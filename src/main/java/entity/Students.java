package entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/5/23.
 */

public class Students implements Serializable{

    private int id;

    private String name;
    private String major;
    private String gender;

    public Students() {
    }

    public Students(int id, String name, String major, String gender) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.gender = gender;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
