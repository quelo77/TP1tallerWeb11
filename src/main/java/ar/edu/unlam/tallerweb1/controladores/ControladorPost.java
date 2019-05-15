package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorPost {
//	@RequestMapping(path="/form-post", method=RequestMethod.GET)
//	public ModelAndView irAFormPruebaPost() {
//		Operaciones formulario= new Operaciones();
//		ModelMap modelo= new ModelMap();
//		modelo.put("formulario", formulario);
//		return new ModelAndView("form-post",modelo);
//		
//	}
//	@RequestMapping(path="operaciones", method=RequestMethod.POST)
//	public ModelAndView sumaSimple(@ModelAttribute("formulario")Operaciones s) {
//		ModelMap modelo= new ModelMap();
//		if(s.getOperar()==null){
//			modelo.put("error", "Solo pueden ingresarse numeros");
//			return new ModelAndView("form-post", modelo);
//		}
//		modelo.put("formulario", s);
//		return new ModelAndView("exit-post",modelo);
//		
//	}
//	
//	
//	@RequestMapping(path="exit-post",method=RequestMethod.GET)
//	public ModelAndView irAExitPrueba() {
//		return new ModelAndView("exit-post");
//	}
//	
	@RequestMapping(path="/form-post", method=RequestMethod.GET)
	public ModelAndView irAFormPruebaPost() {
		
		ModelMap modelo= new ModelMap();
		return new ModelAndView("form-post",modelo);
	}	
	@RequestMapping(path="exit-post",method=RequestMethod.GET)
	public ModelAndView irAExitPrueba() {
		return new ModelAndView("exit-post");
	}
	@RequestMapping("/form-post/{tipoOperacion}/{texto}")
	public ModelAndView realizarOperacion(@PathVariable("tipoOperacion") String operacionDeseada, 
									      @PathVariable("texto") String cadenaRecibida
									      ) {
		
		ModelMap modelo = new ModelMap();
		modelo.put("tipoOperacion", operacionDeseada);
		modelo.put("texto", cadenaRecibida);
		
		if(operacionDeseada.equalsIgnoreCase("pasarAMayuscula")) {
			String resultado = cadenaRecibida.toUpperCase();
			modelo.put("resultado", resultado);
			return new ModelAndView("form-post", modelo);
		}
		
		if(operacionDeseada.equalsIgnoreCase("pasarAMinuscula")) {
			String resultado = cadenaRecibida.toLowerCase();
			modelo.put("resultado", resultado);
			return new ModelAndView("form-post", modelo);
		}
		
		if(operacionDeseada.equalsIgnoreCase("invertirOrden")) {
			String resultado = "";
			for (int x=cadenaRecibida.length()-1;x>=0;x--) {
				resultado = resultado + cadenaRecibida.charAt(x);
			}
			modelo.put("resultado", resultado);
			return new ModelAndView("form-post", modelo);
		}
		
		if(operacionDeseada.equalsIgnoreCase("cantidadDeCaracteres")) {
			Integer resultado = cadenaRecibida.length();
			modelo.put("resultado", resultado);
			return new ModelAndView("form-post", modelo);
		}
		
		//Si la operación indicada no existe, muestro pantalla de error
		return new ModelAndView("exit-post", modelo);
}

}
