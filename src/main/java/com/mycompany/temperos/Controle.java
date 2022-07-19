package com.mycompany.temperos;


import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controle {
    public static void inserirTemperos (ArrayList<Temperos> lista){
        char tipo;
        Temperos temperos = new Temperos();
        
        temperos.setID(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID: ")));
        temperos.setProduto(JOptionPane.showInputDialog("Digite o nome do produto: "));
        temperos.setMarca(JOptionPane.showInputDialog(null, "Digite a marca do produto: "));
        temperos.setFabricante(JOptionPane.showInputDialog(null, "Digite o fabricante: "));
        temperos.setOrigem(JOptionPane.showInputDialog(null, "Digite o país de origem: "));
        temperos.setPeso(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o peso: ")));
        do{
        tipo = JOptionPane.showInputDialog(null, "Digite o tipo de volume (l para líquido e s para sólido): ").charAt(0);
        temperos.setTipovol(tipo);
        } while ((tipo != 'l') && (tipo != 's'));
        temperos.setPreco(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o preço: ")));
        temperos.setAno(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de fabricação: ")));

        lista.add(temperos);
    }

    public static void removerTemperos (ArrayList<Temperos> lista){
        int aux=0;
        if (lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "A lista está vazia!", "Meus Temperos", 0);
        } else{
            int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID do tempero que deseja excluir"));
            for (Temperos t : lista) {
                if (t.getID() != id){
                    aux++;
                } else{
                    System.out.println("index "+lista.indexOf(t));
                    lista.remove(lista.indexOf(t));
                    break;
                }
            }
            if (aux == lista.size()){
                JOptionPane.showMessageDialog(null, "ID não existe!", "ERRO!", 0);
            }
        }
    }

    public static void listarTemperos (ArrayList<Temperos> lista) {
        String msg = "";
        if (lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "A lista está vazia!", "Meus Temperos", 0);
        } else {
            for (Temperos t : lista) {
                msg = msg + "\nID: " + t.getID();
                msg = msg + "\nProduto: " + t.getProduto();
                msg = msg + "\nMarca: " + t.getMarca();
                msg = msg + "\nFabricante: " + t.getFabricante();
                msg = msg + "\nPaís de Origem: " + t.getOrigem();
                msg = msg + "\nPeso: " + t.getPeso();
                msg = msg + "\nTipo de Volume: " + t.getTipovol();
                msg = msg + "\nPreço: " + t.getPreco();
                msg = msg + "\nAno de Fabricação: " + t.getAno();
                msg = msg + "\n__________________________________\n";
            }
            JOptionPane.showMessageDialog(null, msg, "Meus Temperos!", 1);
        }       
    }

    public static void alterarTemperos (ArrayList<Temperos> lista){
        int aux = 0;
        if (lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "A lista está vazia!", "Meus Temperos", 0);
        } else{
            int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID do tempero que deseja alterar"));
            for (Temperos t : lista) {
                if (t.getID() == id){
                    Temperos temp = lista.get(lista.indexOf(t));
                    temp.setProduto(JOptionPane.showInputDialog("Digite o nome do Produto: ", temp.getProduto()));
                    temp.setMarca(JOptionPane.showInputDialog("Digite a marca do produto: ", temp.getMarca()));
                    temp.setFabricante(JOptionPane.showInputDialog("Digite o fabricante: ", temp.getFabricante()));
                    temp.setOrigem(JOptionPane.showInputDialog("Digite o país de origem: ", temp.getOrigem()));
                    temp.setPeso(Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do produto: ", temp.getPeso())));
                    do{
                    temp.setTipovol(JOptionPane.showInputDialog("Digite o tipo de volume (l/s): ", temp.getTipovol()).charAt(0));
                    } while ((temp.getTipovol() != 'l') && (temp.getTipovol() != 's'));
                    temp.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Digite o preço do produto: ", temp.getPreco())));
                    temp.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de fabricação do produto: ", temp.getAno())));
                } else{
                    aux++;
                }
            }
             if (aux == lista.size()){
                    JOptionPane.showMessageDialog(null, "ID não existe!", "ERRO!", 0);
             }
        }        
    }
}
