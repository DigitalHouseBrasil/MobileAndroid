package br.com.digitalhouse.roomdatabaseapp.data.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import br.com.digitalhouse.roomdatabaseapp.model.Contato;
import io.reactivex.Flowable;

@Dao
public interface ContatosDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Contato contato);

    @Update
    void update(Contato contato);

    @Delete
    void delete(Contato contato);

    @Query("SELECT * FROM contatos")
    List<Contato> getAll();

    @Query("SELECT * FROM contatos")
    Flowable<List<Contato>> getAllRxJava();

    @Query("SELECT * FROM contatos WHERE id = :id")
    Flowable<List<Contato>> getById(long id);

    @Query("SELECT * FROM contatos WHERE nome = :nome")
    Flowable<List<Contato>> getByNome(String nome);
}
