package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "engines")

public class Engine {

    @Id private String name;

    private int power;

    public Engine (String name, int power) {
        this.name = name;
        this.power = power;
    }

    public Engine (String name) {
        this.name = name;
        this.power = power;
    }

    public Engine () {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}

