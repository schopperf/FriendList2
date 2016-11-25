package at.fh.swengb.friendlist.model;

/**
 * Created by fabian on 07.11.16.
 */
public class BadFriends extends Friend{
    private String drugs;

    public BadFriends(String name, int age, String location, String drugs) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.drugs = drugs;
    }

    public BadFriends() {

    }

    @Override
    public String toString() {
        return "BadFriends{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", drugs='" + drugs + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BadFriends that = (BadFriends) o;

        if (age != that.age) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        return drugs != null ? drugs.equals(that.drugs) : that.drugs == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (drugs != null ? drugs.hashCode() : 0);
        return result;
    }


}
