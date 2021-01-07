package dal;

import exception.TeacherNotFoundException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

import static java.lang.String.format;
import static util.HibernateSessionFactory.getSessionFactory;

public class TeacherDaoImpl implements TeacherDao{

    @Override
    public TeacherEntity findById(Integer id) {
        TeacherEntity teacherEntity = getSessionFactory().openSession().get(TeacherEntity.class, id);
        if(teacherEntity==null) throw new TeacherNotFoundException(format("No teacher with such id %s", id));
        return teacherEntity;
    }

    @Override
    public TeacherEntity save(TeacherEntity teacher) {
        Session session = getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        Integer id = (Integer) session.save(teacher);
        tx1.commit();
        session.close();
        return findById(id);
    }

    @Override
    public TeacherEntity update(TeacherEntity teacher) {
        Session session = getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(teacher);
        tx1.commit();
        session.close();
        return teacher;
    }

    @Override
    public TeacherEntity delete(Integer id) {
        Session session = getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        TeacherEntity teacher = findById(id);
        session.delete(teacher);
        tx1.commit();
        session.close();
        return teacher;
    }

    @Override
    public List<TeacherEntity> findAll() {
        List<TeacherEntity> teachers = (List<TeacherEntity>)  getSessionFactory().openSession()
                .createQuery("From TeacherEntity").list();
        return teachers;
    }
}
