package br.com.digitalhouse.roomdatabaseapp.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;

@Entity(tableName = "contatos")
public class Contato implements Parcelable {

    @PrimaryKey(autoGenerate = true)
    private long id;

    @ColumnInfo(name = "nome")
    private String nome;

    @ColumnInfo(name = "telefone")
    private String telefone;

    public Contato() {
    }

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    protected Contato(Parcel in) {
        id = in.readLong();
        nome = in.readString();
        telefone = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(id);
        dest.writeString(nome);
        dest.writeString(telefone);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Contato> CREATOR = new Creator<Contato>() {
        @Override
        public Contato createFromParcel(Parcel in) {
            return new Contato(in);
        }

        @Override
        public Contato[] newArray(int size) {
            return new Contato[size];
        }
    };

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
