
package com.ejemplo01.ejemplo01.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;





@Getter @Setter
@Entity
@Table (name= "tecnologia")
public class Tecnologia implements Serializable  {
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column
    private String imagen;
    @Column
    private String nombre;
  

}

