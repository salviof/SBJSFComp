/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller;

import com.super_bits.Controller.Interfaces.acoes.ItfAcaoController;
import com.super_bits.Controller.Interfaces.acoes.ItfAcaoControllerEntidade;
import com.super_bits.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.Controller.Interfaces.permissoes.ItfAcaoEntidade;
import com.super_bits.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import com.super_bits.Controller.Interfaces.permissoes.ItfAcaoGerenciarEntidade;
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

    @InfoTipoAcaoGestaoEntidade(icone = "fa fa-gears", precisaPermissao = false,
            nomeAcao = "Bean Exemplo Gerenciar",
            xhtmlDaAcao = "/resources/SBComp/SBSystemPages/exemplosAdamantium//demonstracaoLayout.xhtml")
    beanExempplo_MB_gerenciar,
    //
    @InfoTipoAcaoFormulario(campos = {"[separador:DadosUsuario 6 campos]", "nome", "cpf", "email", "telefone", "apelido", "senha",
        "[separador:DadosEmpresa 5 campos]", "cnpj", "inscricaoEstadual", "inscricaoMunicipal", "site", "telefone",
        "[separador:DadosMix 4 campos]", "nome", "telefone", "id", "cpf",
        "[separador:DadosMix 3 campos]", "email", "insricaoMunicipal", "telefone"})
    beanExemplo_FRM_NOVO_Teste,
    beanExemplo_FRM_teste2FormMuiltiplasEntidades;

    @Override
    public ItfAcaoDoSistema getAcaoDoSistema() {
        return UtilFabricaDeAcoesAcessosModel.getNovaAcao(this);
    }

    @Override
    public ItfAcaoEntidade getAcaoDeEntidade() {
        return (ItfAcaoEntidade) getAcaoDoSistema();
    }

    @Override
    public ItfAcaoFormularioEntidade getAcaoEntidadeFormulario() {
        return (ItfAcaoFormularioEntidade) getAcaoDeEntidade();
    }

    @Override
    public ItfAcaoControllerEntidade getAcaoEntidadeController() {
        return (ItfAcaoControllerEntidade) getAcaoDeEntidade();
    }

    @Override
    public ItfAcaoController getAcaoController() {
        return (ItfAcaoController) getAcaoDeEntidade();
    }

    @Override
    public ItfAcaoGerenciarEntidade geAcaoGerenciarEntidade() {
        return (ItfAcaoGerenciarEntidade) getAcaoDeEntidade();
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
        return getAcaoDeEntidade();
    }

}
