package br.edu.scl.ifsp.ads.havagas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner formacaoSpinner = findViewById(R.id.formacaoSpinner);
        formacaoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String formacaoSelecionada = formacaoSpinner.getSelectedItem().toString();

                // Configurar a visibilidade dos campos com base na formação selecionada
                if (formacaoSelecionada.equals("Fundamental") || formacaoSelecionada.equals("Médio")) {
                    findViewById(R.id.anoFormaturaTv).setVisibility(View.VISIBLE);
                } else if (formacaoSelecionada.equals("Graduação") || formacaoSelecionada.equals("Especialização")) {
                    findViewById(R.id.anoConclusaoTv).setVisibility(View.VISIBLE);
                    findViewById(R.id.instituicaoTv).setVisibility(View.VISIBLE);
                } else if (formacaoSelecionada.equals("Mestrado") || formacaoSelecionada.equals("Doutorado")) {
                    findViewById(R.id.anoConclusaoMestradoDoutoradoTv).setVisibility(View.VISIBLE);
                    findViewById(R.id.instituicaoMestradoDoutoradoTv).setVisibility(View.VISIBLE);
                    findViewById(R.id.tituloMonografiaTv).setVisibility(View.VISIBLE);
                    findViewById(R.id.orientadorTv).setVisibility(View.VISIBLE);
                } else {
                    // Se a formação não corresponder a nenhum dos casos anteriores, oculte todos os campos adicionais
                    findViewById(R.id.anoFormaturaTv).setVisibility(View.GONE);
                    findViewById(R.id.anoConclusaoTv).setVisibility(View.GONE);
                    findViewById(R.id.instituicaoTv).setVisibility(View.GONE);
                    findViewById(R.id.anoConclusaoMestradoDoutoradoTv).setVisibility(View.GONE);
                    findViewById(R.id.instituicaoMestradoDoutoradoTv).setVisibility(View.GONE);
                    findViewById(R.id.tituloMonografiaTv).setVisibility(View.GONE);
                    findViewById(R.id.orientadorTv).setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Implemente isso se necessário
            }
        });
    }
}