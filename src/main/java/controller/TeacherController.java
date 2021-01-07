package controller;

import exception.TeacherNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import service.TeacherManagementService;
import service.TeacherManagementServiceImpl;
import service.dto.TeacherDto;

import java.util.Date;
import java.util.List;

import static java.lang.String.format;

public class TeacherController {

    private static final Logger log = LoggerFactory.getLogger(TeacherController.class);

    private final TeacherManagementService service = new TeacherManagementServiceImpl();

    public Response findTeacher(Integer teacherId){
        try {
            TeacherDto teacher = service.findTeacher(teacherId);
            log.info(format("Found teacher with id=%s", teacherId));
            return new TeacherResponse(new Date(), teacher);
        } catch (TeacherNotFoundException e) {
            log.error(format("Teacher with id=%s not found", teacherId), e);
            return new ErrorResponse(new Date(), e);
        }
    }

    public MultipleResponse findAllTeachers(){
        List<TeacherDto> teachers = service.findAllTeachers();
        log.info(format("Found teacher with id: %s", teachers.stream().map(TeacherDto::getTeacherId)));
        return new MultipleResponse(new Date(), teachers);
    }

    public Response addTeacher(TeacherDto teacherDto){
        TeacherDto teacher = service.addTeacher(teacherDto);
        log.info(format("Added teacher with id=%s", teacher.getTeacherId()));
        return new TeacherResponse(new Date(), teacher);
    }

    public Response updateTeacher(TeacherDto teacherDto){
        TeacherDto teacher = service.updateTeacher(teacherDto);
        log.info(format("Updated teacher with id=%s", teacher.getTeacherId()));
        return new TeacherResponse(new Date(), teacher);
    }

    public Response removeTeacher(Integer teacherId){
        TeacherDto teacher = service.removeTeacher(teacherId);
        log.info(format("Removed teacher with id=%s", teacher.getTeacherId()));
        return new TeacherResponse(new Date(), teacher);
    }
}
