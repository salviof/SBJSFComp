/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.modulosSB.Persistencia.dao.UtilSBPersistencia;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.InfoCampos.registro.Interfaces.basico.ItfBeanSimples;
import com.super_bits.modulosSB.SBCore.TratamentoDeErros.FabErro;
import java.lang.reflect.ParameterizedType;
import javax.persistence.EntityManager;

/**
 *
 * @author desenvolvedor
 */
public class TesteBasico {

    private class RepositorioGenerico<T extends ItfBeanSimples> {

        private Class<T> classe;
        private EntityManager em = UtilSBPersistencia.getNovoEM();

        @SuppressWarnings("unchecked")
        public RepositorioGenerico(EntityManager em) {
            this.classe = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
                    .getActualTypeArguments()[0];
            this.em = em;
        }

        public int add(T entidade) {
            em.persist(entidade);
            em.flush();
            return ((ItfBeanSimples) entidade).getId();
        }

    }

    private class GenericService<TT extends ItfBeanSimples> {

        private RepositorioGenerico<TT> repositorio;
        private EntityManager em;

        public GenericService() {
            em = UtilSBPersistencia.getNovoEM();
            repositorio = new RepositorioGenerico<>(UtilSBPersistencia.getNovoEM());
        }

        public void add(TT pparametro) {
            try {

                repositorio.add(pparametro);
            } catch (Throwable t) {
                SBCore.RelatarErro(FabErro.PARA_TUDO, "", t);
            }
        }

    }

}
