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
 * Class to open and run Lagan xml file
 * ***************************
 */
public class LaganArea extends MapScreen
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {                                     //opens up the xml file relating to the LaganArea class
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


      Button eat1Button = (Button)findViewById(R.id.lagan_to_eat1);                // get a reference to a button

      eat1Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                       // set listener to start activity
            AlertDialog.Builder eat1ButtonBuilder = new AlertDialog.Builder(LaganArea.this);

            eat1ButtonBuilder
                    .setTitle(R.string.lagan_to_eat1)
                    .setMessage(R.string.boojum_info)
                    .setIcon(R.drawable.to_eat_1_icon_50x50)
                    .setCancelable(true);

            AlertDialog eat1Button = eat1ButtonBuilder.create();

            eat1Button.show();

         }//on Click

      });//Listener

   }

   private void nandos()
   {
      Button eat2Button = (Button)findViewById(R.id.lagan_to_eat2);               // get a reference to a button

      eat2Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                      // set listener to start activity
            AlertDialog.Builder eat2ButtonBuilder = new AlertDialog.Builder(LaganArea.this);


            eat2ButtonBuilder
                    .setTitle(R.string.lagan_to_eat2)
                    .setMessage(R.string.nandos_info)
                    .setIcon(R.drawable.to_eat_2_icon_50x50)
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
      Button eat3Button = (Button)findViewById(R.id.lagan_to_eat3);                // get a reference to a button

      eat3Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                       // set listener to start activity
            AlertDialog.Builder eat3ButtonBuilder = new AlertDialog.Builder(LaganArea.this);


            eat3ButtonBuilder
                    .setTitle(R.string.lagan_to_eat3)
                    .setMessage(R.string.mal_info)
                    .setIcon(R.drawable.to_eat_3_icon_50x50)
                    .setCancelable(true);

            AlertDialog eat3Button = eat3ButtonBuilder.create();

            eat3Button.show();
         }//on Click

      });//Listener

   }

   private void topshop()
   {
      Button shop1Button = (Button)findViewById(R.id.lagan_to_shop1);             // get a reference to a button
      if(shop1Button==null)
      {
         Toast.makeText(this, "Lagan Area was null", Toast.LENGTH_SHORT).show();
         return;
      }

      shop1Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                    // set listener to start activity
            AlertDialog.Builder shop1ButtonBuilder = new AlertDialog.Builder(LaganArea.this);


            shop1ButtonBuilder
                    .setTitle(R.string.lagan_to_shop1)
                    .setMessage(R.string.topshop_info)
                    .setIcon(R.drawable.to_shop_1_icon_50x50)
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
      Button shop2Button = (Button)findViewById(R.id.lagan_to_shop2);                // get a reference to a button

      shop2Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                        // set listener to start activity
            AlertDialog.Builder shop2ButtonBuilder = new AlertDialog.Builder(LaganArea.this);


            shop2ButtonBuilder
                    .setTitle(R.string.lagan_to_shop2)
                    .setMessage(R.string.urban_info)
                    .setIcon(R.drawable.to_shop_2_icon_50x50)
                    .setCancelable(true);

            AlertDialog shop2Button = shop2ButtonBuilder.create();

            shop2Button.show();
         }//on Click

      });//Listener

   }

   private void houseOfFraser()
   {
      Button shop3Button = (Button)findViewById(R.id.lagan_to_shop3);                  // get a reference to a button

      shop3Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                           // set listener to start activity
            AlertDialog.Builder shop3ButtonBuilder = new AlertDialog.Builder(LaganArea.this);


            shop3ButtonBuilder
                    .setTitle(R.string.lagan_to_shop3)
                    .setMessage(R.string.hof_info)
                    .setIcon(R.drawable.to_shop_3_icon_50x50)
                    .setCancelable(true);

            AlertDialog shop3Button = shop3ButtonBuilder.create();

            shop3Button.show();
         }//on Click

      });//Listener

   }

   private void theBox()
   {
      Button party1Button = (Button)findViewById(R.id.lagan_to_party1);                   // get a reference to a button

      party1Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                            // set listener to start activity
            AlertDialog.Builder party1ButtonBuilder = new AlertDialog.Builder(LaganArea.this);


            party1ButtonBuilder
                    .setTitle(R.string.lagan_to_party1)
                    .setMessage(R.string.box_info)
                    .setIcon(R.drawable.to_party_1_icon_50x50)
                    .setCancelable(true)
                    .setPositiveButton("Offer Available: Free entry", new DialogInterface.OnClickListener() {
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
      Button party2Button = (Button)findViewById(R.id.lagan_to_party2);                   // get a reference to a button

      party2Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                            // set listener to start activity
            AlertDialog.Builder party2ButtonBuilder = new AlertDialog.Builder(LaganArea.this);


            party2ButtonBuilder
                    .setTitle(R.string.lagan_to_party2)
                    .setMessage(R.string.ac_info)
                    .setIcon(R.drawable.to_party_2_icon_50x50)
                    .setCancelable(true);

            AlertDialog party2Button = party2ButtonBuilder.create();

            party2Button.show();
         }//on Click

      });//Listener

   }

   private void ollies()
   {
      Button party3Button = (Button)findViewById(R.id.lagan_to_party3);                      // get a reference to a button

      party3Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                               // set listener to start activity
            AlertDialog.Builder party3ButtonBuilder = new AlertDialog.Builder(LaganArea.this);


            party3ButtonBuilder
                    .setTitle(R.string.lagan_to_party3)
                    .setMessage(R.string.ollies_info)
                    .setIcon(R.drawable.to_party_3_icon_50x50)
                    .setCancelable(true);

            AlertDialog party3Button = party3ButtonBuilder.create();

            party3Button.show();
         }//on Click

      });//Listener
   }


   private void returnToMapScreen()

    {
        Button enterButton = (Button)findViewById(R.id.lagan_to_map_screen);                     // get a reference to a button

        enterButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast.makeText(LaganArea.this, "Returning", Toast.LENGTH_SHORT).show();          // toast to inform user of navigation route

                finish();                                                                        //closes this screen and returns to map screen

            }//on Click

        });//Listener

    }//return to Map Screen

}//class