package controller.response;

import java.util.Date;

public class ErrorResponse extends Response<String> {
    public ErrorResponse(Date requestDate, Exception responseObj) {
        super(requestDate, responseObj.getMessage());
    }
}
