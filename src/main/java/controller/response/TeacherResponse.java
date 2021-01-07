package controller.response;

import service.dto.TeacherDto;

import java.util.Date;

public class TeacherResponse extends Response<TeacherDto> {
    public TeacherResponse(Date date, TeacherDto teacher) {
        super(date, teacher);
    }
}
