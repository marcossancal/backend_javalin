package com.sancal.routes;
import io.javalin.Javalin;

public class Routes {
    public static void main(String[] args) {
    }
    public void instanceAllRoutes(Javalin server) {
        UsersRoute usersRoute = new UsersRoute(); 
        usersRoute.instanceUsersRoute(server);
        
        AuthenticationRoute authRoute = new AuthenticationRoute();
        authRoute.instanceAuthRoutes(server);
    }
}
