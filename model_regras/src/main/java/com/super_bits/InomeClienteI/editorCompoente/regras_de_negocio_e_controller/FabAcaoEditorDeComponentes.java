/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller;

import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulos.SBAcessosModel.model.acoes.UtilFabricaDeAcoesAcessosModel;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoGestaoEntidade;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaAcoes;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComponenteVisualSB;

/**
 *
 * @author desenvolvedor
 */
@InfoModuloSBComp(modulo = FabModulosJSFComp.DEMONSTRACAO_ACESSO_RESTRITO)
public enum FabAcaoEditorDeComponentes implements ItfFabricaAcoes {

    @InfoTipoAcaoGestaoEntidade(nomeAcao = "Componentes", icone = "fa fa-th-large", xhtmlDaAcao = "/site/componentes/gerenciar.xhtml")
    COMPONENTE_MB_GERENCIAR,
    @InfoTipoAcaoFormulario(icone = "fa fa-th-large", xhtmlDaAcao = "/site/componentes/listar.xhtml", nomeAcao = "Listar Componentes")
    COMPONENTE_FRM_LISTAR,
    @InfoTipoAcaoFormulario(icone = "fa fa-pencil-square-o", nomeAcao = "Editar Componente", xhtmlDaAcao = "/site/componentes/editar.xhtml")
    COMPONENTE_FRM_EDITAR,
    @InfoTipoAcaoFormulario(icone = "fa fa-plus ", nomeAcao = "Novo Componente", xhtmlDaAcao = "/site/componentes/novo.xhtml")
    COMPONENTE_FRM_NOVO,
    @InfoTipoAcaoFormulario(icone = "fa fa-eye", xhtmlDaAcao = "/site/componentes/visualizar.xhtml")
    COMPONENTE_FRM_VISUALIZAR,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/componentes/inputs.xhtml", icone = "fa fa-pencil-square-o", nomeAcao = "Campos tipo Input")
    COMPONENTE_FRM_INPUTS,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/componentes/todosInputs.xhtml",
            icone = "fa fa-bars", nomeAcao = "Campos tipo Input")
    COMPONENTE_FRM_TODOS_INPUTS;

    @Override
    public AcaoDoSistema getAcaoDoSistema() {
        return (AcaoDoSistema) UtilFabricaDeAcoesAcessosModel.getNovaAcao(this);
    }

    @Override
    public Class getEntidadeDominio() {
        return ComponenteVisualSB.class;
    }

    @Override
    public String getNomeModulo() {
        return UtilFabricaDeAcoesAcessosModel.getModuloByFabrica(this).getNome();
    }

    @Override
    public AcaoDoSistema getRegistro() {
        return getAcaoDoSistema();
    }
}
