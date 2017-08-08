package com.uniulster.Project_Android;

/**
 * **************************
 * Created with IntelliJ IDEA
 * User: Andrew McMechan
 * Student ID: B00652181
 * Date: 05/12/13
 * Time & Version: 19:25 V1
 * Class to allow user details to be forwarded onto App Servers (Continued Development)
 * ***************************
 */
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class UserReview extends UserSubmit {

    public static final String PREFS_NAME = "MyPreferencesfile" ;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.user_review);

        TextView tvName = (TextView)findViewById(R.id.textViewName);                        //imports the data from the submit screen
        TextView tvEmail = (TextView)findViewById(R.id.textViewEmail);
        TextView tvPlaceName = (TextView)findViewById(R.id.textViewPlaceName);
        TextView tvPlaceType = (TextView)findViewById(R.id.textViewPlaceType);
        RatingBar tvRating = (RatingBar)findViewById(R.id.ratingBarPlaceRating);
        SharedPreferences ratings = getSharedPreferences(PREFS_NAME,0);

        tvName.setText(ratings.getString("name", "default"));                              //presents the info in text fields
        tvEmail.setText(ratings.getString("email", "default"));
        tvPlaceName.setText(ratings.getString("place_name", "default"));
        tvPlaceType.setText(ratings.getString("place_type", "default"));
        tvRating.setRating(ratings.getFloat("place_rating", 2));

        returnToMapScreen();

        }

    private void returnToMapScreen()

    {
        Button enterButton = (Button)findViewById(R.id.userReviewToHome);

        enterButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast.makeText(UserReview.this, "Returning", Toast.LENGTH_SHORT).show();


                startActivity(new Intent(UserReview.this, MapScreen.class));              //returns the user to map screen


            }//on Click

        });//Listener

    }//return to Map Screen

} //UserReview
