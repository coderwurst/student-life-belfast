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

    public static final String PREFS_NAME = "MyPreferencesfile" ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_submit);

        final EditText name = (EditText)findViewById(R.id.editTextUserName);
        final EditText email = (EditText)findViewById(R.id.editTextUserEmail);
        final EditText placeName = (EditText)findViewById(R.id.editTextPlaceName);
        final EditText placeType = (EditText)findViewById(R.id.editTextPlaceType);
        final RatingBar placeRating = (RatingBar)findViewById(R.id.ratingBarInput);
        Button btn = (Button)findViewById(R.id.buttonSubmit);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("name", name.getText().toString());
                editor.putString("email", email.getText().toString());
                editor.putString("place_name", placeName.getText().toString());
                editor.putString("place_Type", placeType.getText().toString());
                editor.putFloat("place_Rating", placeRating.getRating());

                editor.commit();

                Intent intent = new Intent(getApplicationContext(), UserReview.class);
                startActivity(intent);

            }//OnClick

        }//OnListener
        );

    }//onCreate

 }//UserSubmit