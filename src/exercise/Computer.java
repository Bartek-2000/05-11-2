package exercise;

import java.util.Objects;

public class Computer {
    private String producer;
    private int model;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return model == computer.model &&
                Objects.equals(producer, computer.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model);
    }

    @Override
    public String toString() {
        return "Computer" +
                "producer: '" + producer + '\'' +
                ", model: " + model;
    }
}
