package service.dto;

import dal.TeacherEntity;

public class TeacherMapper {

    public static TeacherEntity toEntity(TeacherDto dto){
        return new TeacherEntity(
                dto.getTeacherId(),
                dto.getFirstName(),
                dto.getLastName(),
                dto.getPost(),
                dto.getTel()
        );
    }

    public static TeacherDto toDto(TeacherEntity entity){
        return new TeacherDto(
                entity.getTeacherId(),
                entity.getFirstName(),
                entity.getLastName(),
                entity.getPost(),
                entity.getTel()
        );
    }
}
