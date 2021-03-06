/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.SBComp.paginas;

import com.super_bits.InomeClienteI.editorCompoente.model.BeanExemplo;
import com.super_bits.SBComp.controller.FabAcaoTestesBotaoDeAcao;
import com.super_bits.SBComp.controller.InfoAcaoTestesDeAcao;
import com.super_bits.modulos.SBAcessosModel.controller.FabAcaoSeguranca;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.FabMensagens;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.UtilSBCoreFabrica;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComponenteVisualSB;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualBotaoAcao;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.MB_paginaCadastroEntidades;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.anotacoes.InfoPagina;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author salvioF
 */
@Named
@ViewScoped
@InfoAcaoTestesDeAcao(acao = FabAcaoTestesBotaoDeAcao.ACAO_MB_GERENCIAR)
@InfoPagina(nomeCurto = "BotaoAcao", tags = {"Botão de Ação"})
public class PgBotaoDeAcaoLab extends MB_paginaCadastroEntidades<AcaoDoSistema> {

    private List<AcaoDoSistema> acoesDeExibicao;
    private BeanExemplo beanExemplo;
    private final List<AcaoDoSistema> acoesParaBotoes = UtilSBCoreFabrica.getListaTodosRegistrosDaFabrica(FabAcaoSeguranca.class);
    private AcaoDoSistema acaoParaBotaoSelecionada;
    private ItfAcaoDoSistema acaoInstrucao;
    private ComponenteVisualSB tipoDeVisualizacao;
    private List<ComponenteVisualSB> tiposDeVisualizacao;
    private AcaoDoSistema acaoArmazenadaTeste;

    @PostConstruct
    public void init() {
        tiposDeVisualizacao = UtilSBCoreFabrica.getListaTodosRegistrosDaFabrica(FabCompVisualBotaoAcao.class);
        tipoDeVisualizacao = tiposDeVisualizacao.get(0);

        acoesDeExibicao = UtilSBCoreFabrica.getListaTodosRegistrosDaFabrica(FabAcaoTestesBotaoDeAcao.class);
        acaoInstrucao = FabAcaoTestesBotaoDeAcao.ACAO_FRM_INSTRUCOES.getAcaoDoSistema();
        xhtmlAcaoAtual = acaoInstrucao.getComoFormulario().getXhtml();
        acaoSelecionada = acaoInstrucao;

    }

    public PgBotaoDeAcaoLab() {
        super((List) UtilSBCoreFabrica.getListaTodosRegistrosDaFabrica(FabAcaoSeguranca.class),
                FabAcaoTestesBotaoDeAcao.ACAO_FRM_INSTRUCOES.getAcaoDoSistema(),
                FabAcaoTestesBotaoDeAcao.ACAO_FRM_INSTRUCOES.getAcaoDoSistema(),
                FabAcaoSeguranca.USUARIO_CTR_SALVAR_MERGE.getAcaoDoSistema(),
                false);

    }

    @Override
    public void executarAcaoSelecionada() {
        super.executarAcaoSelecionada();
        try {
            /**
             * FabAcaoTestesBotaoDeAcao acaoEscolhida =
             * (FabAcaoTestesBotaoDeAcao)
             * acaoSelecionada.getEnumAcaoDoSistema(); FabTipoAcaoBase
             * acaoBaseEsperadaDaAcaoEscolhida = FabTipoAcaoBase.FORMULARIO;
             * switch (acaoEscolhida) { case ACAO_MB_GERENCIAR: case
             * ACAO_FRM_TESTE_FAKE:
             *
             * acaoBaseEsperadaDaAcaoEscolhida = FabTipoAcaoBase.GESTAO; break;
             *
             * case ACAO_FRM_TESTE_BOTAO_ACAO: case
             * ACAO_FRM_TESTE_CONTROLLER_COM_ENTIDADE:
             *
             * acaoBaseEsperadaDaAcaoEscolhida = FabTipoAcaoBase.CONTROLLER;
             * break; case ACAO_FRM_TESTE_FORMULARIO:
             *
             * acaoBaseEsperadaDaAcaoEscolhida = FabTipoAcaoBase.FORMULARIO;
             *
             * break;
             *
             * case ACAO_FRM_TESTE_INSTRUCAO: return; case ACAO_FRM_INSTRUCOES:
             * return; case ACAO_FRM_TESTE_MENU: return; default: throw new
             * AssertionError(acaoEscolhida.name());
             *
             * }
             *
             */

        } catch (Throwable t) {
            SBCore.enviarAvisoAoUsuario("A ação " + acaoSelecionada.getNomeUnico() + " foi executada, porém a execução não está preparada para este tipo de ação");
            SBCore.enviarMensagemUsuario("A prova do despreparo é o Erro:" + t.getMessage(), FabMensagens.ERRO);
        }
        paginaUtil.atualizaTelaPorID(idAreaExbicaoAcaoSelecionada);
    }

    public List<AcaoDoSistema> getAcoesDeExibicao() {
        return acoesDeExibicao;
    }

    public BeanExemplo getBeanExemplo() {
        return beanExemplo;
    }

    public List<AcaoDoSistema> getAcoesParaBotoes() {
        return acoesParaBotoes;
    }

    public AcaoDoSistema getAcaoparaBtController() {
        return acaoParaBotaoSelecionada;
    }

    public List<ComponenteVisualSB> getTiposDeVisualizacao() {
        return tiposDeVisualizacao;
    }

    public ComponenteVisualSB getTipoDeVisualizacao() {
        return tipoDeVisualizacao;
    }

    public void setTipoDeVisualizacao(ComponenteVisualSB tipoDeVisualizacao) {
        this.tipoDeVisualizacao = tipoDeVisualizacao;
    }

    public AcaoDoSistema getAcaoParaBotaoSelecionada() {
        return acaoParaBotaoSelecionada;
    }

    public void setAcaoParaBotaoSelecionada(AcaoDoSistema acaoParaBotaoSelecionada) {
        this.acaoParaBotaoSelecionada = acaoParaBotaoSelecionada;
    }

    public void metodoTeste() {
        SBCore.enviarAvisoAoUsuario("O metodo teste foi executado ;)");

    }

    public AcaoDoSistema getAcaoArmazenadaTeste() {
        return acaoArmazenadaTeste;
    }

    public void setAcaoArmazenadaTeste(AcaoDoSistema acaoArmazenadaTeste) {
        SBCore.enviarAvisoAoUsuario("A ação foi alterada para" + acaoArmazenadaTeste.getNomeAcao());
        this.acaoArmazenadaTeste = acaoArmazenadaTeste;
    }

    @Override
    public void listarDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
