package com.sample.manytoone;

import com.sample.manytoone.model.User_info;
import com.sample.manytoone.model.Vehicle;
import com.sample.manytoone.repository.User_infoRepository;
import com.sample.manytoone.repository.VehicleRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ManyToOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
		SpringApplication.run(ManyToOneApplication.class, args);
		VehicleRepository vehicleRepository =
				configurableApplicationContext.getBean(VehicleRepository.class);
		User_infoRepository user_infoRepository =
				configurableApplicationContext.getBean(User_infoRepository.class);
		User_info user1 = new User_info("Ram");
		User_info user2 = new User_info("Raju");
		List<User_info> User =  Arrays.asList(user1,user2);
		Vehicle vehicle = new Vehicle("Bmw",User);
		VehicleRepository.save(vehicle);
	}

}
