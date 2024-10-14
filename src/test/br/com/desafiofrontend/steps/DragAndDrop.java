package br.com.desafiofrontend.steps;

import br.com.desafiofrontend.runner.RunCucumberTest;
import io.cucumber.java.pt.E;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DragAndDrop extends RunCucumberTest {
    @E("a tela deve conter um container com uma lista vertical contendo seis elementos")
    public void aTelaDeveConterUmContainerComUmaListaVerticalContendoSeisElementos() {
        List<WebElement> elementos = driver.findElements(By.xpath("//*[@id=\"demo-tabpane-list\"]//div"));
        Assert.assertEquals(7, elementos.size());
    }

    @E("os elementos devem estar organizados em ordem crescente")
    public void osElementosDevemEstarOrganizadosEmOrdemCrescente() {
        List<WebElement> elementos = driver.findElements(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div"));
        String[] ordemCrescente = {"One", "Two", "Three", "Four", "Five", "Six"};
        for (int i = 0; i < elementos.size(); i++) {
            String textoElemento = elementos.get(i).getText().trim();
            Assert.assertEquals(ordemCrescente[i], textoElemento);
        }
    }
}
