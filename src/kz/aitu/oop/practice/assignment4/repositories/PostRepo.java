package kz.aitu.oop.practice.assignment4.repositories;

import kz.aitu.oop.practice.assignment4.data.Connect;
import kz.aitu.oop.practice.assignment4.entities.Department;
import kz.aitu.oop.practice.assignment4.entities.Post;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PostRepo implements Repositories<Post> {
    private List<Post> objects;

    public PostRepo() {
        objects = null;
    }

    public PostRepo(List<Post> objects) {
        this.objects = objects;
    }

    public List<Post> getObjects() {
        return objects;
    }

    public void setObjects(List<Post> objects) {
        this.objects = objects;
    }

    @Override
    public boolean createObjects(Post object) {
        return objects.add(object);
    }

    @Override
    public Post getObjects(int id) {
        return objects.get(id);
    }

    @Override
    public List<Post> getAllObjects() {
        return objects;
    }

    @Override
    public void fill() throws SQLException {
        ResultSet rs = Connect.getStatement().executeQuery("SELECT * FROM post");
        while (rs.next()) {
            objects.add(new Post(Integer.parseInt(rs.getString(1)), rs.getString(2), rs.getString(3), Integer.parseInt(rs.getString(4))));
        }
    }
}
