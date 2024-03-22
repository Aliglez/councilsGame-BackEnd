package aliGlez.councilsGameBack.trails;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import aliGlez.councilsGameBack.interfaces.IGenericFullService;


@RestController
@RequestMapping(path = "${api-endpoint}/trails")
public class TrailController {
    
    IGenericFullService<Trail> service;

    public TrailController(IGenericFullService<Trail> service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<Trail> index() {
        List<Trail> trails = service.getAll();
        return trails;
    }

    @GetMapping(path = "/getById/{id}")
    public ResponseEntity<Trail> getOneById(@PathVariable("id") Long id) throws Exception {
        Trail trail = service.getById(id);
        return ResponseEntity.status(HttpStatus.OK).body(trail);
    }

    @PostMapping(path = "")
    public ResponseEntity<Trail> create(@RequestBody Trail trail) {
        Trail newTrail = service.save(trail);
        return ResponseEntity.status(HttpStatus.CREATED).body(newTrail);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Trail> update(@PathVariable("id") Long id, @RequestBody Trail trail) throws Exception {
        Trail updatedTrail = service.update(id, trail);
        return ResponseEntity.status(HttpStatus.OK).body(updatedTrail);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        try {
            service.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Trail deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred");
        }
    }
}