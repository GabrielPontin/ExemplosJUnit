package br.univel;


import static org.junit.Assert.*;

import org.junit.Test;

public class AuthTest {

	@Test
	public void testSenhaCerta() {
		assertTrue(new Auth().usuarioValido("admin", "123"));
	}
	
	@Test
	public void testSenhaErrada() {
		assertFalse(new Auth().usuarioValido("admin", "1234"));
	}

	@Test
	public void testUsuarioErrado() {
		assertFalse(new Auth().usuarioValido("Pontin", "12345"));
	}
	
	@Test(expected=NullPointerException.class)
	public void testSenhaNula() {
		new Auth().usuarioValido(null, null);
	}
	
	@Test(expected=NullPointerException.class)
	public void testSomenteUsuarioNulo() {
		new Auth().usuarioValido(null, "12345");
	}

}
