/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller;

import com.super_bits.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.Controller.anotacoes.InfoTipoAcaoController;
import com.super_bits.Controller.anotacoes.InfoTipoAcaoFormulario;
import com.super_bits.Controller.anotacoes.InfoTipoAcaoGestaoEntidade;
import com.super_bits.InomeClienteI.editorCompoente.model.BeanExemplo;
import com.super_bits.modulos.SBAcessosModel.model.acoes.UtilFabricaDeAcoesAcessosModel;
import com.super_bits.modulosSB.SBCore.fabrica.ItfFabricaAcoes;

/**
 *
 * @author salvioF
 */
@InfoModuloSBComp(modulo = FabModulosJSFComp.DEMONSTRACAO_BASICA)
public enum FabAcaoTestesBeanExemplo implements ItfFabricaAcoes {
    //
    @InfoTipoAcaoGestaoEntidade(icone = "fa fa-gears", precisaPermissao = false,
            nomeAcao = "Bean Exemplo Gerenciar",
            xhtmlDaAcao = "/resources/SBComp/SBSystemPages/exemplosAdamantium/beanexemplo/gerenciar.xhtml")
    beanExempplo_MB_gerenciar,
    //
    @InfoTipoAcaoFormulario(campos = {
        "[separador:DadosUsuario 6 campos]", "nome", "cpf", "email", "telefone", "apelido", "senha",
        "[separador:DadosEmpresa 5 campos]", "cnpj", "inscricaoEstadual", "inscricaoMunicipal", "site", "telefone",
        "[separador:DadosMix 4 campos]", "nome", "telefone", "id", "cpf",
        "[separador:DadosMix 3 campos]", "email", "inscricaoMunicipal", "telefone"},
            xhtmlDaAcao = "/resources/SBComp/SBSystemPages/exemplosAdamantium/beanexemplo/editar.xhtml", icone = "fa fa-edit")
    beanExemplo_FRM_NOVO_Teste,
    //
    @InfoTipoAcaoFormulario(icone = "fa fa-edit")
    beanExemplo_FRM_teste2FormMuiltiplasEntidades,
    //
    @InfoTipoAcaoFormulario(campos = {
        "[separador:DadosLista]", "nome", "cpf", "email", "telefone"}, icone = "fa fa-list",
            xhtmlDaAcao = "/resources/SBComp/SBSystemPages/exemplosAdamantium/beanexemplo/listar.xhtml")
    beanExemplo_FRM_LISTAR_Teste,
    //
    @InfoTipoAcaoController(icone = "fa fa-save", nomeAcao = "Salvar")
    beanExemplo_CTR_SALVAR_Test,
    //
    @InfoTipoAcaoFormulario(campos = {"[separador:DadosLista]", "nome", "cpf", "email", "telefone"}, icone = "fa fa-eye",
            xhtmlDaAcao = "/resources/SBComp/SBSystemPages/exemplosAdamantium/beanexemplo/editar.xhtml")
    beanExemplo_FRM_VISUALIZAR_Test,
    //
    @InfoTipoAcaoFormulario(campos = {
        "[separador:Dados1]", "nome", "cpf", "email", "telefone", "url", "dinheiro",
        "[separador:Dados2]", "porcentagem", "email", "telefone", "dinheiro",
        "[separador:Dados3]", "porcentagem", "email", "telefone", "dinheiro", "nome", "cpf", "email", "telefone", "url", "dinheiro", "html"},
            icone = "fa fa-edit", xhtmlDaAcao = "/resources/SBComp/SBSystemPages/exemplosAdamantium/beanexemplo/editar.xhtml")
    beanExemplo_FRM_EDITAR_Test,
    //
    @InfoTipoAcaoFormulario(xhtmlDaAcao = "/site/componentes/autoCompletador.xhtml", icone = "fa fa-list")
    beanExemplo_FRM_AUTOCOMPLETE;

    @Override
    public ItfAcaoDoSistema getAcaoDoSistema() {
        return UtilFabricaDeAcoesAcessosModel.getNovaAcao(this);
    }

    @Override
    public Class getEntidadeDominio() {
        return BeanExemplo.class;
    }

    @Override
    public String getNomeModulo() {
        return UtilFabricaDeAcoesAcessosModel.getModuloByFabrica(this).getNome();
    }

    @Override
    public Object getRegistro() {
        return getAcaoDoSistema().getComoGestaoEntidade();
    }

}
