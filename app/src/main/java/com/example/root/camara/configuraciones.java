package com.example.root.camara;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class configuraciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuraciones);
    }

    public void regresar(View v){
        finish();
    }

}
