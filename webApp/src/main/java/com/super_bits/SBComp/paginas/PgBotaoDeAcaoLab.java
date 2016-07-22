/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.SBComp.paginas;

import com.super_bits.InomeClienteI.editorCompoente.model.BeanExemplo;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulosSB.SBCore.fabrica.UtilSBCoreFabrica;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.MB_PaginaConversation;
import com.super_bits.modulosSB.webPaginas.JSFBeans.tipos.FabTipoVisualBotaoAcao;
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

public class PgBotaoDeAcaoLab extends MB_PaginaConversation {

    private List<AcaoDoSistema> acoesDeExibicao;
    private BeanExemplo beanExemplo;
    private List<AcaoDoSistema> acoesParaBotoes;
    private AcaoDoSistema acaoparaBtController;
    private AcaoDoSistema acaoparaBtFormulario;
    private AcaoDoSistema acaoparaBtGestao;

    private String tipoDeVisualizacao;
    private List<String> tiposDeVisualizacao;

    @PostConstruct
    public void init() {
        tipoVisualizacao = UtilSBCoreFabrica.getListaTodosRegistrosDaFabrica(FabTipoVisualBotaoAcao.class);
    }

}
