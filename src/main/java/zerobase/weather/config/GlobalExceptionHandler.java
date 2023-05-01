package zerobase.weather.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)   // INTERNAL_SERVER_ERROR 반환
    @ExceptionHandler(NullPointerException.class)
    public Exception handleAllException(){
        System.out.println("해당 일기가 없습니다.");
        return new Exception();
    }
}
