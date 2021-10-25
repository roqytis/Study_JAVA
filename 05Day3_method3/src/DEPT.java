
public class DEPT {
    private int deptno;
    private String dname;
    private String loc;
	
    public DEPT(int deptno, String dname, String loc) {
             	this.deptno=deptno;
    			this.dname=dname;
    			this.loc=loc;
    			    }
    public DEPT() {}
   
    public int getDeptno() {
    	return deptno;
    }
	public void setDeptno(int deptno) {
		this.deptno=deptno;
	}
		public String getDname() {
			return dname;
		}
		public void setDeptno(String dname) {
			this.dname=dname;
		}		
			
			public String getLoc() {
				return loc;
			}
			public void setLoc(String loc) {
				this.loc=loc;
			     }
        public String getData() {
        	return this.deptno+"\t"+ this.dname+"\t"+this.loc;
        }
        public void printData() {
        	String date=this.deptno+ "\t"+this.dname+"\t"+this.loc;
        	System.out.println("printData========="+ date);
        }
}