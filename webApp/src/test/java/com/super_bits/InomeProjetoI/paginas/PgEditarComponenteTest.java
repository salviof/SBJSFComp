/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.InomeProjetoI.paginas;

import com.super_bits.SBComp.paginas.PgEditarComponente;
import com.super_bits.config.webPaginas.FabConfiguracoesDeAmbienteWebExemplo;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.InfoCampos.campo.CaminhoCampoReflexao;
import com.super_bits.modulosSB.SBCore.testesFW.TesteJunit;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.SBWebPaginas;
import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class PgEditarComponenteTest extends TesteJunit {

    @Test
    public void testListarDados() {

        PgEditarComponente pagina = new PgEditarComponente();
        for (CaminhoCampoReflexao caminho : pagina.getCamposDisponiveis()) {
            System.out.println("Caminho Completo:" + caminho.getCaminhoCompletoString());
            System.out.println("Caminho parcial:" + caminho.getCaminhoSemNomeClasse());
<<<<<<< HEAD
            System.out.println("ID CaminhoParcial:" + caminho.getId());
=======
            System.out.println("String" + caminho.toString());
            System.out.println("ID:" + caminho.getId());
            System.out.println(caminho.getNomeCurto());
>>>>>>> 0616ef8c7560dc5330b3f08045d88087dfe05abc
        }

    }

    @Override
    protected void configAmbienteDesevolvimento() {
        SBCore.configurar(FabConfiguracoesDeAmbienteWebExemplo.DESENVOLVIMENTO.getConfiguracao());
        SBWebPaginas.configurar(FabConfiguracoesDeAmbienteWebExemplo.HOMOLOGACAO.getConfiguracaoWebPaginas());
    }

}
