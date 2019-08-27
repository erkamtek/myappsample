using System;
using OpenQA.Selenium;
using OpenQA.Selenium.Support.PageObjects;


namespace SeleniumFirst
{
    public class LoginPageObject
    {
        public LoginPageObject()
        {
            PageFactory.InitElements(PropertiesCollection.driver, this);
            
        }

        [FindsBy(How = How.Name, Using = "UserName")]
        public IWebElement txtUserName { get; set; }

        [FindsBy(How = How.Name, Using = "Password")]
        public IWebElement txtPassword { get; set; }

        [FindsBy(How = How.Name, Using = "Login")]
        public IWebElement btnLogin { get; set; }


        public void Login(string userName, string password){

            //USername
            txtUserName.SendKeys(userName);

            txtPassword.SendKeys(password);

            btnLogin.Submit();


        }

    }
}
