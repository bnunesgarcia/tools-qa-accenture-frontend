package br.com.desafiofrontend.steps;

import br.com.desafiofrontend.pages.AcessaFuncionalidadesPages;
import br.com.desafiofrontend.support.Utils;
import constants.Variaveis;
import org.openqa.selenium.By;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AcessarFormularioParaPreenchimento extends Utils {

    AcessaFuncionalidadesPages validaMenu = new AcessaFuncionalidadesPages();

    @Dado("que eu acesse a aplicacao demoqa")
    public void queEuAcesseAAplicacaoDemoqa() {
        acessarAplicacao();
    }

    @E("o menu {} deve estar disponivel")
    public void oMenuDeveEstarDisponivel(String menu) {
        validaMenu.validaExibicaoMenu(menu);
    }

    @Quando("eu clico no menu {}")
    public void euClicoNoMenu(String menu) {
        validaMenu.acessaMenu(menu);
    }

    @Então("eu clico no submenu {}")
    public void euClicoNoSubmenu(String submenu) {
        validaMenu.acessaSubMenu(submenu);
    }

    @E("o formulario para preenchimento deve ser disponibilizado")
    public void oFormularioParaPreenchimentoDeveSerDisponibilizado() {
        driver.findElement(By.xpath(Variaveis.formulario)).isDisplayed();
    }
}

