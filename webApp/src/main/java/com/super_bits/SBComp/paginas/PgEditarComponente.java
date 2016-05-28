/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.SBComp.paginas;

import com.super_bits.InomeClienteI.editorCompoente.ComponenteVisual;
import com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller.FabAcaoEditorDeComponentes;
import com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller.InfoAcaoEditorComponente;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulosSB.SBCore.InfoCampos.campo.CaminhoCampoReflexao;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.bean.BeanExemplo;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.MB_paginaCadastroEntidades;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.anotacoes.InfoPagina;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;

import javax.inject.Named;

/**
 *
 *
 *
 * @author desenvolvedor
 */
@InfoAcaoEditorComponente(acao = FabAcaoEditorDeComponentes.COMPONENTE_MB_GERENCIAR)
@InfoPagina(nomeCurto = "ECOMP", tags = {"Editor de Componentes"})
@Named
@SessionScoped
public class PgEditarComponente extends MB_paginaCadastroEntidades<Object> {

    private List<String> componentesExistentes;

    private CaminhoCampoReflexao campoSelecionado;
    private List<CaminhoCampoReflexao> camposDisponiveis;
    private final BeanExemplo beanExemplo = new BeanExemplo();

    public PgEditarComponente() {
        super(new AcaoDoSistema[]{
            FabAcaoEditorDeComponentes.COMPONENTE_FRM_VISUALIZAR.getAcaoDoSistema(),
            FabAcaoEditorDeComponentes.COMPONENTE_FRM_EDITAR.getAcaoDoSistema()
        },
                FabAcaoEditorDeComponentes.COMPONENTE_FRM_NOVO.getAcaoEntidadeFormulario(),
                FabAcaoEditorDeComponentes.COMPONENTE_FRM_LISTAR.getAcaoEntidadeFormulario(),
                null,
                false, true, true, true, false);
        camposDisponiveis = beanExemplo.getCaminhoCampoNivel1();
    }

    public List<String> getComponentesExistentes() {
        return componentesExistentes;
    }

    public void setComponentesExistentes(List<String> componentesExistentes) {
        this.componentesExistentes = componentesExistentes;
    }

    @Override
    public void listarDados() {

        ComponenteVisual comp1 = new ComponenteVisual();
        ComponenteVisual comp2 = new ComponenteVisual();
        ComponenteVisual comp3 = new ComponenteVisual();
        ComponenteVisual comp4 = new ComponenteVisual();
        componentesExistentes = new ArrayList<>();
        comp1.setNome("Componente Endereço");
        comp1.setXhtml("Componente Endereço");

    }

    public CaminhoCampoReflexao getCampoSelecionado() {
        return campoSelecionado;
    }

    public void setCampoSelecionado(CaminhoCampoReflexao campoSelecionado) {
        this.campoSelecionado = campoSelecionado;
    }

    public List<CaminhoCampoReflexao> getCamposDisponiveis() {
        return camposDisponiveis;
    }

    public BeanExemplo getBeanExemplo() {
        return beanExemplo;
    }

}