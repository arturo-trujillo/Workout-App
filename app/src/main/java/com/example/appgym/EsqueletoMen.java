package com.example.appgym;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;

public class EsqueletoMen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esqueleto_men);

        Bundle bundle = getIntent().getExtras();

        //VALIDACIÓN PARA DETERMINAR SI HAY UN PROBLEMA
        if(bundle != null){
            if(bundle.getString("some")!=null){
                Toast.makeText(getApplicationContext(),"data:" + bundle.getString("some"), Toast.LENGTH_SHORT);
            }

        }
    }
}