package com.example.financas.generic.enums;

import jakarta.persistence.AttributeConverter;

public class CodedEnumConverter<E extends Enum<E> & CodedEnum> implements AttributeConverter<E, String> {

    private final Class<E> enumType;

    public CodedEnumConverter(Class<E> enumType) {
        this.enumType = enumType;
    }

    @Override
    public String convertToDatabaseColumn(E enumValue) {
        return enumValue != null ? enumValue.getCodigo() : null;
    }

    @Override
    public E convertToEntityAttribute(String dbData) {
        for(E enumConstant : enumType.getEnumConstants()) {
            if (enumConstant.getCodigo().equals(dbData)) {
                return enumConstant;
            }
        }
        return null;
    }
}
