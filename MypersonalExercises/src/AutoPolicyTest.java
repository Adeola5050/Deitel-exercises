//import static org.junit.jupiter.api.Assertions.*;

public class AutoPolicyTest {
    public static void main(String[] args) {
        AutoPolicy myPolicy=new AutoPolicy(22222222,"Toyota venza", "NJ");
        AutoPolicy inPolicy=new AutoPolicy(50000000, "G-Wagon", "ME");

        policyInNoFaultState(myPolicy);
        policyInNoFaultState(inPolicy);

    }

    public static void policyInNoFaultState(AutoPolicy policy){
        System.out.println("The auto policy:");
        System.out.printf("Account # : %d; Car: %s; State %s %s a no-fault state%n%n", policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(), (policy.isNoFaultState()? "is": "is not"));

    }


}