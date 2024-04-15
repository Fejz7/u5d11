package project.u5d11.exceptions;

import org.springframework.validation.ObjectError;

import java.util.List;

public class BadRequestException extends RuntimeException{
    private List<ObjectError> errorsList;
    public BadRequestException(String message){
        super(message);
    }

    public BadRequestException(List<ObjectError> errorsList){
        super("errore nella validazione");
        this.errorsList = errorsList;
    }
}
