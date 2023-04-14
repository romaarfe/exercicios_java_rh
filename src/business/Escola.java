/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author efapp0122
 */
public class Escola {
    
    public Escola(String nomeEscolaInicial, String localizacaoInicial, 
            String telefoneInicial, int MAX) {
        nome_escola = nomeEscolaInicial;
        localizacao = localizacaoInicial;
        telefone = telefoneInicial;
        MAX_TURMAS = MAX;
 
    }
    
    public Escola() {
        MAX_TURMAS = 4;
    
    }
    
    private String nome_escola = ""; 
    private String localizacao = ""; 
    private String telefone = "";
    public final int MAX_TURMAS;
    private ArrayList<Turma> lista_turmas = new ArrayList<>();
    
    
    public String toString() {
        String str = "";

        str += "Escola\n";
        str += "Nome da Escola: " + getNome_escola()
                + ", Localização: " + getLocalizacao()
                + ", Telefone: " + getTelefone()
                + "\n\tTurmas: " + getLista_turmas();

        return str;
    }
    
    public String listaDadosTurma(Turma t) {
 
        return t.toString();
    }

    public String getNome_escola() {
        return nome_escola;
    }

    public void setNome_escola(String nome_escola) {
        this.nome_escola = nome_escola;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Turma> getLista_turmas() {
        return lista_turmas;
    }

    public void setLista_turmas(ArrayList<Turma> lista_turmas) {
        this.lista_turmas = lista_turmas;
    }
    
    public void adicionarTurma(Turma t) {
        if (lista_turmas.size() < MAX_TURMAS) {
            lista_turmas.add(t);
        }
        else {
            System.out.println("Limite de turmas alcançado!");
        }
    }
    
    public void removerTurma(Turma t) {
        lista_turmas.remove(t);
    }
    
    public void removerTurma(int pos) {
        if (pos > 0 && pos < lista_turmas.size()) {
            lista_turmas.remove(pos);
        }
    }
    
    
}
