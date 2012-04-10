package kvstore.basicExample;

import oracle.kv.KVStoreConfig;
import oracle.kv.KVStoreFactory;
import oracle.kv.Key;
import oracle.kv.Value;
import oracle.kv.ValueVersion;

public class KVStore {
	
	ValueVersion vv;
		
	public void put(Key myKey, String data) {
		// TODO Auto-generated method stub
		
		Value myValue = Value.createValue(data.getBytes());	
		String[] hhosts = {"localhost:5000"};
		KVStoreConfig kconfig = new KVStoreConfig("kvstore", hhosts);
		oracle.kv.KVStore kvstore = KVStoreFactory.getStore(kconfig);
		kvstore.put(myKey, myValue);
		
	}

	public void get(Key key) {
		// TODO Auto-generated method stub
		
		String[] hhosts = {"localhost:5000"};
		KVStoreConfig kconfig = new KVStoreConfig("kvstore", hhosts);
		oracle.kv.KVStore kvstore = KVStoreFactory.getStore(kconfig);
		
		ValueVersion vv = kvstore.get(key);
		Value v = vv.getValue();		
		String dados = new String(v.getValue());
		System.out.println(dados.toString());
	}
		
		

}
