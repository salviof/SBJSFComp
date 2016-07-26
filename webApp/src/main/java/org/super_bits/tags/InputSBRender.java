/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.super_bits.tags;

import java.awt.Color;
import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;
import org.primefaces.renderkit.CoreRenderer;
import org.super_bits.tags.knob.Knob;

/**
 *
 * @author salvioF
 */
@FacesRenderer(componentFamily = InputSB.FAMILIA_DO_COMPONENTE, rendererType = InputSBRender.RENDERER_TYPE)
public class InputSBRender extends CoreRenderer {

    public static final String RENDERER_TYPE = "org.super_bits.tags.InputSBRender";

    @Override
    public void decode(FacesContext context, UIComponent component) {
        super.decode(context, component); //To change body of generated methods, choose Tools | Templates.
    }

    private void encodeMarkup(FacesContext context, InputSB inputSB) throws IOException {

        ResponseWriter writer = context.getResponseWriter();

        Object value = inputSB.getValue() != null ? inputSB.getValue() : 0;

        writer.startElement("input", inputSB);
        writer.writeAttribute("id", inputSB.getClientId(), null);
        writer.writeAttribute("name", inputSB.getClientId(), null);
        writer.writeAttribute("disabled", true, null);
        writer.writeAttribute("value", value.toString(), null);
        writer.writeAttribute("data-min", inputSB.getMin(), null);
        writer.writeAttribute("data-step", inputSB.getStep(), null);
        writer.writeAttribute("data-max", inputSB.getMax(), null);
        writer.writeAttribute("data-displayInput", Boolean.toString(inputSB.isShowLabel()), null);
        writer.writeAttribute("data-readOnly", Boolean.toString(inputSB.isDisabled()), null);
        writer.writeAttribute("data-cursor", Boolean.toString(inputSB.isCursor()), null);

        if (inputSB.getThickness() != null) {
            writer.writeAttribute("data-thickness", inputSB.getThickness(), null);
        }

        if (inputSB.getForegroundColor() != null) {
            String fg;
            if (inputSB.getForegroundColor() instanceof Color) {
                fg = "FFFFFF";
            } else {
                fg = inputSB.getForegroundColor().toString();
            }
            writer.writeAttribute("data-fgColor", fg, null);
        }

        if (inputSB.getBackgroundColor() != null) {
            String bg;
            if (inputSB.getBackgroundColor() instanceof Color) {
                bg = "ffffff";
            } else {
                bg = inputSB.getBackgroundColor().toString();
            }
            writer.writeAttribute("data-bgColor", bg, null);
        }

        if (inputSB.getWidth() != null) {
            writer.writeAttribute("data-width", inputSB.getWidth().toString(), null);
        }

        writer.writeAttribute("class", "knob", null);

        writer.endElement("input");

        writer.startElement("input", null);
        writer.writeAttribute("id", inputSB.getClientId() + "_hidden", null);
        writer.writeAttribute("name", inputSB.getClientId() + "_hidden", null);
        writer.writeAttribute("type", "hidden", null);
        writer.writeAttribute("value", value.toString(), null);
        writer.endElement("input");
    }

    @Override
    public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
        this.encodeMarkup(context, (InputSB) component);
        this.encodeScript(context, (InputSB) component);
    }

}
