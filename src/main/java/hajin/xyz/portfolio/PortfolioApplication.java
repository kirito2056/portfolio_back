package hajin.xyz.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}

}

/*

	사이드 프로젝트는 패키지별로 entity, repository, controller 관리
	메인 repository 없음 General에 있는 Repo, Entity 삭제 예정
	사실 그냥 DB 없이 대충 해도 되긴 함

	sideproject package에 package 생성 후 프론트 작업
	html은 api로 반환 + react는 front 깃헙 레포에서 관리
	static에서 관리? 해야하나?
	React HTML View -> XSS방지
	Security - CORS + "/*"



 */