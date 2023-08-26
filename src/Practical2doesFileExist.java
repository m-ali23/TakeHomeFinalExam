import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Practical2doesFileExist {

	public static void main(String[] args) throws IOException {
		List<String> myList = new ArrayList<String>();

		String path = "data\\File.txt";

		File file = new File(path);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		// Check if the specified file Exists or not

		if (file.exists()) {

			System.out.println("File Exists");
		} else

			System.out.println("File Does not Exists");
		String line = null;
		while ((line = br.readLine()) != null) {
			myList.add(line);
		}
		for (int i = 0; i < myList.size(); i++) {
			if (i == 2) {
				continue;
			}

			System.out.println(myList.get(i));

		}

	}// end of main
}//end of class
