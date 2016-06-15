/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller;

import com.super_bits.Controller.Interfaces.acoes.ItfAcaoController;
import com.super_bits.Controller.Interfaces.acoes.ItfAcaoControllerEntidade;
import com.super_bits.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.Controller.Interfaces.permissoes.ItfAcaoEntidade;
import com.super_bits.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import com.super_bits.Controller.Interfaces.permissoes.ItfAcaoGerenciarEntidade;
import com.super_bits.Controller.anotacoes.InfoTipoAcaoFormulario;
import com.super_bits.InomeClienteI.editorCompoente.model.BeanExemplo;
import com.super_bits.modulos.SBAcessosModel.model.acoes.UtilFabricaDeAcoesAcessosModel;
import com.super_bits.modulosSB.SBCore.fabrica.ItfFabricaAcoes;

/**
 *
 * @author salvioF
 */
public enum FabTestesBeanExemplo implements ItfFabricaAcoes {

    @InfoTipoAcaoFormulario(campos = {""})
    beanExemplo_FRM_Teste;

    @Override
    public ItfAcaoDoSistema getAcaoDoSistema() {
        return UtilFabricaDeAcoesAcessosModel.getNovaAcao(this);
    }

    @Override
    public ItfAcaoEntidade getAcaoDeEntidade() {
        return getAcaoDeEntidade();
    }

    @Override
    public ItfAcaoFormularioEntidade getAcaoEntidadeFormulario() {
        return (ItfAcaoFormularioEntidade) getAcaoDeEntidade();
    }

    @Override
    public ItfAcaoControllerEntidade getAcaoEntidadeController() {
        return (ItfAcaoControllerEntidade) getAcaoDeEntidade();
    }

    @Override
    public ItfAcaoController getAcaoController() {
        return (ItfAcaoController) getAcaoDeEntidade();
    }

    @Override
    public ItfAcaoGerenciarEntidade geAcaoGerenciarEntidade() {
        return (ItfAcaoGerenciarEntidade) getAcaoDeEntidade();
    }

    @Override
    public Class getEntidadeDominio() {
        return BeanExemplo.class;
    }

    @Override
    public String getNomeModulo() {
        return UtilFabricaDeAcoesAcessosModel.getModuloByFabrica(this).getNome();
    }

    @Override
    public Object getRegistro() {
        return getAcaoDeEntidade();
    }

}
