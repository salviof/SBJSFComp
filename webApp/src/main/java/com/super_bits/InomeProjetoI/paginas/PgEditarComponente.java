/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.InomeProjetoI.paginas;

import com.super_bits.InomeClienteI.editorCompoente.ComponenteVisual;
import com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller.FabAcaoEditorDeComponentes;
import com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller.InfoAcaoEditorComponente;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.MB_paginaCadastroEntidades;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.anotacoes.InfoPagina;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;

/**
 *
 * @author desenvolvedor
 */
@InfoAcaoEditorComponente(acao = FabAcaoEditorDeComponentes.COMPONENTE_MB_GERENCIAR)
@InfoPagina(nomeCurto = "EC", tags = {"Editor de Componentes"})
@Named
public class PgEditarComponente extends MB_paginaCadastroEntidades<Object> {

    private List<String> componentesExistentes;
    private String componenteSelecionado;

    public PgEditarComponente() {
        super(new AcaoDoSistema[]{
            FabAcaoEditorDeComponentes.COMPONENTE_FRM_VISUALIZAR.getAcaoDoSistema(),
            FabAcaoEditorDeComponentes.COMPONENTE_FRM_EDITAR.getAcaoDoSistema()
        },
                FabAcaoEditorDeComponentes.COMPONENTE_FRM_NOVO.getAcaoEntidadeFormulario(),
                FabAcaoEditorDeComponentes.COMPONENTE_FRM_LISTAR.getAcaoEntidadeFormulario(),
                null,
                false, true, true, true, false);
    }

    public List<String> getComponentesExistentes() {
        return componentesExistentes;
    }

    public void setComponentesExistentes(List<String> componentesExistentes) {
        this.componentesExistentes = componentesExistentes;
    }

    public String getComponenteSelecionado() {
        return componenteSelecionado;
    }

    public void setComponenteSelecionado(String componenteSelecionado) {
        this.componenteSelecionado = componenteSelecionado;
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

}
