package org.example.resources;

import org.example.models.Car;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("/cars")
@Produces(value = MediaType.APPLICATION_JSON)
@Consumes(value = MediaType.APPLICATION_JSON)
public class CarsResource {


    @GET
    public ArrayList<Car> getAllCars (){

        return null;
    }

    @GET
    @Path("/{id}")
    public Car getOneCar (@PathParam("id") Long carID){
        return null;
    }

    @POST
    public Car createCar (Car car){
        return null;
    }

    @PUT
    @Path("/{id}")
    public Car updateCar (@PathParam("id") Long CarID, Car car){

        return null;
    }

    @DELETE
    @Path("/{id}")
    public void deleteCar (@PathParam("id") Long id){
    }


}
