package com.oddsix.nutripro.rest;

import com.oddsix.nutripro.rest.models.requests.RegisterRequest;
import com.oddsix.nutripro.rest.models.responses.DayResumeResponse;
import com.oddsix.nutripro.rest.models.responses.GeneralResponse;
import com.oddsix.nutripro.rest.models.responses.RegisterResponse;
import com.oddsix.nutripro.rest.models.responses.SuggestedDietResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by filippecl on 03/12/16.
 */

public interface NutriproService {

    @POST("register")
    Call<GeneralResponse> createRegister(@Body RegisterRequest request);

    @FormUrlEncoded
    @POST("signin")
    Call<GeneralResponse> postSignin(@Field("email") String email,
                                     @Field("password") String password);

    @GET("diet")
    Call<SuggestedDietResponse> getSuggestedDiet();

    @GET("meals")
    Call<DayResumeResponse> getMealsByDay(@Query("date") String date);

    @GET("register")
    Call<RegisterResponse> getRegister();

}
