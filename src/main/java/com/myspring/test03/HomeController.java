package com.myspring.test03;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@Autowired
	StudentController controller;
	@Autowired
	StudentSelect stSelect;
	@Autowired
	StudentInsert stInsert;
	@Autowired
	StudentSelectAll stAll;
	@Autowired
	StudentUpdate stUpdate;
	@Autowired
	StudentDelete stDelete;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			stAll.printAll();

			System.out.println("[학생 컨트롤러]");
			System.out.println("(1)추가");
			System.out.println("(2)수정");
			System.out.println("(3)삭제");
			System.out.println("(0)종료");
			
			int choice = scan.nextInt();
			
			if(choice == 1) { 
				Student student = new Student();

				student.setNum(stSelect.getLastNumber() + 1);
				
				System.out.println("[추가]아이디를 입력하세요.");
				student.setId(scan.next());

				System.out.println("[추가]패스워드를 입력하세요.");
				student.setPw(scan.next());
				
				stInsert.insert(student);
			}
			else if(choice == 2) {
				// 비밀번호 수정하기 기능
				System.out.println("[수정]아이디를 입력하세요.");
				String id = scan.next();

				Student student = stSelect.select(id);
				
				if(student != null) {
					System.out.println("[수정]수정할 패스워드를 입력하세요.");
					String pw = scan.next();
					student.setPw(pw);
					
					stUpdate.update(student);
				}
			}
			else if(choice == 3) {
				// 직접 구현해보세요.
				System.out.println("[삭제]아이디를 입력하세요.");
				String id = scan.next();
				
				Student student = stSelect.select(id);
				
				if(student != null) {
					stDelete.delete(id);
					System.out.println("[메세지]삭제되었습니다.");
				}
			}
			else if(choice == 0) { break; }
		}
		
		return "home";
	}
	
}
