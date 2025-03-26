package Api.ApiDoProjeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {
    
    @GetMapping
    public String carregarPaginaCategorias() {
        return "categorias";
    }

}
