package javaannotation;

/**
 @author Dwaipayan

 Class for Car
 **/

@MyAnno
public class Car {

    /**
     @value for car name
     **/
    private String Name;
    private String engine;
    private String modelYear;

    public Car(String name, String engine, String modelYear) {
        Name = name;
        this.engine = engine;
        this.modelYear = modelYear;
    }


    public String Name() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String modelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public String engine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }



}
