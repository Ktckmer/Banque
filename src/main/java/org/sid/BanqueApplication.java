package org.sid;

import org.sid.dao.ClientRepository;
import org.sid.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BanqueApplication implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BanqueApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Client c1 = clientRepository.save(new Client("Cedrick", "kamsicdrick@gmail.com"));
		Client c2 = clientRepository.save(new Client("Corine", "corine@cedrick.fr"));
		Client c3 = clientRepository.save(new Client("Boris", "boris@cedrick.fr"));
				
	}
}

