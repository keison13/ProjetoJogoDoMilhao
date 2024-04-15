package projeto1;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Bem-vindo ao jogo do milhão! Vamos começar.");
	        System.out.print("Por favor, digite o seu nome: ");
	        String Name = scanner.next();
	        System.out.println("Certo "+Name+" vamos as perguntas");
	        System.out.println("-----------------------------------");
		Jogador player = new Jogador(Name, 0, 0);
        Pergunta[] questions = {
            new Pergunta("Qual é o triângulo que tem todos os lados diferentes?", new String[]{"Isoceles", "Equilatero", "Escaleno", "Equivalente"}, 2,500),
            new Pergunta("Qual bicho transmite Doença de Chagas??", new String[]{"Barata", "Barbeiro", "Pulga", "Abelha"}, 1, 500),
            new Pergunta("Qual é o coletivo de cães?", new String[]{"Matilha", "Rebanho", "Alcateia", "Manada"}, 0, 500), 
            new Pergunta("Qual fruto é conhecido no Norte e Nordeste como \"jerimum\"?", new String[]{"Caju", "Abobora", "Chuchu", "Coco"}, 1, 500),
            new Pergunta("Qual foi o último Presidente do período da ditadura militar no Brasil?", new String[]{"Costa e Silva", "Joao Figueiredo", "Ernesto Geisel", "Emilio Medici"}, 1, 500),
            new Pergunta("Seguindo a sequência do baralho, qual carta vem depois do dez?", new String[]{"Rei", "Valete", "Nove", "Ás"}, 1, 500),
            new Pergunta("O adjetivo \"venoso\" está relacionado a:", new String[]{"Veia", "Vento", "Venia", "Vela"}, 0, 500),
            new Pergunta("Em que parte do corpo se encontra a epiglote?", new String[]{"Rim", "Estomago", "Pancreas", "Boca"}, 3, 500),
            new Pergunta("A compensação por perda é chamada de...", new String[]{"Defice", "Indexação", "Indenização", "Indebito"}, 2, 500),
            new Pergunta("Que nome se dá à purificação por meio da água?", new String[]{"Abolição", "Abrupção", "Abnegação", "Ablução"}, 3, 500),
            new Pergunta("Qual é o antônimo de \"malograr\"?", new String[]{"Perder", "Fracassar", "Conseguir", "Desprezar"}, 2, 500),
            new Pergunta("Em que país nasceu Carmem Miranda?", new String[]{"Espanha", "Brasil", "Portugal", "Argentina"}, 2, 500),
            new Pergunta("Quem compôs o Hino da Independência?", new String[]{"Dom Pedro 1", "Manoel Bandeira", "Castro Alves", "Carlos Gomes"}, 0, 500)
            // Local para adcionar perguntas
        };
        
        // Convertendo o array para uma lista e embaralhando as perguntas para mudar a ordem a cada rodada
        ArrayList<Pergunta> questionList = new ArrayList<>(Arrays.asList(questions));
        Collections.shuffle(questionList);

        // Convertendo a lista de volta para um array
        questions = questionList.toArray(new Pergunta[0]);


        Jogo game = new Jogo(player, questions);
        game.start();
        scanner.close();
    }

	}


