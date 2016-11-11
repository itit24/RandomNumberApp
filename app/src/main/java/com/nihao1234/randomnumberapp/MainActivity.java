//linea nueva
package com.nihao1234.randomnumberapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // instancia de la calse random
        Random rand = new Random();
        //asignar variable random de un numero entero
        int n = rand.nextInt(20);

        Context context = getApplicationContext();
        String number = n + "numero";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context,number,duration);
        toast.show();

    }
}
