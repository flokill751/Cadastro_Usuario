package usuarioapp.service;


import org.springframework.beans.factory.annotation.Autowired;
import usuarioapp.model.TipoUsuario;
import usuarioapp.model.Usuario;
import usuarioapp.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario criar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listar(){
        return usuarioRepository.findAll();
    }

    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException ("Usuário nao encontado Pobre!!" + id));
    }

    public Usuario atualizar(Long id, Usuario usuarioAtualizado) {

        Usuario usuario = buscarPorId(id);
        usuario.setNome(usuarioAtualizado.getNome());
        usuario.setEmail(usuarioAtualizado.getEmail());
        usuario.setTipo(usuarioAtualizado.getTipo());
        return usuarioRepository.save(usuario);
    }

    public void deletar(Long id){
        usuarioRepository.deleteById(id);
    }

    public List<Usuario> filtarPorTipo(TipoUsuario tipo){
        return listar().stream()
                .filter(u -> u.getTipo() == tipo)
                .collect(Collectors.toList());
    }

}
