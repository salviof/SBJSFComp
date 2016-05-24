/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.SBComp.paginas;

import com.super_bits.Controller.Interfaces.ItfModuloAcaoSistema;
import com.super_bits.modulos.SBAcessosModel.fabricas.FabAcaoProjetoSB;
import com.super_bits.modulos.SBAcessosModel.fabricas.InfoAcaoProjetoSB;
import com.super_bits.modulos.SBAcessosModel.model.ModuloAcaoSistema;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulosSB.SBCore.InfoCampos.registro.Interfaces.basico.ItfBeanSimples;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.MB_PaginaConversation;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 *
 *
 * @author desenvolvedor
 */
@Named
@SessionScoped
@InfoAcaoProjetoSB(acao = FabAcaoProjetoSB.PROJETO_GERENCIAR_MB)
public class PgProjetoSBVisaoGeral extends MB_PaginaConversation {

    private List<AcaoDoSistema> acoesGestaoDoModulo;
    private AcaoDoSistema acaoSelecionada;
    private ModuloAcaoSistema moduloSelecionado;
    private List<ModuloAcaoSistema> modulosDoSistema;
    private List<ItfBeanSimples> objetosDoSistema;

    public List<AcaoDoSistema> getAcoesGestaoDoModulo() {
        return acoesGestaoDoModulo;

    }

    public void init() {
        modulosDoSistema = (List) MapaAcoesSistema.getModulos();

    }

    public void setAcoesGestaoDoModulo(List<AcaoDoSistema> acoesGestaoDoModulo) {
        this.acoesGestaoDoModulo = acoesGestaoDoModulo;
    }

}
