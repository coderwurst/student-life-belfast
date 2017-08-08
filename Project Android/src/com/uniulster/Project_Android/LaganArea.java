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
public class LaganArea extends MapScreen
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lagan_map);
        boojum();
        nandos();
        theMal();
        topshop();
        urban();
        houseOfFraser();
        theBox();
        alleyCat();
        ollies();
        returnToMapScreen();
    }//onCreate


   private void boojum()
   {
      // 1. Get a reference to a button

      Button eat1Button = (Button)findViewById(R.id.lagan_to_eat1);

      // 2. Set the click listener to implement the notification code

      eat1Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder eat1ButtonBuilder = new AlertDialog.Builder(LaganArea.this);

            eat1ButtonBuilder
                    .setTitle(R.string.lagan_to_eat1)
                    .setMessage(R.string.boojum_info)
                    .setIcon(R.drawable.to_eat)
                    .setCancelable(true);

            AlertDialog eat1Button = eat1ButtonBuilder.create();

            eat1Button.show();

         }//on Click

      });//Listener

   }

   private void nandos()
   {
      // 1. Get a reference to a button

      Button eat2Button = (Button)findViewById(R.id.lagan_to_eat2);

      // 2. Set the click listener to implement the notification code

      eat2Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder eat2ButtonBuilder = new AlertDialog.Builder(LaganArea.this);


            eat2ButtonBuilder
                    .setTitle(R.string.lagan_to_eat2)
                    .setMessage(R.string.nandos_info)
                    .setIcon(R.drawable.to_eat)
                    .setCancelable(true)
                    .setPositiveButton("Offer Available: Free Soft Drink!", new DialogInterface.OnClickListener() {
                       public void onClick(DialogInterface dialog, int id) {
                          AlertDialog.Builder offerDialogBuilder = new AlertDialog.Builder(LaganArea.this);
                          offerDialogBuilder
                                  .setTitle("Barcode")
                                  .setIcon(R.drawable.barcode)
                                  .setMessage(R.string.nandos_offer)
                                  .setCancelable(true);
                          AlertDialog offerDialog = offerDialogBuilder.create();
                          offerDialog.show();
                       }
                    });

            AlertDialog eat2Button = eat2ButtonBuilder.create();

            eat2Button.show();
         }//on Click

      });//Listener

   }

   private void theMal()
   {
      // 1. Get a reference to a button

      Button eat3Button = (Button)findViewById(R.id.lagan_to_eat3);

      // 2. Set the click listener to implement the notification code

      eat3Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder eat3ButtonBuilder = new AlertDialog.Builder(LaganArea.this);


            eat3ButtonBuilder
                    .setTitle(R.string.lagan_to_eat3)
                    .setMessage(R.string.mal_info)
                    .setIcon(R.drawable.to_eat)
                    .setCancelable(true);

            AlertDialog eat3Button = eat3ButtonBuilder.create();

            eat3Button.show();
         }//on Click

      });//Listener

   }

   private void topshop()
   {
      // 1. Get a reference to a button

      Button shop1Button = (Button)findViewById(R.id.lagan_to_shop1);
      if(shop1Button==null)
      {
         Toast.makeText(this, "Lagan Area was null", Toast.LENGTH_SHORT).show();
         return;
      }
      // 2. Set the click listener to implement the notification code

      shop1Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder shop1ButtonBuilder = new AlertDialog.Builder(LaganArea.this);


            shop1ButtonBuilder
                    .setTitle(R.string.lagan_to_shop1)
                    .setMessage(R.string.topshop_info)
                    .setIcon(R.drawable.to_eat)
                    .setCancelable(true)
                    .setPositiveButton("Offer Available: 10% off!", new DialogInterface.OnClickListener() {
                       public void onClick(DialogInterface dialog, int id) {
                          AlertDialog.Builder offerDialogBuilder = new AlertDialog.Builder(LaganArea.this);
                          offerDialogBuilder
                                  .setTitle("Barcode")
                                  .setIcon(R.drawable.barcode)
                                  .setMessage(R.string.topshop_offer)
                                  .setCancelable(true);
                          AlertDialog offerDialog = offerDialogBuilder.create();
                          offerDialog.show();
                       }
                    });

            AlertDialog shop1Button = shop1ButtonBuilder.create();

            shop1Button.show();
         }//on Click

      });//Listener

   }

   private void urban()
   {
      // 1. Get a reference to a button

      Button shop2Button = (Button)findViewById(R.id.lagan_to_shop2);

      // 2. Set the click listener to implement the notification code

      shop2Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder shop2ButtonBuilder = new AlertDialog.Builder(LaganArea.this);


            shop2ButtonBuilder
                    .setTitle(R.string.lagan_to_shop2)
                    .setMessage(R.string.urban_info)
                    .setIcon(R.drawable.to_eat)
                    .setCancelable(true);

            AlertDialog shop2Button = shop2ButtonBuilder.create();

            shop2Button.show();
         }//on Click

      });//Listener

   }

   private void houseOfFraser()
   {
      // 1. Get a reference to a button

      Button shop3Button = (Button)findViewById(R.id.lagan_to_shop3);

      // 2. Set the click listener to implement the notification code

      shop3Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder shop3ButtonBuilder = new AlertDialog.Builder(LaganArea.this);


            shop3ButtonBuilder
                    .setTitle(R.string.lagan_to_shop3)
                    .setMessage(R.string.hof_info)
                    .setIcon(R.drawable.to_eat)
                    .setCancelable(true);

            AlertDialog shop3Button = shop3ButtonBuilder.create();

            shop3Button.show();
         }//on Click

      });//Listener

   }

   private void theBox()
   {
      // 1. Get a reference to a button

      Button party1Button = (Button)findViewById(R.id.lagan_to_party1);

      // 2. Set the click listener to implement the notification code

      party1Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder party1ButtonBuilder = new AlertDialog.Builder(LaganArea.this);


            party1ButtonBuilder
                    .setTitle(R.string.lagan_to_party1)
                    .setMessage(R.string.box_info)
                    .setIcon(R.drawable.to_eat)
                    .setCancelable(true)
                    .setPositiveButton("Offer Available: Free entry before midnight", new DialogInterface.OnClickListener() {
                       public void onClick(DialogInterface dialog, int id) {
                          AlertDialog.Builder offerDialogBuilder = new AlertDialog.Builder(LaganArea.this);
                          offerDialogBuilder
                                  .setTitle("Barcode")
                                  .setIcon(R.drawable.barcode)
                                  .setMessage(R.string.box_offer)
                                  .setCancelable(true);
                          AlertDialog offerDialog = offerDialogBuilder.create();
                          offerDialog.show();
                       }
                    });

            AlertDialog party1Button = party1ButtonBuilder.create();

            party1Button.show();
         }//on Click

      });//Listener

   }

   private void alleyCat()
   {
      // 1. Get a reference to a button

      Button party2Button = (Button)findViewById(R.id.lagan_to_party2);

      // 2. Set the click listener to implement the notification code

      party2Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder party2ButtonBuilder = new AlertDialog.Builder(LaganArea.this);


            party2ButtonBuilder
                    .setTitle(R.string.lagan_to_party2)
                    .setMessage(R.string.ac_info)
                    .setIcon(R.drawable.to_eat)
                    .setCancelable(true);

            AlertDialog party2Button = party2ButtonBuilder.create();

            party2Button.show();
         }//on Click

      });//Listener

   }

   private void ollies()
   {
      // 1. Get a reference to a button

      Button party3Button = (Button)findViewById(R.id.lagan_to_party3);

      // 2. Set the click listener to implement the notification code

      party3Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder party3ButtonBuilder = new AlertDialog.Builder(LaganArea.this);


            party3ButtonBuilder
                    .setTitle(R.string.lagan_to_party3)
                    .setMessage(R.string.ollies_info)
                    .setIcon(R.drawable.to_eat)
                    .setCancelable(true);

            AlertDialog party3Button = party3ButtonBuilder.create();

            party3Button.show();
         }//on Click

      });//Listener
   }


   private void returnToMapScreen()

    {
        // 1. Get a reference to a button

        Button enterButton = (Button)findViewById(R.id.lagan_to_map_screen);

        // 2. Set the click listener to run my code

        enterButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast.makeText(LaganArea.this, "Returning", Toast.LENGTH_SHORT).show();


                //startActivity(new Intent(MapScreen.this, MainActivity.class));

                finish();

            }//on Click

        });//Listener

    }//return to Map Screen

}//class