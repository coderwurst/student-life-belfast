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
 * User: Apptitude
 * Date: 06.12.13
 * Time & Version: 18:53 V1
 * Class to open and run University Area xml file
 * ***************************
 */
public class UniversityArea extends MapScreen
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {                               //opens up the xml file relating to the UniversityArea class
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
      Button eat1Button = (Button)findViewById(R.id.uni_to_eat1);                                       // get a reference to a button


      eat1Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                                            // set listener to start activity
            AlertDialog.Builder eat1ButtonBuilder = new AlertDialog.Builder(UniversityArea.this);

            eat1ButtonBuilder
                    .setTitle(R.string.uni_to_eat1)
                    .setMessage(R.string.chip_info)
                    .setIcon(R.drawable.to_eat_1_icon_50x50)
                    .setCancelable(true);

            AlertDialog eat1Button = eat1ButtonBuilder.create();

            eat1Button.show();

      }//on Click

      });//Listener

   }

   private void maggieMays()
   {

      Button eat2Button = (Button)findViewById(R.id.uni_to_eat2);                                       // get a reference to a button



      eat2Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                                            // set listener to start activity
            AlertDialog.Builder eat2ButtonBuilder = new AlertDialog.Builder(UniversityArea.this);


            eat2ButtonBuilder
                    .setTitle(R.string.uni_to_eat2)
                    .setMessage(R.string.maggie_info)
                    .setIcon(R.drawable.to_eat_2_icon_50x50)
                    .setCancelable(true);

            AlertDialog eat2Button = eat2ButtonBuilder.create();

            eat2Button.show();
         }//on Click

      });//Listener

   }

   private void villaItalia()
   {
      Button eat3Button = (Button)findViewById(R.id.uni_to_eat3);                                      // get a reference to a button

      eat3Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                                           // set listener to start activity
            AlertDialog.Builder eat3ButtonBuilder = new AlertDialog.Builder(UniversityArea.this);


            eat3ButtonBuilder
                    .setTitle(R.string.uni_to_eat3)
                    .setMessage(R.string.villa_info)
                    .setIcon(R.drawable.to_eat_3_icon_50x50)
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

      Button shop1Button = (Button)findViewById(R.id.uni_to_shop1);                                    // get a reference to a button

      shop1Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                                          // set listener to start activity
            AlertDialog.Builder shop1ButtonBuilder = new AlertDialog.Builder(UniversityArea.this);


            shop1ButtonBuilder
                    .setTitle(R.string.uni_to_shop1)
                    .setMessage(R.string.rusty_info)
                    .setIcon(R.drawable.to_shop_1_icon_50x50)
                    .setCancelable(true);

            AlertDialog shop1Button = shop1ButtonBuilder.create();

            shop1Button.show();
         }//on Click

      });//Listener

   }

   private void qubShop()
   {
      Button shop2Button = (Button)findViewById(R.id.uni_to_shop2);                                    // get a reference to a button

      shop2Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                                          // set listener to start activity
            AlertDialog.Builder shop2ButtonBuilder = new AlertDialog.Builder(UniversityArea.this);


            shop2ButtonBuilder
                    .setTitle(R.string.uni_to_shop2)
                    .setMessage(R.string.qub_info)
                    .setIcon(R.drawable.to_shop_2_icon_50x50)
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
   {                                                                                                      // get a reference to a button
      Button shop3Button = (Button)findViewById(R.id.uni_to_shop3);

      shop3Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                                             // set listener to start activity
            AlertDialog.Builder shop3ButtonBuilder = new AlertDialog.Builder(UniversityArea.this);


            shop3ButtonBuilder
                    .setTitle(R.string.uni_to_shop3)
                    .setMessage(R.string.clothesline_info)
                    .setIcon(R.drawable.to_shop_3_icon_50x50)
                    .setCancelable(true);

            AlertDialog shop3Button = shop3ButtonBuilder.create();

            shop3Button.show();
         }//on Click

      });//Listener

   }

   private void mClub()
   {                                                                                                     // get a reference to a button
      Button party1Button = (Button)findViewById(R.id.uni_to_party1);

      party1Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                                            // set listener to start activity
            AlertDialog.Builder party1ButtonBuilder = new AlertDialog.Builder(UniversityArea.this);


            party1ButtonBuilder
                    .setTitle(R.string.uni_to_party1)
                    .setMessage(R.string.mclub_info)
                    .setIcon(R.drawable.to_party_1_icon_50x50)
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
      Button party2Button = (Button)findViewById(R.id.uni_to_party2);                                        // get a reference to a button

      party2Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                                               // set listener to start activity
            AlertDialog.Builder party2ButtonBuilder = new AlertDialog.Builder(UniversityArea.this);


            party2ButtonBuilder
                    .setTitle(R.string.uni_to_party2)
                    .setMessage(R.string.qubsu_info)
                    .setIcon(R.drawable.to_party_2_icon_50x50)
                    .setCancelable(true);

            AlertDialog party2Button = party2ButtonBuilder.create();

            party2Button.show();
         }//on Click

      });//Listener

   }

   private void eg()
   {
      Button party3Button = (Button)findViewById(R.id.uni_to_party3);                                       // get a reference to a button

      party3Button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
         {                                                              // set listener to start activity
            AlertDialog.Builder party3ButtonBuilder = new AlertDialog.Builder(UniversityArea.this);


            party3ButtonBuilder
                    .setTitle(R.string.uni_to_party3)
                    .setMessage(R.string.eg_info)
                    .setIcon(R.drawable.to_party_3_icon_50x50)
                    .setCancelable(true);

            AlertDialog party3Button = party3ButtonBuilder.create();

            party3Button.show();
         }//on Click

      });//Listener
   }


   private void returnToMapScreen()

    {
       Button enterButton = (Button)findViewById(R.id.uni_to_map_screen);                                   // get a reference to a button
       if(enterButton==null)
       {
          Toast.makeText(this, " Area was null", Toast.LENGTH_SHORT).show();                                //toast to inform user  of navigation
          return;
       }


        enterButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast.makeText(UniversityArea.this, "Returning", Toast.LENGTH_SHORT).show();                // toast to inform user of navigation route


                finish();                                                                                   //closes this screen and returns to map screen

            }//on Click

        });//Listener

    }//return to Map Screen

}//class
