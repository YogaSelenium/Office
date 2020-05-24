package com.cync.Factoring;

import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cync.FactoringPages.BatchProcessScreenPageFactoring;
import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.utility.TestGroups;
import com.cync.utility.TestUtil;
import com.cync.utility.Xls_Reader;
import com.relevantcodes.extentreports.LogStatus;

public class CashApplication_Factoring_TC extends BaseTest{
	
	Xls_Reader xls_reader = new Xls_Reader(System.getProperty("user.dir")
			+ "\\TestDataProvider\\SanityFactoring.xlsx");

  @Test(dataProvider = "BatchProcess" , groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Verify the Batch Process screen")
	
	   public void TC_Complete_BatchProcess(String clientname,String debtorname,String sourcetype,String checkrefno,String checkamount,String applyamount) throws InterruptedException
	     {
		ExtentTestManager.getTest().getTest().setName("Verify Batch Process screen");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
        
        //step 1: navigate to Batch process screen
        
        BatchProcessScreenPageFactoring batch = cyncHomePage.getCyncMenus().openBatchProcessScreenPageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Batch process screen");
        Thread.sleep(4000);
        
        String clientname1="AB FAC";
        String debtorname1="UTTT";
        String Header = "Batch Process";
        String RefBatchNo = "112233";
        
        String checkrefno1="a";
        Random rndNum = new Random();    
        int Rnum=rndNum.nextInt(2000);
        String sRn= Integer.toString(Rnum); 
        String checkrefnoR=checkrefno1+sRn;
        
        String clientGname="304FACT";
    
      
//******************************************************************* FACTORED ***************    1
        
          //step 2 : click on Add New button
     
        //  Assert.assertTrue(batch.clickAddNewBTN());
          ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Add New button");
        
          Assert.assertTrue(batch.clickElement(batch.add));
          ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Add New button");
        
         //step 3 : verify RefBatch no field
          
         Assert.assertTrue(batch.VerifyRefBatchNo());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Ref Batch no field");
        
         //step 4 : verify batch amount field
         
         Assert.assertTrue(batch.VerifyBatchAmt());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Batch amount field");
        
         //step 5 : verify check total field
         Assert.assertTrue(batch.VerifyCheckTotal());//disabled
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Check total field");
        
         //step 6 : verify applied total field
         Assert.assertTrue(batch.VerifyAppliedAmt());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Applied Amount field");
        
         //step 7 : verify browse files button
         Assert.assertTrue(batch.VerifyBrowseFilesBTN());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successflly verified Browse Files button");
        
         //step 8 : add value to Ref Batch no field
        
         Assert.assertTrue(batch.addValueToRefBatchNo(RefBatchNo));
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Ref batch no");
        
         //step 9 : add value to Batch amount field
         String BatchAmt = "6000";
         Assert.assertTrue(batch.addValueToBatchAmt(BatchAmt));
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Batch Amount");
        
         //step 10 : verify Back to batch list button
          Assert.assertTrue(batch.VerifyBackToBatchBTN());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Back To Batch button");
        
         //step 11 : verify save batch button
         Assert.assertTrue(batch.VerifySaveBatchBTN());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Save Batch button");
        
         //step 12 : verify the batch date message
         Assert.assertTrue(batch.VerifyBatchDateMsg());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Batch Date message");
        
         //step 13 : verify Save and create check button
         Assert.assertTrue(batch.VerifySaveAndCreateCheckBTN());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Save and Batch button");
        
         //step 14 : click on save and create check button without check details
         Assert.assertTrue(batch.ClickSaveAndCreateCheckBTN());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Save and Batch button");
        
         //step: verify the success message
         // Assert.assertTrue(batch.VerifySuccessMsg());
         //ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified success message after batch got saved");
        
         //step 15 : add value to Client field
         //String clientname="AB FAC";
         SanityFactoringEndToEndFlowTC obj=new SanityFactoringEndToEndFlowTC();
         //String clientGname=obj.clientGname;
       //  String clientGname="304FACT";
         
         Assert.assertTrue(batch.addValueToClientField(clientGname));
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Client Text box");
        
         //step 16 : add value to Debtor field
         // String debtorname5="DEMFAC";
         Assert.assertTrue(batch.addValueToDebtorField(debtorname1));
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Debtor Text box");
         
         //step16: add value to Debtor field Dropdown
         Thread.sleep(2000);
        // Assert.assertTrue(batch.SelectValueFromDebtorFieldDropDown());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Debtor Text box");

         
        
         //step 17 : select source type from drop down
         Assert.assertTrue(batch.SelectSourceType(sourcetype));
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected source type from dropdown");
        
         //step 18 : add value to check no field
         
        /* String checkrefno1="a";
         Random rndNum = new Random();    
         int Rnum=rndNum.nextInt(2000);
         String sRn= Integer.toString(Rnum); 
         String checkrefnoR=checkrefno1+sRn;*/
         
         
         Assert.assertTrue(batch.addValueToCheckNoField(checkrefnoR));
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Check No Text box");
        
         //step 19 : add value to Check amount field
         Assert.assertTrue(batch.addValueToCheckAmtField(checkamount));
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Check Amount text box");
        
         //step 20 : verify Bank Routing no Field
         Assert.assertTrue(batch.VerifyBankRoutingNoField());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Bank routing No field");
        
         //step 21 : verify Bank Acocunt no field
         Assert.assertTrue(batch.VerifyBankAccNoField());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Bank Acount No field");
        
         //step 22 : verify the factoring payments tag
         Assert.assertTrue(batch.VerifyFactPaymentsTag());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Factoring Payments Tag");
        
         //step 23 : click on invoice distribution tag
         Thread.sleep(2000);
         Assert.assertTrue(batch.ClickInvDistributionTag());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Invoice Distribution Tag");
        
         //step: check on Invoice check box
         Thread.sleep(4000);
         // batch.CheckOnInvCheckBox();
         // ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on Invoice Check box");
         // Thread.sleep(4000);
        
         //step 24 : Store value From invoice Amount
         
         String applyAmtfetchedfromUI = batch.getValueFromFactoredCinvoiceAmtField(batch.invoiceAmount_xpath);
       
         //step 25 : add value to Apply amount field
         
         Assert.assertTrue(batch.addValueToApplyAmtFieldFromCurrentamount()); 
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Apply Amount field");
        
         Thread.sleep(2000);
        
         //step 26 : Re-enter Check amount with taking data from apply amount
        
         Assert.assertTrue(batch.addValueToCheckAmtFieldFromApplyamount());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Check Amount text box same as apply amount");
         
        
         //step 27 : verify cancel button
         Assert.assertTrue(batch.VerifyCancelBTN());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Cancel button");
        
         //step 28 : Verify save button
         Assert.assertTrue(batch.VerifySaveBTN());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Save button");
        
         //step 29 : Verify Save and new button
         Assert.assertTrue(batch.VerifySaveAndNewBTN());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Save and New button");
        
         //step 30 : click on save button
         Assert.assertTrue(batch.ClickSaveBTN());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on save button");
        
         Thread.sleep(2000);
         
         //step 31 : Edit Batch
         Assert.assertTrue(batch.ClickBatchEditIcon());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Edit Batch");
         Thread.sleep(2000);
         
         //step 32 : Clear Batch Amount & Re-enter data to Batch Amount,same as Check amount  
        
         Assert.assertTrue(batch.addValueToBatchAmtAfterEditBatch(applyAmtfetchedfromUI));
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Re-Entered value to Batch Amount");
        
         Thread.sleep(4000);
         //step 33 : click on save button
         Assert.assertTrue(batch.ClickSaveBTNafterEditBatch());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on save button");
        
         Thread.sleep(6000);
   
         //step: verify the success message
         //  Assert.assertTrue(batch.VerifySaveChkSuccessMsg());
         // ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the success message after saving the batch");
        
         //step33: verify the preview icon
         //    Assert.assertTrue(batch.VerifyPreviewIcon());
         //    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified preview icon");
        
         //step 34 : Verify the edit icon
         Assert.assertTrue(batch.VerifyEditIcon());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Edit icon");
        
         //step 35 : Verify the delete icon
         Assert.assertTrue(batch.VerifyDeleteIcon());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly verified delete icon");
        
         //step 36 : Get the Batch Number
         String batchNo_Factored=batch.getValueFromBatchNoField();
        
         //step 37 : click on Back to Batch button
         Assert.assertTrue(batch.ClickOnBackToBatchBTN());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Back to batch button");
        
        //step 38 : insert Batch No and Filter on Batch Process screen
         Assert.assertTrue(batch.addValueToBatchNoSearchField(batchNo_Factored));
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Entered BatchNo on Search Field of Batch No");
         Thread.sleep(1000);
     
         //step 39 : Mouse Hover on BatchNo to see Process icon
         Thread.sleep(4000);
         Assert.assertTrue(batch.batchNumberMouseHover());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Process batch button");
         Thread.sleep(6000);
        
         //step 40: Process the Batch
         Assert.assertTrue(batch.ProcessBatchBTN());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Process batch button");
         Thread.sleep(8000);
         
         //*************
         //step41: click on notification icon
         Assert.assertTrue(batch.ClickNotificationIcon());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on notification icon");

         
         //step42: verify the success message for completed batch process
         //String message = "Batch process completed successfully";
         Assert.assertTrue(batch.VerifyCompletedMsg());//check contains
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Batch process completed message");
         
         //step43: click on cancel button

         Assert.assertTrue(batch.ClickCancelBTNInNot());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed notification popup");
         
         
//***********************************************************  NON FACTORED   ******************************   2
         //step 41 : Add new BTN click
         Assert.assertTrue(batch.clickAddNewBTN());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Add New button");
       
       
         //step 42 : add value to Batch ref no field
        
         Assert.assertTrue(batch.addValueToRefBatchNo(RefBatchNo));
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Ref batch no");
        
         //step 43 : add value to Batch amount field
         String BatchAmt2="6000";
         Assert.assertTrue(batch.addValueToBatchAmt(BatchAmt2));
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Batch Amount");
        
         //step 44 : click on save and create check button
         Assert.assertTrue(batch.ClickSaveAndCreateCheckBTN());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Save and Batch button");
        
         //step 45: add value to Client field
         Assert.assertTrue(batch.addValueToClientField(clientGname));
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Client Text box");
        
         //step 46: add value to Debtor field
         Assert.assertTrue(batch.addValueToDebtorField(debtorname1));
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Debtor Text box");
         
  
        // Assert.assertTrue(batch.SelectValueFromDebtorFieldDropDown());
        // ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Debtor Text box");
         
         
        
         //step 47: select source type from drop down
         Assert.assertTrue(batch.SelectSourceType(sourcetype));
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected source type from dropdown");
        
         //step 48: add value to check no field
         
         //String checkrefno1="a";
        // Random rndNum2 = new Random();    
         int Rnum2=rndNum.nextInt(2000);
         String sRn2= Integer.toString(Rnum2); 
         String checkrefnoR2=checkrefno1+sRn2;
         
         Assert.assertTrue(batch.addValueToCheckNoField(checkrefnoR2));
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Check No Text box");
        
         //step 49: add value to Check amount field
         Assert.assertTrue(batch.addValueToCheckAmtField(checkamount));
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Check Amount text box");
        
         //step 50: verify the factoring payments tag
         Assert.assertTrue(batch.VerifyFactPaymentsTag());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Factoring Payments Tag");
        
         //step 51: click on invoice distribution tag
         Assert.assertTrue(batch.ClickInvDistributionTag());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Invoice Distribution Tag");
        
         //step 52:click on non-factored checkbox
         Thread.sleep(2000);
         Assert.assertTrue(batch.ClickNonFactoredcheckbox());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on non factored checkbox");
         Thread.sleep(3000);
         
         //step 53 : Store value From Current Amount Field
         
        
         String applyAmtfetchedfromUINon_Factored = batch.getValueFromFactoredCinvoiceAmtField(batch.CurrentAmtField_NonFactored_xpath);
         Thread.sleep(2000);
      
         //step 54 : add value to Apply amount field
        
         Assert.assertEquals(batch.addValueToNonFactoredApplyAmtField(applyAmtfetchedfromUINon_Factored),applyAmtfetchedfromUINon_Factored);
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Apply Amount field");
       
         Thread.sleep(3000);
       
         //step 55 : Re-enter Check amount with taking data from apply amount
       
         Assert.assertTrue(batch.addValueToCheckAmtFieldFromApplyamount());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Check Amount text box same as apply amount");
        
        
         //step 58 : click on save button
         Assert.assertTrue(batch.ClickSaveBTN());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on save button");
         Thread.sleep(4000);
        
        
         //step 59 : Edit Batch
         Assert.assertTrue(batch.ClickBatchEditIcon());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Edit Batch");
         Thread.sleep(2000);
        
         //step 60 : Clear Batch Amount & Re-enter data to Batch Amount,same as Check amount  
       
         Assert.assertTrue(batch.addValueToBatchAmtAfterEditBatch(applyAmtfetchedfromUINon_Factored));
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Re-Entered value to Batch Amount");
       
         Thread.sleep(4000);
         //step 61 : click on save button
         Assert.assertTrue(batch.ClickSaveBTNafterEditBatch());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on save button");
         Thread.sleep(4000);
        
         //step 36 : Get the Batch Number
         String batchNo_NonFactored=batch.getValueFromBatchNoField();
         
         
         //step 62 : click on Back to Batch button
         Assert.assertTrue(batch.ClickOnBackToBatchBTN());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Back to batch button");
        
         
         //step 63 : insert Batch No and Filter on Batch Process screen
         Assert.assertTrue(batch.addValueToBatchNoSearchField(batchNo_NonFactored));
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Entered BatchNo on Search Field of Batch No");
         Thread.sleep(1000);
    
         //step 64 : Mouse Hover on BatchNo to see Process icon
         Thread.sleep(4000);
         Assert.assertTrue(batch.batchNumberMouseHover());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Process batch button");
         Thread.sleep(6000);
       
         //step 65 : Process the Batch
         Assert.assertTrue(batch.ProcessBatchBTN());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Process batch button");
         Thread.sleep(6000);
        
        //***********
         
         //step41: click on notification icon
         Assert.assertTrue(batch.ClickNotificationIcon());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on notification icon");

         
         //step42: verify the success message for completed batch process
         //String message = "Batch process completed successfully";
         Assert.assertTrue(batch.VerifyCompletedMsg());//check contains
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Batch process completed message");
         
         //step43: click on cancel button

         Assert.assertTrue(batch.ClickCancelBTNInNot());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed notification popup");   
                                                                                                    
         
         
        
//********************************************************  ON ACCOUNT    **********************************  3
        //step 66 : Add New BTN click
       // Assert.assertTrue(batch.clickAddNewBTN());
        //ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Add New button");
        Thread.sleep(6000);
        Assert.assertTrue(batch.clickElement(batch.add));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Add New button");
        
        //step 67 : add value to Batch ref no field
       
        Assert.assertTrue(batch.addValueToRefBatchNo(RefBatchNo));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Ref batch no");
        
        //step 68 : add value to Batch amount field
        String BatchAmt3="6000";
        Assert.assertTrue(batch.addValueToBatchAmt(BatchAmt3));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Batch Amount");
        
        //step 69 : click on save and create check button
        Assert.assertTrue(batch.ClickSaveAndCreateCheckBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Save and Batch button");
        
        //step 70 : add value to Client field
        Assert.assertTrue(batch.addValueToClientField(clientGname));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Client Text box");
        
        //step 71 : add value to Debtor field
        Assert.assertTrue(batch.addValueToDebtorField(debtorname1));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Debtor Text box");
        
        //step 72 : select source type from drop down
        Assert.assertTrue(batch.SelectSourceType(sourcetype));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected source type from dropdown");
        
        //step 73 : add value to check no field
        
        int Rnum3=rndNum.nextInt(2000);
        String sRn3= Integer.toString(Rnum3); 
        String chkrefnoR3=checkrefno1+sRn3;
        
        Assert.assertTrue(batch.addValueToCheckNoField(chkrefnoR3));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Check No Text box");
        
        //step 74 : add value to Check amount field
        Assert.assertTrue(batch.addValueToCheckAmtField(BatchAmt3));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Check Amount text box");
        
        //step 75 : verify the factoring payments tag
        Assert.assertTrue(batch.VerifyFactPaymentsTag());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Factoring Payments Tag");
        
        //step 76 : click on On Account Tag
        Assert.assertTrue(batch.ClickOnAccountTag());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Invoice Distribution Tag");
        
        //step 77 :Click on Add invoice
        JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
        
        Assert.assertTrue(batch.ClickOn_AddInvoice());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Add Invoice tag");
             
        
       //step 78 : add value to invoice no field----------->
        String invoiceNo="1212A";
        Assert.assertTrue(batch.addValueToinvoiceNoField(invoiceNo));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Add Invoice tag");
        
        
        
        //step 79 : add value to Apply amount field




        Assert.assertTrue(batch.addValueToApplyAmtFieldi(applyamount));//clear

        batch.addValueToOnAccountApplyAmtFieldi(BatchAmt3);


       // Assert.assertTrue(batch.addValueToApplyAmtField(applyamount));//clear

        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Apply Amount field");
        Thread.sleep(6000);
        
       //******
        //*******
        //*********
        
        
        
        
        //step 80 : click on save button
        
        Assert.assertTrue(batch.ClickSaveBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on save button");
        Thread.sleep(4000);
        
        
        //step 81 : Get the Batch Number
        String batchNo_OnAccount=batch.getValueFromBatchNoField();
        
        //step 82 : click on Back to Batch button
        Assert.assertTrue(batch.ClickOnBackToBatchBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Back to batch button");
       
        //step 83 : insert Batch No and Filter on Batch Process screen
        Assert.assertTrue(batch.addValueToBatchNoSearchField(batchNo_OnAccount));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Entered BatchNo on Search Field of Batch No");
        Thread.sleep(1000);
   
        //step 84 : Mouse Hover on BatchNo to see Process icon
        Thread.sleep(4000);
        Assert.assertTrue(batch.batchNumberMouseHover());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Process batch button");
        Thread.sleep(6000);
      
        //step 85 : Process the Batch
        Assert.assertTrue(batch.ProcessBatchBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Process batch button");
        Thread.sleep(6000);
                                                                                         
           
        
//***************************************************SHORT PAYMENT  ***************************************************** 4
        //step 86 : click add new BTN
        
        //  Assert.assertTrue(batch.clickAddNewBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Add New button");
        
        Assert.assertTrue(batch.clickElement(batch.add));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Add New button");
       
        //step 87 : add value to Batch ref no field
        
        Assert.assertTrue(batch.addValueToRefBatchNo(RefBatchNo));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Ref batch no");
        
        //step 88 : add value to Batch amount field
        String BatchAmt1 = "0";
        Assert.assertTrue(batch.addValueToBatchAmt(BatchAmt1));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Batch Amount");
        
        //step 89 : click on save and create check button
        Assert.assertTrue(batch.ClickSaveAndCreateCheckBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Save and Batch button");
        
        //step 90 : add value to Client field
        Thread.sleep(2000);
        Assert.assertTrue(batch.addValueToClientField(clientGname));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Client Text box");
        
        //step 91 : add value to Debtor field
        Assert.assertTrue(batch.addValueToDebtorField(debtorname1));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Debtor Text box");
        
        //step 92 : select source type from drop down
        Assert.assertTrue(batch.SelectSourceType(sourcetype));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected source type from dropdown");
        
        //step 93 : add value to check no field
        int Rnum4=rndNum.nextInt(2000);
        String sRn4= Integer.toString(Rnum4); 
        String chkrefnoR4=checkrefno1+sRn4;
        
        Assert.assertTrue(batch.addValueToCheckNoField(chkrefnoR4));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Check No Text box");
        
        //step 94 : add value to Check amount field
     
        Assert.assertTrue(batch.addValueToCheckAmtField(checkamount));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Check Amount text box");
        
        //step 95 : verify the factoring payments tag
        Assert.assertTrue(batch.VerifyFactPaymentsTag());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Factoring Payments Tag");
        
        //step 96 : click on invoice distribution tag
        Thread.sleep(4000);
        Assert.assertTrue(batch.ClickInvDistributionTag());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Invoice Distribution Tag");
        
        //step 97 :click on non-factored checkbox
        Assert.assertTrue(batch.ClickNonFactoredcheckbox());
        Thread.sleep(4000);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on non factored checkbox");
        
        //step  : check on Invoice check box
        //   batch.CheckOnInvCheckBox();
        // ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on Invoice Check box");
        // Thread.sleep(4000);
        
        
        
        //step : Store value of Current Amount
        String CurrentAmount_ShortPayment_Calculated=batch.getValueOfShortPaymentCurrentAmtFieldwithCalculation();
        
        
        //step 98 : add value to Apply amount field----->
        
        batch.addValueToShortPaymentApplyAmtField();
       //  Assert.assertTrue(batch.addValueToShortPaymentApplyAmtFieldi(CurrentAmount_ShortPayment_Calculated));
        
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Apply Amount field");
        Thread.sleep(2000);
        
        
        //Step 99 :Select Adjustment Reason
        Assert.assertTrue(batch.SelectAdjustmentReason());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Apply Amount field");
        
		
        //Step 100 : add value to Adjustment amount
        Assert.assertTrue(batch.addValueToAdjustmentAmount(CurrentAmount_ShortPayment_Calculated));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Apply Amount field");
        
        
        
        
        
        //step 101 : Take value from Apply amount field and Re-Enter it in Check field
        // Store value From invoice Amount
        
       
        
        
        //step 55 : Re-enter Check amount with taking data from apply amount
        
        Assert.assertTrue(batch.addValueToCheckAmtField_ShortPayment(CurrentAmount_ShortPayment_Calculated));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Check Amount text box same as apply amount");
        
        
        //step 102 : click on save button
        Assert.assertTrue(batch.ClickSaveBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on save button");
        Thread.sleep(4000);
        
        
        //step 103 : Edit Batch
        Assert.assertTrue(batch.ClickBatchEditIcon());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Edit Batch");
        Thread.sleep(2000);
       
        //step 104 : Clear Batch Amount & Re-enter data to Batch Amount,same as Check amount  
      
        Assert.assertTrue(batch.addValueToBatchAmtAfterEditBatch(CurrentAmount_ShortPayment_Calculated));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Re-Entered value to Batch Amount");
        
        
        //step 61 : click on Batch save button
        Assert.assertTrue(batch.ClickSaveBTNafterEditBatch());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on save button");
        Thread.sleep(4000);
        
        
     
        //step 105 : Get the Batch Number
        String batchNo_ShortPayment=batch.getValueFromBatchNoField();
        
        //step 106 : click on Back to Batch button
        Assert.assertTrue(batch.ClickOnBackToBatchBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Back to batch button");
        
      
        //step 107 : insert Batch No and Filter on Batch Process screen
        Assert.assertTrue(batch.addValueToBatchNoSearchField(batchNo_ShortPayment));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Entered BatchNo on Search Field of Batch No");
        Thread.sleep(1000);
   
        //step 108 : Mouse Hover on BatchNo to see Process icon
        Thread.sleep(4000);
        Assert.assertTrue(batch.batchNumberMouseHover());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Process batch button");
        Thread.sleep(6000);
      
        //step 109 : Process the Batch
        Assert.assertTrue(batch.ProcessBatchBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Process batch button");
        Thread.sleep(6000);
        
        //**********
        //step41: click on notification icon
        Assert.assertTrue(batch.ClickNotificationIcon());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on notification icon");

        
        //step42: verify the success message for completed batch process
        //String message = "Batch process completed successfully";
        Assert.assertTrue(batch.VerifyCompletedMsg());//check contains
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Batch process completed message");
        
        //step43: click on cancel button

        Assert.assertTrue(batch.ClickCancelBTNInNot());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed notification popup"); 
        
//***********************************************************  OVER PAYMENT   **************************************  5
        
        //step 110 : add new BTN click
        
        Assert.assertTrue(batch.clickAddNewBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Add New button");
       
       
        //step 111 : add value to Batch ref no field
       
        Assert.assertTrue(batch.addValueToRefBatchNo(RefBatchNo));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Ref batch no");
        
        //step 112 : add value to Batch amount field
        String BatchAmt4 = "6000";
        Assert.assertTrue(batch.addValueToBatchAmt(BatchAmt4));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Batch Amount");
        
        //step 113 : click on save and create check button
        Assert.assertTrue(batch.ClickSaveAndCreateCheckBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Save and Batch button");
        
        //step 114 : add value to Client field
        Assert.assertTrue(batch.addValueToClientField(clientGname));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Client Text box");
        
        //step 115 : add value to Debtor field
        Assert.assertTrue(batch.addValueToDebtorField(debtorname1));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Debtor Text box");
        
        //step 116 : select source type from drop down
        Assert.assertTrue(batch.SelectSourceType(sourcetype));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected source type from dropdown");
        
        //step 117 : add value to check no field
        
        int Rnum5=rndNum.nextInt(2000);
        String sRn5= Integer.toString(Rnum5); 
        String chkrefnoR5=checkrefno1+sRn5;
        
        
        Assert.assertTrue(batch.addValueToCheckNoField(chkrefnoR5));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Check No Text box");
        
        //step 118 : add value to Check amount field
        Assert.assertTrue(batch.addValueToCheckAmtField(checkamount));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Check Amount text box");
        
        //step 119 : verify the factoring payments tag
        Assert.assertTrue(batch.VerifyFactPaymentsTag());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Factoring Payments Tag");
        
        //step 120 : click on invoice distribution tag
        Assert.assertTrue(batch.ClickInvDistributionTag());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Invoice Distribution Tag");
        
        //step 121 : click on non-factored checkbox
        Assert.assertTrue(batch.ClickNonFactoredcheckbox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on non factored checkbox");
        
        //step : check on Invoice check box
        //   batch.CheckOnInvCheckBox();
        //ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on Invoice Check box");
         Thread.sleep(4000);
        
        //step 122 : add value to Apply amount field
        Assert.assertTrue(batch.addValueToOverPaymentApplyAmtField());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Apply Amount field");
        Thread.sleep(4000);
        
        
        
        
        //step 123 : Take value from Current amount field and do Calculation and Store it 
       
        
        String CurrentAmount_OverPayment_Calculated=batch.getValueOfOverPaymentCurrentAmtFieldwithCalculation();
       
        
        //step 55 : Re-enter Check amount with taking data from Calculated Current amount 
        
        Assert.assertTrue(batch.addValueToCheckAmtField_OverPayment(CurrentAmount_OverPayment_Calculated));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Check Amount text box same as apply amount");
        
        
        //step 124 : click on save button
        Assert.assertTrue(batch.ClickSaveBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on save button");
        Thread.sleep(4000);
        
        
      //step 125 : Edit Batch
        Assert.assertTrue(batch.ClickBatchEditIcon());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Edit Batch");
        Thread.sleep(2000);
       
        //step 126 : Clear Batch Amount & Re-enter data to Batch Amount,same as Check amount  
      
        Assert.assertTrue(batch.addValueToBatchAmtAfterEditBatch(CurrentAmount_OverPayment_Calculated));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Re-Entered value to Batch Amount");
        
        //step 61 : click on Batch save button
        Assert.assertTrue(batch.ClickSaveBTNafterEditBatch());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on save button");
        Thread.sleep(4000);
        
        
        //step 127 : Get the Batch Number
        String batchNo_OverPayment=batch.getValueFromBatchNoField();
        
        //step 128 : click on Back to Batch button
        Assert.assertTrue(batch.ClickOnBackToBatchBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Back to batch button");
        
      
        //step 129 : insert Batch No and Filter on Batch Process screen
        Assert.assertTrue(batch.addValueToBatchNoSearchField(batchNo_OverPayment));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Entered BatchNo on Search Field of Batch No");
        Thread.sleep(1000);
   
        //step 130 : Mouse Hover on BatchNo to see Process icon
        Thread.sleep(4000);
        Assert.assertTrue(batch.batchNumberMouseHover());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Process batch button");
        Thread.sleep(6000);
      
        //step 131 : Process the Batch
        Assert.assertTrue(batch.ProcessBatchBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Process batch button");
        Thread.sleep(6000);
        
        //*********
        
        //step41: click on notification icon
        Assert.assertTrue(batch.ClickNotificationIcon());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on notification icon");

        
        //step42: verify the success message for completed batch process
        //String message = "Batch process completed successfully";
        Assert.assertTrue(batch.VerifyCompletedMsg());//check contains
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Batch process completed message");
        
        //step43: click on cancel button

        Assert.assertTrue(batch.ClickCancelBTNInNot());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed notification popup");   
        
//***************************************************************PArtial PAYMENT************************************************ 6
        
        //step 132 : add new BTN click
        
        Assert.assertTrue(batch.clickAddNewBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Add New button");
       
       
        //step 133 : add value to Batch ref no field
       
        Assert.assertTrue(batch.addValueToRefBatchNo(RefBatchNo));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Ref batch no");
        
        //step 134 : add value to Batch amount field
        String BatchAmt6 = "6000";
        Assert.assertTrue(batch.addValueToBatchAmt(BatchAmt6));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Batch Amount");
        
        //step 135 : click on save and create check button
        Assert.assertTrue(batch.ClickSaveAndCreateCheckBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Save and Batch button");
        
        //step 136 : add value to Client field
        Assert.assertTrue(batch.addValueToClientField(clientGname));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Client Text box");
        
        //step 137 : add value to Debtor field
        Assert.assertTrue(batch.addValueToDebtorField(debtorname1));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Debtor Text box");
        
        //step 138 : select source type from drop down
        Assert.assertTrue(batch.SelectSourceType(sourcetype));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected source type from dropdown");
        
        //step 139 : add value to check no field
        
        int Rnum6=rndNum.nextInt(2000);
        String sRn6= Integer.toString(Rnum6); 
        String chkrefnoR6=checkrefno1+sRn6;
        
        Assert.assertTrue(batch.addValueToCheckNoField(chkrefnoR6));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Check No Text box");
        
        //step 140 : add value to Check amount field
        Assert.assertTrue(batch.addValueToCheckAmtField(checkamount));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Check Amount text box");
        
        //step 141 : verify the factoring payments tag
        Assert.assertTrue(batch.VerifyFactPaymentsTag());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Factoring Payments Tag");
        
        //step 142 : click on invoice distribution tag
        Assert.assertTrue(batch.ClickInvDistributionTag());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Invoice Distribution Tag");
        
        //step 143 : click on non-factored checkbox
        Assert.assertTrue(batch.ClickNonFactoredcheckbox());
        Thread.sleep(2000);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on non factored checkbox");
        
        
        //step : Take value from Current amount field and calculate and Store
        
        String CurrentAmt_PartialPayment_Calculated=batch.getValueOfPartialPaymentCurrentAmtFieldwithCalculation();
      
        //step 144 : add Calculated value to Apply amount field
        Assert.assertEquals(batch.addValueTo_PartialPayment_ApplyAmtField(),CurrentAmt_PartialPayment_Calculated);//clear
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Apply Amount field");
        Thread.sleep(4000);
        
        
        
        
        //step 55 : Re-enter Check amount with taking data from apply amount
        
        Assert.assertTrue(batch.addValueToCheckAmtField_PartialPayment(CurrentAmt_PartialPayment_Calculated));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Check Amount text box same as apply amount");
        
        
        
        //step 146 : click on save button
        Assert.assertTrue(batch.ClickSaveBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on save button");
        Thread.sleep(4000);
        
        
      //step 147 : Edit Batch
        Assert.assertTrue(batch.ClickBatchEditIcon());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Edit Batch");
        Thread.sleep(2000);
       
        //step 148 : Clear Batch Amount & Re-enter data to Batch Amount,same as Check amount  
      
        Assert.assertTrue(batch.addValueToBatchAmtAfterEditBatch(CurrentAmt_PartialPayment_Calculated));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Re-Entered value to Batch Amount");
        
        
       //step 61 : click on Batch save button
        Assert.assertTrue(batch.ClickSaveBTNafterEditBatch());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on save button");
        Thread.sleep(4000);
        
        
     
        //step 149 : Get the Batch Number
        String batchNo_PartialPayment=batch.getValueFromBatchNoField();
        
        //step 150 : click on Back to Batch button
        Assert.assertTrue(batch.ClickOnBackToBatchBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Back to batch button");
        
      
        //step 151 : insert Batch No and Filter on Batch Process screen
        Assert.assertTrue(batch.addValueToBatchNoSearchField(batchNo_PartialPayment));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Entered BatchNo on Search Field of Batch No");
        Thread.sleep(1000);
   
        //step 152 : Mouse Hover on BatchNo to see Process icon
        Thread.sleep(4000);
        Assert.assertTrue(batch.batchNumberMouseHover());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Process batch button");
        Thread.sleep(6000);
      
        //step 153 : Process the Batch
        Assert.assertTrue(batch.ProcessBatchBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Process batch button");
        Thread.sleep(6000);
        
        
//******************************************************** eND of BATCH PROCESS*****************************************//
        
        
       /* //step ; check on batch no check boxex
        Assert.assertTrue(batch.CheckOnBatchChkBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on Batch check boxes");
        
        //step37: click on process icon
        Assert.assertTrue(batch.ClickProcessBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Process Icon");*/
        
        //step39: click on notification icon
        Assert.assertTrue(batch.ClickNotificationIcon());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on notification icon");
        
        //step40: verify the success message for completed batch process
        //String message = "Batch process completed successfully";
        Assert.assertTrue(batch.VerifyCompletedMsg());//check contains
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Batch process completed message");
        
        //step41: click on cancel button
        Assert.assertTrue(batch.ClickCancelBTNInNot());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed notification popup");
        
	 }
	
                              @DataProvider(name = "BatchProcess")
                              public Object[][] getData14() 
                              {
	                          return TestUtil.getData(xls_reader, "BatchProcess");
                               }
	
 }
