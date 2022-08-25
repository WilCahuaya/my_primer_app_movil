package com.example.mi_primera_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtMostrar;
    TextView txtNum;
    Button btnMostrar;
    String[] mensaje=new String[10];
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=findViewById(R.id.conslay_1);
        txtMostrar=findViewById(R.id.txtMostrar);
        txtNum=findViewById(R.id.txtNum);
        btnMostrar=findViewById(R.id.btnMostrar);
        mensaje[0]="Tu palabra es una lámpara a mis pies; es una luz en mi sendero. (Salmos 119:105)";
        mensaje[1]="Estén siempre alegres. (1 Tesalonicenses 5:16)";
        mensaje[2]="Al de carácter firme lo guardarás en perfecta paz, porque en ti confía. (Isaías 26:3)";
        mensaje[3]="Dios, en el principio, creó los cielos y la tierra. (Génesis 1:1)";
        mensaje[4]="Todo lo puedo en Cristo que me fortalece. (Filipenses 4:13)";
        mensaje[5]="Den gracias a Dios en toda situación, porque esta es su voluntad para ustedes en Cristo Jesús. (1 Tesalonicenses 5:18)";
        mensaje[6]="Oren sin cesar. (1 Tesalonicenses 5:17)";
        mensaje[7]="El ángel del SEÑOR acampa en torno a los que le temen; a su lado está para librarlos. (Salmos 34:7)";
        mensaje[8]="Pon en manos del Señor todas tus obras, y tus proyectos se cumplirán. (Proverbios 16:3)";
        mensaje[9]="El principio de la sabiduría es el temor del SEÑOR. (Salmos 111:10)";
        btnMostrar.setOnClickListener(this);


    }

    public void mostrarColorAleatorio(){
        Random rand=new Random();
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        layout.setBackgroundColor(Color.rgb(r,g,b));
    }

    public void mostrarTextoAleatorio(){
        int pos=(int)(Math.random()* mensaje.length);
        txtMostrar.setText(mensaje[pos]);
        txtNum.setText("Texto biblico número: "+(pos+1));
    }

    @Override
    public void onClick(View v) {
        mostrarColorAleatorio();
        mostrarTextoAleatorio();
    }
}