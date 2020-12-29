package br.com.lumini.avaliacao.demodata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import br.com.lumini.avaliacao.enums.UFEnum;
import br.com.lumini.avaliacao.model.JuridicAddress;
import br.com.lumini.avaliacao.model.User;
import br.com.lumini.avaliacao.repository.JuridicAddressRepository;
import br.com.lumini.avaliacao.repository.UserRepository;

@Component
public class DemoData {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private JuridicAddressRepository juridicAddressRepository;
	
	@EventListener
	public void onAppReady(ApplicationReadyEvent event) {
		userRepository.save(new User("Teste", "teste@teste.com", new BCryptPasswordEncoder().encode("Abc123")));
		juridicAddressRepository.save(new JuridicAddress("64672967000100", "74353220", "Rua Presidente John Adams", "123", null, "Jardim Presidente", "Goiânia", UFEnum.GO));
		juridicAddressRepository.save(new JuridicAddress("82646510000103", "79645506", "Rua José Amim", "987", null, "Jardim Oiti", "Três Lagoas", UFEnum.MS));
		juridicAddressRepository.save(new JuridicAddress("64221738000161", "69029470", "Rua Francisco Sampaio", "654", "1A", "Santo Antônio", "Manaus", UFEnum.AM));
		juridicAddressRepository.save(new JuridicAddress("99653654000181", "68908873", "Rua Doze de Dezembro", "5B", null, "Infraero", "Macapá", UFEnum.AP));
		juridicAddressRepository.save(new JuridicAddress("32052494000144", "75143815", "Rua 05", "159", "201", "Residencial Valência", "Anápolis", UFEnum.GO));
		juridicAddressRepository.save(new JuridicAddress("98752390000150", "72710035", "Área Especial 3 Conjunto D", "29", "Fundos", "Setor Norte (Brazlândia)", "Brasília", UFEnum.DF));
		juridicAddressRepository.save(new JuridicAddress("23142947000132", "58419370", "Rua Luzia Gaudêncio de Queiroz", "753", "103", "Velame", "Campina Grande", UFEnum.PB));
		juridicAddressRepository.save(new JuridicAddress("08101574000168", "06695140", "Rua São Roque", "486", null, "Jardim Portela", "Itapevi", UFEnum.SP));
		juridicAddressRepository.save(new JuridicAddress("48761456000109", "74993620", "Rua Valparaíso", "426", null, "Setor Buenos Aires - 1ª Etapa", "Aparecida de Goiânia", UFEnum.GO));
		juridicAddressRepository.save(new JuridicAddress("96630662000114", "04335030", "Rua Rosentino de Sousa", "753", "12A", "Americanópolis", "São Paulo", UFEnum.SP));
	}

}
