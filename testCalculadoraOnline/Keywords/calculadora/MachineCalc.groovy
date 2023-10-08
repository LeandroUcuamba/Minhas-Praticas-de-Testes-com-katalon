package calculadora

import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import steps.CommonSteps as step

import internal.GlobalVariable

public class MachineCalc {

	//TestObject corresponde o mapeamento dos elementos elencados no Object Repository
	TestObject  zero   =      findTestObject('Numeros/zero')
	TestObject   um  =      findTestObject('Numeros/um')
	TestObject   dois  =      findTestObject('Numeros/dois')
	TestObject  tres   =      findTestObject('Numeros/tres')
	TestObject  quatro   =      findTestObject('Numeros/quatro')
	TestObject  cinco   =      findTestObject('Numeros/cinco')
	TestObject  seis   =      findTestObject('Numeros/seis')
	TestObject  sete   =      findTestObject('Numeros/sete')
	TestObject  oito   =      findTestObject('Numeros/oito')
	TestObject   nove  =      findTestObject('Numeros/nove')
	TestObject  adicao   =      findTestObject('Operacoes/adicao')
	TestObject  divisao   =      findTestObject('Operacoes/divisao')
	TestObject  multiplicacao   =      findTestObject('Operacoes/multiplicacao')
	TestObject  subtracao   =      findTestObject('Operacoes/subtracao')
	TestObject   igualdade  =      findTestObject('Operacoes/igualdade')
	TestObject   clean  =      findTestObject('limpar/clean')
	TestObject  screen   =      findTestObject('Tela/screen')


	public void abrirNavegador() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.baseURL)

	}

	public void clicarEmNumerosDeUmAteNove(){
		step.clicarNoBotao(um)
		step.clicarNoBotao(dois)
		step.clicarNoBotao(tres)
		step.clicarNoBotao(quatro)
		step.clicarNoBotao(cinco)
		step.clicarNoBotao(seis)
		step.clicarNoBotao(sete)
		step.clicarNoBotao(oito)
		step.clicarNoBotao(nove)
	}

	public void clicarBtnAdicao(){
		step.clicarNoBotao(adicao)
	}

	public void inserirDeNovoNumerosDeUmAteNove(){
		step.clicarNoBotao(um)
		step.clicarNoBotao(dois)
		step.clicarNoBotao(tres)
		step.clicarNoBotao(quatro)
		step.clicarNoBotao(cinco)
		step.clicarNoBotao(seis)
		step.clicarNoBotao(sete)
		step.clicarNoBotao(oito)
		step.clicarNoBotao(nove)
	}

	public void clicarBtnIgualdade(){
		step.clicarNoBotao(igualdade)
	}


}
