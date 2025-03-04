package br.edu.ifsp.agendasqlite.model;

import java.io.Serializable;

public class Contato implements Serializable {

    private int id;
    private String nome;
    private String fone;
    private String email;
    private Boolean favorito; // true - Favorito  false - Não Favorito
    private String fone2;
    private String diaMesAniver; // DD/MM

    public Contato() {
    }

    public Contato(String nome, String fone, String email, Boolean favorito, String fone2, String diaMesAniver) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
        this.favorito = favorito;
        this.fone2 = fone2;
        this.diaMesAniver = diaMesAniver;
    }


    public boolean equals(Object obj)
    {
        Contato c2= (Contato) obj;
        if (this.id ==c2.getId())
            return true;
           else
            return false;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getFavorito() {
        return favorito;
    }

    public void setFavorito(Boolean favorito) {
        this.favorito = favorito;
    }

    public String getFone2() {
        return fone2;
    }

    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }

    public String getDiaMesAniver() {
        return diaMesAniver;
    }

    public void setDiaMesAniver(String diaMesAniver) {
        this.diaMesAniver = diaMesAniver;
    }
}
