package br.com.desafiofrontend.pages;

import br.com.desafiofrontend.support.Utils;
import constants.Variaveis;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AcessaFuncionalidadesPages extends Utils {

    public void validaExibicaoMenu(String menu) {
        if (menu.equals("forms")) {
            driver.findElement(By.xpath(Variaveis.menuForms)).isDisplayed();
        } else if (menu.equals("alerts, frame & windows")) {
            driver.findElement(By.xpath(Variaveis.menuAlerts)).isDisplayed();
        } else if (menu.equals("elements")) {
            driver.findElement(By.xpath(Variaveis.menuElements)).isDisplayed();
        } else if (menu.equals("interactions")) {
            driver.findElement(By.xpath(Variaveis.menuInteractions)).isDisplayed();
        }
    }

    public void acessaMenu(String menu) {
        if (menu.equals("forms")) {
            driver.findElement(By.xpath(Variaveis.menuForms)).click();
        } else if (menu.equals("alerts, frame & windows")) {
            driver.findElement(By.xpath(Variaveis.menuAlerts)).click();
        } else if (menu.equals("elements")) {
            driver.findElement(By.xpath(Variaveis.menuElements)).click();
        } else if (menu.equals("interactions")) {
            driver.findElement(By.xpath(Variaveis.menuInteractions)).click();
        }
    }

    public void acessaSubMenu(String submenu) {
        if (submenu.equals("practice form")) {
            driver.findElement(By.xpath(Variaveis.subMenuPracticeForms)).click();
        } else if (submenu.equals("browser windows")) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
            WebElement browserWindowElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(Variaveis.subMenuBrowserWindows)));
            browserWindowElement.click();
        } else if (submenu.equals("web tables")) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
            WebElement webTablesElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(Variaveis.subMenuWebElements)));
            webTablesElement.click();
        } else if (submenu.equals("sortable")) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
            WebElement sortableElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(Variaveis.subMenuSortable)));
            sortableElement.click();
        }
    }
}