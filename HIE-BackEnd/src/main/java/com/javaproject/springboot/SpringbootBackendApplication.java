package com.javaproject.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javaproject.springboot.model.ServiceProvider;
import com.javaproject.springboot.repository.ServiceProviderRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	@Autowired
	private ServiceProviderRepository serviceProviderRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		this.serviceProviderRepository.save(new ServiceProvider("Kamala Nehru Memorial Hospital,\n"
				+ "Hashimpur Road, Tagore Town\n"
				+ "Allahabad-211002","Hospital","edp.knmh@gmail.com","0532-2466666"));
		this.serviceProviderRepository.save(new ServiceProvider("Nazreth Hospital - 13-A Kamla Nehru Marg, Near Hathi Park, Allahabad",
				"Hospital","nazarethhospital@rediffmail.com","(0532)2600430, 2601796"));
		this.serviceProviderRepository.save(new ServiceProvider("Tej Bahadur Sapru Hospital - Stainley Road, Allahabad",
				"Hospital","(0532)2642687"));
		this.serviceProviderRepository.save(new ServiceProvider("Narayani Ashram Hospital - Shivkuti, Allahabad-211004",
				"Hospital","(0532)2541630"));
		this.serviceProviderRepository.save(new ServiceProvider("JYOTI AMBULANCE SERVICES, Prayagraj",
				"Ambulance","jyotiambulance@gmail.com", "9654232540, 9990228876"));
		this.serviceProviderRepository.save(new ServiceProvider("Heartline Cardiac Care Hospital - 14/18, Elgin Road, Allahabad",
				"Hospital","(0532)2601903, 2607803"));
		this.serviceProviderRepository.save(new ServiceProvider("Alka Hospital - 42/17-A, Church Lane, Allahabad",
				"Hospital"," (0532)2465464"));
		this.serviceProviderRepository.save(new ServiceProvider("Ajay Brother Gases - GT Road, Near Thana Puramufti, Allahabad",
				"Oxygen Cylinders","9839094543, 9918547334"));
		this.serviceProviderRepository.save(new ServiceProvider("Narayan Gas Service - Chak Raghunath, Naini, Prayagraj",
				"Oxygen Cylinders",
				"narayangroup02@gmail.com","7233881234, 9696941234"));
		this.serviceProviderRepository.save(new ServiceProvider("Lions Club Prayagraj", "Oxygen Cylinder", "9794758380, 6393889983"));
		this.serviceProviderRepository.save(new ServiceProvider("Matrix HealthCare - Civil Lines", "Oxygen Cylinder", "7947439572"));
		this.serviceProviderRepository.save(new ServiceProvider("Dynamic Enterprises-Phaphamau, Prayagraj",
				"Oxygen Cylinder", "7947152610"));
		
		this.serviceProviderRepository.save(new ServiceProvider("VIJAY AMBULANCE SERVICE, Prayagraj",
				"Ambulance","vijaypratap1176@gmail.com", "9452543035, 7080813035"));
		this.serviceProviderRepository.save(new ServiceProvider("JOHN AMBULANCE SERVICE - 16D Hamilton Road George Town\n"
				+ "Prayagraj-211002\n",
				"Ambulance", "nishantjohn8881@gmail.com", "094150 18413"));
		this.serviceProviderRepository.save(new ServiceProvider("Jain Hospital - 61 Lowther Road, Allahabad",
				"Hospital","(0532)2612345, 2600820"));
		this.serviceProviderRepository.save(new ServiceProvider("Sarvodaya Hospital - 24/28, George Town, Allahabad",
				"Hospital","(0532)2460213"));
		this.serviceProviderRepository.save(new ServiceProvider("Moti Lal Nehru Hospital - Colvin Road, Allahabad",
				"Hospital","(0532)2652141, 2654546"));
		this.serviceProviderRepository.save(new ServiceProvider("Northern RailwayHospital - Near Railway Station, Allahabad",
				"Hospital","(0532)2624085"));
	}

}
