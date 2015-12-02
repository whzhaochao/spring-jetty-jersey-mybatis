package com.zhaochao.action;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhaochao.bean.User;
import com.zhaochao.service.UserService;

@Path("hello")
public class HelloAction {
   
    @Autowired
    private UserService userService;
   
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getGreeting(@PathParam("id") Integer id) throws Exception {
        return userService.queryById(id);
    }
    
 
}