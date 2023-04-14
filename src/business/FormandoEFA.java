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
public class FormandoEFA extends Formando {

    public FormandoEFA(boolean presentePRA, String nomeInicial, int idadeInicial, 
            String cursoIncial, String acaoInicial, double notaInicial) {
        super(nomeInicial, idadeInicial, cursoIncial, acaoInicial, notaInicial);
        this.presentePRA = presentePRA;
    }

    public FormandoEFA(boolean presentePRA) {
        this.presentePRA = presentePRA;
    }
    
    private boolean presentePRA;

    @Override
    public String toString() {
        return super.toString() + "\n-- Estava presente no PRA? " + mudarResposta() + "\n" + imprimirAprovacao() + "\n";
    }
    
    @Override
    public boolean verificarAprovacao() {
        
        return super.verificarAprovacao() && verificarPresencaPRA();
    }
    
    public boolean verificarPresencaPRA() {
        return presentePRA;
    }
    
    public String mudarResposta() {
        if (presentePRA) {
            return "Sim";
        }
        else {
            return "Não";
        }
    }
    
    public String imprimirAprovacao() {
        if (verificarAprovacao()) {
            return "-- FORMANDO "+ getNome() + " FOI APROVADO!\n";
        }
        else {
            return "-- FORMANDO "+ getNome() + " FOI REPROVADO!\n";
        }
    }
}
