package at.fh.swengb.friendlist.model;

/**
 * Created by fabian on 25.11.16.
 */

public class Friend {
    protected String name;
    protected int age;
    protected String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
