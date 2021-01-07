package service;

import service.dto.TeacherDto;

import java.util.List;

public interface TeacherManagementService {

    TeacherDto findTeacher(Integer id);
    List<TeacherDto> findAllTeachers();
    TeacherDto addTeacher(TeacherDto teacher);
    TeacherDto updateTeacher(TeacherDto teacher);
    TeacherDto removeTeacher(Integer id);
}
