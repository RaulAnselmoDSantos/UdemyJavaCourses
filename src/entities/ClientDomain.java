package entities;

import domain.GenerecDomain;

import java.util.Objects;

public class ClientDomain implements GenerecDomain<String> {

    private String name;
    private int age;

    private String id;

    public ClientDomain() {
    }

    public ClientDomain(final String name, final int age, final String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClientDomain{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ClientDomain that)) return false;
        return Objects.equals(name, that.name) && Objects.equals(age, that.age) && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }
}
