package com.mycompany.temperos;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Util {
    public static void gravar(ArrayList<Temperos> lista){
        try{
            FileOutputStream arquivo = new FileOutputStream("temperos.dat");
            ObjectOutputStream fluxo = new ObjectOutputStream(arquivo);
            fluxo.writeObject(lista);
            fluxo.flush();
            JOptionPane.showMessageDialog(null, "Dados gravados com sucesso " 
                    + "no arquivo temperos.dat");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Falha na gravação do arquivo" + (e));
        }
    }

    public static ArrayList ler(){
        ArrayList<Temperos> lista = new ArrayList<>();
        try {
            FileInputStream arquivo = new FileInputStream("temperos.dat");
            ObjectInputStream fluxo = new ObjectInputStream(arquivo);
            lista = (ArrayList) fluxo.readObject();
            JOptionPane.showMessageDialog(null, "Dados lidos com sucesso"
            + " no arquivo dados.dat");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha na leitura do arquivo" + (e));
        }
        return lista;
    }
}
