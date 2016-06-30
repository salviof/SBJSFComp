/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller;

import com.super_bits.Controller.anotacoes.InfoTipoAcaoFormulario;
import com.super_bits.Controller.anotacoes.InfoTipoAcaoGestaoEntidade;
import com.super_bits.InomeClienteI.editorCompoente.ComponenteVisual;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulos.SBAcessosModel.model.acoes.UtilFabricaDeAcoesAcessosModel;
import com.super_bits.modulosSB.SBCore.fabrica.ItfFabricaAcoes;

/**
 *
 * @author desenvolvedor
 */
@InfoModuloSBComp(modulo = FabModulosJSFComp.DEMONSTRACAO_ACESSO_RESTRITO)
public enum FabAcaoEditorDeComponentes implements ItfFabricaAcoes {

    @InfoTipoAcaoGestaoEntidade(icone = "fa fa-paint-brush", xhtmlDaAcao = "/site/componentes/gerenciar.xhtml")
    COMPONENTE_MB_GERENCIAR,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/componentes/editar.xhtml")
    COMPONENTE_FRM_EDITAR,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/componentes/listar.xhtml")
    COMPONENTE_FRM_LISTAR,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/componentes/novo.xhtml")
    COMPONENTE_FRM_NOVO,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/componentes/visualizar.xhtml")
    COMPONENTE_FRM_VISUALIZAR;

    @Override
    public AcaoDoSistema getAcaoDoSistema() {
        return (AcaoDoSistema) UtilFabricaDeAcoesAcessosModel.getNovaAcao(this);
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
    public AcaoDoSistema getRegistro() {
        return getAcaoDoSistema();
    }
}
