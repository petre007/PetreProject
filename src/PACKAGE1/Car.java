package PACKAGE1;

public class Car {


    protected int lenght;
    protected int widht;
    protected int weight;

    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    public int getWidht() {
        return widht;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }



    public Car(){
        this.lenght=0;
        this.widht=0;
        this.weight=0;
        this.engine=new Engine();
        this.getEngine().setHorsePower(0);
        this.getEngine().setTopSpeed(0);
        this.getEngine().setTraction("");
    }

    public Car(int lenght, int widht, int weight, int horsePower, int topSpeed, String traction){
        this.lenght=lenght;
        this.widht=widht;
        this.weight=weight;
        this.engine=new Engine();
        this.getEngine().setHorsePower(horsePower);
        this.getEngine().setTopSpeed(topSpeed);
        this.getEngine().setTraction(traction);
    }

}
