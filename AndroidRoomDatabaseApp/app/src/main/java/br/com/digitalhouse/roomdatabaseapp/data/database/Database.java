package br.com.digitalhouse.roomdatabaseapp.data.database;

import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;

import br.com.digitalhouse.roomdatabaseapp.data.database.dao.ContatosDAO;
import br.com.digitalhouse.roomdatabaseapp.model.Contato;

@android.arch.persistence.room.Database(entities = {Contato.class}, version = 2, exportSchema = false)
@TypeConverters(Converters.class)
public abstract class Database extends RoomDatabase {

    private static volatile Database INSTANCE;

    public abstract ContatosDAO contatosDAO();

    public static Database getDataBase(final Context context) {
        if (INSTANCE == null) {
            synchronized (Database.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), Database.class, "banco_de_dados")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }

        return INSTANCE;
    }
}
