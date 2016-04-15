package com.example.antonio.app_fruit_cheers.util;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by antonio on 06/04/2016.
 */
@DatabaseTable(tableName = "fruta")
public class Fruta {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private String nome;
    @DatabaseField
    private String descricaoNutricional;
    @DatabaseField
    private String descricaoMedicamentosa;
    @DatabaseField
    private int idImageFruta;


    public Fruta(String nome, String descricaoNutricional, String descricaoMedicamentosa, int idImageFruta) {
        this.nome = nome;
        this.descricaoNutricional = descricaoMedicamentosa;
        this.descricaoMedicamentosa = descricaoMedicamentosa;
        this.idImageFruta = idImageFruta;
    }

    public Fruta() {
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

    public String getDescricaoNutricional() {
        return descricaoNutricional;
    }

    public void setDescricaoNutricional(String descricaoNutricional) {
        this.descricaoNutricional = descricaoNutricional;
    }

    public int getIdImageFruta() {
        return idImageFruta;
    }

    public void setIdImageFruta(int idImageFruta) {
        this.idImageFruta = idImageFruta;
    }

    public String getDescricaoMedicamentosa() {
        return descricaoMedicamentosa;
    }

    public void setDescricaoMedicamentosa(String descricaoMedicamentosa) {
        this.descricaoMedicamentosa = descricaoMedicamentosa;
    }

    public String toString(){
        return "id: "+this.id+"\nnome: "+this.nome+"\nInformação Nutricional: "+this.descricaoNutricional+"\nIndicação Medicamentosa: "+this.descricaoMedicamentosa;
    }
}
