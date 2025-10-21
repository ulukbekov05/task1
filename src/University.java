public class University {
    private String uni_name;
    private String city ;
    private int count_student;

    public String  getUni_name(){return uni_name;}
    public void setUni_name(String uni_name){this.uni_name=uni_name;}

    public String getCity(){return city;}
    public void setCity(String city){this.city=city;}

    public int getCount_student(){return count_student;}
    public void setCount_student(int count_student){this.count_student=count_student;}

    public String toString(){
        return "name: "+uni_name+"\n"+
                "city: "+city+"\n"+
                "count: "+count_student+"\n";
    }
}
