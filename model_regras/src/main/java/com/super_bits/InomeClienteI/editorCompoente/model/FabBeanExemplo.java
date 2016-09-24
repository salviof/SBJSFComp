/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.InomeClienteI.editorCompoente.model;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;

/**
 *
 * @author desenvolvedor
 */
public enum FabBeanExemplo implements ItfFabrica {
    BEAN_EXEMPLO1, BEAN_EXEMPLO2, BEAN_EXEMPLO3, BEAN_EXEMPLO4;

    ;

    @Override
    public Object getRegistro() {
        BeanExemplo novoBean = new BeanExemplo();
        switch (this) {
            case BEAN_EXEMPLO1:
                novoBean.setId(10);
                novoBean.setNome("Bean Exemplo 11");
                break;
            case BEAN_EXEMPLO2:
                novoBean.setId(11);
                novoBean.setNome("Bean Exemplo 22");
                break;
            case BEAN_EXEMPLO3:
                novoBean.setId(12);
                novoBean.setNome("Bean Exemplo 33");
                break;
            case BEAN_EXEMPLO4:
                novoBean.setId(13);
                novoBean.setNome("Bean Exemplo 44");
                break;
            default:
                throw new AssertionError(this.name());

        }
        return novoBean;

    }

}
