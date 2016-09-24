/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.testes;

import com.super_bits.config.webPaginas.FabConfiguracoesDeAmbienteWebExemplo;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.webPaginas.TratamentoDeErros.RelatorioTesteWebPaginas;
import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class TesteConformidadeGeral extends RelatorioTesteWebPaginas {

    @Override
    protected void configAmbienteDesevolvimento() {
        SBCore.configurar(new FabConfiguracoesDeAmbienteWebExemplo(true), SBCore.ESTADO_APP.DESENVOLVIMENTO);

    }

    @Test
    public void testar() {
        exibirRelatorioAcoes();
    }

}
