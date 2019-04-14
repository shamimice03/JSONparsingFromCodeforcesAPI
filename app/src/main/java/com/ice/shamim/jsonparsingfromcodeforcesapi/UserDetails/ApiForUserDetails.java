package com.ice.shamim.jsonparsingfromcodeforcesapi.UserDetails;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ApiForUserDetails {

    String BASE_URL_Submission_details = "https://codeforces.com/api/";

    @GET
    Call<Codeforces> getValue(@Url String url); ///for dynamic access.
}
