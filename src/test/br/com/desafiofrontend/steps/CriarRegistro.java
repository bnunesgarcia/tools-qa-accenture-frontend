package br.com.desafiofrontend.steps;

import br.com.desafiofrontend.pages.CriarMultiplosRegistrosPages;
import br.com.desafiofrontend.pages.CriarRegistroPages;
import br.com.desafiofrontend.support.Utils;
import io.cucumber.java.pt.E;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Random;

public class CriarRegistro extends Utils {

    CriarRegistroPages criarRegistros = new CriarRegistroPages();
    CriarMultiplosRegistrosPages criarMultiplosRegistros = new CriarMultiplosRegistrosPages();

    @E("um popup para preenchimento de novo registro aparece")
    public void umPopupParaPreenchimentoDeNovoRegistroAparece() {
        criarRegistros.validaModal();
    }

    @E("eu preencho o Nome")
    public void euPreenchoONome() {
        criarRegistros.preencheNome();
    }

    @E("eu preencho o sobrenome")
    public void euPreenchoOSobrenome() {
        criarRegistros.preencheSobrenome();
    }

    @E("eu preencho o email")
    public void euPreenchoOEmail() {
        criarRegistros.preencheEmail();
    }

    @E("eu preencho a idade")
    public void euPreenchoAIdade() {
        criarRegistros.preencheIdade();
    }

    @E("eu preencho o salario")
    public void euPreenchoOSalario() {
        criarRegistros.preencheSalario();
    }

    @E("eu preencho o departamento")
    public void euPreenchoODepartamento() {
        criarRegistros.preencheDepartamento();
    }

    @E("eu realizo o submit da criacao do novo registro")
    public void euRealizoOSubmitDaCriacaoDoNovoRegistro() {
        driver.findElement(By.id("submit")).click();
    }

    @E("eu valido que os dados foram inseridos na tabela de registros")
    public void euValidoQueOsDadosForamInseridosNaTabelaDeRegistros() {
        criarRegistros.validaRegistrosNaTabela();
    }

    @E("eu preencho o campo nome com o {}")
    public void euPreenchoOCampoNomeComO(String nome) {
        criarMultiplosRegistros.preencherCampoNome(nome);
    }

    @E("eu preencho o campo sobrenome com o {}")
    public void euPreenchoOCampoSobrenomeComO(String sobrenome) {
        criarMultiplosRegistros.preencherCampoSobrenome(sobrenome);
    }

    @E("eu preencho o campo email com o email {}")
    public void euPreenchoOCampoEmailComOEmail(String email) {
        criarMultiplosRegistros.preencherCampoEmail(email);
    }

    @E("eu preencho a campo idade com a idade {}")
    public void euPreenchoACampoIdadeComAIdade(String idade) {
        criarMultiplosRegistros.preencherCampoIdade(idade);
    }

    @E("eu preencho o campo salario com o salario {}")
    public void euPreenchoOCampoSalarioComOSalario(String salario) {
        criarMultiplosRegistros.preencherCampoSalario(salario);
    }

    @E("eu preencho o campo departamento com o departamento {}")
    public void euPreenchoOCampoDepartamentoComODepartamento(String departamento) {
        criarMultiplosRegistros.preencherCampoDepartamento(departamento);
    }


}

