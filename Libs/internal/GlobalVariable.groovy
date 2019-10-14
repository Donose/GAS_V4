package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object Meeting
     
    /**
     * <p></p>
     */
    public static Object Offer
     
    /**
     * <p></p>
     */
    public static Object Contract
     
    /**
     * <p></p>
     */
    public static Object Billing_Req
     
    /**
     * <p></p>
     */
    public static Object Billing_inv
     
    /**
     * <p></p>
     */
    public static Object Receivables
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            Meeting = selectedVariables['Meeting']
            Offer = selectedVariables['Offer']
            Contract = selectedVariables['Contract']
            Billing_Req = selectedVariables['Billing_Req']
            Billing_inv = selectedVariables['Billing_inv']
            Receivables = selectedVariables['Receivables']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
