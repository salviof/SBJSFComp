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
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/acoes/botaoAcaoTst.xhtml",
            nomeAcao = "Botão com ação personalizada ", icone = "fa fa-gear", descricao = "")
    ACAO_FRM_TESTE_BOTAO_ACAO,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/acoes/botaoAcaoPaginaAtualTst.xhtml",
            nomeAcao = "Executar ação pagina Atual", icone = "fa fa-gears", descricao = "")
    ACAO_FRM_TESTE_CONTROLLER_COM_ENTIDADE,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/acoes/botaoAcaoDeEntidadePaginaAtualTst.xhtml",
            nomeAcao = "Executar ação de entidade pagina Atual", icone = "fa fa-wpforms", descricao = "")
    ACAO_FRM_TESTE_FORMULARIO,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/acoes/botaoFakeTst.xhtml",
            nomeAcao = "Botao Fake ", icone = "fa fa-fa-external-link", descricao = "")
    ACAO_FRM_TESTE_FAKE,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/acoes/botaoLinkTst.xhtml",
            nomeAcao = "Links ", icone = "fa fa-external-link-square ", descricao = "")
    ACAO_FRM_TESTE_MENU,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/acoes/menuTst.xhtml",
            nomeAcao = "Menu",
            icone = "fa fa-bars", descricao = "")
    ACAO_FRM_TESTE_INSTRUCAO,
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/acoes/instrucoes.xhtml",
            nomeAcao = "Instruções", icone = "fa fa-graduation-cap", descricao = "")
    ACAO_FRM_INSTRUCOES;

    @Override
    public AcaoDoSistema getAcaoDoSistema() {
        return (AcaoDoSistema) UtilFabricaDeAcoesAcessosModel.getNovaAcao(this);
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
