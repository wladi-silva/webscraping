package com.wladi.acoplamento.models;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Mensagem {
    
    public final String link = "https://www.bibliaon.com/versiculo_do_dia/";
    public Document doc = null;
    public String retorno;

    public String conectar() {

        try {
            doc = Jsoup.connect(link).get();
        } catch (Exception e) {
            return "Site indisponivel ou URL inválida.";
        }
    
        Element element = doc.getElementById("versiculo_hoje");
        this.retorno = element.text();
        
        return retorno;
    }
}