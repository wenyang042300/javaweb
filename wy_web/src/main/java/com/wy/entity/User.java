package com.wy.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = false)
public class User {
    private String id;
    private String username;
    private String password;
    private String mes;
}
