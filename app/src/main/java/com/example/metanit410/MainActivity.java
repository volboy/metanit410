package com.example.metanit410;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
       // Toast toast=Toast.makeText(this, "Hello Android 7", Toast.LENGTH_LONG);
        //toast.setGravity(Gravity.TOP, 0, 160);
       // toast.show();
        Snackbar.make(view, "Привет Мир!!!", Snackbar.LENGTH_LONG).show();
    }
}
