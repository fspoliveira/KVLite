package kvstore.basicExample;

import java.util.List;
import oracle.kv.Key;
import oracle.kv.Value;
import oracle.kv.ValueVersion;

import java.util.ArrayList;


public class HelloWorld {

	
	static List<String> majorComponents = new ArrayList<String>();
	static List<String> minorComponents = new ArrayList<String>();
	static KVStore kvstore =  new KVStore();
		
	public static void main(String args[])
	{
	
		
		HelloWorld h = new HelloWorld();
		h.addFone();
		h.addEndereco();
		
		
	}
	
	
    public void addFone(){
    	
    	// Define the major and minor path components for the key
    			majorComponents.add("Smith");
    			majorComponents.add("Bob");		
    			minorComponents.add("phonenumber");
    			
    			// Create the key
    			Key myKey = Key.createKey(majorComponents, minorComponents);
    			
    			String data = "408 555 5555";
    		
    			
    			// Create the value. Notice that we serialize the contents of the
    			// String object when we create the value.
    			
    			Value myValue = Value.createValue(data.getBytes());
    			
    			// Now put the record. Note that we do not show the creation of the
    			// kvstore handle here.
    			kvstore.put(myKey, myValue);
    		  
    			
    			ValueVersion vv = kvstore.get(myKey);
    			Value v = vv.getValue();
    			String dados = new String(v.getValue());
    		
    			System.out.println(dados.toString());
    			
    	
    }
    
    public void addEndereco(){
    	// Define the major and minor path components for the key
		majorComponents.add("Smith");
		majorComponents.add("Bob");		
		minorComponents.add("endereco");
		
		// Create the key
		Key myKey = Key.createKey(majorComponents, minorComponents);
		
		String data = "CampoRedondo";
	
		
		// Create the value. Notice that we serialize the contents of the
		// String object when we create the value.
		
		Value myValue = Value.createValue(data.getBytes());
		
		// Now put the record. Note that we do not show the creation of the
		// kvstore handle here.
		kvstore.put(myKey, myValue);
	  
		
		ValueVersion vv = kvstore.get(myKey);
		Value v = vv.getValue();
		String dados = new String(v.getValue());
	
		System.out.println(dados.toString());
		
    	
    }
    



}
