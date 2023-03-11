package com.hrproject.myProject.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity(name = "Student")
@Table(name = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @SequenceGenerator(

            name = "student_sequence",
            allocationSize = 1

    )
    @GeneratedValue(

            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )

    Long id;

    @Column(

            name ="first_name",
            nullable = false,
            columnDefinition = "TEXT"


    )
    String first_name;

    @Column(

            name ="last_name",
            nullable = false,
            columnDefinition = "TEXT"


    )
    String last_name;

    @Column(

            name ="email",
            nullable = false,
            columnDefinition = "TEXT"


    )
    String email;

    @Column(

            name ="password",
            nullable = false,
            columnDefinition = "TEXT"


    )
    String password;


    @Column(

            name ="age",
            nullable = false,
            columnDefinition = "INTEGER"


    )
    int age ;

    public Person(String first_name, String last_name, String email, String password, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.age = age;
    }
}
