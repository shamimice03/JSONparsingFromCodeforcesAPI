package com.ice.shamim.jsonparsingfromcodeforcesapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.ice.shamim.jsonparsingfromcodeforcesapi.StatusDetails.ApiForUserStatusDetails;
import com.ice.shamim.jsonparsingfromcodeforcesapi.StatusDetails.UserSubmissionDetails;
import com.ice.shamim.jsonparsingfromcodeforcesapi.UserDetails.ApiForUserDetails;
import com.ice.shamim.jsonparsingfromcodeforcesapi.UserDetails.Codeforces;
import com.ice.shamim.jsonparsingfromcodeforcesapi.UserDetails.Result;


import java.util.HashSet;
import java.util.Set;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView textView,textView2;
    Button btn,btn2;
    EditText cf_handle;
    String handle_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text);
        btn = findViewById(R.id.button);
        textView2 = findViewById(R.id.text2);
        btn2 = findViewById(R.id.button2);
        cf_handle = (EditText) findViewById(R.id.Handle);




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ParseingUserDetails();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ParsingUserSubmissionDetails();
            }
        });

    }


    //UserSubmission Details/////////////////////////////////////



    private void ParsingUserSubmissionDetails() {


        handle_name = cf_handle.getText().toString();

        String method_With_handle = "user.status?handle="+handle_name;

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiForUserStatusDetails.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiForUserStatusDetails api = retrofit.create(ApiForUserStatusDetails.class);

        Call<UserSubmissionDetails> call = api.getValue(method_With_handle);

        call.enqueue(new Callback<UserSubmissionDetails>() {
            @Override
            public void onResponse(Call<UserSubmissionDetails> call, Response<UserSubmissionDetails> response) {


                try{

                    UserSubmissionDetails userSubmissionDetails = response.body();
                    String data = userSubmissionDetails.getStatus().toString();
                    com.ice.shamim.jsonparsingfromcodeforcesapi.StatusDetails.Result[] result = userSubmissionDetails.getResult();
                    Set<String> solve_Cf = new HashSet<>();

                    for(int i=0; i<result.length; i++) {

                        String ContestId = result[i].getProblem().getContestId();
                        String problemIndex = result[i].getProblem().getIndex();
                        String verdict = result[i].getVerdict();

                        String problemNumber = ContestId + problemIndex;

                        if(verdict.equals("OK")){

                            solve_Cf.add(problemNumber);  ///Including GYM solved Also
                        }


                    }

                    textView2.setText(String.valueOf(solve_Cf.size()));


                }catch (Exception e){

                    Toast.makeText(MainActivity.this, "Invalid Username!!!", Toast.LENGTH_SHORT).show();
                }



            }

            @Override
            public void onFailure(Call<UserSubmissionDetails> call, Throwable t) {

                Toast.makeText(MainActivity.this, "failed", Toast.LENGTH_SHORT).show();
            }
        });

    }


    /////////////////////////////////////// * //////////////////////////////




    ///UserDetails///////////////////////////
    private void ParseingUserDetails() {

        handle_name = cf_handle.getText().toString();

        String first_half="user.info?handles="+handle_name;

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiForUserDetails.BASE_URL_Submission_details)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiForUserDetails api = retrofit.create(ApiForUserDetails.class);



        Call<Codeforces> call = api.getValue(first_half);

        call.enqueue(new Callback<Codeforces>() {
            @Override
            public void onResponse(Call<Codeforces> call, Response<Codeforces> response) {



                try{
                    Codeforces codeforces = response.body();
                    String data = codeforces.getStatus().toString();
                    Result[] arr = codeforces.getResult();
                    textView.setText(arr[0].getLastName().toString());


                }catch (Exception e){

                    Toast.makeText(MainActivity.this, e.toString(), Toast.LENGTH_SHORT).show();
                }



            }

            @Override
            public void onFailure(Call<Codeforces> call, Throwable t) {

                Toast.makeText(MainActivity.this, "failed", Toast.LENGTH_SHORT).show();
            }

        });


    }


      ////////////////////////////   *  //////////////////////


}