package com.fmunoz.API.dtos;

import com.fmunoz.API.validations.ValidDna;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MutantePruebaDto {
    @ValidDna
    private String[] dna;
}
