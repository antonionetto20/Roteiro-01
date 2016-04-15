package com.example.antonio.app_fruit_cheers.DAO;

import com.example.antonio.app_fruit_cheers.util.Fruta;
import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by antonio on 06/04/2016.
 */
public class FrutaDAO extends BaseDaoImpl<Fruta, Integer> {
    public FrutaDAO(ConnectionSource connectionSource) throws SQLException {
        super(Fruta.class);
        setConnectionSource(connectionSource);
        initialize();
    }
    //este método retorna um objeto queryBuilder que serve para que você possa construir seu
    //select utilizando clausulas como o where e operações como o like, o and...
    @Override
    public QueryBuilder<Fruta, Integer> queryBuilder() {
        return super.queryBuilder();
    }
    //Com este método, você pode fazer os selects específicos utilizando as clausulas construídas
    //utilizando o queryBuilder
    @Override
    public List<Fruta> query(PreparedQuery<Fruta> preparedQuery) throws SQLException {
        return super.query(preparedQuery);
    }
}
