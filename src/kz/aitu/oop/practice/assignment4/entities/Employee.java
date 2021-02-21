package kz.aitu.oop.practice.assignment4.entities;

import kz.aitu.oop.practice.assignment4.data.Connect;

import java.sql.SQLException;

public class Employee {
    private int id ;
    private String f_name;
    private String s_name;
    private String dateOfBirth;
    private int post_id;
    private int dep_id;

    public Employee() {
    }

    public Employee(String f_name , String s_name , String dateOfBirth , int dep_id , int post_id) {
        this.dateOfBirth = dateOfBirth;
        this.f_name = f_name;
        this.s_name = s_name;
        this.dep_id = dep_id;
        this.post_id = post_id;
    }
    public Employee(int id , String f_name , String s_name , String dateOfBirth , int dep_id , int post_id) {
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.f_name = f_name;
        this.s_name = s_name;
        this.dep_id = dep_id;
        this.post_id = post_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getDep_id() {
        return dep_id;
    }

    public void setDep_id(int dep_id) {
        this.dep_id = dep_id;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public boolean insert() throws SQLException {
        return Connect.getStatement().execute(
                "INSERT INTO employee(f_name, s_name, DOB, post_id, dep_id) VALUES ('"
                        +this.f_name+"','"
                        +this.s_name+"','"
                        +this.dateOfBirth+"','"
                        +this.post_id+"','"
                        +this.dep_id+"')"
        );
    }

    @Override
    public String toString() {
        return "employee[" +
                "id=" + id +
                ", f_name='" + f_name +
                ", s_name='" + s_name +
                ", DateOfBirth=" + dateOfBirth +
                ", post_id=" + post_id +
                ", dep_id=" + dep_id +
                ']';
    }
}


