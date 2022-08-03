public class ZeeL2 {
    /**
     * 

     CustomStep.run("cirlce",5);



     class CustomStep1 implements DisplayInterface {
        Display 
        public CustomeStep1()
         public void display() {
             sysout("Step1");
         }
     }
//
Chain.run()
class mycustomstep1 extends/implements Step {

execute(){
sysout("interview")
}
}
     */
}

interface Step {

    public int execute();

    default void run(){
        //Injected
        Step s = new StepOne();
        int result = s.execute();
        if(result == 0) {
            // Call Failure Method
        } else if(result == 1) {
            // Call Success Method
        }
    }
}

class StepOne implements Step {

    public int execute(Step nextStep) {
        sysout("Step1");
        return 0;
    }
}

class StepTwo implements Step {
    public int execute() {
        sysout("Step2");
        //Business Logic
        return 1;
    }
}



Step.run();
