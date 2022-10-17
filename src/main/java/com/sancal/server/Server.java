package com.sancal.server;
import io.javalin.Javalin;
import com.sancal.routes.Routes;
public class Server {

    public static void main(String[] args) {
        Javalin server = Javalin.create().start(7000);
        Routes rotas = new Routes();
        rotas.instanceAllRoutes(server);
    }   
}