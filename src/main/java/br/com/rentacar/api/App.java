package br.com.rentacar.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class App extends Application {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
