package generics;

public class PairUse {
	

	
	    public static void main(String[] args){
	    	
	    	 Pair<String, Integer> pInner= new Pair<String, Integer>("ab",100);
	          Pair<Pair<String, Integer>, String> p= new Pair<>();
	          p.setFirst(pInner);
	          System.out.println(p.getFirst());
	          System.out.println(p.getFirst().getFirst());
	          System.out.println(p.getFirst().getSecond());

	    	
	//    	Pair<String,Integer> pSI = new Pair<String,Integer>("ab",10);
	    //    Pair p= new Pair(10,20);
	    //    System.out.println(p.getFirst()+ " " +p.getSecond());
	        

	 //       PairString pS= new PairString("aa", "bb");
	  //      PairDouble pS= new PairDouble(3.1, 7.2);
	    	
	 //   	Pair<Integer> p=new Pair<>(10,20);
	    	
	    //	Pair<String> pS = new Pair<>("aa","bb");
	    //	System.out.println(pS.getFirst()+" "+pS.getSecond());
	    //	pS.setFirst("xyz");
	    	
	    //	Pair<Integer> pI  = new Pair<Integer>(10,20);
	    //	System.out.println(pI.getFirst()+" "+pI.getSecond());
	    	
	    	//  Pair<Double> pD= new Pair<Double>(10.1, 20.6);
	       //   System.out.println(pD.getFirst()+ " " +pD.getSecond());
	    }
	


}
