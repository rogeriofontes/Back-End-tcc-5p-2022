package br.com.stagiun.tccstagiun.model.service.impl;

import br.com.stagiun.tccstagiun.model.domain.Vaga;
import br.com.stagiun.tccstagiun.model.repository.VagaRepository;
import br.com.stagiun.tccstagiun.model.service.VagaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VagaServiceImpl implements VagaService {

    @Autowired
    private VagaRepository vagaRepository;

    @Override
    public Vaga salvar(Vaga vaga) {
        return vagaRepository.save(vaga);
    }

    @Override
    public Vaga editar(Long id, Vaga vaga) {
        vaga.setId(id);
        return vagaRepository.save(vaga);
    }

    @Override
    public List<Vaga> list() {
        return vagaRepository.findAll();
    }

    @Override
    public Optional<Vaga> findById(Long id) {
        return vagaRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        vagaRepository.deleteById(id);
    }
}
