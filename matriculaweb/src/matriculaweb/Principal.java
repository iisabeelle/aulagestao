package matriculaweb;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		
		System.out.println("Qual a matrícula do aluno?");
		String matricula = teclado.next();
		
		System.out.println("Qual o nome do aluno?");
		String nome = teclado.next();
		
		System.out.println(" Qual o email do aluno?");
		String email = teclado.next();
		teclado.close();

		Aluno a1 = new Aluno();
		a1.setNome(nome);
		a1.setMatricula(matricula);
		a1.setEmail(email);
		
		Aluno a2 = new Aluno ("1234", "isabelle","i@gmail.com");
		
		Coordenacao coord = new Coordenacao();
		coord.matricular(a1);
		coord.exibir();
		coord.consultar("1234");
		
		
	}

}
