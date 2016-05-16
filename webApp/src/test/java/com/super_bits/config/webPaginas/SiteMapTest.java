/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.testesFW.TesteJunit;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.SBWebPaginas;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.B_Pagina;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.ItfB_Pagina;
import com.super_bits.modulosSB.webPaginas.JSFBeans.util.testes.UtilTestePagina;
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
            List<ItfB_Pagina> paginas = new ArrayList();
            paginas.addAll(mapa.getPaginasOfflineEmLista());
            Map<String, ItfB_Pagina> paginasCadastradas = new HashMap<>();

            for (ItfB_Pagina pagina : paginas) {
                System.out.println("XHTML:::::" + pagina.getRecursoXHTML());
                System.out.println("#### ADICIONANDO--->" + pagina.getNomeCurto() + "<---");
                if (paginasCadastradas.get(pagina.getNomeCurto()) != null) {
                    throw new UnsupportedOperationException("A tag de atalho " + pagina.getNomeCurto() + " já foi usada em " + pagina.getClass().getSimpleName());
                }

                paginasCadastradas.put(pagina.getNomeCurto(), pagina);
                System.out.println(pagina.getNomeCurto());
                System.out.println("Validando" + pagina.getClass().getSimpleName());
                UtilTestePagina.testaConfigPaginaBasico(pagina);

            }
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
