package rw.ac.student.crud_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.ac.student.crud_app.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    /**
     * CRUD APPLICATION SERVICES ARE DONE
     */
}
