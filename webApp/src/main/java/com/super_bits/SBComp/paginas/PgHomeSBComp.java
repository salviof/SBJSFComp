/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.SBComp.paginas;

import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.MB_PaginaConversation;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.anotacoes.InfoPagina;
import com.super_bits.modulosSB.webPaginas.controller.paginasDoSistema.FabAcaoPaginasDoSistema;
import com.super_bits.modulosSB.webPaginas.controller.paginasDoSistema.InfoAcaoPaginaDoSistema;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author desenvolvedor
 */
@InfoAcaoPaginaDoSistema(acao = FabAcaoPaginasDoSistema.PAGINA_MB_HOME)
@Named
@InfoPagina(tags = "Pagina inicial criação de componentes", nomeCurto = "PGINI")
@ViewScoped
public class PgHomeSBComp extends MB_PaginaConversation {

    private String teste = "tesssssssteeeeeeeeee Colé humano! Sá parada funciona doidin.";

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }

}
