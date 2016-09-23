/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller;

import com.super_bits.configSBFW.ConfiguradorModelEditorComponente;
import com.super_bits.modulos.SBAcessosModel.controller.FabAcaoSeguranca;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.CaminhoCampoReflexao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.GrupoCampos;

import com.super_bits.modulosSB.SBCore.testesFW.TesteAcaoDoSistema;
import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class FabAcaoEditorDeComponentesTest extends TesteAcaoDoSistema {

    public FabAcaoEditorDeComponentesTest() {
        super(true);
    }

    @Test
    public void testValues() {
        testesBasicosDeAcoes(FabAcaoEditorDeComponentes.class);
    }

    @Override
    protected void configAmbienteDesevolvimento() {
        SBCore.configurar(ConfiguradorModelEditorComponente.DESENVOLVIMENTO.getConfiguracao(), SBCore.ESTADO_APP.DESENVOLVIMENTO);

        for (GrupoCampos grp : FabAcaoSeguranca.USUARIO_FRM_EDITAR.getAcaoDoSistema().getComoFormulario().getGruposDeCampos()) {
            System.out.println("GRUPOOOOO " + grp.getNomeGrupo());
            for (CaminhoCampoReflexao campo : grp.getCampos()) {
                System.out.println(campo.getCaminhoCompletoString());
            }
        }
    }

}
