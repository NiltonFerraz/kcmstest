package tests.consulta;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cenario1 {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Entra na tela de login
		driver.get("https://test-web-dev.azurewebsites.net/");

		// Escolhe o valor de Login
		WebElement inputLogin = driver.findElement(By.cssSelector("input[id='txtLogin'"));
		inputLogin.sendKeys("kcms");

		// Escolhe o valor de senha
		WebElement inputSenha = driver.findElement(By.cssSelector("input[id='txtSenha'"));
		inputSenha.sendKeys("123456");

		// Clica no botão Entrar
		WebElement buttonSubmit = driver.findElement(By.cssSelector("input[id='btnentrar'"));
		buttonSubmit.click();

	}

	@After
	public void tearDown() throws Exception {
		// Thread.sleep(3000);
		// driver.close();

	}

	@Test
	public void consultaEmpresa() {

		// Escolhe o link Consultar Empresas
		// String value = "Adicionar Empresa";
		WebElement dropdown = driver.findElement(By.id("ctl00_Content_btnCons"));
		dropdown.click(); // assuming you have to click the "dropdown" to open it

		// Escolhe o link Consultar Empresas
		WebElement localizaEmpresa = driver
				.findElement(By.cssSelector("#ctl00_Content_grdEmp > tbody > tr:nth-child(40) > td:nth-child(2)"));
		localizaEmpresa.click();
		// #ctl00_Content_grdEmp_ctl40_btnIdEmp
		// #ctl00_Content_grdEmp > tbody > tr:nth-child(40) > td:nth-child(2)
	}
}
