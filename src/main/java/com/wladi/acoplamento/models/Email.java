package com.wladi.acoplamento.models;

public class Email {

    private String emailDe;
    private String emailPara;
    private String titulo;
    private String conteudo;
    private String status;

    public Email(String conteudo) {
        this.conteudo = conteudo;
        this.emailDe = "Wladimir Oliveira";
        this.emailPara = "nadja_bispo@hotmail.com";
        this.titulo = "Mensagem do dia para o meu Amor.";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmailDe() {
        return emailDe;
    }

    public void setEmailDe(String emailDe) {
        this.emailDe = emailDe;
    }

    public String getEmailPara() {
        return emailPara;
    }

    public void setEmailPara(String emailPara) {
        this.emailPara = emailPara;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Email [emailDe=" + emailDe + ", emailPara=" + emailPara + ", titulo=" + titulo + ", conteudo="
                + conteudo + ", status=" + status + "]";
    }

}