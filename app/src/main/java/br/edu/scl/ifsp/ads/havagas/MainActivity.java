package br.edu.scl.ifsp.ads.havagas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private CheckBox adicionarCelularCheckBox;
    private EditText celularEditText;
    private Formulario formulario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        formulario = new Formulario();

        EditText nomeCompletoTv = findViewById(R.id.nomeCompletoTv);
        EditText emailTv = findViewById(R.id.emailTv);
        CheckBox receberEmailsCb = findViewById(R.id.receberEmailsCb);
        EditText telefoneTv = findViewById(R.id.telefoneTv);
        CheckBox adicionarCelularCb = findViewById(R.id.adicionarCelularCb);
        EditText celularTv = findViewById(R.id.celularTv);
        Spinner sexoSpinner = findViewById(R.id.sexoSpinner);
        EditText dataNascimentoTv = findViewById(R.id.dataNascimentoTv);
        Spinner formacaoSpinner = findViewById(R.id.formacaoSpinner);
        EditText anoFormaturaTv = findViewById(R.id.anoFormaturaTv);
        EditText anoConclusaoTv = findViewById(R.id.anoConclusaoTv);
        EditText instituicaoTv = findViewById(R.id.instituicaoTv);
        EditText anoConclusaoMestradoDoutoradoTv = findViewById(R.id.anoConclusaoMestradoDoutoradoTv);
        EditText instituicaoMestradoDoutoradoTv = findViewById(R.id.instituicaoMestradoDoutoradoTv);
        EditText tituloMonografiaTv = findViewById(R.id.tituloMonografiaTv);
        EditText orientadorTv = findViewById(R.id.orientadorTv);
        EditText vagasInteresseTv = findViewById(R.id.vagasInteresseTv);

        Button btnSalvar = findViewById(R.id.btnSalvar);
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formulario.setNomeCompleto(nomeCompletoTv.getText().toString());
                formulario.setEmail(emailTv.getText().toString());
                formulario.setReceberEmails(receberEmailsCb.isChecked());
                formulario.setTelefone(telefoneTv.getText().toString());
                formulario.setAdicionarCelular(adicionarCelularCb.isChecked());
                formulario.setCelular(celularTv.getText().toString());
                formulario.setSexo(sexoSpinner.getSelectedItem().toString());

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
                try {
                    Date dataNascimento = dateFormat.parse(dataNascimentoTv.getText().toString());
                    formulario.setDataNascimento(dataNascimento);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                formulario.setFormacao(formacaoSpinner.getSelectedItem().toString());
                formulario.setAnoFormaturaFundamentalMedio(Integer.parseInt(anoFormaturaTv.getText().toString()));
                formulario.setAnoConclusaoGraduacaoEspecializacao(Integer.parseInt(anoConclusaoTv.getText().toString()));
                formulario.setInstituicaoGraduacaoEspecializacao(instituicaoTv.getText().toString());
                formulario.setAnoConclusaoMestradoDoutorado(Integer.parseInt(anoConclusaoMestradoDoutoradoTv.getText().toString()));
                formulario.setInstituicaoMestradoDoutorado(instituicaoMestradoDoutoradoTv.getText().toString());
                formulario.setTituloMonografia(tituloMonografiaTv.getText().toString());
                formulario.setOrientador(orientadorTv.getText().toString());
                formulario.setVagasInteresse(vagasInteresseTv.getText().toString());

                String dadosDoFormulario = formulario.toString();

                Button btnSalvar = findViewById(R.id.btnSalvar);
                btnSalvar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Formulario dadosDoFormulario = new Formulario(nomeCompletoTv,emailTv,receberEmailsCb,
                                telefoneTv,adicionarCelularCb,celularTv,sexoSpinner,dataNascimentoTv,
                                formacaoSpinner,anoConclusaoTv,anoFormaturaTv, instituicaoTv,anoConclusaoMestradoDoutoradoTv,
                                instituicaoMestradoDoutoradoTv,tituloMonografiaTv,orientadorTv,vagasInteresseTv);

                        Toast.makeText(this, dadosDoFormulario.toString(), Toast.LENGTH_LONG).show();
                        showFormularioDialog();}
                });
            }
            private void showFormularioDialog() {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Dados do Formulário");
                builder.setMessage(formulario.toString());
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
        formacaoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String formacaoSelecionada = formacaoSpinner.getSelectedItem().toString();

                // Primeiro, ocultar todos os campos
                findViewById(R.id.anoFormaturaTv).setVisibility(View.GONE);
                findViewById(R.id.anoConclusaoTv).setVisibility(View.GONE);
                findViewById(R.id.instituicaoTv).setVisibility(View.GONE);
                findViewById(R.id.anoConclusaoMestradoDoutoradoTv).setVisibility(View.GONE);
                findViewById(R.id.instituicaoMestradoDoutoradoTv).setVisibility(View.GONE);
                findViewById(R.id.tituloMonografiaTv).setVisibility(View.GONE);
                findViewById(R.id.orientadorTv).setVisibility(View.GONE);
                findViewById(R.id.vagasInteresseTv).setVisibility(View.GONE);

                // Configurar a visibilidade dos campos com base na formação selecionada
                if (formacaoSelecionada.equals("Fundamental") || formacaoSelecionada.equals("Médio")) {
                    findViewById(R.id.anoFormaturaTv).setVisibility(View.VISIBLE);
                    findViewById(R.id.vagasInteresseTv).setVisibility(View.VISIBLE);

                } else if (formacaoSelecionada.equals("Graduação") || formacaoSelecionada.equals("Especialização")) {
                    findViewById(R.id.anoConclusaoTv).setVisibility(View.VISIBLE);
                    findViewById(R.id.instituicaoTv).setVisibility(View.VISIBLE);
                    findViewById(R.id.vagasInteresseTv).setVisibility(View.VISIBLE);

                } else if (formacaoSelecionada.equals("Mestrado") || formacaoSelecionada.equals("Doutorado")) {
                    findViewById(R.id.anoConclusaoMestradoDoutoradoTv).setVisibility(View.VISIBLE);
                    findViewById(R.id.instituicaoMestradoDoutoradoTv).setVisibility(View.VISIBLE);
                    findViewById(R.id.tituloMonografiaTv).setVisibility(View.VISIBLE);
                    findViewById(R.id.orientadorTv).setVisibility(View.VISIBLE);
                    findViewById(R.id.vagasInteresseTv).setVisibility(View.VISIBLE);
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
                // Implemente
            }
        });

        adicionarCelularCheckBox = findViewById(R.id.adicionarCelularCb);
        celularEditText = findViewById(R.id.celularTv);
        adicionarCelularCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (adicionarCelularCheckBox.isChecked()) {
                    celularEditText.setVisibility(View.VISIBLE);
                } else {
                    celularEditText.setVisibility(View.GONE);
                }
            }
        });

    }
}