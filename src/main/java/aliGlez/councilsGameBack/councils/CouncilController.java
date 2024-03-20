package aliGlez.councilsGameBack.councils;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aliGlez.councilsGameBack.interfaces.IGenericLimitedService;

@RestController
@RequestMapping(path = "${api-endpoint}/councils")
public class CouncilController {

    IGenericLimitedService<Council> service;

    public CouncilController(IGenericLimitedService<Council> service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<Council> index() {
        List<Council> councils = service.getAll();
        return councils;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCouncil(@PathVariable Long id) {
        try {
            service.deleteById(id);
            return new ResponseEntity<>("Council deleted sucesfully", HttpStatus.OK);
        } catch (CouncilNotFoundEXception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>("An error occured", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
