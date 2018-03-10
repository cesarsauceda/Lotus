package com.example.sauceda.lotus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LOTUS extends AppCompatActivity {

    TextView registroUsuario, registroPsicologo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lotus);
        registroUsuario=findViewById(R.id.txtRegistroUsuario);
        registroPsicologo=findViewById(R.id.txtRegistroPsicologo);

        registroUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LOTUS.this,RegistroDeUsuario.class));
            }
        });

        registroPsicologo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LOTUS.this,RegistroDePsicologos.class));
            }
        });

    }
}
