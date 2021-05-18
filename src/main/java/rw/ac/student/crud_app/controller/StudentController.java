package rw.ac.student.crud_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.ac.student.crud_app.model.Student;
import rw.ac.student.crud_app.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    /**
     * Method handling the request
     */
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id ){
        Optional<Student> studentOptional = studentRepository.findById(id);
        return studentOptional.get();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        Student studentSaved = studentRepository.save(student);

        return studentSaved;
    }

    @PutMapping("/{id}")
    public String updateStudent(@RequestBody Student studentToUpdate,@PathVariable Long id){
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (!studentOptional.isPresent()){
            return "Student doesn't exist";
        }

        studentToUpdate.setId(studentOptional.get().getId());
        studentRepository.save(studentToUpdate);

        return "Student with id : "+id+"is updated";
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id){
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (!studentOptional.isPresent()){
            return "Student doesn't exist";
        }

        studentRepository.deleteById(id);

        return "Student deleted successfully";
    }

}
