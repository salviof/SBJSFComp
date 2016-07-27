/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.SBComp.Model;

import com.super_bits.InomeClienteI.editorCompoente.model.BeanExemplo;
import com.super_bits.config.webPaginas.FabConfiguracoesDeAmbienteWebExemplo;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.InfoCampos.campo.FabCampos;
import com.super_bits.modulosSB.SBCore.InfoCampos.campo.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.InfoCampos.registro.Interfaces.basico.ItfBeanSimples;
import com.super_bits.modulosSB.SBCore.testesFW.TesteJunit;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class BeanExemploTest extends TesteJunit {

    public BeanExemploTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testSomeMethod() {
        try {

            BeanExemplo exemplo = new BeanExemplo();

            ItfCampoInstanciado testeCampoCOR = exemplo.getCampoInstanciadoByAnotacao(FabCampos.COR);
            System.out.println(testeCampoCOR.getTipoCampo());

            ItfCampoInstanciado testeCampoCNPj1 = exemplo.getCampoByNomeOuAnotacao("cnpj");

            System.out.println("Mascara=" + testeCampoCNPj1.getMascara());
            ItfCampoInstanciado testeCampoCNPj = exemplo.getCampoInstanciadoByAnotacao(FabCampos.CNPJ);

            System.out.println("Mascara=" + testeCampoCNPj.getMascara());

            ItfCampoInstanciado testeCampoListaComFabrica = exemplo.getCampoByNomeOuAnotacao("beanSelecionadoDaListaFabrica");

            for (ItfBeanSimples teste : testeCampoListaComFabrica.getListaDeOpcoes()) {
                System.out.println(teste.getNome());
            }
        } catch (Throwable t) {
            lancarErroJUnit(t);
        }
    }

    @Override
    protected void configAmbienteDesevolvimento() {
        SBCore.configurar(FabConfiguracoesDeAmbienteWebExemplo.DESENVOLVIMENTO.getConfiguracao());
    }

}
