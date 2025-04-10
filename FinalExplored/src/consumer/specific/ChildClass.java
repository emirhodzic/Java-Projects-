package consumer.specific;

import generic.BaseClass;

public class ChildClass extends BaseClass {

    @Override
    protected void optionalMethod() {
        System.out.println("[Child:optionalMethod] EXTRA Stuff Here");
        super.optionalMethod();
    }

//    @Override
//    public void recommendedMethod() {
//        System.out.println("[Child:recommendedMethod]: I'll do things my way");
//        optionalMethod();
//    }

    public static void recommendedStatic(){
        System.out.println("[ChildClass.recommendedStatic] BEST Way to Do it");
        optionalStatic();
        // mandatoryStatic();

    }
}
