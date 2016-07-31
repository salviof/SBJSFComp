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
import com.super_bits.modulosSB.SBCore.ConfigGeral.ItfConfiguradorCore;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.Mensagens.CentramMensagemProgramadorMsgStop;
import com.super_bits.modulosSB.SBCore.TratamentoDeErros.ErroSBCoreDeveloperSopMessagem;
import com.super_bits.modulosSB.SBCore.logeventos.CentralLogEventosArqTextoGenerica;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.ItfConfigWebPagina;
import com.super_bits.modulosSB.webPaginas.controller.paginasDoSistema.FabAcoesPaginasDoSistema;
import com.super_bits.modulosSB.webPaginas.util.CentralDeMensagensJSFAPP;

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
public enum FabConfiguracoesDeAmbienteWebExemplo {

    DESENVOLVIMENTO, HOMOLOGACAO, PRODUCAO;

    public ItfConfiguradorCore getConfiguracao() {
        ConfigCoreCustomizavel cfg = new ConfigCoreCustomizavel();
        cfg.setCliente("Faculdade_Java");
        cfg.setGrupoProjeto("SBJSFComp");
        cfg.setNomeProjeto("webApp");
        cfg.setDiretorioBase("");
        cfg.setCentralDeEventos(CentralLogEventosArqTextoGenerica.class);
        cfg.setCentralMEnsagens(CentralDeMensagensJSFAPP.class);
        cfg.setClasseErro(ErroSBCoreDeveloperSopMessagem.class);
        cfg.setControleDeSessao(ControleDeSessaoPadrao.class);
        cfg.setFabricaDeAcoes(new Class[]{FabAcaoSeguranca.class,
            FabAcaoAcessoRestritoExemplo.class,
            FabAcaoTestesBeanExemplo.class,
            FabAcaoEditorDeComponentes.class,
            FabAcaoDemonstracaoSB.class,
            FabAcaoProjetoSB.class,
            FabAcaoTestesBotaoDeAcao.class,
            FabAcoesPaginasDoSistema.class,
            FabAcaoDemonstracaoSB.class
        });
        cfg.setClasseConfigPermissao(ConfigAcessos.class);

        switch (this) {
            case DESENVOLVIMENTO:
                cfg.setEstadoAPP(SBCore.ESTADO_APP.DESENVOLVIMENTO);
                cfg.setCentralMEnsagens(CentramMensagemProgramadorMsgStop.class);
                cfg.setClasseErro(ErroSBCoreDeveloperSopMessagem.class);
                cfg.setCentralMEnsagens(CentramMensagemProgramadorMsgStop.class);
                break;
            case HOMOLOGACAO:
                cfg.setEstadoAPP(SBCore.ESTADO_APP.HOMOLOGACAO);
                break;
            case PRODUCAO:
                cfg.setEstadoAPP(SBCore.ESTADO_APP.PRODUCAO);
                break;
            default:
                throw new AssertionError(this.name());

        }
        return cfg;

    }

    public ItfConfigSBPersistencia getConfiguracaoPersistencia() {
        return new ConfigPersistenciaInomeProjetoI();
    }

    public ItfConfigWebPagina getConfiguracaoWebPaginas() {
        return new ConfigWPInomeProjetoI();
    }

}
