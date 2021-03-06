/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller.FabMenuExemplo;
import com.super_bits.SBComp.paginas.PgBotaoDeAcaoLab;
import com.super_bits.SBComp.paginas.PgComponenteLab;
import com.super_bits.SBComp.paginas.PgDemoComponente;
import com.super_bits.SBComp.paginas.PgEditarComponente;
import com.super_bits.SBComp.paginas.PgHomeSBComp;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.ItfFabricaMenu;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.ItfB_Pagina;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.MB_SiteMapa;
import com.super_bits.modulosSB.webPaginas.JSFBeans.declarados.Paginas.PgProjetoSBVisaoGeral;
import com.super_bits.modulosSB.webPaginas.controller.paginasDoSistema.PgTestesCampo;

import java.util.Map;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Inject;

/**
 *
 *
 * Todas as paginas do seu sistema precisam ser Injetadas no SiteMAP
 *
 * O site Map, ajuda o bean paginaAtual a identificar qual pagina está sendo
 * referenciada, e serve de parametro para montar o site Map da pagina
 *
 *
 * @author Salvio
 */
@ApplicationScoped
public class SiteMap extends MB_SiteMapa {

    /// Injete aqui todas as Paginas que extendem o objeto MB_pagina
    @Inject
    private PgDemoComponente demoComponente;
    @Inject
    private PgEditarComponente editarCompoente;
    @Inject
    private PgHomeSBComp paginaInicial;
    @Inject
    private PgProjetoSBVisaoGeral visaoGeral;
    @Inject
    private PgComponenteLab laboratorioComponentes;
    @Inject
    private PgBotaoDeAcaoLab botaoDeAcaoLab;
    @Inject
    private PgTestesCampo testesCampo;

    public SiteMap() {
        super();
    }

    // Paginas do Sistema.
    @Override
    protected Map<String, ItfB_Pagina> buildPaginas() {
        Map<String, ItfB_Pagina> paginasSimples = buildSystemPages();
        return paginasSimples;
    }

    @Override
    public Class<? extends ItfFabricaMenu> getFabricaMenu() {
        return FabMenuExemplo.class;
    }

}
