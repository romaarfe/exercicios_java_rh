/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

import business.Formando;
import business.FormandoEFA;
import business.FormandoJD;
import business.Turma;
import lib.Console;
import java.util.ArrayList;

/**
 *
 * @author efapp0122
 */
public class TestFormando {

//    public static final String INPUT(String x) {
//        return Console.readString(x);
//    }
//
//    public static final void PRINT(String y) {
//        System.out.println(y);
//    }
    public static void main(String[] args) {

//        Formando f1 = new Formando();
//        
//        PRINT("Nome anterior: " + f1.getNome());
//        
//        String novoNome = INPUT("Novo nome do formando: ");
//        
//        f1.setNome(novoNome);
//        
//        PRINT("Nome atual: " + f1.getNome());
//        
//        ArrayList<String> frases = new ArrayList<>();
//        String f;
//
//        for (int i = 0; i < 6; i++) {
//            f = Console.readString("Insira alguma info: ");
//            frases.add(f);
//        }
//        
//        frases.remove(3);
//        frases.set(4, "Ragnarok");
//        
//       for (String frase : frases) {
//           System.out.println(frase);
//      
        ArrayList<Formando> formandos = new ArrayList<>();

//        int num = Console.readInt("Insira a quantidade de formandos: ");
//        for (int i = 0; i < num; i++) {
//            f.setNumero(Console.readInt("Insira o numero: "));
//            f.setNome(Console.readString("Insira o nome: "));
//            f.setIdade(Console.readInt("Insira a idade: "));
//            f.setCurso(Console.readString("Insira o curso: "));
//            f.setAcao(Console.readString("Insira a acao: "));
        Formando f1 = new FormandoEFA(true, "Juvenal", 34,
                "EFA", "0122", 12.5);
        formandos.add(f1);

        Formando f2 = new FormandoEFA(false, "Taninha", 24,
                "EFA", "0122", 11);
        formandos.add(f2);

        Formando f3 = new FormandoEFA(false, "Epaminondas", 14,
                "EFA", "0122", 8);
        formandos.add(f3);

        System.out.println(formandos.toString());
    }
}
