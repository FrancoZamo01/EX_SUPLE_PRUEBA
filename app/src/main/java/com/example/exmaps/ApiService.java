package com.example.exmaps;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("api/en/countries/info/all.json")
    Call<ResponseBody> getCountriesRaw();  // Usamos ResponseBody para manejar el texto crudo
}
