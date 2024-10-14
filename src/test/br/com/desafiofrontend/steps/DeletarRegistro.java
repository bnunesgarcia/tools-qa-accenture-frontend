package br.com.desafiofrontend.steps;

import br.com.desafiofrontend.runner.RunCucumberTest;
import io.cucumber.java.pt.E;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DeletarRegistro extends RunCucumberTest {

    @E("eu deleto o registro inserido")
    public void deletarRegistroInserido(){
        WebElement deleteBtn = driver.findElement(By.xpath("//*[@id=\"delete-record-4\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", deleteBtn);
    }

    @E("eu valido que o registro náo esta mais disponivel na tabela")
    public void validarExclusaoDeRegistro(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        boolean elemento = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"delete-record-4\"]")));
            if (elemento) {
                System.out.println("TESTE OK");
            } else {
                System.out.println("BUG");
            }
    }

}
