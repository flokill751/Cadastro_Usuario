package usuarioapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import usuarioapp.model.TipoUsuario;
import usuarioapp.model.Usuario;
import usuarioapp.service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping //POST /usuario
    public Usuario criar (@RequestBody Usuario usuario) {
        return usuarioService.criar(usuario);
    }

    @GetMapping //GET / usuarios
    public List<Usuario> listar() {
        return usuarioService.listar();
    }

    @GetMapping("/{id}")
    public Usuario buscarPorId(@PathVariable Long id) {
        return usuarioService.buscarPorId(id);
    }

    @PutMapping("/usuarios{id}")
    public Usuario Atualizar(@PathVariable Long id, @RequestBody Usuario usuario)
    {
        return usuarioService.atualizar(id, usuario);
    }

    @PutMapping("/usuarios/{id}")
    public void deletar(@PathVariable Long id) {
        usuarioService.deletar(id);
    }

    @GetMapping("/filtro/{tipo}")

    public List<Usuario> filtrar(@PathVariable TipoUsuario tipo) {
        return usuarioService.filtarPorTipo(tipo);
    }

}
