package com.example.crianbra.leccion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    String tag = "Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("mensaje", "creando");
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.btn_ingresar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirAcerca();
            }
        });
    }

    public void AbrirAcerca() {
        Log.d (tag,"Si llamo a la funcion");

        TextView u = (TextView) (findViewById(R.id.user));

        Intent i01 = new Intent(this, Main2Activity.class);
        String data [] = new String [1];
        i01.putExtra("usuario", ""+u.getText());
        startActivity(i01);



    }
}
