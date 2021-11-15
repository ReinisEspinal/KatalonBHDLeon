package manejador

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class ManejadorAccion {


	public static TestObject obtenerMiObjetoDePruebaPorXPath(String selectorValue) {
		TestObject to = new TestObject()
		to.addProperty("xpath", ConditionType.EQUALS, selectorValue)
		return to
	}
}
