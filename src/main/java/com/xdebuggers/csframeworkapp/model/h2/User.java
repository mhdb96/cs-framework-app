package com.xdebuggers.csframeworkapp.model.h2;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id()
    private Long id;
    private String name;
    private String mail;

    public User() {
    }

    public User(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public User name(String name) {
        setName(name);
        return this;
    }

    public User mail(String mail) {
        setMail(mail);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(mail, user.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mail);
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", mail='" + getMail() + "'" +
                "}";
    }

}
