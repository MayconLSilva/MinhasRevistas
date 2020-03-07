/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Maycon Silva
 */
public class ModeloRevistas {
    
    private int idRevista;
    private int numeroEdicao;
    private int ano;
    private String caixa;
    private String colecao;

    /**
     * @return the idRevista
     */
    public int getIdRevista() {
        return idRevista;
    }

    /**
     * @param idRevista the idRevista to set
     */
    public void setIdRevista(int idRevista) {
        this.idRevista = idRevista;
    }

    /**
     * @return the numeroEdicao
     */
    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    /**
     * @param numeroEdicao the numeroEdicao to set
     */
    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the caixa
     */
    public String getCaixa() {
        return caixa;
    }

    /**
     * @param caixa the caixa to set
     */
    public void setCaixa(String caixa) {
        this.caixa = caixa;
    }

    /**
     * @return the colecao
     */
    public String getColecao() {
        return colecao;
    }

    /**
     * @param colecao the colecao to set
     */
    public void setColecao(String colecao) {
        this.colecao = colecao;
    }
    
}
