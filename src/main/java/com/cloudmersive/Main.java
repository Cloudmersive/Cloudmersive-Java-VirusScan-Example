package com.cloudmersive;

import com.cloudmersive.client.*;
import com.cloudmersive.client.model.*;
import com.cloudmersive.client.invoker.*;
import com.cloudmersive.client.invoker.auth.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {




        try
        {
            // Customer

            ApiClient defaultClient = Configuration.getDefaultApiClient();

            // Configure API key authorization: Apikey
            ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
            Apikey.setApiKey("YOUR-KEY");

            
            ScanApi apiInstance = new ScanApi();
            File inputFile = new File("C:\\Users\\Administrator\\Documents\\GitHub\\Cloudmersive-Java-VirusScan-Example\\pdf1.pdf"); // File | Input file to perform the operation on.
            
            ByteArrayInputStream inputStream = new ByteArrayInputStream(new byte[100]);
            
            try 
            {
                VirusScanResult result = apiInstance.scanFile(inputStream);
                System.out.println(result);
            } catch (ApiException e) {
                System.err.println("Exception when calling ScanApi#scanFile");
                e.printStackTrace();
            }


        }
        catch (Exception e)
        {
            System.out.println("Error:" + e.toString() + e.getMessage() );
        }




    }
}
