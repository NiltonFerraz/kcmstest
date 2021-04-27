package tests.cadastro;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cenario5 {

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
		//Thread.sleep(3000);
		//driver.close();

	}

	@Test
	public void preencheCadastro() {

		// Escolhe o link Adicionar Empresa
		// String value = "Adicionar Empresa";
		WebElement dropdown = driver.findElement(By.id("ctl00_Content_btnAdd"));
		dropdown.click(); // assuming you have to click the "dropdown" to open it

		// Entra com a Razao Social
		WebElement inputRazaoSocial = driver.findElement(By.cssSelector("input[id='ctl00_Content_txtRazaoSocial'"));
		inputRazaoSocial.sendKeys("Empresa Automatizada 1 - ME");

		// Entra com o CNPJ
		WebElement inputCNPJ = driver.findElement(By.cssSelector("input[id='ctl00_Content_txtCNPJ'"));
		inputCNPJ.sendKeys("14158477000104");

		// Clica no botão Pesquisar Municipio
		WebElement buttonSubmit = driver.findElement(By.cssSelector("a[id='ctl00_Content_btnMunicipio'"));
		buttonSubmit.click();

		// Entra com o Municipio
		WebElement inputMunicipio = driver.findElement(By.cssSelector("input[id='ctl00_Content_txtMunicipio'"));
		inputMunicipio.sendKeys("Sorocaba");

		// Entra com o Estado
		WebElement inputEstado = driver.findElement(By.cssSelector("select[id='ctl00_Content_lstUF'"));
		inputEstado.sendKeys("SP");

		// Clica no botão Pesquisar
		WebElement buttonPesquisar = driver.findElement(By.cssSelector("input[id='ctl00_Content_btnPesquisar'"));
		buttonPesquisar.click();

		// Clica no botão Confirmar
		WebElement buttonConfirmarPesquisa = driver
				.findElement(By.cssSelector("input[id='ctl00_Content_btnConfirmar'"));
		buttonConfirmarPesquisa.click();
		
		// Entra com a Senha
		WebElement inputSenha = driver.findElement(By.cssSelector("input[id='ctl00_Content_txtSenha'"));
		inputSenha.sendKeys("123456");
		
		// Entra com a Confirmação de Senha
		WebElement inputConfirmarSenha = driver.findElement(By.cssSelector("input[id='ctl00_Content_txtConfirmSenha'"));
		inputConfirmarSenha.sendKeys("123456");
		
		// Clica no botão Confirmar para finalizar o Cadastro
		WebElement buttonConfirmar = driver
				.findElement(By.cssSelector("input[id='ctl00_Content_btnConfirmar'"));
		buttonConfirmar.click();

	}
}
