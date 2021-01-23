package br.com.lojaonline.utils;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class criptografiaUtil {

	private static final int carga = 12;

	public static String criptografaSenha(String senhaTexto) {
		String salt = BCrypt.gensalt(carga);
		String senhaCriptografada = BCrypt.hashpw(senhaTexto, salt);
		return senhaCriptografada;
	}

	public static boolean comparaSenha(String senhaTexto, String senhaHash) {
		boolean verificaSenha = false;

		if (null == senhaHash || !senhaHash.startsWith("$2a$")) {
			throw new java.lang.IllegalArgumentException("Hash fornecido para a comparação inválido!");
		}

		verificaSenha = BCrypt.checkpw(senhaTexto, senhaHash);
		return verificaSenha;
	}
}
