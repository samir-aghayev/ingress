package recordPractica;

public record Person(String name, int age) {

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("name=%s, age=%d", name, age);
    }
}
