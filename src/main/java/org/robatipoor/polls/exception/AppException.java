package org.robatipoor.polls.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * AppException
 */
@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
public class AppException extends RuntimeException {
    public AppException(String arg0){
        super(arg0);
    }

    public AppException(){
    }
}