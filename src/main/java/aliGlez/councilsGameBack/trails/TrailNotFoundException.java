package aliGlez.councilsGameBack.trails;


import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Event not found")
public class TrailNotFoundException extends Exception {

    public TrailNotFoundException(String message) {
        super(message);
    }

    public TrailNotFoundException(String message, Throwable cause) {
        super(message,cause);
    }
    
}