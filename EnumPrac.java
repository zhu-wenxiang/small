public enum EnumPrac {
    Sunday("Good day!",7),
    Monday("Terrible Day",1),
    Tuesday("Boring Day",2),
    Wednesday("Second Boring Day",3),
    Thursday("Boring day again",4),
    Friday("Exciting Day",5),
    Saturday("Let's roll it!",6);
    
    private String deString;
    private int desint;
    private StringBuffer str=new StringBuffer();

    EnumPrac(String desStr,int i){
        desint+=i;
        this.str.append(desStr);
    }

    public String getDeString(){
        deString=Sunday.toString()+Monday.toString()+str.toString();
        return deString;
    }
    public int getDesInt() {
        return desint;
    }

    

}
