package com.devit.model;

import lombok.Data;

import javax.persistence.Entity;

/**
 * Created by lucasgodoy on 03/07/16.
 */
@Entity
@Data
public class User extends BaseEntity {
    private String username;
}
