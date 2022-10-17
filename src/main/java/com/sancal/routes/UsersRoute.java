package com.sancal.routes;
import io.javalin.Javalin;
import com.sancal.controllers.UsersController;

public class UsersRoute {
    private String USERSROUTEURL = "/users";
    private String USERROUTEURL = "/user";
    public static void main(String[] args) {
        
    }
    
    public void instanceUsersRoute(Javalin server){
        UsersController uc = new UsersController();
        server.get(USERSROUTEURL,ctx-> ctx.json(uc.getAllUsers()));
        server.get(USERROUTEURL, ctx->ctx.result("User Route"));
    }

}
