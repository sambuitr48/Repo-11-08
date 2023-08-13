package herencia;

public class Animal {
    private String name;
    public int Weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public Animal(String name, int weight) {
        this.name = name;
        Weight = weight;
    }
    
}
