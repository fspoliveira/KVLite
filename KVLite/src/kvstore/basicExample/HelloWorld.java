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
		h.addValue(myKey, "2364 7979");
		h.getValue(myKey);

		minorComponents.add("endereco");
		myKey = Key.createKey(majorComponents, minorComponents);
		h.addValue(myKey, "Antonieta Leitao");
		h.getValue(myKey);

	}

	public void addValue(Key key, String data) {

		Value myValue = Value.createValue(data.getBytes());		
		kvstore.put(key, myValue);
	}
	
	public void getValue(Key key){

		ValueVersion vv = kvstore.get(key);
		Value v = vv.getValue();		
		String dados = new String(v.getValue());
		System.out.println(dados.toString());
		

	}

}
