package com.sancal.routes;
import io.javalin.Javalin;

public class AuthenticationRoute {
    private String AUTHROUTEURL = "/auth";

    public void instanceAuthRoutes(Javalin server){
        server.get(AUTHROUTEURL, ctx-> ctx.result("Auth route"));
    }
}
