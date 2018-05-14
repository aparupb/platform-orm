package com.stockpile.platform.orm.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table( name = "country" )
public class Country implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min = 2, max = 2)
    @Column(name = "code", nullable = false, unique = true)
    private String code;

    @Size(min = 1)
    @Column(name = "name", nullable = false, unique = true)
    private String name;

}
