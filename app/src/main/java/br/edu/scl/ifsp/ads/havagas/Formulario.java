package br.edu.scl.ifsp.ads.havagas;

import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Formulario {
    private String nomeCompleto;
    private String email;
    private boolean receberEmails;
    private String telefone;
    private boolean adicionarCelular;
    private String celular;
    private String sexo;
    private Date dataNascimento;
    private String formacao;
    private int anoFormaturaFundamentalMedio;
    private int anoConclusaoGraduacaoEspecializacao;
    private String instituicaoGraduacaoEspecializacao;
    private int anoConclusaoMestradoDoutorado;
    private String instituicaoMestradoDoutorado;
    private String tituloMonografia;
    private String orientador;
    private String vagasInteresse;

    // Construtor
    public Formulario() {
        // Inicialize os campos conforme necessário
    }

    public Formulario(EditText nomeCompletoTv, EditText emailTv, CheckBox receberEmailsCb, EditText telefoneTv, CheckBox adicionarCelularCb, EditText celularTv, Spinner sexoSpinner, EditText dataNascimentoTv, Spinner formacaoSpinner, EditText anoConclusaoTv, EditText anoFormaturaTv, EditText instituicaoTv, EditText anoConclusaoMestradoDoutoradoTv, EditText instituicaoMestradoDoutoradoTv, EditText tituloMonografiaTv, EditText orientadorTv, EditText vagasInteresseTv) {
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isReceberEmails() {
        return receberEmails;
    }

    public void setReceberEmails(boolean receberEmails) {
        this.receberEmails = receberEmails;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isAdicionarCelular() {
        return adicionarCelular;
    }

    public void setAdicionarCelular(boolean adicionarCelular) {
        this.adicionarCelular = adicionarCelular;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public int getAnoFormaturaFundamentalMedio() {
        return anoFormaturaFundamentalMedio;
    }

    public void setAnoFormaturaFundamentalMedio(int anoFormaturaFundamentalMedio) {
        this.anoFormaturaFundamentalMedio = anoFormaturaFundamentalMedio;
    }

    public int getAnoConclusaoGraduacaoEspecializacao() {
        return anoConclusaoGraduacaoEspecializacao;
    }

    public void setAnoConclusaoGraduacaoEspecializacao(int anoConclusaoGraduacaoEspecializacao) {
        this.anoConclusaoGraduacaoEspecializacao = anoConclusaoGraduacaoEspecializacao;
    }

    public String getInstituicaoGraduacaoEspecializacao() {
        return instituicaoGraduacaoEspecializacao;
    }

    public void setInstituicaoGraduacaoEspecializacao(String instituicaoGraduacaoEspecializacao) {
        this.instituicaoGraduacaoEspecializacao = instituicaoGraduacaoEspecializacao;
    }

    public int getAnoConclusaoMestradoDoutorado() {
        return anoConclusaoMestradoDoutorado;
    }

    public void setAnoConclusaoMestradoDoutorado(int anoConclusaoMestradoDoutorado) {
        this.anoConclusaoMestradoDoutorado = anoConclusaoMestradoDoutorado;
    }

    public String getInstituicaoMestradoDoutorado() {
        return instituicaoMestradoDoutorado;
    }

    public void setInstituicaoMestradoDoutorado(String instituicaoMestradoDoutorado) {
        this.instituicaoMestradoDoutorado = instituicaoMestradoDoutorado;
    }

    public String getTituloMonografia() {
        return tituloMonografia;
    }

    public void setTituloMonografia(String tituloMonografia) {
        this.tituloMonografia = tituloMonografia;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public String getVagasInteresse() {
        return vagasInteresse;
    }

    public void setVagasInteresse(String vagasInteresse) {
        this.vagasInteresse = vagasInteresse;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        StringBuilder sb = new StringBuilder();

        sb.append("Nome Completo: ").append(nomeCompleto).append("\n");
        sb.append("E-mail: ").append(email).append("\n");
        sb.append("Receber E-mails: ").append(receberEmails ? "Sim" : "Não").append("\n");
        sb.append("Telefone: ").append(telefone).append("\n");
        sb.append("Adicionar Celular: ").append(adicionarCelular ? "Sim" : "Não").append("\n");
        sb.append("Celular: ").append(celular).append("\n");
        sb.append("Sexo: ").append(sexo).append("\n");
        sb.append("Data de Nascimento: ").append(dateFormat.format(dataNascimento)).append("\n");
        sb.append("Formação: ").append(formacao).append("\n");
        sb.append("Ano de Formatura (Fundamental/Médio): ").append(anoFormaturaFundamentalMedio).append("\n");
        sb.append("Ano de Conclusão (Graduação/Especialização): ").append(anoConclusaoGraduacaoEspecializacao).append("\n");
        sb.append("Instituição (Graduação/Especialização): ").append(instituicaoGraduacaoEspecializacao).append("\n");
        sb.append("Ano de Conclusão (Mestrado/Doutorado): ").append(anoConclusaoMestradoDoutorado).append("\n");
        sb.append("Instituição (Mestrado/Doutorado): ").append(instituicaoMestradoDoutorado).append("\n");
        sb.append("Título de Monografia (Mestrado/Doutorado): ").append(tituloMonografia).append("\n");
        sb.append("Orientador (Mestrado/Doutorado): ").append(orientador).append("\n");
        sb.append("Vagas de Interesse: ").append(vagasInteresse).append("\n");

        return sb.toString();
    }
}
