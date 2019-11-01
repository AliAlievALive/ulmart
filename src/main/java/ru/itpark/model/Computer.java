package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Computer extends Product {
    private String os;
    private int ramSize;
    private int hardSize;
    private int Cores;

    public Computer(long id, String brand, int price, int rating, String type, String os, int ramSize, int hardSize, int cores) {
        super(id, brand, price, rating, type);
        this.os = os;
        this.ramSize = ramSize;
        this.hardSize = hardSize;
        Cores = cores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        if (!super.equals(o)) return false;
        Computer computer = (Computer) o;
        if (ramSize != computer.ramSize) return false;
        if (hardSize != computer.hardSize) return false;
        if (Cores != computer.Cores) return false;
        return Objects.equals(os, computer.os);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (os != null ? os.hashCode() : 0);
        result = 31 * result + ramSize;
        result = 31 * result + hardSize;
        result = 31 * result + Cores;
        return result;
    }

    @Override
    public String toString() {
        return "Computer{" + super.toString() +
                "os='" + os +
                ", ramSize=" + ramSize +
                ", hardSize=" + hardSize +
                ", Cores=" + Cores +
                "} ";
    }
}
