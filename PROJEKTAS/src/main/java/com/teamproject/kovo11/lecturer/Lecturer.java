package com.teamproject.kovo11.lecturer;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Lecturer {

    public Lecturer(Integer id, String name, String email, Area area) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.area = area;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private final String name;

    private String email;

    private Area area;


}
