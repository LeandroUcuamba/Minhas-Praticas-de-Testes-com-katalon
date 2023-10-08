package talkit

import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import steps.CommonSteps as step

import internal.GlobalVariable


public class CadastroTasks {

	//TestObject corresponde o mapeamento dos elementos elencados no Object Repository
	TestObject  btn_signUpNow   =      findTestObject('TalkIT/signup/btn_signUpNow')
	TestObject   btn_save  =      findTestObject('TalkIT/signup/btn_save')
	TestObject  nome_login   =      findTestObject('TalkIT/signup/nome_login')
	TestObject   nome_usuario  =      findTestObject('TalkIT/signup/nome_usuario')
	TestObject  senha   =      findTestObject('TalkIT/signup/senha')
	TestObject  btn_logout   =      findTestObject('TalkIT/logout/btn_logout')
	TestObject  btn_signIn   =      findTestObject('TalkIT/signin/btn_signIn')
	TestObject  menu_signIn   =      findTestObject('TalkIT/signin/menu_signIn')
	TestObject   nome_usuario_login  =      findTestObject('TalkIT/signin/nome_usuario_login')
	TestObject   senha_usuario_login  =      findTestObject('TalkIT/signin/senha_usuario_login')
	TestObject   btn_addSomeTask  =      findTestObject('TalkIT/createtask/btn_addSomeTask')
	TestObject  btn_addTask   =      findTestObject('TalkIT/createtask/btn_addTask')


	public void abrirNavegador() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.baseURL)
	}


	public void clicarBotaoRegistro() {
		step.clicarNoBotao(btn_signUpNow)
	}

	public void preencherCamposRegisto() {
		step.inserirTexto(nome_usuario, "LeandroSantosUcuamba") //nome_login
		step.inserirTexto(nome_login, "Leandro Dos Santos") //nome_usuario
		step.inserirTexto(senha, "Ango1234")
	}

	public void clicarBotaoSave() {
		step.clicarNoBotao(btn_save)
	}
	
	public void clicarLogout(){
		step.clicarNoBotao(btn_logout) //
	}
	
	public void clicarMenuSignin(){
		step.clicarNoBotao(menu_signIn) //
	}
	
	public void preencherLogin(){ //
		step.inserirTexto(nome_usuario_login, "LeandroSantosUcuamba")
		step.inserirTexto(senha_usuario_login, "Ango1234")
	}
	
	public void clicarBtnSignin(){ //
		step.clicarNoBotao(btn_signIn)
	}
	

	public void clicarBotaoLetAdd() {
		step.clicarNoBotao(btn_addSomeTask)
	}

	public void clicarBotaoAddTask() {
		step.clicarNoBotao(btn_addTask)
	}

	public void fecharNavegador(){
		step.fecharNavegador()
	}




}
