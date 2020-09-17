package com.careerit.javatojson;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Product{
	
	private int pid;
	private String name;
	private double price;
	
}

// https://www.baeldung.com/jackson-object-mapper-tutorial
public class JavaJsonTest {

		@Test
		void convertToJsonFile() {
			Product product = new Product(1001,"Lenovo Thinkpad",45000);
			ObjectMapper mapper = new ObjectMapper();
			try {
				String jsonData = mapper.writeValueAsString(product);
				System.out.println(jsonData);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Test
		void readJsonFromFile() {
			
			ObjectMapper mapper = new ObjectMapper();
			try {
				List<Product> list = mapper.readValue(new File("product.json"),new TypeReference<List<Product>>() {});
				list.stream().forEach(System.out::println);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
