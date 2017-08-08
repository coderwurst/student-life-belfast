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
 * User: Apptitude
 * Date: 06.12.13
 * Time & Version: 18:53 V1
 * Class to open and run City Centre xml file
 * ***************************
 */
public class CityCentre extends MapScreen
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {                                 //opens up the xml file relating to the CityCentre class
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
      Button eat1Button = (Button)findViewById(R.id.centre_to_eat1);                     // get a reference to a button

      eat1Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                             // set listener to start activity
            AlertDialog.Builder eat1ButtonBuilder = new AlertDialog.Builder(CityCentre.this);

            eat1ButtonBuilder
                    .setTitle(R.string.centre_to_eat1)
                    .setMessage(R.string.mcd_info)
                    .setIcon(R.drawable.to_eat_1_icon_50x50)
                    .setCancelable(true);

            AlertDialog eat1Button = eat1ButtonBuilder.create();

            eat1Button.show();

         }//on Click

      });//Listener

   }

   private void subway()
   {
      Button eat2Button = (Button)findViewById(R.id.centre_to_eat2);                     // get a reference to a button

      eat2Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                             // set listener to start activity
            AlertDialog.Builder eat2ButtonBuilder = new AlertDialog.Builder(CityCentre.this);


            eat2ButtonBuilder
                    .setTitle(R.string.centre_to_eat2)
                    .setMessage(R.string.subway_info)
                    .setIcon(R.drawable.to_eat_2_icon_50x50)
                    .setCancelable(true);

            AlertDialog eat2Button = eat2ButtonBuilder.create();

            eat2Button.show();
         }//on Click

      });//Listener

   }

   private void clements()
   {
      Button eat3Button = (Button)findViewById(R.id.centre_to_eat3);                     // get a reference to a button

      eat3Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                             // set listener to start activity
            AlertDialog.Builder eat3ButtonBuilder = new AlertDialog.Builder(CityCentre.this);


            eat3ButtonBuilder
                    .setTitle(R.string.centre_to_eat3)
                    .setMessage(R.string.clements_info)
                    .setIcon(R.drawable.to_eat_3_icon_50x50)
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
      Button shop1Button = (Button)findViewById(R.id.centre_to_shop1);                   // get a reference to a button

      shop1Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                            // set listener to start activity
            AlertDialog.Builder shop1ButtonBuilder = new AlertDialog.Builder(CityCentre.this);


            shop1ButtonBuilder
                    .setTitle(R.string.centre_to_shop1)
                    .setMessage(R.string.primark_info)
                    .setIcon(R.drawable.to_shop_1_icon_50x50)
                    .setCancelable(true);

            AlertDialog shop1Button = shop1ButtonBuilder.create();

            shop1Button.show();
         }//on Click

      });//Listener

   }

   private void next()
   {
      Button shop2Button = (Button)findViewById(R.id.centre_to_shop2);                   // get a reference to a button

      shop2Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                            // set listener to start activity
            AlertDialog.Builder shop2ButtonBuilder = new AlertDialog.Builder(CityCentre.this);


            shop2ButtonBuilder
                    .setTitle(R.string.centre_to_shop2)
                    .setMessage(R.string.next_info)
                    .setIcon(R.drawable.to_shop_2_icon_50x50)
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
      Button shop3Button = (Button)findViewById(R.id.centre_to_shop3);                  // get a reference to a button

      shop3Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                           // set listener to start activity
            AlertDialog.Builder shop3ButtonBuilder = new AlertDialog.Builder(CityCentre.this);


            shop3ButtonBuilder
                    .setTitle(R.string.centre_to_shop3)
                    .setMessage(R.string.zara_info)
                    .setIcon(R.drawable.to_shop_3_icon_50x50)
                    .setCancelable(true);

            AlertDialog shop3Button = shop3ButtonBuilder.create();

            shop3Button.show();
         }//on Click

      });//Listener

   }

   private void duke()
   {
      Button party1Button = (Button)findViewById(R.id.centre_to_party1);            // get a reference to a button

      party1Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                      // set listener to start activity
            AlertDialog.Builder party1ButtonBuilder = new AlertDialog.Builder(CityCentre.this);


            party1ButtonBuilder
                    .setTitle(R.string.centre_to_party1)
                    .setMessage(R.string.duke_info)
                    .setIcon(R.drawable.to_party_1_icon_50x50)
                    .setCancelable(true);

            AlertDialog party1Button = party1ButtonBuilder.create();

            party1Button.show();
         }//on Click

      });//Listener

   }

   private void apartment()
   {
      Button party2Button = (Button)findViewById(R.id.centre_to_party2);           // get a reference to a button

      party2Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                     // set listener to start activity
            AlertDialog.Builder party2ButtonBuilder = new AlertDialog.Builder(CityCentre.this);


            party2ButtonBuilder
                    .setTitle(R.string.centre_to_party2)
                    .setMessage(R.string.aptmnt_info)
                    .setIcon(R.drawable.to_party_2_icon_50x50)
                    .setCancelable(true);

            AlertDialog party2Button = party2ButtonBuilder.create();

            party2Button.show();
         }//on Click

      });//Listener

   }

   private void thompsons()
   {
      Button party3Button = (Button)findViewById(R.id.centre_to_party3);            // get a reference to a button

      party3Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                      // set listener to start activity
            AlertDialog.Builder party3ButtonBuilder = new AlertDialog.Builder(CityCentre.this);


            party3ButtonBuilder
                    .setTitle(R.string.centre_to_party3)
                    .setMessage(R.string.thompsons_info)
                    .setIcon(R.drawable.to_party_3_icon_50x50)
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
        Button enterButton = (Button)findViewById(R.id.centre_to_map_screen);           // get a reference to a button

        enterButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {                                         // set listener to start activity
                Toast.makeText(CityCentre.this, "Returning", Toast.LENGTH_SHORT).show(); // toast to inform user of navigation route


                finish();                                                               //closes this screen and returns to map screen

            }//on Click

        });//Listener

    }//return to Map Screen

}//class