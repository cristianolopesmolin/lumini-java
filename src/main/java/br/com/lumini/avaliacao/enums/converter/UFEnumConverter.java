package br.com.lumini.avaliacao.enums.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import br.com.lumini.avaliacao.enums.UFEnum;

@Converter(autoApply = true)
public class UFEnumConverter implements AttributeConverter<UFEnum, Integer>{

	@Override
	public Integer convertToDatabaseColumn(UFEnum uf) {
		return uf != null ? uf.getCod() : null;
	}

	@Override
	public UFEnum convertToEntityAttribute(Integer ufCod) {
		return ufCod == null ? null : UFEnum.getUFbyCod(ufCod);
	}

}
