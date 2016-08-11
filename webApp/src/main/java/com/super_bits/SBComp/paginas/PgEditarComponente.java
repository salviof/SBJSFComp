/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.SBComp.paginas;

import com.super_bits.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.Controller.Interfaces.acoes.ItfAcaoSecundaria;
import com.super_bits.InomeClienteI.editorCompoente.model.BeanExemplo;
import com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller.FabAcaoEditorDeComponentes;
import com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller.InfoAcaoEditorComponente;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulosSB.SBCore.InfoCampos.campo.CaminhoCampoReflexao;
import com.super_bits.modulosSB.SBCore.fabrica.UtilSBCoreFabrica;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.MB_paginaCadastroEntidades;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.anotacoes.InfoPagina;
import com.super_bits.modulosSB.webPaginas.controller.sessao.SessaoAtualSBWP;
import com.super_bits.view.fabricasCompVisual.componentes.FabCompVisualInputs;
import com.super_bits.view.fabricasCompVisual.componentes.FabCompVisualMenu;
import com.super_bits.view.fabricasCompVisual.componentes.FabCompVisualSeletorItem;
import com.super_bits.view.fabricasCompVisual.componentes.FabCompVisualSeletorItens;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
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
    @Inject
    private SessaoAtualSBWP sessaoAtual;
    private CaminhoCampoReflexao campoSelecionado;
    private final List<CaminhoCampoReflexao> camposDisponiveis;
    private final BeanExemplo beanExemplo = new BeanExemplo();
    private final List<ItfAcaoSecundaria> acoesDisponiveis;

    public PgEditarComponente() {
        super(new AcaoDoSistema[]{
            FabAcaoEditorDeComponentes.COMPONENTE_FRM_VISUALIZAR.getAcaoDoSistema(),
            FabAcaoEditorDeComponentes.COMPONENTE_FRM_EDITAR.getAcaoDoSistema()
        },
                FabAcaoEditorDeComponentes.COMPONENTE_FRM_NOVO.getAcaoDoSistema().getComoFormularioEntidade(),
                FabAcaoEditorDeComponentes.COMPONENTE_FRM_LISTAR.getAcaoDoSistema().getComoFormularioEntidade(),
                null,
                false, true, true, true, false);

        Field[] campos = BeanExemplo.class.getDeclaredFields();
        camposDisponiveis = new ArrayList<>();

        acoesDisponiveis = FabAcaoEditorDeComponentes.COMPONENTE_MB_GERENCIAR.getAcaoDoSistema().getComoGestaoEntidade().getAcoesVinculadas();

        for (Field cp : campos) {
            camposDisponiveis.add(new CaminhoCampoReflexao(cp.getName(), BeanExemplo.class));
        }

    }

    @PostConstruct
    public void inicioAposConstruir() {

    }

    public List<String> getComponentesExistentes() {
        return componentesExistentes;
    }

    public void setComponentesExistentes(List<String> componentesExistentes) {
        this.componentesExistentes = componentesExistentes;
    }

    @Override
    public void listarDados() {

        componentesExistentes = new ArrayList<>();
        componentesExistentes.addAll((List) UtilSBCoreFabrica.getListaTodosRegistrosDaFabrica(FabCompVisualInputs.class));
        componentesExistentes.addAll((List) UtilSBCoreFabrica.getListaTodosRegistrosDaFabrica(FabCompVisualMenu.class));
        componentesExistentes.addAll((List) UtilSBCoreFabrica.getListaTodosRegistrosDaFabrica(FabCompVisualSeletorItem.class));
        componentesExistentes.addAll((List) UtilSBCoreFabrica.getListaTodosRegistrosDaFabrica(FabCompVisualSeletorItens.class));

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

    public List<ItfAcaoSecundaria> getAcoesDisponiveis() {
        return acoesDisponiveis;
    }

    @Override
    public void setAcaoSelecionada(ItfAcaoDoSistema acaoSelecionada) {
        this.acaoSelecionada = acaoSelecionada;
    }

    public SessaoAtualSBWP getSessaoAtual() {
        return sessaoAtual;
    }

}
