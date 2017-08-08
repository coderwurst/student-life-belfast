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
   introsong = MediaPlayer.create(Splash.this, R.raw.too_close);
   introsong.start();

   Thread splashThread = new Thread() {
      public void run() {
         try {
            Thread.sleep(5000);
         } catch (Exception e) {
         } finally {
            Intent i = new Intent(Splash.this,MyActivity.class);
            startActivity(i);
            finish();
         }
      }
   };
   splashThread.start();
}
}