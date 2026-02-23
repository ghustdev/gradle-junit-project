package org.example

import static org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import static org.mockito.Mockito.*

class VendaTest {
	
	@Test
	void checkout() {
		def cliente = new Cliente("123", "Gustavo")
		def creditoService = mock(ICredito.class)
		// simula o FakeCreditoService, redefine o valor para 2500
		when(creditoService.getLimite(cliente.getCpf())).thenReturn(2500d)
		def venda = new Venda(2000, cliente, creditoService)

		def resultado = venda.checkout()

		assertTrue(resultado)
	}
}