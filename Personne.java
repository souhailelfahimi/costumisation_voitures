
public abstract class Personne {
	
	//att
		
		protected static int cont=0;
		protected int id;
		protected String nom;
		protected String prenom;
		protected String tel;
		protected String mail;
		protected String cin;
		protected int age;
		
	
	
	
	//cons
		
		public Personne(){
			cont++;
			this.id=cont;
		}
		
		public Personne(String nom,String prenom,String tel,String mail,String cin,int age){
			cont++;
			this.id=cont;
			this.nom=nom;
			this.prenom=prenom;
			this.tel=tel;
			this.mail=mail;
			this.cin=cin;
			this.age=age;
		}
	
	
		public abstract void addToBase();
	
		
		//setters & getters
		
		public void setNom(String nom){
			this.nom=nom;
		}
		public void setPrenom(String prenom){
			this.prenom=prenom;
		}
		public void setTel(String tel){
			this.tel=tel;
		}
		public void setMail(String mail){
			this.mail=mail;
		}
		public void setCin(String cin){
			this.cin=cin;
		}
		public void setAge(int age){
			this.age=age;
		}
		
		
		
		public String getNom(){
			return this.nom;
		}
		public String getPrenom(){
			return this.prenom;
		}
		public String getTel(){
			return this.tel;
		}
		public String getMail(){
			return this.mail;
		}
		public String getCin(){
			return this.cin;
		}
		public int getAge(){
			return this.age;
		}
		
		
		
		
	
	
}
