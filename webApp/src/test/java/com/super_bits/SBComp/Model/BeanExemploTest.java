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
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
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
            Field testeCampo2 = BeanExemplo.class.getDeclaredField("nome");

            Field[] campos = BeanExemplo.class.getDeclaredFields();
            for (Field campo : campos) {
                System.out.println(campo.getName());
            }

            Field testeCampo = BeanExemplo.class.getDeclaredField("beanFilho");

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
            ItfCampoInstanciado campoComsequencia;
            campoComsequencia = exemplo.getCampoByNomeOuAnotacao("beanFilho.nome");

            System.out.println(campoComsequencia.getNome());
            System.out.println(campoComsequencia.getNome());
            System.out.println(campoComsequencia.getValor());

            ItfCampoInstanciado campoLista = exemplo.getCampoByNomeOuAnotacao("listasExemplo[0].beanFilho.nome");

            System.out.println(campoLista.getNome());
            System.out.println(campoLista.getValor());

            ItfCampoInstanciado campoListae = exemplo.getCampoByNomeOuAnotacao("listasExemplo[0].beanFilho.nome");
            ItfCampoInstanciado campteste = exemplo.getCampoByNomeOuAnotacao("listasExemplo[0].beanFilho");
            BeanExemplo teste = (BeanExemplo) campteste.getValor();

            List<BeanExemplo> listaloca = new ArrayList<>();
            BeanExemplo loco = new BeanExemplo();
            loco.setNome("Olha o teste loco aé doidin!");
            listaloca.add(loco);
            loco.getListasExemplo().get(0).setBeanFilho(new BeanExemplo());
            loco.getListasExemplo().get(0).getBeanFilho().setListasExemplo(listaloca);
            ItfCampoInstanciado campoLoco = loco.getCampoByNomeOuAnotacao("listasExemplo[0].beanFilho.listasExemplo[0].nome");
            System.out.println(campoLoco.getValor());
        } catch (Throwable t) {
            lancarErroJUnit(t);
        }
    }

    @Override
    protected void configAmbienteDesevolvimento() {
        SBCore.configurar(FabConfiguracoesDeAmbienteWebExemplo.DESENVOLVIMENTO.getConfiguracao());
    }

}
