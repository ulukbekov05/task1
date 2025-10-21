public class School {
    private String name;
    private String city;
    private int studentCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public String toString() {
        return "School{name='" + name + "', city='" + city + "', studentCount=" + studentCount + "}";
    }

}
