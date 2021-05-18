package rw.ac.student.crud_app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

/**
 * @Entity class for student tbl
 */
@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long  id;

    private String name;

    private String className;

    private String gender;

    private Date dob;

    public Student() {
    }

    public Student(String name, String className, String gender, Date dob) {
        this.name = name;
        this.className = className;
        this.gender = gender;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
