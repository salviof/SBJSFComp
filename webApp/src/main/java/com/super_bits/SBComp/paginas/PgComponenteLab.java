/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.SBComp.paginas;

import com.super_bits.Controller.Interfaces.acoes.ItfAcaoControllerEntidade;
import com.super_bits.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import com.super_bits.InomeClienteI.editorCompoente.model.BeanExemplo;
import com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller.FabAcaoTestesBeanExemplo;
import com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller.editorComponente.InfoAcaoTestesBeanExemplo;
import com.super_bits.modulos.SBAcessosModel.fabricas.FabAcaoProjetoSB;
import com.super_bits.modulos.SBAcessosModel.fabricas.InfoAcaoProjetoSB;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.MB_paginaCadastroEntidades;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.anotacoes.InfoPagina;
import com.super_bits.modulosSB.webPaginas.controller.paginasDoSistema.InfoAcoesPaginaDoSistema;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author desenvolvedor
 */
@InfoAcaoTestesBeanExemplo(acao = FabAcaoTestesBeanExemplo.beanExempplo_MB_gerenciar)
@Named
@ViewScoped
@InfoPagina(nomeCurto = "LC", tags = "Laboratorio de Componentes")
public class PgComponenteLab extends MB_paginaCadastroEntidades<BeanExemplo> {

    public PgComponenteLab() {
        super(
                new AcaoDoSistema[]{
                    ((AcaoDoSistema) FabAcaoTestesBeanExemplo.beanExemplo_FRM_VISUALIZAR_Test.getAcaoDoSistema()),
                    ((AcaoDoSistema) FabAcaoTestesBeanExemplo.beanExemplo_FRM_EDITAR_Test.getAcaoDoSistema())
                },
                FabAcaoTestesBeanExemplo.beanExemplo_FRM_NOVO_Teste.getAcaoEntidadeFormulario(),
                FabAcaoTestesBeanExemplo.beanExemplo_FRM_LISTAR_Teste.getAcaoEntidadeFormulario(),
                FabAcaoTestesBeanExemplo.beanExemplo_CTR_SALVAR_Test.getAcaoEntidadeController(),
                false, true, true, true, false
        );
    }

    @Override
    public void executarAcao(BeanExemplo pBean) {
        super.executarAcao(pBean);
    }

    @Override
    public void listarDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
