package kz.aitu.oop.practice.assignment4;

import kz.aitu.oop.practice.assignment4.data.Connect;
import kz.aitu.oop.practice.assignment4.entities.Department;
import kz.aitu.oop.practice.assignment4.repositories.DepartmentRepo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        DepartmentRepo repo = new DepartmentRepo();
        repo.fill();
        System.out.println(repo);
    }
}
