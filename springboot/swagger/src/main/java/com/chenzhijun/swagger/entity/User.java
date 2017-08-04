package com.chenzhijun.swagger.entity;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
}
