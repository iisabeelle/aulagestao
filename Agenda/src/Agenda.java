import java.util.Scanner;
import java.util.ArrayList;

public class Agenda {
private ArrayList<Contato> contatos;
    
    public Agenda() {
        contatos = new ArrayList<>();
    }
    
    public void salvarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("salvo!");
    }
    
    public void pesquisarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Contato encontrado:");
                System.out.println(contato);
                return;
            }
        }
        System.out.println("não encontrado.");
    }
    
    public void apagarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatos.remove(contato);
                System.out.println("excluido");
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }
    
    public void exibirContatos() {
        if (contatos.isEmpty()) {
            System.out.println("vazio");
        } else {
            System.out.println("Contatos salvos:");
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
        }

}
}