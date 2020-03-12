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

public class CurrentUserUrl {


    @Test
    public void testAdicionarURLCliente() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milene\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.manage().window().maximize();

        //abrir o navegador
        navegador.get("https://api.github.com/");
        sleep(10000);
        navegador.get("https://api.github.com/user");
        String texto  = navegador.findElement(By.xpath("/html/body/pre")).getText();
        assertTrue(texto.contains("Requires authentication"));
        assertTrue(texto.contains("https://developer.github.com/v3/users/#get-the-authenticated-user"));
        sleep(5000);
        navegador.quit();


    }






}
