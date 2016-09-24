/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.InomeClienteI.editorCompoente.model.config.ConfigPersistenciaInomeProjetoI;
import com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller.FabAcaoEditorDeComponentes;
import com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller.FabAcaoTestesBeanExemplo;
import com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller.MODULOS.demonstracao_acesso_restrito.FabAcaoAcessoRestritoExemplo;
import com.super_bits.SBComp.controller.FabAcaoTestesBotaoDeAcao;
import com.super_bits.configSBFW.acessos.ConfigAcessos;
import com.super_bits.modulos.SBAcessosModel.controller.FabAcaoSeguranca;
import com.super_bits.modulos.SBAcessosModel.fabricas.FabAcaoProjetoSB;
import com.super_bits.modulos.SBAcessosModel.fabricas.acoesDemonstracao.FabAcaoDemonstracaoSB;
import com.super_bits.modulosSB.Persistencia.ConfigGeral.ItfConfigSBPersistencia;
import com.super_bits.modulosSB.SBCore.ConfigGeral.ConfigCoreCustomizavel;
import com.super_bits.modulosSB.SBCore.ConfigGeral.ControleDeSessaoPadrao;
import com.super_bits.modulosSB.SBCore.ConfigGeral.ItfConfiguracaoCoreCustomizavel;
import com.super_bits.modulosSB.SBCore.ConfigGeral.ItfConfiguradorCore;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.CentramMensagemProgramadorMsgStop;
import com.super_bits.modulosSB.SBCore.modulos.TratamentoDeErros.ErroSBCoreDeveloperSopMessagem;
import com.super_bits.modulosSB.SBCore.modulos.logeventos.CentralLogEventosArqTextoGenerica;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.ConfiguradorCoreDeProjetoWebWarAbstrato;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.ItfConfigWebPagina;
import com.super_bits.modulosSB.webPaginas.controller.paginasDoSistema.FabAcaoPaginasDoSistema;
import com.super_bits.modulosSB.webPaginas.util.CentralDeMensagensJSFAPP;
import javax.servlet.ServletContext;

/**
 *
 * É Importante criar ambientes de execução diferentes de acordo com o estágio
 * de produção
 *
 * O sistema perimite alterar:  <br>
 * A classe responsável por envio de mensagens ao desenvolvedor, ao usuário, e
 * logs de sistema <br>
 * A Classe responsável por tratamento de erros A Classe responsável pela
 * configuração de acessos do sistema  <br>
 * A classe responsável por armazenamento de logs <br>
 *
 *
 *
 * @author desenvolvedor
 */
public class FabConfiguracoesDeAmbienteWebExemplo extends ConfiguradorCoreDeProjetoWebWarAbstrato {

    public FabConfiguracoesDeAmbienteWebExemplo(boolean modoDesenvolvimento) {
        super(modoDesenvolvimento);
    }

    public FabConfiguracoesDeAmbienteWebExemplo(ServletContext contexto) {
        super(contexto);
    }

    public ItfConfigSBPersistencia getConfiguracaoPersistencia() {
        return new ConfigPersistenciaInomeProjetoI();
    }

    public ItfConfigWebPagina getConfiguracaoWebPaginas() {
        return new ConfigWPInomeProjetoI();
    }

    @Override
    public void defineFabricasDeACao(ItfConfiguracaoCoreCustomizavel pConfig) {
        pConfig.setFabricaDeAcoes(new Class[]{FabAcaoSeguranca.class,
            FabAcaoAcessoRestritoExemplo.class,
            FabAcaoTestesBeanExemplo.class,
            FabAcaoEditorDeComponentes.class,
            FabAcaoDemonstracaoSB.class,
            FabAcaoProjetoSB.class,
            FabAcaoTestesBotaoDeAcao.class,
            FabAcaoPaginasDoSistema.class,
            FabAcaoDemonstracaoSB.class
        });
        pConfig.setClasseConfigPermissao(ConfigAcessos.class);
    }

}
