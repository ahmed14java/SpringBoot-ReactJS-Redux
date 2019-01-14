package com.springredux.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book")
@JsonIgnoreProperties(ignoreUnknown = true , value = {"hibernateLazyInitializer" , "handler"})
public class Book implements Serializable{

    private static final long serialVersionUID = -3109490646706848328L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;


    @Column(name = "author")
    private String author;


    @Column(name = "description")
    private String description;

    @Column(name = "published")
    @Temporal(TemporalType.DATE)
    private Date date;



}
