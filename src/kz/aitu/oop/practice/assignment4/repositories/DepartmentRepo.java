package kz.aitu.oop.practice.assignment4.repositories;

import kz.aitu.oop.practice.assignment4.data.Connect;
import kz.aitu.oop.practice.assignment4.entities.Department;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DepartmentRepo implements Repositories<Department> {
    private List<Department> objects;

    public DepartmentRepo() {
        objects = null;
    }

    public DepartmentRepo(List<Department> objects) {
        this.objects = objects;
    }

    public List<Department> getObjects() {
        return objects;
    }

    public void setObjects(List<Department> objects) {
        this.objects = objects;
    }

    @Override
    public boolean createObjects(Department department) {
        return objects.add(department);
    }

    @Override
    public Department getObjects(int id) {
        return objects.get(id);
    }

    @Override
    public List<Department> getAllObjects() {
        return objects;
    }

    @Override
    public void fill() throws SQLException {
        ResultSet rs = Connect.getStatement().executeQuery("SELECT * FROM deparment");
        while (rs.next()) {
            objects.add(new Department(Integer.parseInt(rs.getString(1)), rs.getString(2), rs.getString(3)));
        }
    }
}
