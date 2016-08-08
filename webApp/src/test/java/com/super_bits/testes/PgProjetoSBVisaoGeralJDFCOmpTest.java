/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.testes;

import com.super_bits.Controller.Interfaces.ItfModuloAcaoSistema;
import com.super_bits.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.Controller.Interfaces.acoes.ItfAcaoSecundaria;
import com.super_bits.config.webPaginas.FabConfiguracoesDeAmbienteWebExemplo;
import com.super_bits.modulos.SBAcessosModel.fabricas.FabAcaoProjetoSB;
import com.super_bits.modulos.SBAcessosModel.model.acoes.acaoDeEntidade.AcaoGestaoEntidade;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.testesFW.TesteJunit;
import com.super_bits.modulosSB.webPaginas.JSFBeans.declarados.Paginas.PgProjetoSBVisaoGeral;
import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class PgProjetoSBVisaoGeralJDFCOmpTest extends TesteJunit {

    public PgProjetoSBVisaoGeralJDFCOmpTest() {
    }

    @Test
    public void testInit() {
        try {

            String xhtml = FabAcaoProjetoSB.PROJETO_GERENCIAR_MB.getAcaoDoSistema().getComoFormularioEntidade().getXhtml();
            PgProjetoSBVisaoGeral paginaProgeto = new PgProjetoSBVisaoGeral();
            paginaProgeto.getAcaoVinculada();
            MapaAcoesSistema.makeMapaAcoesSistema();
            paginaProgeto.init();

            for (ItfModuloAcaoSistema modulo : paginaProgeto.getModulosDoSistema()) {
                System.out.println("MODULO:::" + modulo.getNome());

                System.out.println("Ações Principais do modulo:" + modulo.getNome());

                for (ItfAcaoDoSistema acao : modulo.getAcoesGestaoMB()) {
                    System.out.println("--" + acao.getNome());

                    for (ItfAcaoSecundaria subAcao : ((AcaoGestaoEntidade) acao).getAcoesVinculadas()) {
                        System.out.println("---" + subAcao.getNome());
                    }

                }
                System.out.println("Ações Vinculadas do modulo " + modulo.getNome());
                for (ItfAcaoDoSistema acao : modulo.getAcoes()) {
                    System.out.println(acao.getNome());

                }
                System.out.println("---------------------------------");

            }

            System.out.println(paginaProgeto.getAcaoVinculada().getXhtml());
        } catch (Throwable t) {
            lancarErroJUnit(t);
        }
    }

    @Override
    protected void configAmbienteDesevolvimento() {
        SBCore.configurar(FabConfiguracoesDeAmbienteWebExemplo.DESENVOLVIMENTO.getConfiguracao(), false);
    }

}
