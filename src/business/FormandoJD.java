/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

/**
 *
 * @author efapp0122
 */
public class FormandoJD extends Formando{

    public FormandoJD(String nomeInicial, int idadeInicial, String cursoIncial, String acaoInicial, 
            double notaInicial, double notaTrabalhoInicial) {
        super(nomeInicial, idadeInicial, cursoIncial, acaoInicial, notaInicial);
        this.notaTrabalho = notaTrabalhoInicial;
    }

    public FormandoJD() {
        
    }
    
    private double notaTrabalho;
    
    
    @Override
    public boolean verificarAprovacao() {
        
        return super.verificarAprovacao() && verificarNotaTrabalho();
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n-- Nota do Trabalho acima de 9,99? " + mudarRespostaTrabalho() + "\n" + imprimirAprovacao() + "\n";
    }
    
    public boolean verificarNotaTrabalho() {
        return notaTrabalho > 9.99;
    }
    
    public String imprimirAprovacao() {
        if (verificarAprovacao()) {
            return "-- FORMANDO "+ getNome() + " FOI APROVADO!\n";
        }
        else {
            return "-- FORMANDO "+ getNome() + " FOI REPROVADO!\n";
        }
    }
    
     public String mudarRespostaTrabalho() {
        if (verificarNotaTrabalho()) {
            return "Sim";
        }
        else {
            return "Não";
        }
    }
}
