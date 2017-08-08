package com.uniulster.Project_Android;

/**
 * **************************
 * Created with IntelliJ IDEA
 * User: Andrew McMechan
 * Student ID: B00652181
 * Date: 05/12/13
 * Time & Version: 19:23 V1
 * Class to allow user to input own Rating, Place Name , Own Name and Email
 * ***************************
 */
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

public class UserSubmit extends MapScreen {

    public static final String PREFS_NAME = "MyPreferencesfile" ;                 //declare the shared preferences as a final


    @Override
    protected void onCreate(Bundle savedInstanceState) {                          //locate the button to submit data
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_submit);

        final EditText name = (EditText)findViewById(R.id.editTextUserName);       //id up information entered to be transferred
        final EditText email = (EditText)findViewById(R.id.editTextUserEmail);
        final EditText placeName = (EditText)findViewById(R.id.editTextPlaceName);
        final EditText placeType = (EditText)findViewById(R.id.editTextPlaceType);
        final RatingBar placeRating = (RatingBar)findViewById(R.id.ratingBarInput);
        Button btn = (Button)findViewById(R.id.buttonSubmit);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                SharedPreferences ratings = getSharedPreferences(PREFS_NAME, 0);   //create the shared preferences package for ratings
                SharedPreferences.Editor editor = ratings.edit();
                editor.putString("name", name.getText().toString());
                editor.putString("email", email.getText().toString());
                editor.putString("place_name", placeName.getText().toString());
                editor.putString("place_type", placeType.getText().toString());
                editor.putFloat("place_rating", placeRating.getRating());

                editor.commit();                                                  //finishes the package

                Intent intent = new Intent(getApplicationContext(), UserReview.class);   //sends user to review screen
                startActivity(intent);

            }//OnClick

        }//OnListener
        );

    }//onCreate

 }//UserSubmit