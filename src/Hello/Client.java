package Hello;

import java.util.*;

public class Client {

	public static void main(String[] args) {
        DatasetReader datasetReader = new DatasetReader();
        String str=System.getProperty("user.dir");
        List<Book> books = datasetReader.readDataset(str+ "/data.csv");
        
      

        // Print details of all Book objects
        for (Book book : books) {
            book.printDetails();
        }
    }
}
