package service;

import dal.TeacherDao;
import dal.TeacherDaoImpl;
import service.dto.TeacherDto;
import service.dto.TeacherMapper;

import java.util.List;
import java.util.stream.Collectors;

public class TeacherManagementServiceImpl implements TeacherManagementService {

    private final TeacherDao dao = new TeacherDaoImpl();

    @Override
    public TeacherDto findTeacher(Integer id) {
        return TeacherMapper.toDto(dao.findById(id));
    }

    @Override
    public List<TeacherDto> findAllTeachers() {
        return dao.findAll().stream().map(TeacherMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public TeacherDto addTeacher(TeacherDto teacher) {
        return TeacherMapper.toDto(dao.save(TeacherMapper.toEntity(teacher)));
    }

    @Override
    public TeacherDto updateTeacher(TeacherDto teacher) {
        return TeacherMapper.toDto(dao.update(TeacherMapper.toEntity(teacher)));
    }

    @Override
    public TeacherDto removeTeacher(Integer id) {
        return TeacherMapper.toDto(dao.delete(id));
    }
}
