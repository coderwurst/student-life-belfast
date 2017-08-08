package com.uniulster.Project_Android;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

/**
 * Created by IntelliJ IDEA.
 * User: Colm
 * Date: 05/12/13
 * Time: 11:02
 * UPDATE COMMENT ABOUT PROGRAM HERE
 */
public class Splash extends Activity
  //intro song to app
{ MediaPlayer introsong;

   @Override
    public void onCreate (Bundle savedInstanceState)
{
  super.onCreate(savedInstanceState);
   setContentView(R.layout.splashbo);
   //call song from raw folder under resources
   introsong = MediaPlayer.create(Splash.this, R.raw.app_intro);
   introsong.start();

   Thread splashThread = new Thread() {

      public void run() {
         try {                                                                  //pause running of method for 5 seconds
            Thread.sleep(5000);

         } catch (Exception e) {

         } finally {
            //once splash image disappears, pull up mcactivity class to start up app intro
            Intent i = new Intent(Splash.this,MyActivity.class);

            startActivity(i);

            finish();
         }
      }
   };
   splashThread.start();
}
}