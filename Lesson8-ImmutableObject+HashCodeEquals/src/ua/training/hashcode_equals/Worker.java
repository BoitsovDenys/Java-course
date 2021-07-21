package ua.training.hashcode_equals;

import java.util.Date;

public class Worker {
    String name;
    int age;
    int category;

    public Worker() {
        name = "Default worker";
        age = 30;
        category = 3;
    }

    public Worker(String name, int age, int category) {
        this.name = name;
        this.age = age;
        this.category = category;
    }

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

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Worker-[" + "name=" + name + ", age=" + age + ", category=" + category + ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;

        Worker worker = (Worker) o;

        if (age != worker.age) return false;
        if (category != worker.category) return false;
        return name.equals(worker.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + category;
        return result;
    }
}
