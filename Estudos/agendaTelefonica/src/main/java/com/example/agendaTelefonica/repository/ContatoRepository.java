package com.example.agendaTelefonica.repository;
import com.example.agendaTelefonica.domain.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
