import Decorator.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class decoratorTest {


    @Test
    public void testBundleDeal2(){

        BundleDeal bundleOldRelease = new OldRelease();
        bundleOldRelease = new SnackBundle(bundleOldRelease);
        bundleOldRelease = new DrinkBundle(bundleOldRelease);
        System.out.println(bundleOldRelease.getDescription()
                + " are €" + bundleOldRelease.cost()+ "\n");

    }

    @Test
    public void testBundleDeal(){

        BundleDeal bundleNewRelease = new NewRelease();
        bundleNewRelease = new SnackBundle(bundleNewRelease);
        bundleNewRelease = new DrinkBundle(bundleNewRelease);
        System.out.println(bundleNewRelease.getDescription()
                + " are €" + bundleNewRelease.cost());

    }


    @Test
    public void testBundleNewRelease(){
        BundleDeal newRelease = new NewRelease();
        newRelease = new SnackBundle(newRelease);
        System.out.println("\n" + newRelease.getDescription()
                + " is €" + newRelease.cost());


    }
}