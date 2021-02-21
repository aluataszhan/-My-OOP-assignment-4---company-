package kz.aitu.oop.practice.assignment4.repositories;

import kz.aitu.oop.practice.assignment4.entities.Department;
import kz.aitu.oop.practice.assignment4.entities.Post;

import java.sql.SQLException;
import java.util.List;

public interface Repositories<T> {
    boolean createObjects(T object);

    T getObjects(int id);

    List<T> getAllObjects();

    void fill() throws SQLException;
}
