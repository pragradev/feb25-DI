package io.pragra.learning.feb25_ioc;

public class PetrolEngine implements IEngine{
    private Integer horsePower;

    public PetrolEngine(Integer horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void display() {
        System.out.println("Petrol Engine, HP = " + horsePower);
    }

    @Override
    public String toString() {
        return "PetrolEngine{" +
                "horsePower=" + horsePower +
                '}';
    }
}
