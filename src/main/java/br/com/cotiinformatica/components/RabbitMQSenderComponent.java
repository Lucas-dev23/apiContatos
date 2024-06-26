package br.com.cotiinformatica.components;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.cotiinformatica.entities.Contato;

@Component
public class RabbitMQSenderComponent {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	private Queue queue;
	
	public void sendMessage(Contato contato) throws Exception {
		
		//serializando os dados do contato em JSON
		String message = objectMapper.writeValueAsString(contato);
		
		rabbitTemplate.convertAndSend
			(this.queue.getName(), //nome da fila do RabbitMQ 
			 message); //dados gravados na fila
	}
}
