/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.InomeClienteI.editorCompoente;

import com.super_bits.modulosSB.SBCore.InfoCampos.anotacoes.InfoClasse;
import com.super_bits.modulosSB.SBCore.InfoCampos.registro.ItemNormal;

/**
 *
 * @author desenvolvedor
 */
@InfoClasse(tags = "Componente Visual")
public class ComponenteVisual extends ItemNormal {

    public ComponenteVisual() {
        super(ComponenteVisual.class);
    }

    private int id;
    private String nome;
    private String xhtml;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getXhtml() {
        return xhtml;
    }

    public void setXhtml(String xhtml) {
        this.xhtml = xhtml;
    }

}
