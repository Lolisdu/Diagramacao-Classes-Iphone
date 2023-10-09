package AparelhoIphone;

import Music.DisplayMusic;
import Navegacao.NavegadorInternet;
import Telefone.Telefone;

public class NovoIphone implements DisplayMusic, NavegadorInternet, Telefone {

	@Override
	public void ligar() {
		System.out.println("Ligar do Iphone");
		
	}

	@Override
	public void atender() {
		System.out.println("Atender do Iphone");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Ver recados no Iphone");
		
	}

	@Override
	public void exibirAba() {
		System.out.println("Abrir Safari");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova Pagina Safari");
		
	}

	@Override
	public void atualizarAba() {
		System.out.println("Atualizando Safari");
		
	}

	@Override
	public void tocar() {
		System.out.println("Play Music");
		
	}

	@Override
	public void pausar() {
		System.out.println("Stop Music");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Select Music");
		
	}

}
