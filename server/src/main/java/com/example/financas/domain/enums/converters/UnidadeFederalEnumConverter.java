package com.example.financas.domain.enums.converters;

import com.example.financas.domain.enums.TipoPessoaEnum;
import com.example.financas.domain.enums.UnidadeFederalEnum;
import com.example.financas.generic.enums.CodedEnumConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class UnidadeFederalEnumConverter extends CodedEnumConverter<UnidadeFederalEnum> {

    public UnidadeFederalEnumConverter() {
        super(UnidadeFederalEnum.class);
    }
}
