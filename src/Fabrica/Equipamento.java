package Fabrica;

import AparelhoIphone.NovoIphone;
import Music.DisplayMusic;
import Navegacao.NavegadorInternet;
import Telefone.Telefone;

public class Equipamento {
	
	public static void main(String[] args) {
		
		NovoIphone iphone = new NovoIphone();
		DisplayMusic music = (DisplayMusic) iphone;
		NavegadorInternet internet = (NavegadorInternet) iphone;
		Telefone telefone = (Telefone) iphone;
		
		System.out.println("Musica");
        music.selecionarMusica();
        music.tocar();
        music.pausar();
        System.out.println("(✿◠‿◠) ");
        System.out.println(" ");

        System.out.println("Telefone");
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();
        System.out.println(" (✿◠‿◠) ");
        System.out.println(" ");

        System.out.println("Internet");
        internet.exibirAba();
        internet.adicionarNovaAba();
        internet.atualizarAba();
        System.out.println(" (. ❛ ᴗ ❛.)  ");
		
	}
}
