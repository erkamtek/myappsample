using System;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Firefox;

namespace SeleniumFirst
{
    class Program
    {
        IWebDriver driver ;
        static void Main(string[] args)
        {

            IWebDriver driver = new FirefoxDriver();
            driver.Navigate().GoToUrl("http://www.google.com");

            IWebElement element = driver.FindElement(By.Name("q"));

            element.SendKeys("erkam Tek");

            driver.Close();

        }
    }
}
