package utileria

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
public class Utileria {


	public static void hacerClic(TestObject etiqueta) {

		try {
			WebUI.click(etiqueta, FailureHandling.STOP_ON_FAILURE);
		}
		catch(Exception e) {
			println(e);
		}
	}

	public static void editarTexto(TestObject elemento,String texto) {
		try {
			WebUI.setText(elemento, texto, FailureHandling.STOP_ON_FAILURE);
		}
		catch(Exception e) {
			println(e);
		}
	}
	public static void capturarEvidencia() {
		WebUI.takeScreenshot();
	}
}