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
    public static Object G_Timeout
     
    /**
     * <p></p>
     */
    public static Object G_SiteURL
     
    /**
     * <p></p>
     */
    public static Object G_ShortTimeOut
     
    /**
     * <p></p>
     */
    public static Object AddResultMessage
     
    /**
     * <p></p>
     */
    public static Object QueryResultMessage
     
    /**
     * <p></p>
     */
    public static Object UpdateResultMessage
     
    /**
     * <p>Profile default : &#30331;&#20837;&#36039;&#26009;&#21015;</p>
     */
    public static Object CurrentID
     
    /**
     * <p></p>
     */
    public static Object ApproveConfirmMessage
     
    /**
     * <p></p>
     */
    public static Object SendApproveConfirmMessage
     
    /**
     * <p></p>
     */
    public static Object DeleteResultMessage
     
    /**
     * <p>Profile default : 1:&#20351;&#29992;Script&#21034;&#38500;DB&#36039;&#26009;;2:&#25163;&#21205;&#36664;&#20837;&#32113;&#32232;</p>
     */
    public static Object UserScriptorKeyin
     
    /**
     * <p></p>
     */
    public static Object CreditcardPath
     
    /**
     * <p></p>
     */
    public static Object menu
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            G_Timeout = selectedVariables['G_Timeout']
            G_SiteURL = selectedVariables['G_SiteURL']
            G_ShortTimeOut = selectedVariables['G_ShortTimeOut']
            AddResultMessage = selectedVariables['AddResultMessage']
            QueryResultMessage = selectedVariables['QueryResultMessage']
            UpdateResultMessage = selectedVariables['UpdateResultMessage']
            CurrentID = selectedVariables['CurrentID']
            ApproveConfirmMessage = selectedVariables['ApproveConfirmMessage']
            SendApproveConfirmMessage = selectedVariables['SendApproveConfirmMessage']
            DeleteResultMessage = selectedVariables['DeleteResultMessage']
            UserScriptorKeyin = selectedVariables['UserScriptorKeyin']
            CreditcardPath = selectedVariables['CreditcardPath']
            menu = selectedVariables['menu']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
