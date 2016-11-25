package at.fh.swengb.friendlist.model;

/**
 * Created by fabian on 07.11.16.
 */
public class GoodFriends extends Friend {
    private String sharedInterests;
    private String knows;

    public GoodFriends(String name, int age, String location, String sharedInterests, String knows) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.sharedInterests = sharedInterests;
        this.knows = knows;
    }

    public GoodFriends() {

    }


    public String getSharedInterests() {
        return sharedInterests;
    }

    public void setSharedInterests(String sharedInterests) {
        this.sharedInterests = sharedInterests;
    }

    public String getKnows() {
        return knows;
    }

    public void setKnows(String knows) {
        this.knows = knows;
    }

    @Override
    public String toString() {
        return "GoodFriends{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", sharedInterests='" + sharedInterests + '\'' +
                ", knows='" + knows + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodFriends that = (GoodFriends) o;

        if (age != that.age) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (sharedInterests != null ? !sharedInterests.equals(that.sharedInterests) : that.sharedInterests != null)
            return false;
        return knows != null ? knows.equals(that.knows) : that.knows == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (sharedInterests != null ? sharedInterests.hashCode() : 0);
        result = 31 * result + (knows != null ? knows.hashCode() : 0);
        return result;
    }

}
