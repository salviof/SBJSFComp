/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.super_bits.tags;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.component.UINamingContainer;
import javax.faces.component.UIPanel;
import javax.faces.context.FacesContext;
import org.primefaces.component.api.Widget;

/**
 *
 * @author salvioF
 */
@FacesComponent("testeTagOnChange")
public class TesteTagOnchangeComponent extends UIComponentBase implements Widget {

    public static final String CLASSE_DO_COMPONENTE = "org.super_bits.tags.TesteTagOnchangeComponent";
    public static final String FAMILIA_DO_COMPONENTE = "org.super_bits.tags.componentes";

    @Override
    public String getFamily() {
        return FAMILIA_DO_COMPONENTE;
    }

    /**
     * Através dessa variavel é possivel acessar o objeto via javascript
     *
     * @return
     */
    @Override
    public String resolveWidgetVar() {
        FacesContext context = getFacesContext();
        String userWidgetVar = (String) getAttributes().get("widgetVar");

        if (userWidgetVar != null) {
            return userWidgetVar;
        } else {
            return "widget_"
                    + getClientId(context).replaceAll(
                    "-|" + UINamingContainer.getSeparatorChar(context),
                    "_");
        }
    }

    protected static enum PropertyKeys {
        metodoOnchange, widgetVar, propriedadeTextoTeste;
    }

    public String getWidgetVar() {
        return (String) getStateHelper().eval(PropertyKeys.widgetVar, null);
    }

    public void setWidgetVar(String _widgetVar) {
        getStateHelper().put(PropertyKeys.widgetVar, _widgetVar);
    }

}
