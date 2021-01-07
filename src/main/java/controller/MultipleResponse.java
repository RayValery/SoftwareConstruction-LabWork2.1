package controller;

import java.util.Date;
import java.util.List;

public class MultipleResponse extends Response<List>{
    public MultipleResponse(Date date, List responses) {
        super(date, responses);
    }
}
