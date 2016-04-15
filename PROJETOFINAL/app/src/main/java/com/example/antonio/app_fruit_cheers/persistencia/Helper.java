package com.example.antonio.app_fruit_cheers.persistencia;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.antonio.app_fruit_cheers.util.Fruta;
import com.example.antonio.app_fruit_cheers.util.Receita;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * Created by antonio on 06/04/2016.
 */
public class Helper extends OrmLiteSqliteOpenHelper{
    private static final String NOME = "Fruit";
    private static final int VERSAO = 1;

    public Helper(Context context) {
        super(context, NOME, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, Fruta.class);
            TableUtils.createTable(connectionSource, Receita.class);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int i, int i1) {
        try {
            TableUtils.dropTable(connectionSource, Fruta.class, true);
            TableUtils.dropTable(connectionSource, Receita.class, true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
