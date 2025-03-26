package Api.ApiDoProjeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AutenticacaoController {

    // Página de Login
    @GetMapping("/login")
    public String mostrarPaginaLogin(Model model) {
        return "autenticacao/login";
    }

    // Página "Esqueci Senha" (GET)
    @GetMapping("/esqueci-senha")
    public String mostrarPaginaEsqueciSenha(Model model) {
        return "autenticacao/esqueci-senha";
    }

    // Processar "Esqueci Senha" (POST - exemplo futuro)
    // @PostMapping("/esqueci-senha")
    // public String processarEsqueciSenha(String email, Model model) {
        // Lógica para enviar e-mail de recuperação (implemente depois)
    //     return "redirect:/auth/login?success";
    // }
}