package java8Feature.functionalInterface.inDetail;

public class SimpleFunInterfaceTest {
	  public static void main(String[] args) {
	    /*carryOutWork(new SimpleFunctionalInterface() {
	      @Override
	      public void doWork() {
	        System.out.println("Do work in SimpleFun impl...");
	      }
	    });*/
	    carryOutWork(() -> System.out.println("Do work in lambda exp impl..."));
	  }
	  public static void carryOutWork(SimpleFunctionalInterface sfi){
	    sfi.doWork();
	  }
	}

