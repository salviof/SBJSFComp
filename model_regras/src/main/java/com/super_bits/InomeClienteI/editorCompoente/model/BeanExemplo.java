/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.InomeClienteI.editorCompoente.model;

import com.super_bits.modulosSB.Persistencia.registro.persistidos.modulos.CEP.Localizacao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoClasse;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.ValorAceito;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabCampos;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.FabTipoBeanSBGenerico;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.ItemContatoCorporativo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotNull;

/**
 * ATENÇÃO A DOCUMENTAÇÃO DA CLASSE É OBRIGATÓRIA O JAVADOC DOS METODOS PUBLICOS
 * SÃO OBRIGATÓRIOS E QUANDO EXISTIR UMA INTERFACE DOCUMENTADA UMA REFERENCIA
 * DEVE SER CRIADA, A SINTAXE DE REFERENCIA É: @see_ NomeDAClasse#Metodo
 * DOCUMENTE DE FORMA OBJETIVA E EFICIENTE, NÃO ESQUEÇA QUE VOCÊ FAZ PARTE DE
 * UMA EQUIPE.
 *
 * @author <a href="mailto:salviof@gmail.com">Salvio Furbino</a>
 * @since 30/12/2015
 * @version 1.0
 *
 */
@InfoClasse(tags = {"Objeto Exemplo"}, plural = "Beans de Exmplo")
public class BeanExemplo
        extends ItemContatoCorporativo {

    @InfoCampo(tipo = FabCampos.ID, label = "ID")
    @NotNull
    private int id;

    @InfoCampo(tipo = FabCampos.EMAIL, label = "Email")
    @NotNull
    private String email = "emailteste@teste.com";

    @InfoCampo(tipo = FabCampos.TELEFONE_FIXO_NACIONAL, label = "Telefone")
    @NotNull
    private String telefone = "313017-7334";

    @InfoCampo(tipo = FabCampos.TELEFONE_CELULAR, label = "Celular")
    @NotNull
    private String celular;

    @InfoCampo(tipo = FabCampos.TELEFONE_FIXO_INTERNACIONAL, label = "Tel Internacional")
    @NotNull
    private String telInternacional;

    @InfoCampo(tipo = FabCampos.CPF, label = "CPF")
    @NotNull
    private String cpf;

    @InfoCampo(tipo = FabCampos.CNPJ, label = "CNPJ")
    @NotNull
    private String cnpj;

    @InfoCampo(tipo = FabCampos.INSCRICAO_ESTADUAL, label = "Teste")
    @NotNull
    private String cpTeste;

    @InfoCampo(tipo = FabCampos.INSCRICAO_ESTADUAL, label = "Inscestadual")
    @NotNull
    private String inscricaoEstadual;

    @InfoCampo(tipo = FabCampos.INSCRIACAO_MUNICIPAL, label = "Insc. Municipal")
    @NotNull
    private String inscricaoMunicipal;

    @InfoCampo(tipo = FabCampos.COR, label = "Cor")
    @NotNull
    private String cor;

    @InfoCampo(Mask = "", label = "Mascara Esp.")
    @NotNull
    private String mascaraEspecial;

    @InfoCampo(tipo = FabCampos.HTML, label = "Html")
    @NotNull
    private String html;

    @InfoCampo(tipo = FabCampos.SITE, obrigatorio = true, label = "Site")
    @NotNull
    private String site;

    @InfoCampo(tipo = FabCampos.URL, label = "Url")
    private String url;

    @InfoCampo(tipo = FabCampos.SENHA, label = "Senha")
    @NotNull
    private String senha;

    @NotNull
    @InfoCampo(tipo = FabCampos.QUANTIDADE, label = "Quantidade")
    private int quantidade;

    @NotNull
    @InfoCampo(tipo = FabCampos.PERCENTUAL, label = "Percentual")
    private int porcentagem;

    @NotNull
    @InfoCampo(tipo = FabCampos.MOEDA_REAL, label = "Dinheiro")
    private Double dinheiro;

    @NotNull
    @InfoCampo(tipo = FabCampos.REG_DATAALTERACAO, label = "Data Alteração")
    private Date dataAlteracao;

    @InfoCampo(tipo = FabCampos.AAA_NOME, label = "Apelido")
    private String apelido;

    @NotNull
    @InfoCampo(tipo = FabCampos.AAA_NOME_LONGO, label = "Nome")
    private String nome;

    @InfoCampo(tipo = FabCampos.LCComplemeto, label = "Complemento")
    @NotNull
    private String complemento;

    @InfoCampo(tipo = FabCampos.LCCEP, obrigatorio = true, label = "CEP")
    @NotNull
    private String cep;

    @InfoCampo(tipo = FabCampos.DATAHORA, label = "Data Hora")
    @NotNull
    private String dataHora;

    @InfoCampo(tipo = FabCampos.ARQUIVO_DE_ENTIDADE, label = "Arquivo")
    @NotNull
    private String arquivo;

    @InfoCampo(tipo = FabCampos.LC_LOCALIZACAO, label = "Localização")
    @NotNull
    private Localizacao localizacao;
    @NotNull
    private BeanExemplo beanFilho;

    @InfoCampo(tipo = FabCampos.OBJETO_DE_UMA_LISTA, valoresAceitos = {
        @ValorAceito(valor = "Teste"),
        @ValorAceito(valor = "Teste2")}
    )
    private BeanExemplo beanSelecionadoDaListaDescritiva;

    @InfoCampo(tipo = FabCampos.OBJETO_DE_UMA_LISTA, fabricaDeOpcoes = FabTipoBeanSBGenerico.class)
    private BeanExemplo beanSelecionadoDaListaFabrica;

    @InfoCampo(tipo = FabCampos.OBJETO_DE_UMA_LISTA, caminhoParaLista = "filiaisFornecedor")
    private BeanExemplo benSelecionadoListaPorCampo;

    private List<BeanExemplo> listasExemplo;

    public BeanExemplo() {
        this(true);

    }

    /**
     *
     * @param pCriarLista
     */
    public BeanExemplo(boolean pCriarLista) {
        super();
        if (!pCriarLista) {
            listasExemplo = null;
        } else {
            BeanExemplo exemplo1 = new BeanExemplo(false);
            exemplo1.setNome("Bean Lista 1");
            exemplo1.setId(1);
            exemplo1.setEmail("teste@teste.com");

            BeanExemplo exemplo2 = new BeanExemplo(false);
            exemplo2.setNome("Bean Lista 1");
            exemplo2.setId(1);
            exemplo2.setEmail("teste@teste.com");
            listasExemplo = new ArrayList<>();
            beanFilho = new BeanExemplo(false);
            listasExemplo.add(exemplo1);

            apelido = "testeeeeeeee";

        }

    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelInternacional() {
        return telInternacional;
    }

    public void setTelInternacional(String telInternacional) {
        this.telInternacional = telInternacional;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return cpTeste;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.cpTeste = inscricaoEstadual;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMascaraEspecial() {
        return mascaraEspecial;
    }

    public void setMascaraEspecial(String mascaraEspecial) {
        this.mascaraEspecial = mascaraEspecial;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    @Override
    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(int porcentagem) {
        this.porcentagem = porcentagem;
    }

    public Double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(Double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public BeanExemplo getBeanFilho() {
        return beanFilho;
    }

    public void setListasExemplo(List<BeanExemplo> listasExemplo) {
        this.listasExemplo = listasExemplo;
    }

    public List<BeanExemplo> getListasExemplo() {
        return listasExemplo;
    }

    public BeanExemplo getBeanSelecionadoDaListaDescritiva() {
        return beanSelecionadoDaListaDescritiva;
    }

    public void setBeanSelecionadoDaListaDescritiva(BeanExemplo beanSelecionadoDaListaDescritiva) {
        this.beanSelecionadoDaListaDescritiva = beanSelecionadoDaListaDescritiva;
    }

    public BeanExemplo getBeanSelecionadoDaListaFabrica() {
        return beanSelecionadoDaListaFabrica;
    }

    public void setBeanSelecionadoDaListaFabrica(BeanExemplo beanSelecionadoDaListaFabrica) {
        this.beanSelecionadoDaListaFabrica = beanSelecionadoDaListaFabrica;
    }

    public BeanExemplo getBenSelecionadoListaPorCampo() {
        return benSelecionadoListaPorCampo;
    }

    public void setBenSelecionadoListaPorCampo(BeanExemplo benSelecionadoListaPorCampo) {
        this.benSelecionadoListaPorCampo = benSelecionadoListaPorCampo;
    }

    public void setBeanFilho(BeanExemplo beanFilho) {
        this.beanFilho = beanFilho;
    }

}
