package aliGlez.councilsGameBack.trails;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(path = "${api-endpoint}")
public class TrailImageController {
    @PostMapping(path = "/images")
    ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
        return ResponseEntity.status(201).body("Saved image");
    }
}
