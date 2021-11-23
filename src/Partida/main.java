package Partida;
public class main {
	
	public main() {
		
	}
	
	public static void main(String[] args) {
		
		//CLASSE - NOME OBJETO = NOVO OBJETO DA CLASSE PERSONAGEM//
	    Personagem perso1 = new Personagem();
	    
	    perso1.setNomeP("MKJackson");
	    perso1.setStatusP(false);
	    perso1.setTempoDeVida(100);
	    perso1.setIdP(01);
	   
	    System.out.println("Personagem MKJackson criado");
	    
	    Habilidade thriller = new Habilidade();
	    
	    thriller.setNomeHabilidadePerso("Thriller");
	    thriller.setIdHab(1);
	    thriller.setStatusHabPerso(false);
	    thriller.setDescricaoHab("Cura o seu personagem em 10 de HP");
	    
	    System.out.println("Habilidade do MKJackson criado");
	    
	    //////FIM DA CRIAÇÃO DO PERSONAGEM E DA HABILIDADE DO PERSONAGEM MKJACKSON/////
	    
	    Personagem perso2 = new Personagem();
	    
	    perso2.setNomeP("Hommer Simpson");
	    perso2.setStatusP(false);
	    perso2.setTempoDeVida(100);
	    perso2.setIdP(02);
	    
	    System.out.println("Personagem Hommer Simpson criado");
	    
	    Habilidade bolacha_envenenada = new Habilidade();
	    
	    bolacha_envenenada.setNomeHabilidadePerso("Bolacha Envenenada");
	    bolacha_envenenada.setIdHab(2);
	    bolacha_envenenada.setStatusHabPerso(false);
	    bolacha_envenenada.setDescricaoHab("Retira 10 de vida do personagem oponente");
	    
	    System.out.println("Habilidade de Hommer Simpson criado");
		
	    ////FIM DA CRIAÇÃO DO PERSONAGEM E DA HABILIDADE DO PERSONAGEM HOMMER SIMPSON/////
	    
	    //CLASSE - NOME OBJETO = NOVO OBJETO DA CLASSE JOGDOR//
	    Jogador j1 = new Jogador();
	    
	    j1.setNome("Luan Victor");
	    j1.setApelido("Luanzera");
	    j1.setEmail("luanvictorms@gmail.com");
	    j1.setTelefone("31989517089");
		
	    Menu fim = new Menu();
	    
	    fim.sobreDesenvolvedores();
	}

}
