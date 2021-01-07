package service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeacherDto {

    public TeacherDto(String firstName, String lastName, String post, Long tel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.post = post;
        this.tel = tel;
    }

    private Integer teacherId;

    private String firstName;

    private String lastName;

    private String post;

    private Long tel;

    @Override
    public String toString() {
        return "Teacher{" +
                "name = " + firstName +
                " " + lastName +
                ", post = " + post +
                ", tel = " + tel +
                '}';
    }
}
