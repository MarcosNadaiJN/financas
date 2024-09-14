package com.example.financas.domain.enums.converters;

import com.example.financas.domain.enums.SexoPessoaEnum;
import com.example.financas.domain.enums.TipoContaBancariaEnum;
import com.example.financas.generic.enums.CodedEnumConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class TipoContaBancariaEnumConverter extends CodedEnumConverter<TipoContaBancariaEnum> {

    public TipoContaBancariaEnumConverter() {
        super(TipoContaBancariaEnum.class);
    }
}
