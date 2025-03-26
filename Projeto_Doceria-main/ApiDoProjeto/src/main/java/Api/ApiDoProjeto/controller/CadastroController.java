package Api.ApiDoProjeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Api.ApiDoProjeto.model.cadastro.CadastroModel;
import Api.ApiDoProjeto.model.cadastro.CadastroRepository;

@Controller
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    private CadastroRepository repository;

    // Endpoint de acesso a página de cadastro
    @GetMapping
    public String carregarPaginaCadastro(Model model) {
        model.addAttribute("cadastro", new CadastroModel());
        return "cadastro/cadastro";
    }

    // Método que grava as informações do cadastro
    @PostMapping
    public String salvarCadastro(CadastroModel cadastro) {
        repository.save(cadastro);
        return "redirect:/";
    }

    // Método para listagem dos usuários cadastrados
    @GetMapping("/listagem")
    public String carregarPaginaListagem(Model model) {
        model.addAttribute("cadastros", repository.findAll());
        return "atendente/listar_usuarios";
    }

}
