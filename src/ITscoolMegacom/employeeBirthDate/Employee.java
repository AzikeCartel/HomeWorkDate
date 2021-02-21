package ITscoolMegacom.employeeBirthDate;

import java.util.Date;

public class Employee {
    private String name;
    private Date birthDate;
    private int age;

    public Employee(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Employee(int age) {
        this.age = age;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
