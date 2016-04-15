package com.example.antonio.app_fruit_cheers.util;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
/**
 * Created by antonio on 06/04/2016.
 */
@DatabaseTable(tableName = "receita")
public class Receita {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private String nome;
    @DatabaseField
    private String ingredientes;
    @DatabaseField
    private String modoPreparo;
    @DatabaseField(foreign = true)
    private Fruta fruta;

    public Receita(String nome, String ingredientes, String modoPreparo, Fruta fruta) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.modoPreparo = modoPreparo;
        this.fruta = fruta;
    }

    public Receita() {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

    public Fruta getFruta() {
        return fruta;
    }

    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }

    public String toString(){
        return "ID: "+this.id+"\nNome: "+this.nome+"\nFruta: "+this.fruta+"\nIngredientes: "+this.ingredientes+"\nModo de preparo: "+this.modoPreparo;
    }
}
