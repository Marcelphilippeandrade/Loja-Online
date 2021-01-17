package br.com.lojaonline.service;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import br.com.lojaonline.daos.CompraDao;
import br.com.lojaonline.infra.MailSender;
import br.com.lojaonline.models.Compra;

@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "java:/jms/topics/CarrinhoComprasTopico"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic")})
public class EnviaEmailCompra implements MessageListener {

	@Inject
	private CompraDao compraDao;

	@Inject
	private MailSender mailSender;

	public void onMessage(Message message) {

		try {
			TextMessage textMessage = (TextMessage) message;
			Compra compra = compraDao.buscaPorUuid(textMessage.getText());

			String messageBody = "Sua compra na loja online foi realizada com sucesso, com numero de pedido "
					+ compra.getUuid();

			mailSender.send("compras.livraria.lojaonline@gmail.com", compra.getUsuario().getEmail(),
					"Nova compra na loja online", messageBody);
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}
