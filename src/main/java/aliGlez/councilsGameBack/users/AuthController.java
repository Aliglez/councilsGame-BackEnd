package aliGlez.councilsGameBack.users;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "${api-endopoin}")
public class AuthController {

    @GetMapping(path = "/login")
    public ResponseEntity<Map<String,String>> login() {

        SecurityContext contexHolder = SecurityContextHolder.getContext();
        Authentication auth = contexHolder.getAuthentication();

        Map<String,String> json = new HashMap<>();
        json.put("message", "Logged");
        json.put("email", auth.getName());
        json.put("roles", auth.getAuthorities().iterator().next().toString());

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(json);
    }
    
}
