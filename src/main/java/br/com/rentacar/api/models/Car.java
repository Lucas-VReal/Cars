package br.com.rentacar.api.models;


import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    public Car (Long id, String name){
        this.id = id;
        this.name = name;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private long id;
    @Column(name = "car_name")
    private String name;

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


}
