public class Employee {
    private String name;
    private int age;
    private int id;
    private String idType;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Employee(String name, int age, int id, String idType) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.idType = idType;
    }

    public int getID(){
        return id;
    }

    public String getIdType() {
        return idType;
    }
}
