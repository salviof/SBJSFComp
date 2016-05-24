/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.SBComp.paginas;

import com.super_bits.config.webPaginas.TesteBasico;
import com.super_bits.configSBFW.FabConfiguracoesDeAmbienteModelEditorComponente;
import com.super_bits.modulos.SBAcessosModel.fabricas.FabAcaoProjetoSB;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.testesFW.TesteJunit;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author desenvolvedor
 */
public class PgProjetoSBVisaoGeralTest extends TesteJunit {

    public PgProjetoSBVisaoGeralTest() {
    }

    @Test
    public void testInit() {
        try {

            String xhtml = FabAcaoProjetoSB.PROJETO_GERENCIAR_MB.getAcaoEntidadeFormulario().getXhtml();
            PgProjetoSBVisaoGeral teste = new PgProjetoSBVisaoGeral();
            teste.getAcaoVinculada();

            System.out.println(teste.getAcaoVinculada().getXhtml());
        } catch (Throwable t) {
            lancarErroJUnit(t);
        }
    }

    @Override
    protected void configAmbienteDesevolvimento() {
        SBCore.configurar(FabConfiguracoesDeAmbienteModelEditorComponente.DESENVOLVIMENTO.getConfiguracao(), true);
    }

}
