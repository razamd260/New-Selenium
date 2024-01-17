package NetWork;


import java.util.Optional;
import org.openqa.selenium.devtools.v112.network.model.Response;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import org.openqa.selenium.devtools.v112.network.Network;
import org.openqa.selenium.devtools.v112.network.model.Request;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1 {
	public static void main(String[] args) {
     WebDriverManager.chromedriver().setup();
     ChromeDriver driver=new ChromeDriver();
     DevTools devtool=driver.getDevTools();
     devtool.createSession();
     devtool.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
     devtool.addListener(Network.requestWillBeSent(), request ->
        {
        	Request req=request.getRequest();
        	//System.out.println(req.getUrl());
    	            } );
     devtool.addListener(Network.responseReceived(), response->
     {
    	 Response res=response.getResponse();
    	 System.out.println(res.getStatus());
         });
    		 
	 driver.get("https://www.facebook.com");
	}
}
