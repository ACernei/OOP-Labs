package lab5.task1;

public class G extends F {
    public String g;

    public G(String s) {
        super(s);
        this.g = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + g;
    }
}