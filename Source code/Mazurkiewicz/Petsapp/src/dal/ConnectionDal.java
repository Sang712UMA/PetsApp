package dal;

public class ConnectionDal {

	MongoClientURI uri = new MongoClientURI(
			"mongodb+srv://halkidiki:<petsapp1234>@petapp-suohs.mongodb.net/test?retryWrites=true");

	MongoClient mongoClient = new MongoClient(uri);
	MongoDatabase database = mongoClient.getDatabase("test");

}
