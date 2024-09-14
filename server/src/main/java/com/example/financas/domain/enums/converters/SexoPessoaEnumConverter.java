package com.example.financas.domain.enums.converters;

import com.example.financas.domain.enums.FormaDePagamentoEnum;
import com.example.financas.domain.enums.SexoPessoaEnum;
import com.example.financas.generic.enums.CodedEnumConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class SexoPessoaEnumConverter extends CodedEnumConverter<SexoPessoaEnum> {

    public SexoPessoaEnumConverter() {
        super(SexoPessoaEnum.class);
    }
}
