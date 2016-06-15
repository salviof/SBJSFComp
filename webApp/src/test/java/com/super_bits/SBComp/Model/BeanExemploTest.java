/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.SBComp.Model;

import com.super_bits.modulosSB.SBCore.InfoCampos.campo.FabCampos;
import com.super_bits.modulosSB.SBCore.InfoCampos.campo.ItfCampoInstanciado;
import com.super_bits.InomeClienteI.editorCompoente.model.BeanExemplo;
import com.super_bits.config.webPaginas.TesteBasico;
import com.super_bits.modulosSB.SBCore.testesFW.TesteJunit;

import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class BeanExemploTest extends TesteBasico {

    public BeanExemploTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testSomeMethod() {

        BeanExemplo exemplo = new BeanExemplo();

        ItfCampoInstanciado teste = exemplo.getCampoInstanciadoByAnotacao(FabCampos.CNPJ);

        System.out.println("Mascara=" + teste.getMascara());
    }

}
