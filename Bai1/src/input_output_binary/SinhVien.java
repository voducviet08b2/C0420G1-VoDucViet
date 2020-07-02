package input_output_binary;

import java.io.*;

public class SinhVien implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String classes;
    private int age;

    public SinhVien(int id, String name, String classes, int age) {
        this.id = id;
        this.name = name;
        this.classes = classes;
        this.age = age;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
