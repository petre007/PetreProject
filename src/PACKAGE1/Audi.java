package PACKAGE1;

public class Audi extends Car{

    private String model;
    private int yearOfFabrication;
   

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYearOfFabrication(int yearOfFabrication) {
        this.yearOfFabrication = yearOfFabrication;
    }

    public int getYearOfFabrication() {
        return yearOfFabrication;
    }

    public Audi(){
        super();
        this.model="";
        this.yearOfFabrication=0;
    }

    public Audi(int lenght, int widht, int weight, int horsePower, int topSpeed, String traction, String model, int yearOfFabrication){
        super(lenght, widht, weight, horsePower, topSpeed, traction);
        this.model=model;
        this.yearOfFabrication=yearOfFabrication;
    }

}
