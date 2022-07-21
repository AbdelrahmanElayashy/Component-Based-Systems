package repository.MediaManager;

import repository.ISound;
import repository.Helper;

public class MediaManagerImpl implements IMediaStore {
	ISound iSound;
	
	public void setISound(ISound iSound){
		Helper.assertNotNull(this.iSound);
		this.iSound = iSound;
	}
	
	//Implementing download from interface IMediaStore
	@Override
	public int download(int param3, int param2, int param1){
		Helper.assertNotNull(this.iSound);
		// TODO: insert code here
	}
	
	//Implementing upload from interface IMediaStore
	@Override
	public int upload(){
		Helper.assertNotNull(this.iSound);
		// TODO: insert code here
	}
	
}
