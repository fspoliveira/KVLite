package kvstore.basicExample;

import oracle.kv.KVStoreConfig;
import oracle.kv.KVStoreFactory;
import oracle.kv.Key;
import oracle.kv.Value;
import oracle.kv.ValueVersion;

public class KVStore {
	
	ValueVersion vv;
		
	public void put(Key myKey, Value myValue) {
		// TODO Auto-generated method stub
		String[] hhosts = {"localhost:5000"};
		KVStoreConfig kconfig = new KVStoreConfig("kvstore", hhosts);
		oracle.kv.KVStore kvstore = KVStoreFactory.getStore(kconfig);
		kvstore.put(myKey, myValue);
		
	}

	public ValueVersion get(Key myKey) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String[] hhosts = {"localhost:5000"};
		KVStoreConfig kconfig = new KVStoreConfig("kvstore", hhosts);
		oracle.kv.KVStore kvstore = KVStoreFactory.getStore(kconfig);
		return kvstore.get(myKey);
	}

}
