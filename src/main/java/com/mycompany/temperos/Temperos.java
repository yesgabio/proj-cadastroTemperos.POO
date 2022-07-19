package com.mycompany.temperos;


import java.io.Serializable;

public class Temperos implements Serializable{
    private int id;
    private String produto;
    private String marca;
    private String fabricante;
    private String origem;
    private float peso;
    private char tipovol;
    private float preco;
    private int ano;

    public Temperos(){
    }

    public Temperos(int id, String produto, String marca, String fabricante, String origem, float peso, char tipovol, float preco, int ano){
        this.id = id;
        this.produto = produto;
        this.marca = marca;
        this.fabricante = fabricante;
        this.origem = origem;
        this.peso = peso;
        this.tipovol = tipovol;
        this.preco = preco;
        this.ano = ano;
    }

    public int getID(){
        return id;
    }
    public void setID(int id){
        this.id = id;
    }

    public String getProduto(){
        return produto;
    }
    public void setProduto(String produto){
        this.produto = produto;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getFabricante(){
        return fabricante;
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getOrigem(){
        return origem;
    }
    public void setOrigem(String origem){
        this.origem = origem;
    }

    public float getPeso(){
        return peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }    

    public char getTipovol(){
        return tipovol;
    }
    public void setTipovol(char tipovol){
        this.tipovol = tipovol;
    }

    public float getPreco(){
        return preco;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }

    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
}
