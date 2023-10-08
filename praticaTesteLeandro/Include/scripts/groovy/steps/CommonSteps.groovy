package steps

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.omg.CORBA.Object



class CommonSteps {
	static void clicarNoBotao(TestObject) {
		WebUI.click(TestObject)
	}


	static void clicarNoBotaoEinserirTexto(TestObject, String Texto) {
		WebUI.click(TestObject)
		WebUI.setText(TestObject, Texto)
	}

	static void selecionarOpcao(TestObject, String value) {
		WebUI.click(TestObject)
		WebUI.selectOptionByValue(TestObject, value, false)
	}

	static void selecionarOpcaoIndex(TestObject, Object) {
		WebUI.waitForPageLoad(5)
		WebUI.click(TestObject)
		WebUI.selectOptionByIndex(TestObject, Object)
	}


	static void inserirTexto(TestObject, String texto) {
		WebUI.setText(TestObject, texto)
	}

	static void aguardarElementoVisivel(TestObject) {
		WebUI.waitForElementVisible(TestObject, 10)
	}

	static void duploCliqueNoBotao(TestObject) {
		WebUI.doubleClick(TestObject)
	}

	static void aguardarPagina(TestObject) {
		WebUI.waitForPageLoad(5)
		WebUI.waitForElementVisible(TestObject, 5)
	}


	static void fecharNavegador() {
		WebUI.closeBrowser()
	}
}