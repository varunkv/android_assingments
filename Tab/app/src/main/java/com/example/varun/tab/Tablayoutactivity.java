package com.example.varun.tab;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Tablayoutactivity extends TabActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablayoutactivity);

        TabHost tabHost=getTabHost();


        TabSpec videospec=tabHost.newTabSpec("Videos");
        videospec.setIndicator("", getResources().getDrawable(R.drawable.video));
       Intent videosInt=new Intent(this,videoactivity.class);
        videospec.setContent(videosInt);

        TabSpec songspec=tabHost.newTabSpec("Songs");
        songspec.setIndicator("", getResources().getDrawable(R.drawable.song));
        Intent songsint=new Intent(this,songsactivity.class);
        songspec.setContent(songsint);

        TabSpec photospec=tabHost.newTabSpec("Photos");
        photospec.setIndicator("", getResources().getDrawable(R.drawable.imge));
        Intent photoint=new Intent(this,photosactivity.class);
        photospec.setContent(photoint);


        tabHost.addTab(photospec);
        tabHost.addTab(songspec);
        tabHost.addTab(videospec);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tablayoutactivity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
