package org.example.models;

public class Car {

    public Car (Long id, String name, String plate){
        this.id = id;
        this.name = name;
        this.plate = plate;
    }

    private long id;
    private String name;
    private String plate;

    public Car() {

    }


    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
