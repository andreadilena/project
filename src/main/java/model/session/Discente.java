package model.session;

import javax.persistence.*;

@Entity
@Table(name="discente")
public class Discente {

    @Column(name="matricola")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int chiave;

    @Column(name="nome")
    private String nome;

    @Column(name="cognome")
    private String cognome;

    public Discente(){
        this.nome = "";
        this.cognome = "";
    }

    public void setChiava(int chiave){
        this.chiave = chiave;
    }

    public int getChiave(){
        return chiave;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCognome(String cognome){
        this.cognome = cognome;
    }

    public String getCognome(){
        return cognome;
    }
}

