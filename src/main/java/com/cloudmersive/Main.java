package com.cloudmersive;

import com.cloudmersive.client.*;
import com.cloudmersive.client.model.*;
import com.cloudmersive.client.invoker.*;
import com.cloudmersive.client.invoker.auth.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        ApiClient client = new ApiClient();
        client.addDefaultHeader("Apikey", "14343416-776b-40e8-b6d7-6ffaa0bd70f9");

        client.setReadTimeout(300000);
        client.setWriteTimeout(300000);
        client.setConnectTimeout(300000);






        try
        {
            // Customer

            ApiClient defaultClient = Configuration.getDefaultApiClient();

            // Configure API key authorization: Apikey
            ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
            Apikey.setApiKey("f0c513bc-8c00-4491-830e-3e83b015feb6");

            
            ScanApi apiInstance = new ScanApi();
            File inputFile = new File("./pdf1.pdf"); // File | Input file to perform the operation on.
            try {
                VirusScanResult result = apiInstance.scanFile(inputFile);
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
