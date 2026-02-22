package entities;

public class People {
    private String name;
    private int age;
    private double altura;

    public People(String name, int age, double altura) {
        this.name = name;
        this.age = age;
        this.altura = altura;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAltura() {
        return altura;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
