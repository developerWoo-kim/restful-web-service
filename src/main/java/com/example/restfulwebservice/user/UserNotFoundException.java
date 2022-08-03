package com.example.restfulwebservice.user;
//HTTP Status code
// 2XX -> OK
// 4XX -> client 존재하지 않는 리소스를 호출 등등
// 5XX -> Server
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
