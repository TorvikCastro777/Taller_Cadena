package com.example.torvikcastroo.calculadorajy;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class principal extends AppCompatActivity {

    private TextView total, subtotal;
    private EditText cantidad;
    private Spinner material, dije, bano, divisa;
    private Resources resources;
    private String[] materia;
    private String[] dijes;
    private String[] banos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        subtotal = (TextView) findViewById(R.id.lblUnidad);
        total = (TextView) findViewById(R.id.lblResultado);
        cantidad = (EditText) findViewById(R.id.Txt1);
        material = (Spinner) findViewById(R.id.spn1);
        dije = (Spinner) findViewById(R.id.spn2);
        bano = (Spinner) findViewById(R.id.spn3);
        divisa = (Spinner) findViewById(R.id.spn4);

        resources = this.getResources();

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.materiales, android.R.layout.simple_spinner_item);
        material.setAdapter(adapter);


        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this, R.array.dijes, android.R.layout.simple_spinner_item);
        dije.setAdapter(adapter1);

        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.banos, android.R.layout.simple_spinner_item);
        bano.setAdapter(adapter2);

        ArrayAdapter adapter3 = ArrayAdapter.createFromResource(this, R.array.divisas, android.R.layout.simple_spinner_item);
        divisa.setAdapter(adapter3);
    }

    public void calcular (View v){

        int opcionMaterial, opcionDije, opcionBano, opcionDivisa;
        double resultado = 0, unidad = 0,cant = 0;

        if (validar()) {

            opcionMaterial = material.getSelectedItemPosition();
            opcionDije = dije.getSelectedItemPosition();
            opcionBano = bano.getSelectedItemPosition();
            opcionDivisa = divisa.getSelectedItemPosition();
            cant = Integer.parseInt(cantidad.getText().toString());

            switch (opcionMaterial){
             case 0:
                 switch (opcionDije){
                     case 0:
                         switch (opcionBano) {
                             case 0:
                                 switch (opcionDivisa) {
                                     case 0:
                                         unidad = 100;
                                         resultado = unidad * cant;
                                         break;
                                     case 1:
                                         unidad = 100;
                                         resultado = unidad * cant;
                                         resultado = resultado * 3200;
                                         break;
                                     }
                                 break;
                             case 1:
                                 switch (opcionDivisa){
                                     case 0:
                                         unidad = 80;
                                         resultado = unidad * cant;
                                         break;
                                     case 1:
                                         unidad = 80;
                                         resultado = unidad * cant;
                                         resultado =  resultado * 3200;
                                         break;
                                     }
                                 break;
                             case 2:
                                 switch (opcionDivisa){
                                     case 0:
                                         unidad = 70;
                                         resultado = cant * unidad;
                                         break;
                                     case 1:
                                         unidad = 70;
                                         resultado = cant *unidad;
                                         resultado = resultado * 3200;
                                         break;
                                     }
                                 break;
                             }
                             break;
                     case 1:
                         switch (opcionBano) {
                             case 0:
                                 switch (opcionDivisa) {
                                     case 0:
                                         unidad = 120;
                                         resultado = cant * unidad;
                                         break;
                                     case 1:
                                         unidad = 120;
                                         resultado = cant * unidad;
                                         resultado = resultado * 3200;
                                         break;
                                 }
                                 break;
                             case 1:
                                 switch (opcionDivisa) {
                                     case 0:
                                         unidad = 100;
                                         resultado = cant * unidad;
                                         break;
                                     case 1:
                                         unidad = 100;
                                         resultado = cant * unidad;
                                         resultado = resultado * 3200;
                                         break;
                                     }
                                     break;
                             case 2:
                                 switch (opcionDivisa){
                                     case 0:
                                         unidad = 90;
                                         resultado = cant * unidad;
                                         break;
                                     case 1:
                                         unidad = 90;
                                         resultado = cant *unidad;
                                         resultado = resultado * 3200;
                                         break;
                                 }
                                 break;
                                }
                            }
                            break;
             case 1:
                 switch (opcionDije){
                     case 0:
                         switch (opcionBano){
                             case 0:
                                 switch (opcionDivisa){
                                     case 0:
                                         unidad = 90;
                                         resultado = cant * unidad;
                                         break;
                                     case 1:
                                         unidad = 90;
                                         resultado = cant *unidad;
                                         resultado = resultado * 3200;
                                         break;
                                    }
                                 break;
                             case 1:
                                 switch (opcionDivisa){
                                     case 0:
                                         unidad = 70;
                                         resultado = cant * unidad;
                                         break;
                                     case 1:
                                         unidad = 70;
                                         resultado = cant *unidad;
                                         resultado = resultado * 3200;
                                         break;
                                 }
                                  break;
                             case 2:
                                 switch (opcionDivisa) {
                                     case 0:
                                         unidad = 50;
                                         resultado = cant * unidad;
                                         break;
                                     case 1:
                                         unidad = 50;
                                         resultado = cant * unidad;
                                         resultado = resultado * 3200;
                                         break;
                                     }

                                 }
                         break;
                     case 1:
                         switch (opcionBano){
                             case 0:
                                 switch (opcionDivisa){
                                     case 0:
                                         unidad = 110;
                                         resultado = cant * unidad;
                                         break;
                                     case 1:
                                         unidad = 110;
                                         resultado = cant * unidad;
                                         resultado = resultado * 3200;
                                         break;
                                     }
                                 break;
                             case 1:
                                 switch (opcionDivisa){
                                     case 0:
                                         unidad = 90;
                                         resultado = cant * unidad;
                                         break;
                                     case 1:
                                         unidad = 90;
                                         resultado = cant * unidad;
                                         resultado = resultado * 3200;
                                         break;
                                 }
                                 break;
                             case 2:
                                 switch (opcionDivisa) {
                                     case 0:
                                         unidad = 80;
                                         resultado = cant * unidad;
                                         break;
                                     case 1:
                                         resultado = cant * unidad;
                                         resultado = resultado * 3200;
                                         break;
                                    }
                                 }
                             }
                          break;
                         }

            subtotal.setText(" = $" + unidad);
            total.setText(" = $"  + resultado);
                     }
                 }

    public boolean validar(){
        if(cantidad.getText().toString().isEmpty()){
            cantidad.setError(this.getResources().getString(R.string.mensajeError1));
            cantidad.requestFocus();
            return false;

        }
        if(Double.parseDouble( cantidad.getText().toString())==0){
            cantidad.requestFocus();
            cantidad.setError(this.getResources().getString(R.string.mensjaeError2));
            return false;
        }

        return true;
    }

    public void borrar(View v){
        subtotal.setText("");
        total.setText("");
        cantidad.setText("");
        cantidad.requestFocus();
    }
}













