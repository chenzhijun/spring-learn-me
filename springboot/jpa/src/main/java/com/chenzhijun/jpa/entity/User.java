package com.chenzhijun.jpa.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "TBL_USER")
@Data
@ToString
public class User {

    @Column(name = "ID")
    @Id
    @GeneratedValue
    private long id;

    @Column(name="NAME")
    private String name;

    @Column(name = "AGE")
    private int age;
}
