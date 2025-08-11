package Com.Wipro.Threads;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;

public class ImageCopy {
	public static void main(String[] args) {
		// ✅ Make sure to use double backslashes \\ in file paths
		String sourcePath = "C:\\Users\\91868\\OneDrive\\Pictures\\Screenshot_2024_0109_131854.jpg";
		String destinationPath = "C:\\Users\\91868\\OneDrive\\Pictures\\Screenshot_Copy.jpg";

		File sourceFile = new File(sourcePath);

		// Check if file exists
		if (!sourceFile.exists()) {
			System.out.println("❌ Source image not found at: " + sourcePath);
			return;
		}

		try (FileInputStream fis = new FileInputStream(sourceFile);
				FileOutputStream fos = new FileOutputStream(destinationPath);) {
			int byteData;
			while ((byteData = fis.read()) != -1) {
				fos.write(byteData);
			}

			System.out.println("✅ Image copied successfully to: " + destinationPath);
		} catch (IOException e) {
			System.out.println("❌ Error during image copy: " + e.getMessage());
		}
	}
}
