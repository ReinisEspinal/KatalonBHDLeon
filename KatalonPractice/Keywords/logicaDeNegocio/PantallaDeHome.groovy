package logicaDeNegocio

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import utileria.Utileria
import entidad.VariableXpath
import manejador.ManejadorAccion


import internal.GlobalVariable

public class PantallaDeHome {


	private static TestObject textBoxBusqueda = ManejadorAccion.obtenerMiObjetoDePruebaPorXPath(VariableXpath.amazonTextBoxBusqueda);
	private static TestObject btnBuscar =  ManejadorAccion.obtenerMiObjetoDePruebaPorXPath(VariableXpath.amazonBotonBusqueda);
	
	/*
	 Escribe en el TextBox busquedad y hace clic en 
	 boton de busqueda en la pagina de Amazon
	 */
	public static void buscarProductoEnAmazon(String producto) {

		Utileria.editarTexto(textBoxBusqueda,producto);
		Utileria.hacerClic(btnBuscar);
		Utileria.capturarEvidencia();
	}
}
