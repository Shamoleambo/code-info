package com.tidz.code_info;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tidz.code_info.model.Programmer;
import com.tidz.code_info.model.ProgrammingLanguage;
import com.tidz.code_info.model.Seniority;
import com.tidz.code_info.repository.AppDAO;

@SpringBootApplication
public class CodeInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeInfoApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(AppDAO appDAO) {
		return runner -> {
			updateProgrammer(appDAO);
		};
	}

	private void updateProgrammer(AppDAO appDAO) {
		Long id = 1L;
		Programmer programmer = appDAO.findProgrammerById(id);

		ProgrammingLanguage lang = new ProgrammingLanguage("C#");

		System.out.println("Before: " + programmer);
		programmer.setCompany("Le codé");
		programmer.setPosition("ULTRA programmer");
		programmer.addProgrammingLanguage(lang);
		programmer.setSeniority(Seniority.SENIOR_ANALIST);

		appDAO.update(programmer);
		System.out.println("After: " + programmer);
		System.out.println("Done!");

	}

	public void findProgrammer(AppDAO appDAO) {
		Long id = 1L;
		Programmer programmer = appDAO.findProgrammerById(id);

		System.out.println(programmer);
	}

	public void saveProgrammer(AppDAO appDAO) {
		Programmer programmer = new Programmer("Mano", "Maneiro", "Firma", Seniority.JUNIOR_ANALIST, "Mega Programmer",
				2);

		ProgrammingLanguage language1 = new ProgrammingLanguage("Java");
		ProgrammingLanguage language2 = new ProgrammingLanguage("JavaScript");
		ProgrammingLanguage language3 = new ProgrammingLanguage("Python");

		programmer.addProgrammingLanguage(language1);
		programmer.addProgrammingLanguage(language2);
		programmer.addProgrammingLanguage(language3);

		appDAO.save(programmer);

		System.out.println("Programmer: " + programmer);
		System.out.println("Lang1: " + language1);
		System.out.println("Lang2: " + language2);
		System.out.println("Lang3: " + language3);

		System.out.println("Done");
	}

}
