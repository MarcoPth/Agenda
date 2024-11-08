package agendacontato;

import java.util.ArrayList;

public class Agenda {
    
    private ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }
    
    public Contato getContato(int index) {
        if (index >= 0 && index < contatos.size()) {
            return contatos.get(index);
        }
        return null;
    }

    
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso!");
    }
    
   
    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Sem Contatos Salvos.");
        } else {
            System.out.println("Lista de contatos:");
            for (int i = 0; i < contatos.size(); i++) {
                System.out.println("Contato " + (i + 1) + ":");
                contatos.get(i).exibirContato();
            }
        }
    }

    
    public void editarContato(int indice, String novoNome, String novoTelefone) {
        if (indice >= 0 && indice < contatos.size()) {
            Contato contato = contatos.get(indice);
            if (!novoNome.isEmpty()) contato.setNome(novoNome);
            if (!novoTelefone.isEmpty()) contato.setTelefone(novoTelefone);
            System.out.println("Contato editado com sucesso!");
        } else {
            System.out.println("Contato nao encontrado.");
        }
    }

    
    public void removerContato(int indice) {
        if (indice >= 0 && indice < contatos.size()) {
            contatos.remove(indice);
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato nao encontrado.");
        }
    }

    public int tamanho() {
        return contatos.size();
    }

    Object getContatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
