package com.uniulster.Project_Android;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {                                       //opens up the xml file relating to the MyActivity class
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        enterMapScreen();
        exitApp();
        //exit Program

    }//on create

    private void enterMapScreen()

    {
        Button enterButton = (Button)findViewById(R.id.toMapScreen);                           // get a reference to a button

        enterButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {                                                // set listener to start activity
                Toast.makeText(MyActivity.this, "Welcome", Toast.LENGTH_SHORT).show();         // toast to inform user of navigation route


                startActivity(new Intent(MyActivity.this, MapScreen.class));                   //sends the user to the map screen

            }//on Click

        });//Listener

    }//enterMapScreen

   private void exitApp()

   {
      Button enterButton = (Button)findViewById(R.id.exitButton);                              //exit button to exit the app and return to android home screen

      enterButton.setOnClickListener(new View.OnClickListener()
      {
         public void onClick(View v)
         {
            System.exit(0);

         }//on Click

      });//Listener

   }//enterMapScreen


}//my activity