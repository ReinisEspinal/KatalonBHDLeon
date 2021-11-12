package entidad

//ctrl+shift+o
public class VariableXpath {

	/*
	 Amazon
	 *Crear objetos*
	 *Hacer metodo crear objetos
	 */
	public static String amazonTextBoxBusqueda=".//input[@id='twotabsearchtextbox' or @aria-label='Search']";
	public static String amazonBotonBusqueda ="//input[@id=\"nav-search-submit-button\" or @value='Go']";
	
	public static String amazonLinkProducto = ".//span[text()='Cell']";
	public static String amazonBotonPrecio =".//form[@data-automation-id='ab-movie-hd-tvod_rental']";
	public static String amazonTextoTiempo =".//div[@data-automation-id='runtime-badge' or contains(text(),'1 h 38 min')]"
}
