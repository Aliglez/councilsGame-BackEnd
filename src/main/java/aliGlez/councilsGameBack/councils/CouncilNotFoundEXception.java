package aliGlez.councilsGameBack.councils;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason =  "Council not found")
public class CouncilNotFoundException extends Exception{

    public CouncilNotFoundException(String message){
        super(message);
    }

    public CouncilNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    
}