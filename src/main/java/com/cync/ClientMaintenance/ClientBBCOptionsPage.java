
	package com.cync.ClientMaintenance;

	import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
																					

	
//Author garima
import com.cync.base.BasePage;

	public class ClientBBCOptionsPage  extends BasePage{

		

	public ClientBBCOptionsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	private final By BBcoptions_xpath=By.xpath("//th[@aria-label='Username: activate to sort columndescending']");
	private final By Display_xpath=By.xpath("//th[@aria-label='Date registered: activate to sort column ascending']");
	private final By Edit_xpath=By.id("edit");
	private final By Recivable_xpath=By.xpath("//td[contains(text(),'Receivables')]");
	private final By Rollforward_xpath=By.xpath(" //td[contains(text(),'Rollforward')]");
	private final By Ineligble_xpath=By.xpath("//td[contains(text(),'Ineligible')]");
	private final By Inventory_xpath=By.xpath("//td[contains(text(),'Inventory')]");
	private final By OtherColletral=By.xpath("//td[contains(text(),'Other Collateral')]");
	private final By Reserve_xpath=By.xpath("//td[contains(text(),'Reserves')]");
	private final By Display1_xpath=By.xpath("//input[@id='overall_receivables']");
	private final By Display2_xpath=By.xpath("//tbody//tr[2]//td[2]//input[2]");
	private final By Display3_xpath=By.xpath("//tbody//tr[3]//td[2]//input[2]");
	private final By Display4_xpath=By.xpath("//tbody//tr[4]//td[2]//input[2]");
	private final By Dispaly5_xpath=By.xpath("//tbody//tr[5]//td[2]//input[2]");
	private final By Dispaly6_xpath=By.xpath("//tbody//tr[6]//td[2]//input[2]");
	private final By Save_xpath=By.id("save");
	private final By Sucessmessage_xpath=By.xpath(" //div[contains(text(),'BBC Options was successfully updated.')]");



	//Method to Display BBC options
	public boolean verifyBBCoptions()
	{
		try{ WebElement clickOnsavebutton=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated( BBcoptions_xpath));
		 clickOnsavebutton.isDisplayed();
		
		 return true;
	}
	catch(Exception e)
	{
		 return false;
	}
	}
		
		//Method to display 
		
		
		public boolean verifydisplay()
		{
			try{ WebElement clickOnsavebutton=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated( Display_xpath));
			 clickOnsavebutton.isDisplayed();
			
			 return true;
		}
		catch(Exception e)
		{
			 return false;
		}
			
	}

	//Method to verify edit
		
		
		public boolean verifyEdit()
		{
			try{ WebElement clickOnsavebutton=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated( Edit_xpath));
			 clickOnsavebutton.isDisplayed();
			
			 return true;
		}
		catch(Exception e)
		{
			 return false;
		}
			
	}


	//Verify Recivable
		

		public boolean verifyRecivable()
		{
			try{ WebElement clickOnsavebutton=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated( Recivable_xpath));
			 clickOnsavebutton.isDisplayed();
			
			 return true;
		}
		catch(Exception e)
		{
			 return false;
		}
			
	}

	//Method to Verify rollforward


		public boolean verifyRollforward()
		{
			try{ WebElement clickOnsavebutton=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated( Rollforward_xpath));
			 clickOnsavebutton.isDisplayed();
			
			 return true;
		}
		catch(Exception e)
		{
			 return false;
		}
			
	}
	//Method to Verify Ineligble
		
		
		public boolean verifyIneligble()
		{
			try{ WebElement clickOnsavebutton=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated( Ineligble_xpath));
			 clickOnsavebutton.isDisplayed();
			
			 return true;
		}
		catch(Exception e)
		{
			 return false;
		}
			
	}
		
		//Method to Verify inventory
		
		public boolean verifyInventory()
		{
			try{ WebElement clickOnsavebutton=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated( Inventory_xpath));
			 clickOnsavebutton.isDisplayed();
			
			 return true;
		}
		catch(Exception e)
		{
			 return false;
		}
			
	}

		//Method to Verify to display other colletral
		
		

		public boolean verifyOtherColletral()
		{
			try{ WebElement clickOnsavebutton=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated( OtherColletral));
			 clickOnsavebutton.isDisplayed();
			
			 return true;
		}
		catch(Exception e)
		{
			 return false;
		}
			
	}
		
		//Method to verify Reserve 
		

		public boolean verifyReserve()
		{
			try{ WebElement clickOnsavebutton=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated( Reserve_xpath));
			 clickOnsavebutton.isDisplayed();
			
			 return true;
		}
		catch(Exception e)
		{
			 return false;
		}
			
	}	

		//Method to Display1
		
		
		public boolean verifyDisplay1()
		{
			try{ WebElement clickOnsavebutton=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated( Display1_xpath));
			 clickOnsavebutton.isDisplayed();
			
			 return true;
		}
		catch(Exception e)
		{
			 return false;
		}
			
	}	
		//Method to display2
		

		public boolean verifyDisplay2()
		{
			try{ WebElement clickOnsavebutton=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated( Display2_xpath));
			 clickOnsavebutton.isDisplayed();
			
			 return true;
		}
		catch(Exception e)
		{
			 return false;
		}
			
	}	
		//Method to display3
		
		public boolean verifyDisplay3()
		{
			try{ WebElement clickOnsavebutton=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated( Display3_xpath));
			 clickOnsavebutton.isDisplayed();
			
			 return true;
		}
		catch(Exception e)
		{
			 return false;
		}
			
	}	
		
		//Method to display4
		
			public boolean verifyDisplay4()
			{
				try{ WebElement clickOnsavebutton=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated( Display4_xpath));
				 clickOnsavebutton.isDisplayed();
				
				 return true;
			}
			catch(Exception e)
			{
				 return false;
			}
				
		}	
			
			//Method to display5
			
				public boolean verifyDisplay5()
				{
					try{ WebElement clickOnsavebutton=new WebDriverWait(driver,5)
					.until(ExpectedConditions.visibilityOfElementLocated( Dispaly5_xpath));
					 clickOnsavebutton.isDisplayed();
					
					 return true;
				}
				catch(Exception e)
				{
					 return false;
				}
					
			}	
				
				//Method to display6
				
				public boolean verifyDisplay6()
				{
					try{ WebElement clickOnsavebutton=new WebDriverWait(driver,5)
					.until(ExpectedConditions.visibilityOfElementLocated( Dispaly6_xpath));
					 clickOnsavebutton.isDisplayed();
					
					 return true;
				}
				catch(Exception e)
				{
					 return false;
				}
					
			}	
				
				//Method to click on save
				

				public boolean ClickOnSave()
				{
					try{
					
					WebElement saveBtnWebelement=new WebDriverWait(driver,5)
					.until(ExpectedConditions.visibilityOfElementLocated(Save_xpath));
					saveBtnWebelement.click();
					this.isAlertPresent();
					
					//////Thread.sleep(10000);
					
					return true;
				}
				

				catch(Exception ex){
					return false;
				}
					
				}
				public boolean isAlertPresent() {

				    boolean presentFlag = false;

				    try {
				        Alert alert = driver.switchTo().alert();
			   	        presentFlag = true;
				        alert.accept();
				        } catch (Exception ex) {
				        
				        System.out.println("No Such Alert Present");
				        
				    }
					return presentFlag;

				   
	}
		
				//Method to click on edit
				

				public boolean clickEdit()
				{
					
					try{Thread.sleep(1000);
						WebElement clickOnsavebutton=new WebDriverWait(driver,5)
					.until(ExpectedConditions.visibilityOfElementLocated( Edit_xpath));
					 clickOnsavebutton.click();
					
					 return true;
				}
				catch(Exception e)
				{
					 return false;
				}
					
			}

	//method to verify sucess message
				


				public boolean  verifySucessMEssage()
				{
					try{ WebElement clickOnsavebutton=new WebDriverWait(driver,5)
					.until(ExpectedConditions.visibilityOfElementLocated( Sucessmessage_xpath));
					 clickOnsavebutton .isDisplayed();
					
					 return true;
				}
				catch(Exception e)
				{
					 return false;
				}
					
			}
				
				
				//Method to  click on Display1
				
				
				public boolean clickonDisplay1()
				{
					try{ WebElement clickOnsavebutton=new WebDriverWait(driver,5)
					.until(ExpectedConditions.visibilityOfElementLocated( Display1_xpath));
					 clickOnsavebutton.click();
					
					 return true;
				}
				catch(Exception e)
				{
					 return false;
				}
					
			}	
				//Method to display2
				

				public boolean clickonDisplay2()
				{
					try{ WebElement clickOnsavebutton=new WebDriverWait(driver,5)
					.until(ExpectedConditions.visibilityOfElementLocated( Display2_xpath));
					 clickOnsavebutton.click();
					
					 return true;
				}
				catch(Exception e)
				{
					 return false;
				}
					
			}	
				//Method to  click on display3
				
				public boolean clickonDisplay3() 
				{
					try
					{ 
						Thread.sleep(500);
						WebElement clickOnsavebutton=new WebDriverWait(driver,10)
					.until(ExpectedConditions.visibilityOfElementLocated(Display3_xpath));
					 clickOnsavebutton.click();
					
					 return true;
				}
				catch(Exception e)
				{
					 return false;
				}
					
			}	
				
				//Method to  click on display4
				
					public boolean clickonDisplay4()
					{
						try{ WebElement clickOnsavebutton=new WebDriverWait(driver,5)
						.until(ExpectedConditions.visibilityOfElementLocated( Display4_xpath));
						 clickOnsavebutton.click();
						
						 return true;
					}
					catch(Exception e)
					{
						 return false;
					}
						
				}	
					
					//Method to click on  display5
					
						public boolean clickonDisplay5()
						{
							try{ WebElement clickOnsavebutton=new WebDriverWait(driver,5)
							.until(ExpectedConditions.visibilityOfElementLocated( Dispaly5_xpath));
							 clickOnsavebutton.click();
							
							 return true;
						}
						catch(Exception e)
						{
							 return false;
						}
							
					}	
						
						//Method to click on  display6
						
						public boolean clickonDisplay6()
						{
							try{ WebElement clickOnsavebutton=new WebDriverWait(driver,5)
							.until(ExpectedConditions.visibilityOfElementLocated( Dispaly6_xpath));
							 clickOnsavebutton.click();
							
							 return true;
						}
						catch(Exception e)
						{
							 return false;
						}
							
					}	
	}


