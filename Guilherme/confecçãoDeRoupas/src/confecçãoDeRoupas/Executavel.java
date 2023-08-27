package confecçãoDeRoupas;

import java.util.ArrayList;
import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) {
		ArrayList<Camisa>listaCamisas=new ArrayList<>();
		ArrayList<Calça>listaCalças=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("MENU"
					+"\n1 - Cadastrar"
					+"\n2 - Listar"
					+"\n3 - Editar"
					+"\n4 - Remover"
					+"\n5 - Fechar"
					+"\nCriado por Gulherme Franciel Meiring");
			int escolha=sc.nextInt();
			switch(escolha) {
			case 1:{
				int cadastrar;
				do {
				System.out.println("\nDeseja cadastrar: "
						+"\n1 - Camisa"
						+"\n2 - Calça"
						+"\n3 - Voltar");
				cadastrar =sc.nextInt();
				switch(cadastrar) {
				case 1:{
					System.out.println("Cadastrar Camisa: "
							+"\n1 - Cor: ");
					String cor =sc.next();
					System.out.println("2 - Tipo: ");
					String tipo =sc.next();
					System.out.println("3 - Custo: ");
					double custo = sc.nextDouble();
					System.out.println("4 - Estampa");
					boolean estampa=sc.nextBoolean();
					listaCamisas.add(new Camisa(cor,tipo,custo,estampa));
					break;
				}
				case 2:{
					System.out.println("Cadastrar Calça: "
							+"\n1 - Tecido");
					String tecido=sc.next();
					System.out.println("\n2 - Tipo: ");
					String tipo=sc.next();
					System.out.println("\n3 - Gênero: ");
					String genero =sc.next();
					System.out.println("\n4 - Custo: ");
					double custo=sc.nextDouble();
					listaCalças.add(new Calça(tecido,tipo,genero,custo));
					break;	
		         }
			}
			}while(cadastrar !=3);
			break;
		}
		case 2:{
			int lista;
			do {
				System.out.println("\nLista: "
						+"\n1 - Um camisa/calça"
						+"\n2 - Todos as camisas/calças"
						+"\n3 - Voltar");
				lista=sc.nextInt();
				switch(lista) {
				case 1:{
					System.out.println("Deseja listar uma:"
							+"\n1 - Camisa"
							+"\n2 - Calça");
					int listar =sc.nextInt();
					if(listar == 1) {
						System.out.println("Informe o código: ");
						int escolhaCodigo=sc.nextInt();
						for(int i=0;i < listaCamisas.size();i++) {
							Camisa Camisa=buscarCamisa( i,escolhaCodigo,listaCamisas);
							if(Camisa != null) {
							    System.out.println(Camisa.getInformacoes());
							} 
						}
					}else if(listar ==2) {
						System.out.println("Informe o código: ");
					    int escolhaCodigo=sc.nextInt();
						for(int i=0;i < listaCalças.size();i++) {
							Calça Calça=buscarCalça( i,escolhaCodigo,listaCalças);
							if(Calça != null) {
							    System.out.println(Calça.getInformacoes());
							} 
						}
					}
				break;
				}
				case 2:{
					System.out.println("\nDeseja listar as:"
							+"\n1 - Camisas"
							+"\n2 - Calças");
					lista=sc.nextInt();
					if(lista ==1) {
						for(int i=0;i < listaCamisas.size();i++) {
							System.out.println(listaCamisas.get(i).getInformacoes());
						}
					}else if(lista ==2) {
						for(int i=0;i < listaCalças.size();i++) {
							System.out.println(listaCalças.get(i).getInformacoes());
						}
					}
					break;
				}
			}
			}while(lista !=3);
			break;
		}
		case 3:{
			int editar;
			do {
				System.out.println("\nEditar uma: "
						+"\n1 - Camisa"
						+"\n2 - Calça"
						+"\n3 - Voltar");
				editar=sc.nextInt();
				if(editar ==1) {
					System.out.println("Informe o código da Camisa: ");
					int escolhaCodigo=sc.nextInt();
					for(int i=0;i < listaCamisas.size();i++) {
						if(escolhaCodigo ==listaCamisas.get(i).getCodigo()) {
							int item;
							do {
								System.out.println("\nEditar: "
										+"\n1 - Cor"
										+"\n2 - Tipo"
										+"\n3 - Custo"
										+"\n4 - Gênero"
								        +"\n5 - Mostrar informações"
										+"\n6 - Voltar");
								item =sc.nextInt();
								System.out.println(editarCamisa(sc, item, i ,listaCamisas ));
							}while( item !=6);
						}
					}
				}
				else if(editar ==2) {
					System.out.println("Informe o código da Calça: ");
					int escolhaCodigo=sc.nextInt();
					for(int i=0;i < listaCalças.size();i++) {
						if(escolhaCodigo ==listaCalças.get(i).getCodigo()) {
							int item;
							do {
								System.out.println("\nEditar: "
										+"\n1 - Tecido"
										+"\n2 - Tipo"
										+"\n3 - Custo"
										+"\n4 - Estampa"
								        +"\n5 - Mostrar informações"
										+"\n6 - Voltar");
								item =sc.nextInt();
								System.out.println(editarCalça(sc, item,i,listaCalças ));
							}while( item !=6);
						}
					}
				}
			}while (editar !=3);
				break;
			}
			case 4:{
				int remover;
			
				do {
				System.out.println("\nRemover uma: "
						+"\n1 - Camisa"
						+"\n2 - Calça"
					    +"\n3 - Volar");
				remover=sc.nextInt();
				if(remover == 1) {
					System.out.println("Informe o código da Camisa: ");
					int escolhaCodigo=sc.nextInt();
					for(int i=0;i < listaCamisas.size();i++) {
						if(escolhaCodigo ==listaCamisas.get(i).getCodigo()) {
							listaCamisas.remove(i);
						}
					}
				}else if(remover ==2) {
					System.out.println("Informe o código da Calça: ");
					int escolhaCodigo=sc.nextInt();
					for(int i=0;i < listaCalças.size();i++) {
						if(escolhaCodigo ==listaCalças.get(i).getCodigo()) {
							listaCalças.remove(i);
						}
					}
				}
				}while(remover !=3);
				break;
			}
			case 5:{
				System.exit(0);
			}
			}
		}while(true);
	}
	static String editarCamisa(Scanner sc,int item, int i ,ArrayList<Camisa>listaCamisas) {
		
						switch(item){
						case 1:{
							System.out.println("Cor: ");
							String cor =sc.next();
							listaCamisas.get(i).setCor(cor);
							return "Cor editado";
						}
						case 2:{
							System.out.println("2 - Tipo: ");
							String tipo =sc.next();
							listaCamisas.get(i).setTipo(tipo);
							return "Tipo editado";
						}
						case 3:{
							System.out.println("2 - Custo: ");
							double custo =sc.nextDouble();
							listaCamisas.get(i).setCusto(custo);
							return "Custo editado";
						}
						case 4:{
							System.out.println("2 - Estampa: ");
							boolean estampa =sc.nextBoolean();
							listaCamisas.get(i).setEstampa(estampa);
							return "Estampa editado";
						}
						case 5:{
							return listaCamisas.get(i).getInformacoes();
						}
				    }				
					return "Nada editado,voltando...";			
	}	
	static String editarCalça(Scanner sc,int item, int i ,ArrayList<Calça>listaCalças) {
						
						switch(item){
						case 1:{
							System.out.println("Tecido: ");
							String tecido =sc.next();
							listaCalças.get(i).setTecido(tecido);
							return "Tecido editado";
						}
						case 2:{
							System.out.println("Tipo: ");
							String tipo =sc.next();
							listaCalças.get(i).setTipo(tipo);
							return "Tipo editado";
						}
						case 3:{
							System.out.println("Custo: ");
							double custo =sc.nextDouble();
							listaCalças.get(i).setCusto(custo);
							return "Custo editado";
						}
						case 4:{
							System.out.println("Gênero: ");
							String genero =sc.next();
							listaCalças.get(i).setGenero(genero);
							return "Gênero editado";
						}
						case 5:{
						 return listaCalças.get(i).getInformacoes();
							
						}
					}
					return "Nada editado,voltando...";										
	   }
	static Camisa buscarCamisa(int i,int escolhaCodigo,ArrayList<Camisa>listaCamisas) {
		if(escolhaCodigo ==listaCamisas.get(i).getCodigo()) {
			return listaCamisas.get(i);	
			}
		return null;
	}
	static Calça buscarCalça(int i,int escolhaCodigo,ArrayList<Calça>listaCalças) {
		if(escolhaCodigo ==listaCalças.get(i).getCodigo()) {
			return listaCalças.get(i);	
			}
		return null;
	}
}
