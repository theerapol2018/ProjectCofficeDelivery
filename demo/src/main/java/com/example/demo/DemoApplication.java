package com.example.demo;

import com.example.demo.entity.Manu;
import com.example.demo.entity.Member;
import com.example.demo.entity.ServiceType;
import com.example.demo.repository.ManuRepository;
import com.example.demo.repository.MemberRepository;
import com.example.demo.repository.ServiceTypeRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



	@Bean
	ApplicationRunner init(ManuRepository manuRepository, MemberRepository memberRepository, ServiceTypeRepository serviceTypeRepository) {
		return args -> {
			Stream.of("กาแฟโบราฯ", "การแฟที่ขมมาก","ลาเต้").forEach(name->

			{


				{
					Manu rec = new Manu();
					rec.setName(name);

					if(name == "กาแฟโบราฯ"){
						rec.setPrice(150);

						manuRepository.save(rec);
					}else if(name == "การแฟที่ขมมาก")
					{
						rec.setPrice(152);
						manuRepository.save(rec);

					}else if(name == "ลาเต้")
					{
						rec.setPrice(151);
						manuRepository.save(rec);
					}


				}

			});
/////////////////////////////////////////////////////////////////////////
			for (String name : Arrays.asList("คนธรรมดา", "คนธรรมดากว่า", "คนเฉยๆๆ")) {
				{
					Member member = new Member();
					member.setNameM(name);

					if (name == "คนธรรมดา") {
						member.setTel("2222222150");
						member.setEmail("dfsafsda");
						member.setAddress("home");
						member.setProvince("Udon");
						member.setSex("F");
						memberRepository.save(member);
					} else if (name == "คนธรรมดากว่า") {
						member.setTel("2222222150");
						member.setEmail("dfsafsda");
						member.setAddress("home");
						member.setProvince("Udon");
						member.setSex("F");
						memberRepository.save(member);

					} else if (name == "คนเฉยๆๆ") {
						member.setTel("2222222150");
						member.setEmail("dfsafsda");
						member.setAddress("home");
						member.setProvince("Udon");
						member.setSex("F");
						memberRepository.save(member);
					}


				}

			}
/////////////////////////////////////////////////////////////////////////

			Stream.of("Delivery", "Takeaway").forEach(typeName-> {

				{
					ServiceType serviceType = new ServiceType();
					serviceType.setService(typeName);
					serviceTypeRepository.save(serviceType);

				}

			});








		};
	}


}

