package schiebung;

public class Schieberich {

	/**
	 * @param args
	 */
	public static int[] Schieber = new int[16];
	public static int[] Start = new int[16];
	public static int x = 0;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   boolean state = false;
		   double counter = 0;
		   
		  
		   
		   for(int i = 0; i < Schieber.length;i++){
			Schieber[i] = i;
			Start[i] = i;
		   }
		   int zaehlen = 0;
		   
		   while(zaehlen < 50){
		   int a = 0;
		   a = (int) (Math.random() * 10);
		   
		   switch (a) {
           case 1:  Links1();
                    break;
           case 2:  Links2();
                    break;
           case 3:  Links3();
                    break;
           case 4:  Rechts1();
                    break;
           case 5:  Rechts2();
                    break;
           case 6:  Rechts3();
                    break;
           case 7:  Down1();
                    break;
           case 8:  Down2();
                    break;
           case 9:  Up1();
                    break;
           case 10: Up2();
                    break;
           default: 
                    break;
       }
		   zaehlen++;
		   }
	
		  
		   
		   
		   for(int i = 0; i < Schieber.length;i++){
			   if(i % 4 == 0 && i != 0){
					System.out.println();
				}
				System.out.print(Schieber[i] + "\t");
				
			   }
		   
		  /* while(!state){
			   algo();
			   counter++;
			   if(counter % 10000000  == 0){
				   
				   if(counter % 200000000 == 0){
					  System.out.println();
				   }
				   if(counter % 20000000 == 0){
					   double perc=0;
					   for(int comp = 0;comp<Schieber.length;comp++){
						   if(Start[comp]==Schieber[comp]){
							   perc++;
						   }
					   }
					   System.out.print("---" + (perc/Schieber.length)*100 + " ----");
				   }
				   System.out.print(counter); 
				   
			   }
			   if(Schieber.equals(Start)){
				   state = true; 
			   }
			
			   
		   }
		   
		   for(int i = 0; i < Schieber.length;i++){
			   if(i % 4 == 0 && i != 0){
					System.out.println();
				}
				System.out.print(Schieber[i] + "\t");
				System.out.println(counter + "Yay");
				
			   }
		 
		   */
	}
	
	//-----------------------------------Links
	public static void Links1(){
		   //1 Block
			if(x+1 < Schieber.length){
			Schieber[x] = Schieber[x+1];
			   Schieber[x+1] = 0;
			   x = update();
			   if(x % 4 == 0 && x != 0){
					Rechts1();
				}
			}
	}
	public static void Links2(){
		//2 Block
		  Links1();
		  Links1();
		   x = update();
	}
	public static void Links3(){
		   //3 Block
		  Links1();
		  Links1();
		  Links1();
		   x = update();
	}
	//-------------------------------___Rechts
	public static void Rechts1(){
		   //1 Block
		if(x % 4 == 0){
			return;
		}
		else{
			Schieber[x] = Schieber[x-1];
			   Schieber[x-1] = 0;
			   x = update();
		}
		  
	}
	public static void Rechts2(){
		//2 Block
		  Rechts1();
		  Rechts1();
		   x = update();
	}
	public static void Rechts3(){
		   //3 Block
		  Rechts1();
		  Rechts2();
		   x = update();
	}
	//--------------------------------------
	
	public static void Down1(){
		   //1 Block
			if(x >= 12){
				return;
			}
			else{
		   Schieber[x] = Schieber[x+4];
		   Schieber[x+4] = 0;
		   x = update();
			}
	}
	public static void Down2(){
		//2 Block
		  Down1();
		  Down1();
		   x = update();
	}
	public static void Down3(){
		   //3 Block
		  Down1();
		  Down2();
		   x = update();
	}
	
	//--------------------------------------
	public static void Up1(){
		   //1 Block
			if(x - 4 < 0){
				return;
			}
			else{
		   Schieber[x] = Schieber[x-4];
		   Schieber[x-4] = 0;
		   x = update();
			}
	}
	public static void Up2(){
		//2 Block
		  Up1();
		  Up1();
		   x = update();
	}
	public static void Up3(){
		   //3 Block
		  Up1();
		  Up2();
		   x = update();
	}
	
	
	
	
	//---------------------------------------
	public static int update(){
		 for(int i = 0; i < Schieber.length;i++){
				if(Schieber[i] == 0){
					x = i;
				}
			   }
		 return x;
	}
	//------------------------------------------
	
	public static void algo (){
		int a = 0;
		   a = (int) (Math.random() * 10);
		   
		   switch (a) {
        case 1:  Links1();
                 break;
        case 2:  Links2();
                 break;
        case 3:  Links3();
                 break;
        case 4:  Rechts1();
                 break;
        case 5:  Rechts2();
                 break;
        case 6:  Rechts3();
                 break;
        case 7:  Down1();
                 break;
        case 8:  Down2();
                 break;
        case 9:  Up1();
                 break;
        case 10: Up2();
                 break;
        default: 
                 break;
	}

}
	//-----------------------------------------------------------
}
