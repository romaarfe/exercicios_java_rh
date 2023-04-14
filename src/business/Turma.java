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
public class Turma {

    public Turma(String nomeCursoInicial, String nomeTurmaInicial) {
        nome_curso = nomeCursoInicial;
        nome_turma = nomeTurmaInicial;    
    }

    public Turma() {
        
    }
    
    private String nome_curso = ""; 
    private String nome_turma = "";
    private ArrayList<Formando> lista_formandos = new ArrayList<>();

    public String getNome_curso() {
        return nome_curso;
    }

    public void setNome_curso(String nome_curso) {
        this.nome_curso = nome_curso;
    }

    public String getNome_turma() {
        return nome_turma;
    }

    public void setNome_turma(String nome_turma) {
        this.nome_turma = nome_turma;
    }

    public ArrayList<Formando> getLista_formandos() {
        return lista_formandos;
    }

    public void adicionarFormando(Formando f) {
        lista_formandos.add(f);
    }
    
    public void removerFormando(Formando f) {
        lista_formandos.remove(f);
    }
    
    public void removerFormando(int pos) {
        if (pos > 0 && pos < lista_formandos.size()) {
            lista_formandos.remove(pos);
        }
    }

    public String toString() {
        String str = "";
        
        str += "\n\tNome: " + getNome_turma() + ", Nome do Curso: " + getNome_curso()
                + "\n\t\tFormandos: " + getLista_formandos();

        return str;
    }
    
    
}