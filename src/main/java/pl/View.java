package pl;

import controller.response.Response;
import controller.TeacherController;
import service.dto.TeacherDto;

public class View {
    public static void main(String[] args) {
        TeacherController controller = new TeacherController();

        TeacherDto teacher = new TeacherDto("Yuliia","Bezcorovaina",
                "proffessor",1234567L);

        Response response = controller.addTeacher(teacher);
        System.out.println("Add new teacher: \n" + response.toString());

        teacher = (TeacherDto) response.getResponseObj();

        response = controller.findTeacher(1);
        System.out.println("Find teacher with id=1: \n" + response.toString());

        response = controller.findTeacher(3);
        System.out.println("Find teacher with id=3: \n" + response.toString());

        teacher.setTel(7654321L);
        response = controller.updateTeacher(teacher);
        System.out.println("Update teacher: \n" + response.toString());

        teacher = (TeacherDto) response.getResponseObj();

        response = controller.removeTeacher(teacher.getTeacherId());
        System.out.println("Remove teacher: \n" + response.toString());

        TeacherDto teacher2 = new TeacherDto("Olena","Grinenko",
                "assistant",1234567L);

        controller.addTeacher(teacher2);
        response = controller.findAllTeachers();

        System.out.println("Find all teachers: \n" + response.getResponseObj());
    }
}
