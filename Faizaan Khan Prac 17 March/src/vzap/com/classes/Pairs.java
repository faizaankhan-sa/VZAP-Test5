package vzap.com.classes;

import java.util.Objects;

public class Pairs<T> {

    private T firstValue;
    private T secondValue;

    public Pairs() {
    }

    public Pairs(T firstValue, T secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public T getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(T firstValue) {
        this.firstValue = firstValue;
    }

    public T getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(T secondValue) {
        this.secondValue = secondValue;
    }

    @Override
    public String toString() {
        return "(" + firstValue + "," + secondValue + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Pairs<T> other = (Pairs<T>) obj;
        if (!Objects.equals(this.firstValue, other.firstValue)) {
            return false;
        }
        if (!Objects.equals(this.secondValue, other.secondValue)) {
            return false;
        }
        return true;
    }
}
