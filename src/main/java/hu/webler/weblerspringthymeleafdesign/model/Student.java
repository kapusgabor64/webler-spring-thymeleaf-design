package hu.webler.weblerspringthymeleafdesign.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String firstName;
    private String midName;
    private String lastName;
    private String email;

    private final String COURSE_NAME = "Java Spring Boot";
}
