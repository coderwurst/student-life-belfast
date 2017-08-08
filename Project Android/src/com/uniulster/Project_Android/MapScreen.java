package com.uniulster.Project_Android;

/**
 * **************************
 * Created with IntelliJ IDEA
 * User: Andrew McMechan
 * Student ID: B00652181
 * Date: 28/11/13
 * Time & Version: 18:10 V1
 * PROGRAM INFO
 * ***************************
 */
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MapScreen extends Activity {

    private final String TAG = "StudentLifeV1.0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.belfast_map);

        returnToHomeScreen();
        goToIconScreen();
        goToLaganArea();
        goToCityCentreArea();
        goToUniversityArea();
        goToUserRating();

    }//onCreate

    private void returnToHomeScreen()

    {
        // 1. Get a reference to a button

        Button enterButton = (Button)findViewById(R.id.map_to_home_screen);

        // 2. Set the click listener to run my code

        enterButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast.makeText(MapScreen.this, "Returning", Toast.LENGTH_SHORT).show();


                //startActivity(new Intent(MapScreen.this, MainActivity.class));

                finish();

            }//on Click

        });//Listener

    }//return to Home Screen

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void goToIconScreen()

    {
        // 1. Get a reference to a button

        Button enterButton = (Button)findViewById(R.id.go_to_icon_screen);

        // 2. Set the click listener to run my code

        enterButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast.makeText(MapScreen.this, "ICONS", Toast.LENGTH_SHORT).show();


                startActivity(new Intent(MapScreen.this, TheIcons.class));


            }//on Click

        });//Listener

    }//go to Icon Screen
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    private void goToLaganArea()

    {
        // 1. Get a reference to a button

        Button enterButton2 = (Button)findViewById(R.id.go_to_lagan_screen);

        // 2. Set the click listener to run my code

        enterButton2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast.makeText(MapScreen.this, "Lagan Area", Toast.LENGTH_SHORT).show();


                startActivity(new Intent(MapScreen.this, LaganArea.class));


            }//on Click

        });//Listener

    }//go to Lagan Area
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private void goToCityCentreArea()

    {
        // 1. Get a reference to a button

        Button enterButton = (Button)findViewById(R.id.map_to_city_centre_screen);

        // 2. Set the click listener to run my code

        enterButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast.makeText(MapScreen.this, "City Centre", Toast.LENGTH_SHORT).show();


                startActivity(new Intent(MapScreen.this, CityCentre.class));


            }//on Click

        });//Listener

    }//return to Home Screen
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private void goToUniversityArea()

    {
        // 1. Get a reference to a button

        Button enterButton = (Button)findViewById(R.id.map_to_uni_screen);

        // 2. Set the click listener to run my code

        enterButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast.makeText(MapScreen.this, "University Area", Toast.LENGTH_SHORT).show();


                startActivity(new Intent(MapScreen.this, UniversityArea.class));


            }//on Click

        });//Listener

    }//goToUniversityArea

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
private void goToUserRating()

{
   // 1. Get a reference to a button

   Button enterButton = (Button)findViewById(R.id.map_to_user_rating);

   // 2. Set the click listener to run my code

   enterButton.setOnClickListener(new View.OnClickListener()
   {
      public void onClick(View v)
      {
         Toast.makeText(MapScreen.this, "Submit your own Rating!!", Toast.LENGTH_SHORT).show();


         startActivity(new Intent(MapScreen.this, UserSubmit.class));


      }//on Click

   });//Listener

}//goToUserRating

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}//Map Screen