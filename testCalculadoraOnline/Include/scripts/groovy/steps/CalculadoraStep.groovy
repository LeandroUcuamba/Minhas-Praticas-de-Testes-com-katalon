package steps


import com.kms.katalon.core.util.KeywordUtil
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import calculadora.MachineCalc

class CalculadoraStep {
	
	MachineCalc calc = new MachineCalc()
	
	
	@Given("entro na calculadora online")
	public void entrarNoSite(){
		calc.abrirNavegador()
	}
	
	@And("digito de um a nove")
	public void primeiraInsercao() {
	    calc.clicarEmNumerosDeUmAteNove()
    }
	
	@When("clico em adicionar")
	public void pressionarAdd() {
		calc.clicarBtnAdicao()
    }
	
	@And("digito de um a nove novamente")
	public void segundaInsercao() {
		calc.inserirDeNovoNumerosDeUmAteNove()
    }
	
	@Then("clico no botão de igualdade para devolver o resultado da operacao")
	public void pressionarIgual() {
		calc.clicarBtnIgualdade()
    }
	
}