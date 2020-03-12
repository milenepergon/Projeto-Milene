package cadastro;


import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static java.lang.Thread.sleep;
import java.util.concurrent.TimeUnit;

public class CadastraCliente {
    @Test
    public void testAdicionarCadastroCliente() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Milene\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        //abrir o navegador
        navegador.get ("https://www.grocerycrud.com/demo/bootstrap_theme");
        //alterar combo select version para "Bootstrap V4 Theme"
        navegador.findElement(By.id("switch-version-select")).sendKeys(Keys.ARROW_DOWN);
        //clicar no botão Add Customer
        navegador.findElement(By.xpath("//*[@id=\"gcrud-search-form\"]/div[1]/div[1]/a")).click();
        //inserir nome
        navegador.findElement(By.id("field-customerName")).sendKeys("Teste Stefanini");
        //Last name
        navegador.findElement(By.id("field-contactLastName")).sendKeys("Teste");
        //ContactFirstName
        navegador.findElement(By.id("field-contactFirstName")).sendKeys("Milene Pereira Gonçalves");
        //Phone
        navegador.findElement(By.id("field-phone")).sendKeys("51 9999-9999");
        //AddressLine1
        navegador.findElement(By.id("field-addressLine1")).sendKeys("Av Bento, 6681");
        //AddressLine 2
        navegador.findElement(By.id("field-addressLine2")).sendKeys("Teste adress");
        //City
        navegador.findElement(By.id("field-city")).sendKeys("Porto Alegre");
        //state
        navegador.findElement(By.id("field-state")).sendKeys("RS");
        //PostalCode
        navegador.findElement(By.id("field-postalCode")).sendKeys("91000-000");
        //Country
        navegador.findElement(By.id("field-country")).sendKeys("Brasil");

        sleep(5000);
        //from Employeer -Fixter
        navegador.findElement(By.id("field_salesRepEmployeeNumber_chosen")).click();
        navegador.findElement(By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/div/ul/li[8]")).click();
        //CreditLimit
        navegador.findElement(By.id("field-creditLimit")).sendKeys("200");
        //Clique no botão Save
        navegador.findElement(By.id("form-button-save")).click();

        //validar mensagem
        navegador.findElement(By.id("report-success")).click();
        String sucesso = navegador.findElement(By.id("report-success")).getText();
        assertTrue(sucesso.contains("Your data has been successfully stored into the database. "));

        //fechar navegador
        navegador.quit();














    }








    }







