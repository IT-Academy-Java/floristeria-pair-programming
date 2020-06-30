package floristeria.domain;

public class Floristeria {
    private String name;

    public Floristeria(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Floristeria{" + "name='" + name + '\'' +  '}';
    }
}
