/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.InomeClienteI;

import com.super_bits.InomeClienteI.editorCompoente.model.BeanExemplo;
import com.super_bits.configSBFW.ConfiguradorModelEditorComponente;
import com.super_bits.modulos.SBAcessosModel.model.UsuarioSB;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.UtilSBCoreReflexaoCampos;
import com.super_bits.modulosSB.SBCore.testesFW.TesteJunit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public class TestesSBCompSemPersistencia extends TesteJunit {

    @Override
    protected void configAmbienteDesevolvimento() {
        List<Class> classesDoSistema = new ArrayList();
        classesDoSistema.add(BeanExemplo.class);
        classesDoSistema.add(UsuarioSB.class);
        UtilSBCoreReflexaoCampos.configurarTodasAsClasses(classesDoSistema);
        SBCore.configurar(ConfiguradorModelEditorComponente.DESENVOLVIMENTO.getConfiguracao(), SBCore.getEstadoAPP());
    }

}
