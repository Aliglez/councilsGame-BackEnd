package aliGlez.councilsGameBack.councils;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Council not found")
public class CouncilNotFoundEXception extends Exception {

    public CouncilNotFoundEXception(String message) {
        super(message);

    }

    public CouncilNotFoundEXception(String message, Throwable cause) {
        super(message, cause);
    }

    
}
