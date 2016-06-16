/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.SBComp.paginas;

import com.super_bits.Controller.Interfaces.acoes.ItfAcaoControllerEntidade;
import com.super_bits.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import com.super_bits.InomeClienteI.editorCompoente.model.BeanExemplo;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.MB_paginaCadastroEntidades;

/**
 *
 * @author desenvolvedor
 */
public class PgComponenteLab extends MB_paginaCadastroEntidades<BeanExemplo> {

    public PgComponenteLab(AcaoDoSistema[] pAcoesRegistro, ItfAcaoFormularioEntidade pAcaoNovoRegistro, ItfAcaoFormularioEntidade pAcaoListar, ItfAcaoControllerEntidade pAcaoSalvar, boolean pTempesquisa, boolean pTemVisualizar, boolean pTemEditar, boolean pTemNovo, boolean pTemAlterarStatus) {
        super(pAcoesRegistro, pAcaoNovoRegistro, pAcaoListar, pAcaoSalvar, pTempesquisa, pTemVisualizar, pTemEditar, pTemNovo, pTemAlterarStatus);
    }

    @Override
    public void listarDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
