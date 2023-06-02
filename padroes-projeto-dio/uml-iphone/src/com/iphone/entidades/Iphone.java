package com.iphone.entidades;

import com.iphone.fucional.Navegador;
import com.iphone.fucional.Telefone;
import com.iphone.fucional.TocadorMusica;

public class Iphone implements Telefone, Navegador, TocadorMusica {

	@Override
	public void tocarMusica() {
		System.out.println("-TOCAR MUSICA");
		
	}

	@Override
	public void pausarMusica() {
		System.out.println("-PAUSAR MUSICA");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("-SELECIONAR MUSICA");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("-EXIBIR PAGINA");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("-ADICIONAR NOVA ABA");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("-ATUALIZAR PAGINA");
		
	}

	@Override
	public void ligar() {
		System.out.println("-LIGAR PARA UM CONTATO");
		
	}

	@Override
	public void atender() {
		System.out.println("-ATENDER UMA LIGAÇAO");
		
	}
	

}
