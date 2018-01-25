package com.example.didact.ejercicio_final;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tvEtiqueta, tvResultado,textView1; // En la misma linea siempre y cuando sean del mismo tipo
    EditText editNombre, editApellidos, editEdad;
    Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Identificar la Vista
        tvEtiqueta = (TextView)findViewById(R.id.tvEtiqueta);
        tvResultado = (TextView)findViewById(R.id.tvResultado);
        editNombre = (EditText)findViewById(R.id.editNombre);
        editApellidos = (EditText)findViewById(R.id.editApellidos);
        editEdad = (EditText)findViewById(R.id.editEdad);
        textView1 = (TextView)findViewById(R.id.textView1);
        boton1 = (Button)findViewById(R.id.boton1);
        //OnClick boton

        //Editar el texto de un TextView
        tvEtiqueta.setText("Hola mundo");

        // Obtener el valor de un TextView
        String contenidoetiqueta = tvEtiqueta.getText().toString()

        tvResultado.setText(contenidoetiqueta);

    }// FIN OnCreate



}// FIN MainActivity
