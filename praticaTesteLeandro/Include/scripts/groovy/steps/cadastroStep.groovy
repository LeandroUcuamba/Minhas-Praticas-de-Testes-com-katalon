package steps

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import talkit.CadastroTasks


class cadastroStep {
	
	CadastroTasks task = new CadastroTasks()
	
	
	@Given("estou no site TaskIT")
	public void openBrowser() {
		task.abrirNavegador()
	}
	
	
	@And("clico no botao Ok, I wanna sign up now")
	public void clickUm() {
		task.clicarBotaoRegistro()
	}
	
	@And("na pop-up preencho com os campos com os meus dados de registo")
	public void preencherCampos() {
		task.preencherCamposRegisto()
	}
	
	@And("clico no botao Save")
	public void clickDois() {
		task.clicarBotaoSave()
	}
	
	@And("clico no menu logout")
	public void clickTres() {		
	    task.clicarLogout()
	}
	
	@And("clico no menu sigin")
	public void clickQuatro() {
		task.clicarMenuSignin()
	}
	
	@And("preencho com as credenciais")
	public void clickCinco() {
		task.preencherLogin()
		
	}
	
	
	@And("clico no botao signin")
	public void clickSex() {
		task.clicarBtnSignin()
	}
	
	
	@And("clico no botao Let's add some tasks!")
	public void clickSete() {
		task.clicarBotaoLetAdd()
	}
	
	@When("clico no botao + Add a task")
	public void clickOito() {
		task.clicarBotaoAddTask()
	}
	
	@Then("abri a tela de cadastro de atividades e fecho browser")
	public void closeBrowser() {
		task.fecharNavegador()
	}
	
	
	
	
}