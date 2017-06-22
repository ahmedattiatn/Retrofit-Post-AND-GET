/*
 * Created by Shaon on 8/15/16 8:06 PM
 * Copyright (c) 2016. This is free to use in any software.
 * You must provide developer name on your project.
 */

package org.mytriangle.com.myretrofit2.service;

import org.mytriangle.com.myretrofit2.model.MyModel;
import org.mytriangle.com.myretrofit2.model.People;

import java.util.List;

import retrofit.Call;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;

/**
 * Created by Shaon on 8/15/2016.
 */
public interface APIService {
    @GET("ALJAM/a.php")
    Call<List<MyModel>> getPeopleDetails();

    @FormUrlEncoded  // visit  this site to understandd
    // whats an url encoded     http://www.permadi.com/tutorial/urlEncoding/  http://www.permadi.com/tutorial/urlEncoding/
    @POST("ALJAM/POST.php")
        //we can also use a general call ResponseBody insteed of People
    Call<People> setPeopleDetails(@Field("a") String name);

    // if wewant to send many object we can use
    // Call<People> setPeopleDetails(@Field("a") String name/*,@Field("mat") String mat*/,.....);
    //or simply use FieldMap to understand more watch video Retrofit — Send Data Form-Urlencoded [Full HD,1920x1080]


   /* @FormUrlEncoded
    @POST("ALJAM/POST.php")
    Call<People> setPeopleDetails(@FieldMap  Map<String , String> map);

    et dans le main activity put
        /* Map<String,String> map= new HashMap<>() ;
                        map.put("mat","2");
                        map.put("a","ahmed");*/





}
