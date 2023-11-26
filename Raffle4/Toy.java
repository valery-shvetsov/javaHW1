package Raffle4;

//public class Toy
public class Toy implements Comparable<Toy>{

    private int id;
    private String name;
    private int weight;

    public Toy(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "id=" + id + "{name=" + name + ", weight=" + weight + "}";
    }

    @Override
    public int compareTo(Toy o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
