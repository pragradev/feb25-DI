package io.pragra.learning.feb25_ioc;

public class BMW {
    IEngine engine;

    public BMW(IEngine engine){
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "engine=" + engine +
                '}';
    }
}
