package com.example.antonio.app_fruit_cheers.persistencia;

import android.content.Context;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.antonio.app_fruit_cheers.DAO.FrutaDAO;
import com.example.antonio.app_fruit_cheers.util.Fruta;
import com.example.antonio.app_fruit_cheers.DAO.ReceitaDAO;
import com.example.antonio.app_fruit_cheers.util.Receita;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;

/**
 * Created by antonio on 06/04/2016.
 */
public class DB {
    private Helper helper;//Classe para o controle do banco
    private FrutaDAO frutaDAO;//Classe para o controle da entidade fruta
    private ReceitaDAO receitaDAO;//Classe para o controle da entidade receita

    public DB(Context context) {//recebo o contexto da aplicação no construtor
        helper = new Helper(context);//instanciação do helper utilizando o contexto
        try {//tratamento de excessão
            frutaDAO = new FrutaDAO(helper.getConnectionSource());//instanciação do DAO da fruta
            receitaDAO = new ReceitaDAO(helper.getConnectionSource());//instanciação do DAO da receita
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //==========================================================================Fruta CRUD
    public void insertAluno(Fruta fruta) throws SQLException {
        frutaDAO.create(fruta);//INSERT
    }
    public void updateFruta(Fruta fruta) throws SQLException {
        frutaDAO.update(fruta);//UPDATE
    }
    public void deleteFruta(Fruta fruta) throws SQLException {
        frutaDAO.delete(fruta);//DELETE
    }
    public List<Fruta> selectFruta() throws SQLException {
        List<Fruta> frutas = new ArrayList<>();
        frutas = frutaDAO.queryForAll();//SELECT *
        return  frutas;
    }
    public List<Fruta> selectFrutaById(int id) throws SQLException {
        QueryBuilder<Fruta, Integer> builder = frutaDAO.queryBuilder();//INSTANCIAÇÃO DO CONSTRUTOR DA QUERY
        builder.where().idEq(id);//CONSTRUÇÃO DO SQL COM A CLAUSULA WHERE
        PreparedQuery<Fruta> preparedQuery = builder.prepare();//
        List<Fruta> frutas = frutaDAO.query(preparedQuery);//SELECT ESPECÍFICO
        return frutas;
    }
    //===============================================================================receita CRUD
    public void insertReceita(Receita receita) throws SQLException {
        receitaDAO.create(receita);//INSERT
    }public void updateReceita(Receita receita) throws SQLException {
        receitaDAO.update(receita);//UPDATE
    }
    public void deleteReceita(Receita receita) throws SQLException {
        receitaDAO.delete(receita);//DELETE
    }
    public List<Receita> selectReceita() throws SQLException {
        List<Receita> receitas = new ArrayList<>();
        receitas = receitaDAO.queryForAll();//SELECT *
        return  receitas;
    }
    public List<Receita> selectReceitaById(int id) throws SQLException {
        QueryBuilder<Receita, Integer> builder = receitaDAO.queryBuilder();//INSTANCIAÇÃO DO CONSTRUTOR DA QUERY
        builder.where().idEq(id);//CONSTRUÇÃO DO SQL COM A CLAUSULA WHERE
        PreparedQuery<Receita> preparedQuery = builder.prepare();//
        List<Receita> receitas = receitaDAO.query(preparedQuery);//SELECT ESPECÍFICO
        return receitas;
    }

}
