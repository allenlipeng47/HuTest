package springbootservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


//@ControllerAdvice
public class ControllerExceptionHandler {

    static {
        System.out.println("pengli");
    }

//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    @ExceptionHandler(Exception.class)
//    public String handleConstraintViolationException2() {
//        System.out.println("pengli");
//        return "abcde";
//    }


}
