/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.SBComp.controller;

import com.super_bits.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.Controller.anotacoes.InfoTipoAcaoFormulario;
import com.super_bits.Controller.anotacoes.InfoTipoAcaoGestaoEntidade;
import com.super_bits.modulos.SBAcessosModel.controller.FabModulosSistemaSB;
import com.super_bits.modulos.SBAcessosModel.controller.InfoModulosSistemaSB;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulos.SBAcessosModel.model.acoes.UtilFabricaDeAcoesAcessosModel;
import com.super_bits.modulosSB.SBCore.fabrica.ItfFabricaAcoes;

/**
 *
 * @author salvioF
 */
@InfoModulosSistemaSB(modulo = FabModulosSistemaSB.PAGINAS_DO_SISTEMA)
@InfoAcaoTestesDeAcao(acao = FabAcaoTestesDeAcoes.ACAO_MB_GERENCIAR)
public enum FabAcaoTestesDeAcoes implements ItfFabricaAcoes {

    @InfoTipoAcaoGestaoEntidade(xhtmlDaAcao = "/site/acoes/gerenciarTestesDeAcao.xhtml", icone = "", descricao = "")
    ACAO_MB_GERENCIAR,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/acoes/botaoController.xhtml", icone = "", descricao = "")
    ACAO_FRM_TESTE_CONTROLLER,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/acoes/botaoControllerComEntidade.xhtml", icone = "", descricao = "")
    ACAO_FRM_TESTE_CONTROLLER_COM_ENTIDADE,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/acoes/botaoGestao.xhtml", icone = "", descricao = "")
    ACAO_FRM_TESTE_FORMULARIO,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/acoes/botaoGestao.xhtml", icone = "", descricao = "")
    ACAO_FRM_TESTE_GESTAO,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/acoes/selecaoDeAcao.xhtml", icone = "", descricao = "")
    ACAO_FRM_TESTE_SELECAO,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/acoes/menu.xhtml", icone = "", descricao = "")
    ACAO_FRM_TESTE_MENUS;

    @Override
    public ItfAcaoDoSistema getAcaoDoSistema() {
        return UtilFabricaDeAcoesAcessosModel.getNovaAcao(this);
    }

    @Override
    public Class getEntidadeDominio() {
        return AcaoDoSistema.class;
    }

    @Override
    public String getNomeModulo() {
        return UtilFabricaDeAcoesAcessosModel.getModuloByFabrica(this).getNome();
    }

    @Override
    public ItfAcaoDoSistema getRegistro() {
        return getAcaoDoSistema();
    }
}
