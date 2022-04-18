package com.example.historyProduct;

import com.example.historyProduct.domain.History;
import com.example.historyProduct.domain.User;
import com.example.historyProduct.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class HistoryProductApplication implements CommandLineRunner {
    @Autowired
    UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(HistoryProductApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
		User user = userService.findOneUserByUserName("khanh2");
		List<History> historyList = user.getHistoryList();
		for (int i = 0; i < historyList.size(); i++){
			System.out.println(historyList.get(i).toString());
		}
    }
}
