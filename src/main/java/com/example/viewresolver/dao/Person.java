package com.example.viewresolver.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by 이복음 on 2017-06-05.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int personId;
    private String firstName;
    private String lastName;
    private int age;
}
