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
public class ModeloCaixa {
    
    private int idCaixa;
    private int numeroCaixa;
    private String identificacaoEtiquetaCaixa;
    private String corCaixa;

    /**
     * @return the idCaixa
     */
    public int getIdCaixa() {
        return idCaixa;
    }

    /**
     * @param idCaixa the idCaixa to set
     */
    public void setIdCaixa(int idCaixa) {
        this.idCaixa = idCaixa;
    }

    /**
     * @return the identificacaoEtiquetaCaixa
     */
    public String getIdentificacaoEtiquetaCaixa() {
        return identificacaoEtiquetaCaixa;
    }

    /**
     * @param identificacaoEtiquetaCaixa the identificacaoEtiquetaCaixa to set
     */
    public void setIdentificacaoEtiquetaCaixa(String identificacaoEtiquetaCaixa) {
        this.identificacaoEtiquetaCaixa = identificacaoEtiquetaCaixa;
    }

    /**
     * @return the corCaixa
     */
    public String getCorCaixa() {
        return corCaixa;
    }

    /**
     * @param corCaixa the corCaixa to set
     */
    public void setCorCaixa(String corCaixa) {
        this.corCaixa = corCaixa;
    }

    /**
     * @return the numeroCaixa
     */
    public int getNumeroCaixa() {
        return numeroCaixa;
    }

    /**
     * @param numeroCaixa the numeroCaixa to set
     */
    public void setNumeroCaixa(int numeroCaixa) {
        this.numeroCaixa = numeroCaixa;
    }
    
}
