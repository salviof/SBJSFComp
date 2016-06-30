/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.SBComp.paginas;

import com.super_bits.modulosSB.SBCore.InfoCampos.campo.CaminhoCampoReflexao;
import com.super_bits.modulosSB.SBCore.InfoCampos.campo.GrupoCampos;
import com.super_bits.testes.TestesSBCompSemPersistencia;
import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class PgDemoComponenteTest extends TestesSBCompSemPersistencia {

    @Test
    public void testesPagina() {
        PgDemoComponente democomp = new PgDemoComponente();
        democomp.inicio();
        for (String arquivo : democomp.getListaFormularios()) {
            System.out.println(arquivo);
        }
        for (GrupoCampos grp : democomp.getAcaoFormularioTeste().getGruposDeCampos()) {
            for (CaminhoCampoReflexao caminhoCampo : grp.getCampos()) {
                System.out.println(caminhoCampo.getCaminhoCompletoString());

                democomp.getRegistroFormularioTeste().getCampoByNomeOuAnotacao(caminhoCampo.getCaminhoCompletoString());
            }
        }

    }

}
