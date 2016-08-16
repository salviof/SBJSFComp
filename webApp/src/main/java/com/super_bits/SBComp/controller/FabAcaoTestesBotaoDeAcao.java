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
public enum FabAcaoTestesBotaoDeAcao implements ItfFabricaAcoes {

    @InfoTipoAcaoGestaoEntidade(xhtmlDaAcao = "/site/acoes/gerenciarTestesDeAcao.xhtml",
            nomeAcao = "Testar Botões de ação", icone = "fa fa-rocket", descricao = "Executa testes em botões de ação")
    ACAO_MB_GERENCIAR,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/acoes/botaoController.xhtml",
            nomeAcao = "Botão com ação ", icone = "fa fa-gear", descricao = "")
    ACAO_FRM_TESTE_CONTROLLER,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/acoes/botaoControllerComEntidade.xhtml",
            nomeAcao = "Controller com ação e Entidade", icone = "fa fa-gears", descricao = "")
    ACAO_FRM_TESTE_CONTROLLER_COM_ENTIDADE,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/acoes/botaoFormulario.xhtml",
            nomeAcao = "Visualização de formulario", icone = "fa fa-wpforms", descricao = "")
    ACAO_FRM_TESTE_FORMULARIO,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/acoes/botaoGestao.xhtml",
            nomeAcao = "Link para Gestão ", icone = "fa fa-fa-external-link", descricao = "")
    ACAO_FRM_TESTE_LINK,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/acoes/botaoGestao.xhtml",
            nomeAcao = "Link para Gestão com parametros ", icone = "fa fa-external-link-square ", descricao = "")
    ACAO_FRM_TESTE_LINK_E_PARAMETRO,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/acoes/selecaoDeAcao.xhtml",
            nomeAcao = "Caminho a seguir", icone = "fa fa-map-signs", descricao = "")
    ACAO_FRM_TESTE_SELCAO,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/acoes/menu.xhtml",
            nomeAcao = "Menu",
            icone = "fa fa-bars", descricao = "")
    ACAO_FRM_TESTE_MENUS,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/acoes/instrucoes.xhtml",
            nomeAcao = "Instruções", icone = "fa fa-graduation-cap", descricao = "")
    ACAO_FRM_INSTRUCOES;

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
