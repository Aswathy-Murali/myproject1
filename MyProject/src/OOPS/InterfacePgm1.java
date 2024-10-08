package OOPS;
interface Tvremote
{
	public void RemoteDetails();
}

interface SmartTvRemote extends Tvremote
{
	public void SmartTvRemoteDetails();
}

class Tv implements SmartTvRemote{
	@Override
	public void RemoteDetails() {
		System.out.println("RemoteDetails")	;	
	}
	@Override
	public void SmartTvRemoteDetails()
	{
		System.out.println("SmartTvRemoteDetails")	;		
	}
}

public class InterfacePgm1 {

	public static void main(String[] args) {
		Tv tvobj=new Tv();
		tvobj.RemoteDetails();
		tvobj.SmartTvRemoteDetails();
				

	}

}
