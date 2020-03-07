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
public class ModeloEmprestimo {
    
    private int idEmprestimo;
    private String nomeAmigoEmprestado;
    private String dataEmprestimo;
    private String dataDevolucao;
    private String livroEmprestado;

    /**
     * @return the idEmprestimo
     */
    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    /**
     * @param idEmprestimo the idEmprestimo to set
     */
    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    /**
     * @return the nomeAmigoEmprestado
     */
    public String getNomeAmigoEmprestado() {
        return nomeAmigoEmprestado;
    }

    /**
     * @param nomeAmigoEmprestado the nomeAmigoEmprestado to set
     */
    public void setNomeAmigoEmprestado(String nomeAmigoEmprestado) {
        this.nomeAmigoEmprestado = nomeAmigoEmprestado;
    }

    /**
     * @return the dataEmprestimo
     */
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    /**
     * @param dataEmprestimo the dataEmprestimo to set
     */
    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    /**
     * @return the dataDevolucao
     */
    public String getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * @param dataDevolucao the dataDevolucao to set
     */
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    /**
     * @return the livroEmprestado
     */
    public String getLivroEmprestado() {
        return livroEmprestado;
    }

    /**
     * @param livroEmprestado the livroEmprestado to set
     */
    public void setLivroEmprestado(String livroEmprestado) {
        this.livroEmprestado = livroEmprestado;
    }
    
}
