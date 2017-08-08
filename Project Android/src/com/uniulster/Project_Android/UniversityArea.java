package com.uniulster.Project_Android;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * **************************
 * Created with IntelliJ IDEA
 * User: Andrew McMechan
 * Student ID: B00652181
 * Date: 28/11/13
 * Time & Version: 18:54 V1
 * PROGRAM INFO
 * ***************************
 */
public class UniversityArea extends MapScreen
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uni_area_map);

        chipCo();
        maggieMays();
        villaItalia();
        rustyZip();
        qubShop();
        clothesline();
        mClub();
        qubsu();
        eg();

        returnToMapScreen();
    }//onCreate

   private void chipCo()
   {
      // 1. Get a reference to a button

      Button eat1Button = (Button)findViewById(R.id.uni_to_eat1);

      // 2. Set the click listener to implement the notification code

      eat1Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder eat1ButtonBuilder = new AlertDialog.Builder(UniversityArea.this);

            eat1ButtonBuilder
                    .setTitle(R.string.uni_to_eat1)
                    .setMessage(R.string.chip_info)
                    .setIcon(R.drawable.icon_screen_to_eat_icon_75x75)
                    .setCancelable(true);

            AlertDialog eat1Button = eat1ButtonBuilder.create();

            eat1Button.show();

         }//on Click

      });//Listener

   }

   private void maggieMays()
   {
      // 1. Get a reference to a button

      Button eat2Button = (Button)findViewById(R.id.uni_to_eat2);

      // 2. Set the click listener to implement the notification code

      eat2Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder eat2ButtonBuilder = new AlertDialog.Builder(UniversityArea.this);


            eat2ButtonBuilder
                    .setTitle(R.string.uni_to_eat2)
                    .setMessage(R.string.maggie_info)
                    .setIcon(R.drawable.icon_screen_to_eat_icon_75x75)
                    .setCancelable(true);

            AlertDialog eat2Button = eat2ButtonBuilder.create();

            eat2Button.show();
         }//on Click

      });//Listener

   }

   private void villaItalia()
   {
      // 1. Get a reference to a button

      Button eat3Button = (Button)findViewById(R.id.uni_to_eat3);

      // 2. Set the click listener to implement the notification code

      eat3Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder eat3ButtonBuilder = new AlertDialog.Builder(UniversityArea.this);


            eat3ButtonBuilder
                    .setTitle(R.string.uni_to_eat3)
                    .setMessage(R.string.villa_info)
                    .setIcon(R.drawable.icon_screen_to_eat_icon_75x75)
                    .setCancelable(true)
                    .setPositiveButton("Offer Available: 2 courses for £12!", new DialogInterface.OnClickListener() {
                       public void onClick(DialogInterface dialog, int id) {
                          AlertDialog.Builder offerDialogBuilder = new AlertDialog.Builder(UniversityArea.this);
                          offerDialogBuilder
                                  .setTitle("Barcode")
                                  .setIcon(R.drawable.barcode)
                                  .setMessage(R.string.villa_offer)
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

   private void rustyZip()
   {
      // 1. Get a reference to a button

      Button shop1Button = (Button)findViewById(R.id.uni_to_shop1);

      // 2. Set the click listener to implement the notification code

      shop1Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder shop1ButtonBuilder = new AlertDialog.Builder(UniversityArea.this);


            shop1ButtonBuilder
                    .setTitle(R.string.uni_to_shop1)
                    .setMessage(R.string.rusty_info)
                    .setIcon(R.drawable.icon_screen_to_shop_icon_75x75)
                    .setCancelable(true);

            AlertDialog shop1Button = shop1ButtonBuilder.create();

            shop1Button.show();
         }//on Click

      });//Listener

   }

   private void qubShop()
   {
      // 1. Get a reference to a button

      Button shop2Button = (Button)findViewById(R.id.uni_to_shop2);

      // 2. Set the click listener to implement the notification code

      shop2Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder shop2ButtonBuilder = new AlertDialog.Builder(UniversityArea.this);


            shop2ButtonBuilder
                    .setTitle(R.string.uni_to_shop2)
                    .setMessage(R.string.qub_info)
                    .setIcon(R.drawable.icon_screen_to_shop_icon_75x75)
                    .setCancelable(true)
                    .setPositiveButton("Offer Available: 15% Off!", new DialogInterface.OnClickListener() {
                       public void onClick(DialogInterface dialog, int id) {
                          AlertDialog.Builder offerDialogBuilder = new AlertDialog.Builder(UniversityArea.this);
                          offerDialogBuilder
                                  .setTitle("Barcode")
                                  .setIcon(R.drawable.barcode)
                                  .setMessage(R.string.qub_offer)
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

   private void clothesline()
   {
      // 1. Get a reference to a button

      Button shop3Button = (Button)findViewById(R.id.uni_to_shop3);

      // 2. Set the click listener to implement the notification code

      shop3Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder shop3ButtonBuilder = new AlertDialog.Builder(UniversityArea.this);


            shop3ButtonBuilder
                    .setTitle(R.string.uni_to_shop3)
                    .setMessage(R.string.clothesline_info)
                    .setIcon(R.drawable.icon_screen_to_shop_icon_75x75)
                    .setCancelable(true);

            AlertDialog shop3Button = shop3ButtonBuilder.create();

            shop3Button.show();
         }//on Click

      });//Listener

   }

   private void mClub()
   {
      // 1. Get a reference to a button

      Button party1Button = (Button)findViewById(R.id.uni_to_party1);

      // 2. Set the click listener to implement the notification code

      party1Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder party1ButtonBuilder = new AlertDialog.Builder(UniversityArea.this);


            party1ButtonBuilder
                    .setTitle(R.string.uni_to_party1)
                    .setMessage(R.string.mclub_info)
                    .setIcon(R.drawable.icon_screen_to_party_icon_75x75)
                    .setCancelable(true)
                    .setPositiveButton("Offer Available: Free Drink", new DialogInterface.OnClickListener() {
                       public void onClick(DialogInterface dialog, int id) {
                          AlertDialog.Builder offerDialogBuilder = new AlertDialog.Builder(UniversityArea.this);
                          offerDialogBuilder
                                  .setTitle("Barcode")
                                  .setIcon(R.drawable.barcode)
                                  .setMessage(R.string.mclub_offer)
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

   private void qubsu()
   {
      // 1. Get a reference to a button

      Button party2Button = (Button)findViewById(R.id.uni_to_party2);

      // 2. Set the click listener to implement the notification code

      party2Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder party2ButtonBuilder = new AlertDialog.Builder(UniversityArea.this);


            party2ButtonBuilder
                    .setTitle(R.string.uni_to_party2)
                    .setMessage(R.string.qubsu_info)
                    .setIcon(R.drawable.icon_screen_to_party_icon_75x75)
                    .setCancelable(true);

            AlertDialog party2Button = party2ButtonBuilder.create();

            party2Button.show();
         }//on Click

      });//Listener

   }

   private void eg()
   {
      // 1. Get a reference to a button

      Button party3Button = (Button)findViewById(R.id.uni_to_party3);

      // 2. Set the click listener to implement the notification code

      party3Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {
            AlertDialog.Builder party3ButtonBuilder = new AlertDialog.Builder(UniversityArea.this);


            party3ButtonBuilder
                    .setTitle(R.string.uni_to_party3)
                    .setMessage(R.string.eg_info)
                    .setIcon(R.drawable.icon_screen_to_party_icon_75x75)
                    .setCancelable(true);

            AlertDialog party3Button = party3ButtonBuilder.create();

            party3Button.show();
         }//on Click

      });//Listener
   }


   private void returnToMapScreen()

    {
        // 1. Get a reference to a button

        Button enterButton = (Button)findViewById(R.id.uni_to_map_screen);
       if(enterButton==null)
       {
          Toast.makeText(this, " Area was null", Toast.LENGTH_SHORT).show();
          return;
       }
        // 2. Set the click listener to run my code

        enterButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast.makeText(UniversityArea.this, "Returning", Toast.LENGTH_SHORT).show();


                //startActivity(new Intent(MapScreen.this, MainActivity.class));

                finish();

            }//on Click

        });//Listener

    }//return to Map Screen

}//class
