package controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Response<T> {

    private Date requestDate;
    private T responseObj;

    @Override
    public String toString() {
        return "Response: " +
                "requestDate=" + requestDate +
                ", responseObj=" + responseObj.toString();
    }
}
