package kz.aitu.oop.practice.assignment4.entities;

import kz.aitu.oop.practice.assignment4.data.Connect;

import java.sql.SQLException;

public class Department {
    private int dep_id;
    private String dep_name;
    private String dep_description ;

    public Department() {
    }

    public Department(String dep_name, String dep_description) {
        this.dep_name = dep_name;
        this.dep_description = dep_description;
    }

    public Department(int dep_id, String dep_name, String dep_description) {
        this.dep_id = dep_id;
        this.dep_name = dep_name;
        this.dep_description = dep_description;
    }

    public int getDep_id() {
        return dep_id;
    }

    public void setDep_id(int dep_id) {
        this.dep_id = dep_id;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public String getDep_description() {
        return dep_description;
    }

    public void setDep_description(String dep_description) {
        this.dep_description = dep_description;
    }

    public boolean insert() throws SQLException {
        return Connect.getStatement().execute(
                "INSERT INTO department(dep_name, dep_description) VALUES ('"
                        +this.dep_name+"','"
                        +this.dep_description+"')"
        );
    }

    @Override
    public String toString() {
        return "department[" +
                "dep_id=" + dep_id +
                ", dep_name='" + dep_name +
                ", dep_description='" + dep_description +
                ']';
    }
}
