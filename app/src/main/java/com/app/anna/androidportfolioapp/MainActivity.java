package com.app.anna.androidportfolioapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    public void openApp(View view) {
        Toast.makeText(getApplicationContext(), "Opens Spotify Streamer App",
                Toast.LENGTH_SHORT).show();
    }
    public void openApp2(View view) {
        Toast.makeText(getApplicationContext(), "Opens Scores App",
                Toast.LENGTH_SHORT).show();
    }
    public void openApp3(View view) {
        Toast.makeText(getApplicationContext(), "Opens Library App",
                Toast.LENGTH_SHORT).show();
    }
    public void openApp4(View view) {
        Toast.makeText(getApplicationContext(), "Opens Build It Bigger App",
                Toast.LENGTH_SHORT).show();
    }
    public void openApp5(View view) {
        Toast.makeText(getApplicationContext(), "Opens Bacon App",
                Toast.LENGTH_SHORT).show();
    }
    public void openApp6(View view) {
        Toast.makeText(getApplicationContext(), "Opens Capstone My Own App",
                Toast.LENGTH_SHORT).show();
    }
}


