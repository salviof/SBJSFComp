/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller.FabAcaoEditorDeComponentes;
import com.super_bits.modulos.SBAcessosModel.model.acoes.acaoDeEntidade.AcaoGestaoEntidade;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.testesFW.TesteJunit;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.SBWebPaginas;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.ItfB_Pagina;
import com.super_bits.modulosSB.webPaginas.JSFBeans.util.testes.UtilTestePagina;
import com.super_bits.modulosSB.webPaginas.controller.servletes.WebPaginasServlet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class SiteMapTest extends TesteJunit {

    public SiteMapTest() {
    }

    @Test
    public void testGetFabricaMenu() {

        try {
            SBCore.configurar(FabConfiguracoesDeAmbienteWebExemplo.DESENVOLVIMENTO.getConfiguracao());
            SBWebPaginas.configurar(FabConfiguracoesDeAmbienteWebExemplo.HOMOLOGACAO.getConfiguracaoWebPaginas());
            SiteMap mapa = new SiteMap();

            ItfB_Pagina pagina = mapa.getPaginaNoContexto("/site/home.xhtml");

            System.out.println(pagina);

            WebPaginasServlet testeWPServlet = new WebPaginasServlet();

            testeWPServlet.init();
            //  testeWPServlet.buildMapaRecurso();

            List<ItfB_Pagina> paginas = new ArrayList();
            paginas.addAll(mapa.getPaginasOfflineEmLista());
            Map<String, ItfB_Pagina> paginasCadastradas = new HashMap<>();

            AcaoGestaoEntidade testeXHTML = (AcaoGestaoEntidade) FabAcaoEditorDeComponentes.COMPONENTE_MB_GERENCIAR.getAcaoDoSistema();

            String xhtmlTeste = testeXHTML.getXhtml();

            mapa.getPaginaNoContexto(xhtmlTeste);

            System.out.println(xhtmlTeste);

        } catch (Throwable t) {
            lancarErroJUnit(t);
        }
    }

    @Override
    protected void configAmbienteDesevolvimento() {
        SBCore.configurar(FabConfiguracoesDeAmbienteWebExemplo.DESENVOLVIMENTO.getConfiguracao());
        SBWebPaginas.configurar(FabConfiguracoesDeAmbienteWebExemplo.HOMOLOGACAO.getConfiguracaoWebPaginas());
    }

}
