package br.com.desafiofrontend.pages;

import br.com.desafiofrontend.support.Utils;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Random;

public class CriarRegistroPages extends Utils {

    String firstName = "Gael" + new Random().nextInt(100);
    String lastName = "Oliveir" + new Random().nextInt(100);
    String emailFake = "email" + new Random().nextInt(100) + "@email.com";
    String idadeFake = String.valueOf(new Random().nextInt(100));
    String salarioFake = String.valueOf(new Random().nextInt(10000));
    String departamentoFake = "Departamento" + new Random().nextInt(100);

    public void validaModal(){
        driver.findElement(By.xpath("//div[4]/div/div")).isDisplayed();
    }

    public void preencheNome(){
            driver.findElement(By.id("firstName")).sendKeys(firstName);
    }

    public void preencheSobrenome(){
        driver.findElement(By.id("lastName")).sendKeys(lastName);
    }

    public void preencheEmail(){
        driver.findElement(By.id("userEmail")).sendKeys(emailFake);
    }

    public void preencheIdade(){
        driver.findElement(By.id("age")).sendKeys(idadeFake);
    }

    public void preencheSalario(){
        driver.findElement(By.id("salary")).sendKeys(salarioFake);
    }

    public void preencheDepartamento(){
        driver.findElement(By.id("department")).sendKeys(departamentoFake);
    }

    public void validaRegistrosNaTabela(){
        String nome = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[1]")).getText();
        String sobrenome = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[2]")).getText();
        String idade = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[3]")).getText();
        String email = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[4]")).getText();;
        String salario = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[5]")).getText();;
        String departamento = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[6]")).getText();;

        Assert.assertEquals(nome, firstName);
        Assert.assertEquals(sobrenome, lastName);
        Assert.assertEquals(idade, idadeFake);
        Assert.assertEquals(email, emailFake);
        Assert.assertEquals(salario, salarioFake);
        Assert.assertEquals(departamento, departamentoFake);
    }

}
