/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.InomeClienteI;

import com.super_bits.configSBFW.FabConfiguracoesDeAmbienteModelEditorComponente;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.testesFW.TesteJunit;

/**
 *
 * @author desenvolvedor
 */
public class TestesSBCompSemPersistencia extends TesteJunit {

    @Override
    protected void configAmbienteDesevolvimento() {
        SBCore.configurar(FabConfiguracoesDeAmbienteModelEditorComponente.DESENVOLVIMENTO.getConfiguracao(), false);
    }

}
