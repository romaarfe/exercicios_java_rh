/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

import business.Formando;
import business.Escola;
import business.Turma;
import java.util.ArrayList;
import lib.Console;

/**
 *
 * @author efapp0122
 */
public class TestEscola {
    public static void main(String[] args) {
        
        Escola e = new Escola("Mariazinha Bacalhoada II", 
                "Braga", "995677886", 4);
        
//        e.setNome_escola("Mariazinha Bacalhoada II");
//        e.setLocalizacao("Braga");
//        e.setTelefone("995677886");
        
        Turma t1 = new Turma("efa0122", "Javardos");
//        t1.setNome_curso("efa0122");
//        t1.setNome_turma("Javardos");
        e.adicionarTurma(t1);
        
//        Formando f1 = new Formando(1, "Zé Picolé", 31, 
//                "Programador", "01.22");

//        f1.setNumero(1);
//        f1.setNome("Zé Picolé");
//        f1.setIdade(31);
//        f1.setCurso("Programador");
//        f1.setAcao("01.22");
//        t1.adicionarFormando(f1);
        
//        Formando f2 = new Formando(2, "Pedro Gambiarra", 65, 
//                "Programador", "01.22");

//        f2.setNumero(2);
//        f2.setNome("Pedro Gambiarra");
//        f2.setIdade(65);
//        f1.setCurso("Programador");
//        f2.setAcao("01.22");
//        t1.adicionarFormando(f2);
        
//        Formando f3 = new Formando(3,"Toni Vendedor de Ramos", 31, 
//                "Programador", "01.22");

//        f3.setNumero(3);
//        f3.setNome("Toni Vendedor de Ramos");
//        f3.setIdade(31);
//        f3.setCurso("Programador");
//        f3.setAcao("01.22");
//        t1.adicionarFormando(f3);
        
        Turma t2 = new Turma("efa0123", "Javardices");
//        t2.setNome_curso("efa0123");
//        t2.setNome_turma("Javardices");
        e.adicionarTurma(t2);
        
//        Formando f4 = new Formando(1, "Mariola Quaresma", 31, 
//                "Pseudo Programador", "01.23");

//        f4.setNumero(1);
//        f4.setNome("Mariola Quaresma");
//        f4.setIdade(31);
//        f4.setCurso("Pseudo Programador");
//        f4.setAcao("01.23");
//        t2.adicionarFormando(f4);
        
//        Formando f5 = new Formando(2, "Taninha Pirueta", 65, 
//                "Pseudo Programador", "01.23");

//        f5.setNumero(2);
//        f5.setNome("Taninha Pirueta");
//        f5.setIdade(65);
//        f5.setCurso("Pseudo Programador");
//        f5.setAcao("01.23");
//        t2.adicionarFormando(f5);
        
//        Formando f6 = new Formando(3, "Pistoleiro Sem Dedo", 31, 
//                "Pseudo Programador", "01.23");

//        f6.setNumero(3);
//        f6.setNome("Pistoleiro Sem Dedo");
//        f6.setIdade(31);
//        f6.setCurso("Pseudo Programador");
//        f6.setAcao("01.23");
//        t2.adicionarFormando(f6);
        
        System.out.println(e.toString());
        
    }
}
