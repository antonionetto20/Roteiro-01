package com.example.antonio.app_fruit_cheers.util;

import android.app.Application;

import com.example.antonio.app_fruit_cheers.R;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by antonio on 13/04/2016.
 */
public class FrutasApplication extends Application{

    private List<Fruta> frutas;

    @Override
    public void onCreate() {
        super.onCreate();
        this.frutas = new ArrayList<Fruta>();
        criarFrutasPadrao();

    }

    private void criarFrutasPadrao(){
        this.frutas.add(new Fruta("Goiaba", "nutricional", "medicamentosa", R.drawable.goiaba));
        this.frutas.add(new Fruta("Goiaba", "nutricional", "medicamentosa", R.drawable.goiaba));
        this.frutas.add(new Fruta("Goiaba", "nutricional", "medicamentosa", R.drawable.goiaba));
        this.frutas.add(new Fruta("Goiaba", "nutricional", "medicamentosa", R.drawable.goiaba));
        this.frutas.add(new Fruta("Goiaba", "nutricional", "medicamentosa", R.drawable.goiaba));
        this.frutas.add(new Fruta("Goiaba", "nutricional", "medicamentosa", R.drawable.goiaba));
        this.frutas.add(new Fruta("Goiaba", "nutricional", "medicamentosa", R.drawable.goiaba));
        this.frutas.add(new Fruta("Goiaba", "nutricional", "medicamentosa", R.drawable.goiaba));
        this.frutas.add(new Fruta("Goiaba", "nutricional", "medicamentosa", R.drawable.goiaba));
        this.frutas.add(new Fruta("Goiaba", "nutricional", "medicamentosa", R.drawable.goiaba));
        this.frutas.add(new Fruta("Goiaba", "nutricional", "medicamentosa", R.drawable.goiaba));
        this.frutas.add(new Fruta("Goiaba", "nutricional", "medicamentosa", R.drawable.goiaba));


    }

    public List<Fruta> getFrutas() {
        return this.frutas;
    }

    /**public void adicionarCarro(){
        Random random = new Random();
        this.carros.add(
                this.carros.get(
                        this.carros.size() > 1 ? random.nextInt(this.carros.size() - 1) : 0
                )
        );
    }

    **/
    public void removerFruta(int posicao){
        this.frutas.remove(posicao);
    }
}
