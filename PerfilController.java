package es.teod.familiasec.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app/perfiles")
public class PerfilController {
	
	@GetMapping("/todos") 
		public String todosUsuarios(Model model) {
			model.addAttribute("mensaje", "Listado de perfiles");
			return "pruebas";
				
		}
	 

}
