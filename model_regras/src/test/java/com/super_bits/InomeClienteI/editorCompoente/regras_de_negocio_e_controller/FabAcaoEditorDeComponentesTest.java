/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller;

import com.super_bits.Controller.UtilFabricaDeAcoesBasico;
import com.super_bits.configSBFW.FabConfiguracoesDeAmbienteModelEditorComponente;
import com.super_bits.modulos.SBAcessosModel.model.acoes.UtilFabricaDeAcoesAcessosModel;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.testesFW.TesteAcaoDoSistema;
import org.junit.Test;
import static org.junit.Assert.*;

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
        SBCore.configurar(FabConfiguracoesDeAmbienteModelEditorComponente.DESENVOLVIMENTO.getConfiguracao(), true);
    }

}
