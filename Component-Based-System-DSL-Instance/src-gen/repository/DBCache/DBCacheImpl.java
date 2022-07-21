package repository.DBCache;

import repository.IAudioDB;
import repository.Helper;

public class DBCacheImpl implements IAudioDB {
	IAudioDB iAudioDB;
	
	public void setIAudioDB(IAudioDB iAudioDB){
		Helper.assertNotNull(this.iAudioDB);
		this.iAudioDB = iAudioDB;
	}
	
	//Implementing queryDB from interface IAudioDB
	@Override
	public int queryDB(int param1){
		Helper.assertNotNull(this.iAudioDB);
		// TODO: insert code here
	}
	
	//Implementing addFile from interface IAudioDB
	@Override
	public int addFile(){
		Helper.assertNotNull(this.iAudioDB);
		// TODO: insert code here
	}
	
}
