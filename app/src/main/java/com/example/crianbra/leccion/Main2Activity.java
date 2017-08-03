package com.example.crianbra.leccion;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    String tag = "Lifecycle";
    MediaPlayer mp1, mp2,mp3;
    int valor = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView user= (TextView)(findViewById(R.id.txt_user));
        user.setText((String)getIntent().getExtras().get("usuario"));


        final Button button1= (Button) findViewById(R.id.btn_1);
        mp1 = MediaPlayer.create(this, R.raw.sonido1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.start();
                Log.d (tag,"Si llamo a la funcion");
                Toast.makeText(getApplicationContext(),"Numero 1",Toast.LENGTH_SHORT).show();

            }
        });

        final Button button2= (Button) findViewById(R.id.btn_2);
        mp2 = MediaPlayer.create(this, R.raw.sonido2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
                Log.d (tag,"Si llamo a la funcion");
                Toast.makeText(getApplicationContext(),"Numero 2",Toast.LENGTH_SHORT).show();

            }
        });

        final Button button3= (Button) findViewById(R.id.btn_3);
        mp3 = MediaPlayer.create(this, R.raw.sonido3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();
                Log.d (tag,"Si llamo a la funcion");
                Toast.makeText(getApplicationContext(),"Numero 3",Toast.LENGTH_SHORT).show();

            }
        });

        final Button button4= (Button) findViewById(R.id.btn_4);
        mp2 = MediaPlayer.create(this, R.raw.sonido2);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
                Log.d (tag,"Si llamo a la funcion");
                Toast.makeText(getApplicationContext(),"Numero 4",Toast.LENGTH_SHORT).show();

            }
        });

        final Button button5= (Button) findViewById(R.id.btn_5);
        mp2 = MediaPlayer.create(this, R.raw.sonido2);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
                Log.d (tag,"Si llamo a la funcion");
                Toast.makeText(getApplicationContext(),"Numero 5",Toast.LENGTH_SHORT).show();

            }
        });


        final Button buttonSiguiente= (Button) findViewById(R.id.btn_siguiente);


        buttonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d (tag,"Si llamo a la funcion");

                Intent intentSiguiente = new Intent(Main2Activity.this, Main3Activity.class);
                TextView u = (TextView) (findViewById(R.id.txt_user));
                TextView u1 = (TextView) (findViewById(R.id.txt_hola));
                String data [] = new String [2];
                intentSiguiente.putExtra("usuario", ""+u.getText());
                intentSiguiente.putExtra("2", "2");
                startActivity(intentSiguiente);

            }
        });
    }
}
