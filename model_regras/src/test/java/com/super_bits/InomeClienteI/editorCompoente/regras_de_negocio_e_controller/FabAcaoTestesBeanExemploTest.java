/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller;

import com.super_bits.Controller.UtilFabricaDeAcoesBasico;
import com.super_bits.InomeClienteI.TestesSBCompSemPersistencia;
import com.super_bits.modulos.SBAcessosModel.model.acoes.UtilFabricaDeAcoesAcessosModel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author desenvolvedor
 */
public class FabAcaoTestesBeanExemploTest extends TestesSBCompSemPersistencia {

    public FabAcaoTestesBeanExemploTest() {
    }

    @Test
    public void testValues() {

        for (FabAcaoTestesBeanExemplo acao : FabAcaoTestesBeanExemplo.values()) {
            UtilFabricaDeAcoesBasico.validaIntegridadeAcaoDoSistema(acao.getAcaoDoSistema());
        }
    }

}
