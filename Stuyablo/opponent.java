public class opponent{
    private String oname;
    private int ohealth = 100;
    private int omana = 0;
    private String o1name;
    private String o2name;
    private String o3name;
    private String o4name;
    public opponent(int x){
	if(x==1){
	    setOname("Ariel the Airbender");
	    setO1name("wind shot");
	    setO2name("air shield");
	    setO3name("meditate");
	    setO4name("tornado strike");
	}
	if(x==2){
	    setOname("Waverly the Waterbender");
	    setO1name("water blast");
	    setO2name("ice shield");
	    setO3name("water aura");
	    setO4name("tsunami");
	}
	if(x==3){
	    setOname("Rocky the Earthbender");
	    setO1name("boulder throw");
	    setO2name("rock block");
	    setO3name("solidify");
	    setO4name("earthquake");
	}
	if(x==4){
	    setOname("Flint the Firebender");
	    setO1name("fireball");
	    setO2name("flame block");
	    setO3name("fire focus");
	    setO4name("fire rain");
	}
    }
    public void setOname(String n){
	oname = n;
    }
    public void setO1name(String n){
	o1name = n;
    }
    public void setO2name(String n){
	o2name = n;
    }
    public void setO3name(String n){
	o3name = n;
    }
    public void setO4name(String n){
	o4name = n;
    }
    public String getOname(){
	return oname;
    }
    public int getOhealth(){
	return ohealth;
    }
    public int getOmana(){
	return omana;
    }
    public void setOhealth(int a){
	ohealth += a;
    }
    public void setOmana(int a){
	omana += a;
    }
    public String getOmove(int a){
	if(a==1) return o1name;
	if(a==2) return o2name;
	if(a==3) return o3name;
	if(a==4) return o4name;
	return "";
    }
    public int opick(int a, int b){
	if(b<0){ //if bot's mana is less than 0, bot must restore mana 
	    return 3;
	}
	if(a<2){ //if player's mana is less than two 
	    if(b<10){ //almost always restores mana 
		return 3;
	    }else{ //if bot has more than ten mana, itll just attack the bot
		return 3+(int)(Math.random()*2);
	    }
	}
	if(b<2){ // if bot doesn't have mana but player has more than 2 mana
	//bot will either block or gain mana 
	    return 2+(int)(Math.random()*2);
	}
	if(a<5&&b<5){ //if both have at least 2 mana but both dont have mega attack 
	//bot will randomly pick between attack, block, and gain mana 
	    if((int)(Math.random()*3)==1){
		return 1;
	    }else{
		return 2+(int)(Math.random()*2);
	    }
	}
	if(b<5){// if player has mega attack and bot doesn't, 2/3 chance of blocking, 1/6 chance of restoring mana 
	// 1/6 chance of attacking 
	    int x = (int)(Math.random()*6);
	    if(x==0) return 1;
	    if(x==1) return 3;
	    return 2;
	}
	if(a<5){// if player doesn't have mega attack but bot does it randomly pick between using mega attack 
	// and restoring mana 
	    return 3+(int)(Math.random()*2);
	}
	int x = (int)(Math.random()*3); //if both players have mega attack, 1/3's chance of blocking
	// 2/3's chance of using mega attack 
	if(x==0) return 2; 
	return 4;
    }
}
