package com.example.crianbra.leccion;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    String tag = "Lifecycle";
    MediaPlayer mp1, mp2,mp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView user= (TextView)(findViewById(R.id.txt_user));
        user.setText((String)getIntent().getExtras().get("usuario"));


        final Button buttonSiguiente= (Button) findViewById(R.id.btn_siguiente);
        buttonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d (tag,"Si llamo a la funcion");
                Intent intentSiguiente = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intentSiguiente);
            }
        });
    }
}
