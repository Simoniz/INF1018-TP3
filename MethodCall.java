
public class MethodCall {
	private String methodName;
	private String call[];
    
    public MethodCall(String _s)
    {
    	methodName = _s;
        call = _s.split("[.]");
    }
    
    public void setNom(String _s) 
    {
    	methodName = _s;
    	call = _s.split("[.]");
    }
    
    public String getNomMethode() 
    {
        return methodName;
    }
    
    public String getMethode(int _i) 
    {
            if (call.length > _i)
                    return call[_i];
            return "";
    }
    
    
    public String getObject() 
    {
        if (call.length > 0)
                return call[0];
        return "";
    }
    
    public int getSize() 
    {
            return call.length;
    }
}