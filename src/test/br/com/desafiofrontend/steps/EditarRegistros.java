package br.com.desafiofrontend.steps;

import br.com.desafiofrontend.support.Utils;
import io.cucumber.java.pt.E;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class EditarRegistros extends Utils {

    String novoNome = "Novo Nome";
    String novoSobrenome = "Novo Sobrenome";

    @E("eu acesso a tela de editar dados")
    public void euAcessoATelaDeEditarDados() {
        WebElement editBtn = driver.findElement(By.xpath("//*[@id=\"edit-record-4\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", editBtn);
    }

    @E("eu edito o nome")
    public void euEditoONome() {
        driver.findElement(By.id("firstName")).clear();
        driver.findElement(By.id("firstName")).sendKeys(novoNome);
    }

    @E("eu edito o sobrenome")
    public void euEditoOSobrenome() {
        driver.findElement(By.id("lastName")).clear();
        driver.findElement(By.id("lastName")).sendKeys(novoSobrenome);
    }
    @E("eu realizo o submit da alteracao do registro")
    public void euRealizoAlteracaoDoRegistro() {
        driver.findElement(By.id("submit")).click();
    }

    @E("eu valido que os dados foram alterados corretamente")
    public void euValidoQueOsDadosForamAlteradosCorretamente() {
        String nome = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[1]")).getText();
        String sobrenome = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[2]")).getText();
        Assert.assertEquals(novoNome, nome);
        Assert.assertEquals(novoSobrenome, sobrenome);
    }


}
