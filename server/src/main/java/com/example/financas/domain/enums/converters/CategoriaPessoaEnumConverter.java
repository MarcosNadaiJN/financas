package com.example.financas.domain.enums.converters;

import com.example.financas.domain.enums.CategoriaPessoaEnum;
import com.example.financas.domain.enums.TipoPessoaEnum;
import com.example.financas.generic.enums.CodedEnumConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class CategoriaPessoaEnumConverter extends CodedEnumConverter<CategoriaPessoaEnum> {

    public CategoriaPessoaEnumConverter() {
        super(CategoriaPessoaEnum.class);
    }
}
