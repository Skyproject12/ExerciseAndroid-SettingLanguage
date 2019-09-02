package com.example.mymultilanguageapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textHello, textPlural, textXliff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textHello= findViewById(R.id.text_hello);
        textPlural= findViewById(R.id.text_plural);
        textXliff= findViewById(R.id.text_xliff);

        int pokeCont= 3;
        // to take text text pluss more text
        String hello= String.format(getResources().getString(R.string.hello_world), "Narenda Wicaksono", pokeCont, "Yoga Aprilio");
        textHello.setText(hello);
        int songCount= 5;
        // to take text type plural
        String pluralText= getResources().getQuantityString(R.plurals.numberOfSongAvailable, songCount, songCount);
        textPlural.setText(pluralText);
        textXliff.setText(getResources().getString(R.string.app_homeurl));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // intent to setting from android
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.action_change_settings){
            Intent intent= new Intent(Settings.ACTION_LOCALE_SETTINGS);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
