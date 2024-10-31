package poly;

public class Main {

	public static void main(String[] args) {
		 Employe[] employes = new Employe[4];
		 
		 employes[0]= new Developpeur("JAVA","Amine",10000.00);
		 employes[1]= new Manager(5,"Ahmed",20000.00);
		 employes[2]= new Developpeur("JAVA","Amine",10000.00);
		 employes[3]= new Manager(10,"Med Amine",25000.00);
		 for(int i=0;i<4;i++){
			 employes[i].afficherinfo();
		 }
		 Employe employe = new Developpeur("Java","Alice" , 10000);
		 employe.afficherinfo();
	}

}
