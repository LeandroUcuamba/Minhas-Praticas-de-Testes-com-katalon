package ecommerce

import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import steps.CommonSteps as step

import internal.GlobalVariable

public class Compra {
	
	//TestObject corresponde o mapeamento dos elementos elencados no Object Repository
	TestObject  user_login_field   =      findTestObject('login/user_login_field')
	TestObject  user_password_field   =      findTestObject('login/user_password_field')
	TestObject  btn_login   =      findTestObject('login/btn_login')
	TestObject  filtro   =      findTestObject('menu/filtro')
	TestObject  sauce_labs_oniese   =      findTestObject('Produto/sauce_labs_oniese')
	TestObject  black_tshirt   =      findTestObject('Produto/black_tshirt')
	TestObject  backpack  =      findTestObject('Produto/backpack')
	TestObject  icon_cart  =      findTestObject('cart/icon_cart')
	TestObject  btn_checkout  =      findTestObject('cart/btn_checkout')
	TestObject  delete_tshirt  =      findTestObject('cart/delete_tshirt')
	TestObject  btn_continue  =      findTestObject('checkout/btn_continue')
	TestObject  btn_finish  =      findTestObject('checkout/btn_finish')
	TestObject  first_name  =      findTestObject('checkout/first_name')
	TestObject  last_name  =      findTestObject('checkout/last_name')
	TestObject  postal_code  =      findTestObject('checkout/postal_code')
	
	
	
	public void abrirNavegador() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.baseURL)
	}
	
	
	public void digitarCredenciais(){
		step.inserirTexto(user_login_field, "standard_user")
		step.inserirTexto(user_password_field, "secret_sauce")
	}
	
	public void clicarParaLogar(){
		step.clicarNoBotao(btn_login)
	}
	
	public clicarNoFiltro(){
		step.clicarNoBotao(filtro)
	}
	
	public void inserirNoCarrinho(){
		step.clicarNoBotao(sauce_labs_oniese)
		step.clicarNoBotao(black_tshirt)
		step.clicarNoBotao(backpack)
	}

	public void clicarNoCart(){
		step.clicarNoBotao(icon_cart)
	}
	
	
	public void removeTshirtCart(){
		step.clicarNoBotao(delete_tshirt)
	}
	
	
	public void clicarCheckout(){
		step.clicarNoBotao(btn_checkout)
	}
	
	
	public void preencherDadosUser(){
		step.inserirTexto(first_name, "Leandro")
		step.inserirTexto(last_name, "Dos Santos Ucuamba")
		step.inserirTexto(postal_code, "00011")
	}
	
	
	public void clicarContinue(){
		step.clicarNoBotao(btn_continue)
	}
	
	
	public void clicarFinish(){
		step.clicarNoBotao(btn_finish)
	}
	
	
	
}
