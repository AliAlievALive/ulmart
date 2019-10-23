package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone extends Product {
    private String os;
    private int ramSize;
    private boolean haveNFC;

    public Phone(long id, String brand, int price, int rating, String os, int ramSize, boolean haveNFC) {
        super(id, brand, price, rating);
        this.os = os;
        this.ramSize = ramSize;
        this.haveNFC = haveNFC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        if (!super.equals(o)) return false;
        Phone phone = (Phone) o;
        if (ramSize != phone.ramSize) return false;
        if (haveNFC != phone.haveNFC) return false;
        return Objects.equals(os, phone.os);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (os != null ? os.hashCode() : 0);
        result = 31 * result + ramSize;
        result = 31 * result + (haveNFC ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "Phone{" +
                "os='" + os + '\'' +
                ", ramSize=" + ramSize +
                ", haveNFC=" + haveNFC +
                "} ";
    }
}
