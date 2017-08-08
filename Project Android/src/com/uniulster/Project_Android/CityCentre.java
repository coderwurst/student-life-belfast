package com.uniulster.Project_Android;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
 * Time & Version: 18:53 V1
 * PROGRAM INFO
 * ***************************
 */
public class CityCentre extends MapScreen
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city_centre_map);

        primark();
        next();
        zara();
        mcdonalds();
        subway();
        clements();
        duke();
        apartment();
        thompsons();

        returnToMapScreen();
    }//onCreate


   private void mcdonalds()
   {
      // 1. Get a reference to a button

      Button eat1Button = (Button)findViewById(R.id.centre_to_eat1);

      // 2. Set the click listener to implement the notification code

      eat1Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder eat1ButtonBuilder = new AlertDialog.Builder(CityCentre.this);

            eat1ButtonBuilder
                    .setTitle(R.string.centre_to_eat1)
                    .setMessage(R.string.mcd_info)
                    .setIcon(R.drawable.icon_screen_to_eat_icon_75x75)
                    .setCancelable(true);

            AlertDialog eat1Button = eat1ButtonBuilder.create();

            eat1Button.show();

         }//on Click

      });//Listener

   }

   private void subway()
   {
      // 1. Get a reference to a button

      Button eat2Button = (Button)findViewById(R.id.centre_to_eat2);

      // 2. Set the click listener to implement the notification code

      eat2Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder eat2ButtonBuilder = new AlertDialog.Builder(CityCentre.this);


            eat2ButtonBuilder
                    .setTitle(R.string.centre_to_eat2)
                    .setMessage(R.string.subway_info)
                    .setIcon(R.drawable.icon_screen_to_eat_icon_75x75)
                    .setCancelable(true);

            AlertDialog eat2Button = eat2ButtonBuilder.create();

            eat2Button.show();
         }//on Click

      });//Listener

   }

   private void clements()
   {
      // 1. Get a reference to a button

      Button eat3Button = (Button)findViewById(R.id.centre_to_eat3);

      // 2. Set the click listener to implement the notification code

      eat3Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder eat3ButtonBuilder = new AlertDialog.Builder(CityCentre.this);


            eat3ButtonBuilder
                    .setTitle(R.string.centre_to_eat3)
                    .setMessage(R.string.clements_info)
                    .setIcon(R.drawable.icon_screen_to_eat_icon_75x75)
                    .setCancelable(true)
                    .setPositiveButton("Offer Available: Free refill!", new DialogInterface.OnClickListener() {
                       public void onClick(DialogInterface dialog, int id) {
                          AlertDialog.Builder offerDialogBuilder = new AlertDialog.Builder(CityCentre.this);
                          offerDialogBuilder
                                  .setTitle("Barcode")
                                  .setIcon(R.drawable.barcode)
                                  .setMessage(R.string.clements_offer)
                                  .setCancelable(true);
                          AlertDialog offerDialog = offerDialogBuilder.create();
                          offerDialog.show();
                       }
                    });

            AlertDialog eat3Button = eat3ButtonBuilder.create();

            eat3Button.show();
         }//on Click

      });//Listener

   }

   private void primark()
   {
      // 1. Get a reference to a button

      Button shop1Button = (Button)findViewById(R.id.centre_to_shop1);

      // 2. Set the click listener to implement the notification code

      shop1Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder shop1ButtonBuilder = new AlertDialog.Builder(CityCentre.this);


            shop1ButtonBuilder
                    .setTitle(R.string.centre_to_shop1)
                    .setMessage(R.string.primark_info)
                    .setIcon(R.drawable.icon_screen_to_shop_icon_75x75)
                    .setCancelable(true);

            AlertDialog shop1Button = shop1ButtonBuilder.create();

            shop1Button.show();
         }//on Click

      });//Listener

   }

   private void next()
   {
      // 1. Get a reference to a button

      Button shop2Button = (Button)findViewById(R.id.centre_to_shop2);

      // 2. Set the click listener to implement the notification code

      shop2Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder shop2ButtonBuilder = new AlertDialog.Builder(CityCentre.this);


            shop2ButtonBuilder
                    .setTitle(R.string.centre_to_shop2)
                    .setMessage(R.string.next_info)
                    .setIcon(R.drawable.icon_screen_to_shop_icon_75x75)
                    .setCancelable(true)
                    .setPositiveButton("Offer Available: 10% off!", new DialogInterface.OnClickListener() {
                       public void onClick(DialogInterface dialog, int id) {
                          AlertDialog.Builder offerDialogBuilder = new AlertDialog.Builder(CityCentre.this);
                          offerDialogBuilder
                                  .setTitle("Barcode")
                                  .setIcon(R.drawable.barcode)
                                  .setMessage(R.string.next_offer)
                                  .setCancelable(true);
                          AlertDialog offerDialog = offerDialogBuilder.create();
                          offerDialog.show();
                       }
                    });

            AlertDialog shop2Button = shop2ButtonBuilder.create();

            shop2Button.show();
         }//on Click

      });//Listener

   }

   private void zara()
   {
      // 1. Get a reference to a button

      Button shop3Button = (Button)findViewById(R.id.centre_to_shop3);

      // 2. Set the click listener to implement the notification code

      shop3Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder shop3ButtonBuilder = new AlertDialog.Builder(CityCentre.this);


            shop3ButtonBuilder
                    .setTitle(R.string.centre_to_shop3)
                    .setMessage(R.string.zara_info)
                    .setIcon(R.drawable.icon_screen_to_shop_icon_75x75)
                    .setCancelable(true);

            AlertDialog shop3Button = shop3ButtonBuilder.create();

            shop3Button.show();
         }//on Click

      });//Listener

   }

   private void duke()
   {
      // 1. Get a reference to a button

      Button party1Button = (Button)findViewById(R.id.centre_to_party1);

      // 2. Set the click listener to implement the notification code

      party1Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder party1ButtonBuilder = new AlertDialog.Builder(CityCentre.this);


            party1ButtonBuilder
                    .setTitle(R.string.centre_to_party1)
                    .setMessage(R.string.duke_info)
                    .setIcon(R.drawable.icon_screen_to_party_icon_75x75)
                    .setCancelable(true);

            AlertDialog party1Button = party1ButtonBuilder.create();

            party1Button.show();
         }//on Click

      });//Listener

   }

   private void apartment()
   {
      // 1. Get a reference to a button

      Button party2Button = (Button)findViewById(R.id.centre_to_party2);

      // 2. Set the click listener to implement the notification code

      party2Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder party2ButtonBuilder = new AlertDialog.Builder(CityCentre.this);


            party2ButtonBuilder
                    .setTitle(R.string.centre_to_party2)
                    .setMessage(R.string.aptmnt_info)
                    .setIcon(R.drawable.icon_screen_to_party_icon_75x75)
                    .setCancelable(true);

            AlertDialog party2Button = party2ButtonBuilder.create();

            party2Button.show();
         }//on Click

      });//Listener

   }

   private void thompsons()
   {
      // 1. Get a reference to a button

      Button party3Button = (Button)findViewById(R.id.centre_to_party3);

      // 2. Set the click listener to implement the notification code

      party3Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder party3ButtonBuilder = new AlertDialog.Builder(CityCentre.this);


            party3ButtonBuilder
                    .setTitle(R.string.centre_to_party3)
                    .setMessage(R.string.thompsons_info)
                    .setIcon(R.drawable.icon_screen_to_party_icon_75x75)
                    .setCancelable(true)
                    .setPositiveButton("Offer Available: Free entry before midnight", new DialogInterface.OnClickListener() {
                       public void onClick(DialogInterface dialog, int id) {
                          AlertDialog.Builder offerDialogBuilder = new AlertDialog.Builder(CityCentre.this);
                          offerDialogBuilder
                                  .setTitle("Barcode")
                                  .setIcon(R.drawable.barcode)
                                  .setMessage(R.string.thompsons_offer)
                                  .setCancelable(true);
                          AlertDialog offerDialog = offerDialogBuilder.create();
                          offerDialog.show();
                       }
                    });

            AlertDialog party3Button = party3ButtonBuilder.create();

            party3Button.show();
         }//on Click

      });//Listener
   }


   private void returnToMapScreen()

    {
        // 1. Get a reference to a button

        Button enterButton = (Button)findViewById(R.id.centre_to_map_screen);

        // 2. Set the click listener to run my code

        enterButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast.makeText(CityCentre.this, "Returning", Toast.LENGTH_SHORT).show();


                //startActivity(new Intent(MapScreen.this, MainActivity.class));

                finish();

            }//on Click

        });//Listener

    }//return to Map Screen

}//class