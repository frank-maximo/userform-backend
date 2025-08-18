package com.example.dbtester.api;
import com.example.dbtester.User;
import com.example.dbtester.LoginRequest;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.GET;
import java.util.List;
public interface ApiService {
    @POST("api/users/register")
    Call<User> registerUser(@Body User user);

    @POST("api/users/login")
    Call<User> loginUser(@Body LoginRequest loginRequest);
    @GET("/users")
    Call<List<User>> getAllUsers(); // Optional: if you need to fetch user list
}
