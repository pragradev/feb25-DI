package io.pragra.learning.feb25_ioc;

public class DieselEngine implements IEngine{
    private Integer horsePower;

    public DieselEngine(Integer horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void display() {
        System.out.println("Diesel Engine, HP = " + horsePower);
    }

    @Override
    public String toString() {
        return "DieselEngine{" +
                "horsePower=" + horsePower +
                '}';
    }
}
