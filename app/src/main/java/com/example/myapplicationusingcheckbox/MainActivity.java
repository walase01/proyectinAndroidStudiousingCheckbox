package com.example.myapplicationusingcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox java;
    CheckBox JAVAS;
    CheckBox Go;
    CheckBox Kotlin;
    CheckBox python;
    CheckBox scala;
    CheckBox rubi;
    CheckBox switf;
    CheckBox Dart;
    CheckBox C,cmore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Conectar();
    }

    public void Conectar(){
        java = findViewById(R.id.Java);
        JAVAS = findViewById(R.id.JavaScript);
        Go = findViewById(R.id.Go);
        Kotlin = findViewById(R.id.Kotlin);
        python = findViewById(R.id.Python);
        scala = findViewById(R.id.Scala);
        rubi = findViewById(R.id.Rubi);
        switf = findViewById(R.id.Swift);
        Dart =  findViewById(R.id.Dart);
        C = findViewById(R.id.C);
        cmore = findViewById(R.id.Cmoremore);
    }

    public void showLenguagesDevelopment(View view){
        if (java.isChecked() && JAVAS.isChecked() && Go.isChecked() && Kotlin.isChecked() && python.isChecked() && scala.isChecked() && rubi.isChecked() && switf.isChecked() && Dart.isChecked() && C.isChecked() && cmore.isChecked()){
            String[] Lista = {java.getText().toString(),JAVAS.getText().toString()};

            for (int i=0;i<Lista.length;i++){
                Toast.makeText(this,Lista[i],Toast.LENGTH_SHORT).show();
            }

        }
    }
}