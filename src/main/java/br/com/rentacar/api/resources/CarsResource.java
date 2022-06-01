package br.com.rentacar.api.resources;


import br.com.rentacar.api.models.Car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/cars")
@Produces(value = MediaType.APPLICATION_JSON)
@Consumes(value = MediaType.APPLICATION_JSON)
public class CarsResource {

     private EntityManagerFactory entityManagerFactory;
     private EntityManager entityManager;
    public CarsResource () {
        entityManagerFactory = Persistence.createEntityManagerFactory("rentacarPU");
        entityManager = entityManagerFactory.createEntityManager();
    }
    @GET
    public List<Car> getAllCars (){

        List<Car> list = entityManager
                .createQuery("select o from Car o", Car.class) //car é o tipo do retorno
                .getResultList();

        return list;

    }

    @GET
    @Path("/{id}")
    public Car getOneCar (@PathParam("id") Long carID){

        Car list = entityManager
                .createQuery("select o from Car o where o.id = :id", Car.class)
                .setParameter("id", carID)
                .getSingleResult();

        return list;
    }

    @POST
    public Car createCar (Car car){

        entityManager.getTransaction().begin();

        entityManager.persist(car);

        entityManager.getTransaction().commit();

        return car;

    }

    @PUT
    @Path("/{id}")
    public Car updateCar (@PathParam("id") Long carID, Car car){

        Car carro = getOneCar(carID);

        carro.setName(car.getName());

        entityManager.getTransaction().begin();

        entityManager.persist(carro);

        entityManager.getTransaction().commit();

        return carro;
    }

    @DELETE
    @Path("/{id}")
    public void deleteCar (@PathParam("id") Long carID){

        Car deletedCar = getOneCar(carID);

        entityManager.getTransaction().begin();

        entityManager.remove(deletedCar);

        entityManager.getTransaction().commit();


    }


}
