package kz.aitu.oop.practice.assignment4.entities;

import kz.aitu.oop.practice.assignment4.data.Connect;

import java.sql.SQLException;

public class Post {
    private int post_id;
    private String post_name;
    private String post_description;
    private int salary;

    public Post() {
    }

    public Post(String post_name, String post_description, int salary) {
        this.post_name = post_name;
        this.post_description = post_description;
        this.salary = salary;
    }

    public Post(int post_id, String post_name, String post_description, int salary) {
        this.post_id = post_id;
        this.post_name = post_name;
        this.post_description = post_description;
        this.salary = salary;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public String getPost_name() {
        return post_name;
    }

    public void setPost_name(String post_name) {
        this.post_name = post_name;
    }

    public String getPost_description() {
        return post_description;
    }

    public void setPost_description(String post_description) {
        this.post_description = post_description;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary= salary;
    }

    public boolean insert() throws SQLException {
        return Connect.getStatement().execute(
                "INSERT INTO post(post_name, description, salary) VALUES ('"
                        +this.post_name+"','"
                        +this.post_description+"','"
                        +this.salary+"')"
        );
    }

    @Override
    public String toString() {
        return "post[" +
                "post_id=" + post_id +
                ", post_name='" + post_name +
                ", post_description='" + post_description + ", salary=" + salary +
                ']';
    }
}
