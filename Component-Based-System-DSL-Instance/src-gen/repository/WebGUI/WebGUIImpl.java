package repository.WebGUI;

import repository.IMediaStore;
import repository.Helper;

public class WebGUIImpl implements IHTTP {
	IMediaStore iMediaStore;
	
	public void setIMediaStore(IMediaStore iMediaStore){
		Helper.assertNotNull(this.iMediaStore);
		this.iMediaStore = iMediaStore;
	}
	
	//Implementing HTTPUpload from interface IHTTP
	@Override
	public int HTTPUpload(){
		Helper.assertNotNull(this.iMediaStore);
		// TODO: insert code here
	}
	
	//Implementing HTTPDownload from interface IHTTP
	@Override
	public int HTTPDownload(){
		Helper.assertNotNull(this.iMediaStore);
		// TODO: insert code here
	}
	
}
