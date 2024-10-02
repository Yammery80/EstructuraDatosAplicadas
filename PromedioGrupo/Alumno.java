package PromedioGrupo;

public class Alumno {
    //Declaración de Variables
    private String name;
    private String tuition; //matricula
    private double structures;
    private double english;
    private double iot;
    private double average;

    //Constructor
    public Alumno(String m, String n){
        this.tuition = m;
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTuition() {
        return tuition;
    }

    public void setTuition(String tuition) {
        this.tuition = tuition;
    }

    public double getStructures() {
        return structures;
    }

    public void setStructures(double structures) {
        this.structures = structures;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getIot() {
        return iot;
    }

    public void setIot(double iot) {
        this.iot = iot;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = (this.structures + this.english + this.iot / 3);
    }

    @Override //Anotación de Java para anular
    public String toString() {
        return "Alumno [name=" + name + ", tuition=" + tuition + ", average=" + average + "]";
    }
    
    

}
