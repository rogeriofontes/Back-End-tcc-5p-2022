package br.com.stagiun.tccstagiun.model.service.impl;

import br.com.stagiun.tccstagiun.model.domain.Idioma;
import br.com.stagiun.tccstagiun.model.repository.IdiomaRepository;
import br.com.stagiun.tccstagiun.model.service.IdiomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IdiomaServiceImpl implements IdiomaService {

    @Autowired
    private IdiomaRepository idiomaRepository;

    @Override
    public Idioma salvar(Idioma idioma) {
        return idiomaRepository.save(idioma);
    }

    @Override
    public Idioma editar(Long id, Idioma idioma) {
        idioma.setId(id);
        return idiomaRepository.save(idioma);
    }

    @Override
    public List<Idioma> list() {
        return idiomaRepository.findAll();
    }

    @Override
    public Optional<Idioma> findById(Long id) {
        return idiomaRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        idiomaRepository.deleteById(id);
    }
}
