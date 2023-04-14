/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.logging.Logger;

/**
 *
 * @author efapp0122
 */
public class Formando { // Primeira letra maiúscula da classe
    
    public Formando(String nomeInicial, int idadeInicial, 
            String cursoIncial, String acaoInicial, double notaInicial) {
        incrementarNumero(this);
        nome =  nomeInicial;
        idade = idadeInicial;
        curso = cursoIncial;
        acao = acaoInicial;
        nota = notaInicial;
    }
    
    public Formando() {
        
    }

    // == VARIAVEIS DE INSTANCIA ======================
    private static int contador = 1;
    private int numero = contador; // As variaveis tem que ter o modificador de acesso 'private'
    private String nome = ""; // String tem letra maiuscula por não ser nativo/primitivo
    private int idade = 0;
    private String curso = "";
    private String acao = "";
    private double nota = 0;

    // == METODOS DE INSTANCIA ========================
    
    public static void incrementarNumero(Formando f) {
        contador++;
    }
    
    public boolean verificarAprovacao() {
        return nota > 9.99;
    }
    
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCurso() {
        return curso;
    }

    public String getAcao() {
        return acao;
    }

    public String toString() {
        String str = "";
        
        str += "Nome: " + nome +  ", Idade: " + idade + ", Curso: " + curso + ", Acao: " + acao + ", Nota: " + nota;

        return str;
    }

    public boolean equals(Object obj) {

        if (obj instanceof Formando) {

            Formando fobj = (Formando) obj; // cast

            if (getNome().equals(fobj.getNome())
                    && getNumero() == fobj.getNumero()
                    && getIdade() == fobj.getIdade()
                    && getAcao().equals(fobj.getAcao())
                    && getCurso().equals(fobj.getCurso())) {
                return true;
            }
        }
        return false;
    }

    public Object clone() {

        Formando f = new Formando();

        f.setNome(getNome());
        f.setNumero(getNumero());
        f.setAcao(getAcao());
        f.setCurso(getCurso());
        f.setIdade(getIdade());

        return f;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
