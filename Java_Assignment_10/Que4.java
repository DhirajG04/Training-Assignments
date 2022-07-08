package Java_Assignment_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Que4 {

	public static void main(String[] args) {
		
		var path="C:\\Users\\DHIRGAIK\\Desktop\\Java Assign\\StudentList.txt";

		try {
			String data=Files.readString(Path.of(path));
			
			List<String> s=data.lines()
					.map(t->t.trim())
					.collect(Collectors.toList());
			
			s.stream().filter(t->!t.isBlank())
				.forEach(t->System.out.println(t+" "));
			
			System.out.println();
			
			long count=s.stream().filter(t->!t.isBlank()).count();
			
			System.out.println(count);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
