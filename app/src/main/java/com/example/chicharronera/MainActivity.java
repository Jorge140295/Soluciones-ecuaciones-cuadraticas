package com.example.chicharronera;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText edt_a,edt_b,edt_c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//realizamos la igualdad de las variables de los ediTex en base al ID de cada uno de ellos o los que les corresponde
        edt_a=(EditText)findViewById(R.id.TCuadratico);
        edt_b=(EditText)findViewById(R.id.TLineal);
        edt_c=(EditText)findViewById(R.id.TIndependiente);

    }

//creamos el metodo calcular del BOTON CALCULAR
    public void calcular(View view) {
       int  a, b,c;
       a=Integer.parseInt(edt_a.getText().toString());
        b=Integer.parseInt(edt_b.getText().toString());
        c=Integer.parseInt(edt_c.getText().toString());

        float res_raiz=0,resultado1=0,resultado2=0;
        int sum_raiz;
        sum_raiz =(b*b)-4*a*c;
        res_raiz=(float)Math.sqrt(sum_raiz);

        if(sum_raiz<=0){
            Toast.makeText(this,"No se puede ralizar la raiz es negativa  RESULTADO: ",Toast.LENGTH_SHORT).show();

        }else if(sum_raiz>=1){


            resultado1=(-1*b+(res_raiz))/(2*a);
            resultado2=(-1*b-(res_raiz))/(2*a);
        }

        String pars1,pars2;
        pars1=String.valueOf(resultado1);
        pars2=String.valueOf(resultado2);

        Toast.makeText(this,"Resultado x1 = " + pars1 +" Resultado x2="+ pars2,Toast.LENGTH_SHORT).show();


    }

}