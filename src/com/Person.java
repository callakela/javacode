package com;

import java.util.List;

public class Person {
	 private String name;
	   private List<String> languages;

	   public Person(String name, List<String> languages) {
	      this.name = name;
	      this.languages = languages;
	   }

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	   public List<String> getLanguages() {
	      return languages;
	   }

	   public void setLanguages(List<String> languages) {
	      this.languages = languages;
	   }
}
