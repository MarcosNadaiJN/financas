package com.example.financas.domain.enums.converters;

import com.example.financas.domain.enums.CategoriaPessoaEnum;
import com.example.financas.domain.enums.FormaDePagamentoEnum;
import com.example.financas.generic.enums.CodedEnumConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class FormaDePagamentoEnumConverter extends CodedEnumConverter<FormaDePagamentoEnum> {

    public FormaDePagamentoEnumConverter() {
        super(FormaDePagamentoEnum.class);
    }
}
