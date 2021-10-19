package com.example.dicodingsubmission1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton miegoreng;
    ImageButton nasigoreng;
    Button aboutme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miegoreng = (ImageButton) findViewById(R.id.imageButtonMie);
        miegoreng.setOnClickListener(this);
        nasigoreng = (ImageButton) findViewById(R.id.imageButtonNasi);
        nasigoreng.setOnClickListener(this);
        aboutme = (Button)findViewById(R.id.about_me);

        getSupportActionBar().setTitle("Menu Utama");
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButtonMie:
                Intent explicit1 = new Intent(getApplicationContext(), MenuMie.class);
                startActivity(explicit1);
                break;

            case R.id.imageButtonNasi:
                Intent explicit2 = new Intent(getApplicationContext(), MenuNasi.class);
                startActivity(explicit2);
                break;

            default:
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.about_me:
            Intent explicit3 = new Intent(getApplicationContext(), About.class);
            startActivity(explicit3);

            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}