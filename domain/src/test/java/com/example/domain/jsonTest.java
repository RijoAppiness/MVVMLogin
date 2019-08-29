package com.example.domain;

import com.example.domain.models.User;
import com.example.domain.models.UserToken;
import com.google.gson.Gson;

import org.junit.Test;

public class jsonTest {
    @Test
    public void jsonprintTest(){
        User user = new User();
        user.setAddress("Thazhathekudiydfdfjkjkjdf");
        user.setJob("dfdfdfdf");
        user.setName("Rijo");
        UserToken userToken = new UserToken();
        userToken.setError(false);
        userToken.setUser(user);
        userToken.setUserID(31323232);
        userToken.setValid(true);
        Gson gson = new Gson();
        String userJson = gson.toJson(user);
        String userTokenJson = gson.toJson(userToken);
        System.out.println("this is user");
        System.out.println("///////////////");
        System.out.println(userJson);
        System.out.println("this is userToken");
        System.out.println("///////////////");
        System.out.println(userTokenJson);
    }
}
