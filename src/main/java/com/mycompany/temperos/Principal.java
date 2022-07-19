package com.mycompany.temperos;


import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        int op = 0;
        String msg = "Digite a opção: \n "
        + "1- Inserir \n "
        + "2- Remover \n "
        + "3- Listar \n "
        + "4- Alterar \n "
        + "0- Sair";

        Controle ctrl = new Controle();

        ArrayList<Temperos> lista = Util.ler();

        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(null, msg, "Menu", 1));
            switch (op){
                case 1: {
                    ctrl.inserirTemperos(lista);
                }
                break;
                case 2: {
                    ctrl.removerTemperos(lista);
                }
                break;
                case 3: {
                    ctrl.listarTemperos(lista);
                }
                break;
                case 4: {
                    ctrl.alterarTemperos(lista);
                }
                break;
                case 0:{
                    Util.gravar(lista); 
                    JOptionPane.showMessageDialog(null, "Saindo");
                }
                break;
                default:{
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                }
            }
        }while (op != 0);
    }
}
