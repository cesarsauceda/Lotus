package com.example.sauceda.lotus;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class RegistroDeUsuario extends AppCompatActivity {
    EditText edtNombre, edtCorreo, edtPassword, edtConPassword;
    TextView txtAcceder;
    LinearLayout linearLayout;
    Button btnRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_de_usuario);
        edtNombre=findViewById(R.id.edtNombre);
        edtCorreo=findViewById(R.id.edtCorreo);
        edtPassword=findViewById(R.id.edtPassword);
        edtConPassword=findViewById(R.id.edtConfirmPassword);
        txtAcceder=findViewById(R.id.txtAccedeUsuario);
        btnRegistrar=findViewById(R.id.btnRegistrarUsuario);
        linearLayout=findViewById(R.id.linear);
        String correo=edtCorreo.getText().toString();

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre=edtNombre.getText().toString();
                String password=edtPassword.getText().toString();
                String confipassword=edtConPassword.getText().toString();



                if(password==confipassword) {
                    Snackbar.make(linearLayout, "Registro Usuario Completo", Snackbar.LENGTH_SHORT).show();
                    startActivity(new Intent(RegistroDeUsuario.this,LOTUS.class));
                }else{
                    Snackbar.make(linearLayout,"Error en Contraseña",Snackbar.LENGTH_SHORT).show();
                }



            }
        });



        txtAcceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RegistroDeUsuario.this, "Se fue al Acceder", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
