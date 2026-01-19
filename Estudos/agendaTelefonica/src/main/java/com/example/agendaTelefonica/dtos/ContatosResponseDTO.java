package com.example.agendaTelefonica.dtos;

import jakarta.validation.constraints.NotNull;

public record ContatosResponseDTO(long id, @NotNull String nome, @NotNull String numero) {
}
