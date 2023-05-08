package com.wladi.acoplamento.execute;

import java.time.LocalTime;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.wladi.acoplamento.models.Email;
import com.wladi.acoplamento.models.Mensagem;

@Component
public class Agendamento {
    
    @Scheduled(cron = "10 10 10 * * *")
    public void execute() {
        System.out.println("Rodando: " + LocalTime.now());
        
        Mensagem msg = new Mensagem();
        String conteudo = "Bom dia, esse é o versiculo do dia: " + msg.conectar() + " \n \nDeus abençoe seu dia, até mais tarde.";
		Email email = new Email(conteudo);

		try {
			new RestTemplate().exchange("http://localhost:8080/email", HttpMethod.POST, new HttpEntity<Object>(email), Object.class);
		} catch (Exception e) {
			System.out.println("Exeption gerada.");
		}
		
    }
}