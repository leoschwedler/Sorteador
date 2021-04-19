package com.br.sorteador;


import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;


public class HomeActivity extends AppCompatActivity {

    Button btnSortearDez, btnSortearCem, btnSortearMil, btnSortearDezMil, btnDadosSeis, btnDadosDoze, btnDadosVinte, btnDadosCem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnSortearDez = findViewById(R.id.btnSortearDez);
        btnSortearCem = findViewById(R.id.btnSortearCem);
        btnSortearMil = findViewById(R.id.btnSortearMil);
        btnSortearDezMil = findViewById(R.id.btnSortearDezMil);
        btnDadosSeis = findViewById(R.id.btnDadosSeis);
        btnDadosDoze = findViewById(R.id.btnDadosDoze);
        btnDadosVinte = findViewById(R.id.btnDadosVinte);
        btnDadosCem = findViewById(R.id.btnDadosCem);

        btnSortearDez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = new Random().nextInt(11);
                AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
                builder.setMessage("Número: " + num)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                builder.create();
                builder.show();
            }
        });

        btnSortearCem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = new Random().nextInt(101);
                AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
                builder.setMessage("Número: " + num)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                builder.create();
                builder.show();
            }
        });

        btnSortearMil.setOnClickListener(new View.OnClickListener() {
            int num = new Random().nextInt(1001);
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
                builder.setMessage("Número: " + num)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                builder.create();
                builder.show();
            }
        });

        btnSortearDezMil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = new Random().nextInt(10001);
                AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
                builder.setMessage("Número: " + num)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                builder.create();
                builder.show();
            }
        });

        btnDadosSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = new Random().nextInt(7);
                AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
                builder.setMessage("Valor dos dados: " + num)
                        .setTitle("Dados Girando...")
                        .setIcon(R.drawable.dados)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                builder.create();
                builder.show();
            }
        });

        btnDadosDoze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = new Random().nextInt(13);
                AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
                builder.setMessage("Valor dos dados: " + num)
                        .setTitle("Dados Girando...")
                        .setIcon(R.drawable.dados)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                builder.create();
                builder.show();
            }
        });

        btnDadosVinte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = new Random().nextInt(21);
                AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
                builder.setMessage("Valor dos dados: " + num)
                        .setTitle("Dados Girando...")
                        .setIcon(R.drawable.dados)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                builder.create();
                builder.show();
            }
        });

        btnDadosCem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = new Random().nextInt(101);
                AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
                builder.setMessage("Valor dos dados: " + num)
                        .setTitle("Dados Girando...")
                        .setIcon(R.drawable.dados)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                builder.create();
                builder.show();
            }
        });
    }

    public void chamarFrases(View view) {
        startActivity(new Intent(getBaseContext(), FrasesActivity.class));
    }

}