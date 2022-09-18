package site.telion.spring_skypro_level1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import site.telion.spring_skypro_level1.model.GryffindorStudent;
import site.telion.spring_skypro_level1.model.Student;

@RestController
@RequestMapping("/hogwarts")
public class HogwartsController {

    @GetMapping("/add")
    public Student addStudentGryffindor(@RequestParam(value = "name", required = false) String name,
                                       @RequestParam(value = "power", required = false) Integer magicPower,
                                       @RequestParam(value = "transgression", required = false) Integer transgressionPower,
                                       @RequestParam(value = "nobility", required = false) Integer nobility,
                                       @RequestParam(value = "honour", required = false) Integer honour,
                                       @RequestParam(value = "bravery", required = false) Integer bravery
                                       ) {
        Student student = new GryffindorStudent(name, magicPower, transgressionPower, nobility, honour, bravery);
        System.out.println("student = " + student);
        return student;
    }
}
