import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class MongoDBConnection {

    public static void main(String[] args) {

        String connectionString = "mongodb://localhost:27017";

        try (MongoClient mongoClient = MongoClients.create(connectionString)) {

            System.out.println("Connected to MongoDB successfully!");

        } catch (Exception e) {

            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}