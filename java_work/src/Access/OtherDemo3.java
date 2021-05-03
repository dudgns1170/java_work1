package Access;
import Access.OtherDemo2;
import Other.OtherDemo1;

public class OtherDemo3 {
	public OtherDemo3()
	{
		this._public();
		this._protected();
		this._default();
		this._private();
		
	}
	public void _public()
	{
		System.out.println("public");
	}
	protected void _protected() {
		System.out.println("protected");
	}
	void _default()
	{
		System.out.println("default");
	}
	private void _private() {
		System.out.println("private");
	}

}


class SamPackage extends OtherDemo2{
	public SamPackage()
	{
		OtherDemo2 same = new OtherDemo2();
		same._public();
		same._protected();
		same._default();
		
		this._public();
		this._protected();
		this._default();
	}
}

class OtherPackage extends OtherDemo1{
	public OtherPackage() {
		OtherDemo1  Other = new OtherDemo1();
		Other._public();
		
		this._public();
		this._protected();
		
		
	}
}
