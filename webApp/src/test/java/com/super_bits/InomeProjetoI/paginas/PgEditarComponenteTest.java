/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.InomeProjetoI.paginas;

import com.super_bits.config.webPaginas.FabConfiguracoesDeAmbienteWebExemplo;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.InfoCampos.campo.CaminhoCampoReflexao;
import com.super_bits.modulosSB.SBCore.testesFW.TesteJunit;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.SBWebPaginas;
import org.junit.Test;
import static org.junit.Assert.*;

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
        }

    }

    @Override
    protected void configAmbienteDesevolvimento() {
        SBCore.configurar(FabConfiguracoesDeAmbienteWebExemplo.DESENVOLVIMENTO.getConfiguracao());
        SBWebPaginas.configurar(FabConfiguracoesDeAmbienteWebExemplo.HOMOLOGACAO.getConfiguracaoWebPaginas());
    }

}
