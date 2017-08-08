package com.uniulster.Project_Android;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        enterMapScreen();
        exitApp();
        //exit Program

    }//on create

    private void enterMapScreen()

    {
        // 1. Get a reference to a button

        Button enterButton = (Button)findViewById(R.id.toMapScreen);

        // 2. Set the click listener to run my code

        enterButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast.makeText(MyActivity.this, "Welcome", Toast.LENGTH_SHORT).show();


                startActivity(new Intent(MyActivity.this, MapScreen.class));

            }//on Click

        });//Listener

    }//enterMapScreen

   private void exitApp()

   {
      // 1. Get a reference to a button

      Button enterButton = (Button)findViewById(R.id.exitButton);

      // 2. Set the click listener to run my code

      enterButton.setOnClickListener(new View.OnClickListener()
      {
         public void onClick(View v)
         {
            Toast.makeText(MyActivity.this, "Exiting", Toast.LENGTH_SHORT).show();

                     System.exit(0);

         }//on Click

      });//Listener

   }//enterMapScreen


}//my activity