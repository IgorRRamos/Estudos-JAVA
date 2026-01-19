package com.example.agendaTelefonica.service;
import com.example.agendaTelefonica.domain.Contato;
import com.example.agendaTelefonica.dtos.ContatosRequestsDTO;
import com.example.agendaTelefonica.dtos.ContatosResponseDTO;
import com.example.agendaTelefonica.repository.ContatoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service //Marca a classe como servico/negocio da aplicacao.
public class ContatoService {

    private final ContatoRepository repository;
    public ContatoService(ContatoRepository repository){
        this.repository = repository;
    }

    public ContatosResponseDTO create(ContatosRequestsDTO dto){
        Contato contato = new Contato();

        contato.setNome(dto.nome());
        contato.setNumero(dto.numero());

        Contato saved = repository.save(contato);

        return new ContatosResponseDTO(
                saved.getId(),
                saved.getNome(),
                saved.getNumero()
        );
    }
    public Page<ContatosResponseDTO> list(Pageable pageable){
        return repository.findAll(pageable).map(contato -> new ContatosResponseDTO(
                contato.getId(),
                contato.getNome(),
                contato.getNumero()
        ));
    }

}
