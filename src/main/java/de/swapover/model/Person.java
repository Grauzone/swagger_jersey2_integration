package de.swapover.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by mikulicv on 02.05.16.
 */
@XmlRootElement
public class Person {

    private final Integer id;
    String firstname;
    String lastname;

    public Person(Integer id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
