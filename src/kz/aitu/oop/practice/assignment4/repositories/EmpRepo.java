package kz.aitu.oop.practice.assignment4.repositories;

import kz.aitu.oop.practice.assignment4.data.Connect;
import kz.aitu.oop.practice.assignment4.entities.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmpRepo implements Repositories<Employee>  {
    private List<Employee> objects;

    public EmpRepo() {
        objects = null;
    }

    public EmpRepo(List<Employee> objects) {
        this.objects = objects;
    }

    public List<Employee> getObjects() {
        return objects;
    }

    public void setObjects(List<Employee> objects) {
        this.objects = objects;
    }

    @Override
    public boolean createObjects(Employee object) {
        return objects.add(object);
    }

    @Override
    public Employee getObjects(int id) {
        return objects.get(id);
    }

    @Override
    public List<Employee> getAllObjects() {
        return objects;
    }

    @Override
    public void fill() throws SQLException {
        ResultSet rs = Connect.getStatement().executeQuery("SELECT * FROM employee");
        while (rs.next()) {
            objects.add(new Employee(Integer.parseInt(rs.getString(1)), rs.getString(2), rs.getString(3), rs.getString(4), Integer.parseInt(rs.getString(5)), Integer.parseInt(rs.getString(6))));
        }
    }
}
