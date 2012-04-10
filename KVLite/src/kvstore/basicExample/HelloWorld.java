package kvstore.basicExample;

import java.util.List;
import oracle.kv.Key;
import oracle.kv.Value;
import oracle.kv.ValueVersion;

import java.util.ArrayList;

public class HelloWorld {

	private static List<String> majorComponents = new ArrayList<String>();
	private static List<String> minorComponents = new ArrayList<String>();
	private static KVStore kvstore = new KVStore();

	public static void main(String args[]) {

		HelloWorld h = new HelloWorld();
		
		majorComponents.add("Oliveira");
		majorComponents.add("Fenando");

		minorComponents.add("phonenumber");
		Key myKey = Key.createKey(majorComponents, minorComponents);
		kvstore.put(myKey, "2364 7979");
		kvstore.get(myKey);

		minorComponents.add("endereco");
		myKey = Key.createKey(majorComponents, minorComponents);
		kvstore.put(myKey, "Antonieta Leitao");
		kvstore.get(myKey);

	}


}
