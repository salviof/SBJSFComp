/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.SBComp.paginas;

import com.super_bits.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.InomeClienteI.editorCompoente.model.BeanExemplo;
import com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller.FabAcaoTestesBeanExemplo;
import com.super_bits.InomeClienteI.editorCompoente.regras_de_negocio_e_controller.editorComponente.InfoAcaoTestesBeanExemplo;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.MB_paginaCadastroEntidades;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.anotacoes.InfoPagina;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
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

    private List<String> listaAutoComplete;

    private ItfAcaoDoSistema acaoAutoCompletador;

    private BeanExemplo beanSelecionado;

    String pesquisa;

    @PostConstruct
    public void init() {

        setEntidadeSelecionada(new BeanExemplo());
        BeanExemplo bean1 = new BeanExemplo();
        BeanExemplo bean2 = new BeanExemplo();
        BeanExemplo bean3 = new BeanExemplo();

        getEntidadesListadas().add(bean1);
        getEntidadesListadas().add(bean2);
        getEntidadesListadas().add(bean3);

        acaoAutoCompletador = FabAcaoTestesBeanExemplo.beanExemplo_FRM_AUTOCOMPLETE.getAcaoDoSistema();

    }

    public List<String> autoComplete(String query) {
        List<String> results = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            results.add(query + i);
        }

        return results;
    }

    public List<BeanExemplo> criaLista(String pesquisa) {
        List<BeanExemplo> listaTemporaria = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            BeanExemplo novoBean = new BeanExemplo();
            novoBean.setApelido("BeanExemplo" + i + pesquisa);
            listaTemporaria.add(novoBean);
        }

        return listaTemporaria;

    }

    public PgComponenteLab() {
        super(
                new AcaoDoSistema[]{
                    ((AcaoDoSistema) FabAcaoTestesBeanExemplo.beanExemplo_FRM_VISUALIZAR_Test.getAcaoDoSistema()),
                    ((AcaoDoSistema) FabAcaoTestesBeanExemplo.beanExemplo_FRM_EDITAR_Test.getAcaoDoSistema())
                },
                FabAcaoTestesBeanExemplo.beanExemplo_FRM_NOVO_Teste.getAcaoDoSistema().getComoFormularioEntidade(),
                FabAcaoTestesBeanExemplo.beanExemplo_FRM_LISTAR_Teste.getAcaoDoSistema().getComoFormularioEntidade(),
                FabAcaoTestesBeanExemplo.beanExemplo_CTR_SALVAR_Test.getAcaoDoSistema().getComoControllerEntidade(),
                false, true, true, true, false
        );
    }

    @Override
    public void executarAcao(BeanExemplo pBean) {
        super.executarAcao(pBean);

        if (acaoSelecionada == acaoAutoCompletador) {

            atualizaInformacoesDeEdicao(estadoEdicao.ALTERAR);
            paginaUtil.atualizaTelaPorID("formulario");
        }
    }

    @Override
    public void listarDados() {

    }

    public List<String> getListaAutoComplete() {

        return listaAutoComplete;

    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public ItfAcaoDoSistema getAcaoAutoCompletador() {
        return acaoAutoCompletador;
    }

    public BeanExemplo getBeanSelecionado() {
        return beanSelecionado;
    }

    public void setBeanSelecionado(BeanExemplo beanSelecionado) {
        this.beanSelecionado = beanSelecionado;
    }

}
