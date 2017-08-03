package com.example.crianbra.leccion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView user1= (TextView)(findViewById(R.id.txt_user2));
        user1.setText((String)getIntent().getExtras().get("usuario"));
    }
}
