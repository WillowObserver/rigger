package wang.lei.rigger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RiggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RiggerApplication.class, args);
		System.out.print("__________\n" +
				         "|   __   \\\n" +
				         "|  |  |   )                       _   __\n"+
				         "|  |__|  /      Rigger 启动成功   | | / /\n"+
				         "|   __   \\    .  __   __   ___   | |/ /\n"+
				         "|  |  \\   \\   | |_|  |_|  |__|   |  ./\n"+
				         "|__|   \\___\\  | __|  __|  |___   |_|\n");
	}
}
