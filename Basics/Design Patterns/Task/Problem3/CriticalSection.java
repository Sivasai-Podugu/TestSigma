package Problem3;

public class CriticalSection {
    private String str;

    public CriticalSection(String str){
        this.str = str;
    }

    public String getStr(){
        return str;
    }

    public void serStr(String str){
        this.str = str;
    }
    
}

