package com.devit.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by lucasgodoy on 03/07/16.
 */
@MappedSuperclass()
@Data
public abstract class BaseEntity implements Serializable {
    private static final long serialVersionUID = 2965555625740991692L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
}
