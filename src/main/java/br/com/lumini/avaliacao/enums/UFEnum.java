package br.com.lumini.avaliacao.enums;

import lombok.Getter;

@Getter
public enum UFEnum {
	
	AC(0, "AC", "Acre"),
	AL(1, "AL", "Alagoas"),
	AP(2, "AP", "Amapá"),
	AM(3, "AM", "Amazonas"),
	BA(4, "BA", "Bahia"),
	CE(5, "CE", "Ceará"),
	DF(6, "DF", "Distrito Federal"),
	ES(7, "ES", "Espírito Santo"),
	GO(8, "GO", "Goiás"),
	MA(9, "MA", "Maranhão"),
	MT(10, "MT", "Mato Grosso"),
	MS(11, "MS", "Mato Grosso do Sul"),
	MG(12, "MG", "Minas Gerais"),
	PA(13, "PA", "Pará"),
	PB(14, "PB", "Paraíba"),
	PR(15, "PR", "Paraná"),
	PE(16, "PE", "Pernambuco"),
	PI(17, "PI", "Piauí"),
	RJ(18, "RJ", "Rio de Janeiro"),
	RN(19, "RN", "Rio Grande do Norte"),
	RS(20, "RS", "Rio Grande do Sul"),
	RO(21, "RO", "Rondônia"),
	RR(22, "RR", "Roraima"),
	SC(23, "SC", "Santa Catarina"),
	SP(24, "SP", "São Paulo"),
	SE(25, "SE", "Sergipe"),
	TO(26, "TO", "Tocantins");
	
	private Integer cod;
	private String shortName;
	private String fullName;
	
	private UFEnum(final Integer cod, final String shortName, final String fullName) {
		this.cod = cod;
		this.shortName = shortName;
		this.fullName = fullName;
	}
	
	public static UFEnum getUFbyCod(final Integer cod) {
		for (UFEnum uf : UFEnum.values()) {
			if(uf.getCod().equals(cod)) {
				return uf;
			}
		}
		return null;
	}

}
