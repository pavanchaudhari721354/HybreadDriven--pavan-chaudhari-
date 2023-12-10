package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropOperation {
	private Properties prop;
	
	public PropOperation(String filepath) throws IOException {
		File file = new File(filepath);
		FileInputStream inputstream = new FileInputStream(file);
		prop = new Properties();
		prop.load(inputstream);
		
		
	}

}
