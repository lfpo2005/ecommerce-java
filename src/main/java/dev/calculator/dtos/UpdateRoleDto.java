package dev.calculator.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.UUID;

@Data
public class UpdateRoleDto {
    @NotNull
    private UUID userId;
}