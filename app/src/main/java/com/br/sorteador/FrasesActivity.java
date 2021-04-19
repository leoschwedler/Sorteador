package com.br.sorteador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FrasesActivity extends AppCompatActivity {

    Button btnGerarFraseNerd, btnGerarFraseMotivacional;
    TextView txtFraseNerd, txtFraseMotivacional;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frases);

        btnGerarFraseNerd = findViewById(R.id.btnGerarFraseNerd);
        btnGerarFraseMotivacional = findViewById(R.id.btnGerarFraseMotivacional);

        txtFraseNerd = findViewById(R.id.txtFraseNerd);
        txtFraseMotivacional = findViewById(R.id.txtFraseMotivacional);

        btnGerarFraseNerd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String [] frases = {"Vida longa e próspera.",
                        "Seja estranho. Seja aleatório. Seja quem você é. Porque você nunca sabe quem amaria a pessoa que você esconde.",
                        "Meu precioso.",
                        "A vida é um caos aleatório,ordenada pelo tempo.",
                        "Que é que há, velhinho?",
                        "A verdade, é que dói lembrar dela.",
                        "O aleatório não existe, nosso cérebro sempre toma decisões mesmo que ocultas.",
                        "Um ato aleatório de bondade, por menor que seja, pode ter um tremendo impacto na vida de outra pessoa.",
                        "Faça a pessoa que você gosta se sentir especial ao invés de só mais uma.",
                        "A vida e uma caixa preta nunca saberemos o seu real significado.\u2060",
                        "Tudo o que você precisará quando o universo acabar é de uma toalha."};

                int f = new Random().nextInt(20);
                txtFraseNerd.setText(frases[f]);
            }
        });

        btnGerarFraseMotivacional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String [] frases = {"A persistência é o caminho do êxito.",
                        "Sinto falta daquelas risadas, mas lembro como você fazia me sentir sozinho.",
                        "o ruim de mentir, com tempo você acaba acreditando nas suas próprias mentiras.",
                        "Cada instante é sempre..",
                        "meu pensamento nao aleatorio.",
                        "O insucesso é apenas uma oportunidade para recomeçar com mais inteligência.",
                        "O universo não é aleatório. As coisas acontecem porque as pessoas querem assim.",
                        "O caminho pra perfeição é fazer da dificuldade uma motivação",};

                int f = new Random().nextInt(10);
                txtFraseMotivacional.setText(frases[f]);
            }
        });
    }
}