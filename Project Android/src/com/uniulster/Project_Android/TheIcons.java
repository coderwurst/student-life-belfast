package com.uniulster.Project_Android;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * **************************
 * Created with IntelliJ IDEA
 * User: Andrew McMechan
 * Student ID: B00652181
 * Date: 28/11/13
 * Time & Version: 18:52 V1
 * PROGRAM INFO
 * ***************************
 */
public class TheIcons extends MapScreen
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_icons);


        returnToMapScreen();
    }//onCreate


    private void returnToMapScreen()

    {
        // 1. Get a reference to a button

        Button enterButton = (Button)findViewById(R.id.icons_to_map_screen);

        // 2. Set the click listener to run my code

        enterButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast.makeText(TheIcons.this, "Returning", Toast.LENGTH_SHORT).show();


                //startActivity(new Intent(MapScreen.this, MainActivity.class));

                finish();

            }//on Click

        });//Listener

    }//return to Map Screen

}//class