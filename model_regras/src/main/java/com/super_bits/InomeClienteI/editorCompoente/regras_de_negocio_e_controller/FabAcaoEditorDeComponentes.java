/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller;

import com.super_bits.Controller.Interfaces.acoes.ItfAcaoController;
import com.super_bits.Controller.Interfaces.acoes.ItfAcaoControllerEntidade;
import com.super_bits.Controller.Interfaces.permissoes.ItfAcaoEntidade;
import com.super_bits.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import com.super_bits.Controller.Interfaces.permissoes.ItfAcaoGerenciarEntidade;
import com.super_bits.Controller.anotacoes.InfoAcaoGestaoEntidade;
import com.super_bits.InomeClienteI.editorCompoente.ComponenteVisual;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulos.SBAcessosModel.model.acoes.UtilFabricaDeAcoesAcessosModel;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.TratamentoDeErros.FabErro;
import com.super_bits.modulosSB.SBCore.fabrica.ItfFabricaAcoes;

/**
 *
 * @author desenvolvedor
 */
@InfoModuloInomeProjetoI(modulo = FabModulosJSFComp.DEMONSTRACAO_ACESSO_RESTRITO)

public enum FabAcaoEditorDeComponentes implements ItfFabricaAcoes {

    @InfoAcaoGestaoEntidade(icone = "fa-paint-brush")
    COMPONENTE_MB_GERENCIAR,
    COMPONENTE_FRM_EDITAR,
    COMPONENTE_FRM_LISTAR,
    COMPONENTE_FRM_NOVO,
    COMPONENTE_FRM_VISUALIZAR;

    @Override
    public AcaoDoSistema getAcaoDoSistema() {
        return (AcaoDoSistema) UtilFabricaDeAcoesAcessosModel.getNovaAcao(this);
    }

    @Override
    public ItfAcaoGerenciarEntidade geAcaoGerenciarEntidade() {
        try {
            return (ItfAcaoGerenciarEntidade) getRegistro();
        } catch (Throwable t) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "A ação " + this + " não parece ser do tipo ItfAcaoControllerEntidade", t);
        }

        return null;
    }

    @Override
    public ItfAcaoFormularioEntidade getAcaoEntidadeFormulario() {
        return (ItfAcaoFormularioEntidade) getRegistro();
    }

    @Override
    public ItfAcaoControllerEntidade getAcaoEntidadeController() {
        try {
            return (ItfAcaoControllerEntidade) getRegistro();
        } catch (Throwable t) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "A ação " + this + " não parece ser do tipo ItfAcaoControllerEntidade", t);
        }

        return null;
    }

    @Override
    public ItfAcaoController getAcaoController() {
        try {
            return (ItfAcaoController) getRegistro();
        } catch (Throwable t) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "A ação " + this + " não parece ser do tipo ItfAcaoControllerEntidade", t);
        }

        return null;

    }

    @Override
    public Class getEntidadeDominio() {
        return ComponenteVisual.class;
    }

    @Override
    public String getNomeModulo() {
        return UtilFabricaDeAcoesAcessosModel.getModuloByFabrica(this).getNome();
    }

    @Override
    public ItfAcaoEntidade getAcaoDeEntidade() {
        return (ItfAcaoEntidade) UtilFabricaDeAcoesAcessosModel.getAcaoPrincipalDoDominio(this);
    }

    @Override
    public AcaoDoSistema getRegistro() {
        return getAcaoDoSistema();
    }
}
