using System;
using OpenQA.Selenium;
using OpenQA.Selenium.Support.PageObjects;

namespace SeleniumFirst
{
    public class EAPageObject
    {
        
        public EAPageObject(){

            PageFactory.InitElements(PropertiesCollection.driver,this);
        }


        [FindsBy(How = How.Id, Using= "TitleId")]
        public IWebElement ddlTitleID { get; set; }

        [FindsBy(How = How.Name, Using = "Initial")]
        public IWebElement txtInitial { get; set; }

        [FindsBy(How = How.Name, Using = "FirstName")]
        public IWebElement txtFirstName { get; set; }

        [FindsBy(How = How.Id, Using = "TitleId")]
        public IWebElement btnSave { get; set; }


    }
}
