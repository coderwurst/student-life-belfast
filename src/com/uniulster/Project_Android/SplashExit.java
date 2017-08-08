package com.uniulster.Project_Android;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

/**
 * Created by IntelliJ IDEA.
 * User: Colm
 * Date: 05/12/13
 * Time: 14:38
 * UPDATE COMMENT ABOUT PROGRAM HERE
 */
public class SplashExit extends Activity
{
    MediaPlayer exitsong;

    @Override
      public void onCreate (Bundle savedInstanceState)
      {
         setContentView(R.layout.splashexit);
         exitsong = MediaPlayer.create(SplashExit.this, R.raw.app_intro);
         exitsong.start();

         Thread splashThread = new Thread() {
            public void run() {
               try {
                  Thread.sleep(5000);
               } catch (Exception e) {
               } finally {


                  finish();

               }
               System.exit(0);
            }
         };
         splashThread.start();
      }
      @Override
      protected void onPause()
      {
         super.onPause();
         exitsong.release();
         finish();
      }

   }//class
