package com.demo.linkedin.connect;

import org.scribe.builder.ServiceBuilder;
import org.scribe.builder.api.LinkedInApi;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;

import java.io.*;
/**
 * Connecting to LinkedIn using OAUTH
 * @author Rishu Shrivastava
 *
 */
public class ConnectLinkedIn {

	private static String API_KEY = "81j8lz2seitqgr";
	private static String API_SECRET = "rLxAC5prXvX0bo57";
	
	public static void main(String[] args) {
		
		Token accessToken = null;
		
		OAuthService service = new ServiceBuilder()
                .provider(LinkedInApi.class)
                .apiKey(API_KEY)
                .apiSecret(API_SECRET)
                .build();
		

        try{
            File file = new File("service.dat");

            if(file.exists()){
                //if the file exists we assume it has the AuthHandler in it - which in turn contains the Access Token
                @SuppressWarnings("resource")
				ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
                AuthHandler authHandler = (AuthHandler) inputStream.readObject();
                accessToken = authHandler.getAccessToken();
            } else {
                System.out.println("There is no stored Access token we need to make one");
                //In the constructor the AuthHandler goes through the chain of calls to create an Access Token
                AuthHandler authHandler = new AuthHandler(service);
                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("service.dat"));
                outputStream.writeObject( authHandler);
                outputStream.close();
                accessToken = authHandler.getAccessToken();
            }
            
        }catch (Exception e){
            System.out.println("Threw an exception when serializing: " + e.getClass() + " :: " + e.getMessage());
        }
		
        
        /**************************
        *
        * Querying the LinkedIn API
        *
        **************************/

       System.out.println();
       System.out.println("********A basic user profile call********");
       //The ~ means yourself - so this should return the basic default information for your profile in XML format
       //https://developer.linkedin.com/documents/profile-api
       String url = "http://api.linkedin.com/v1/people/~";
       OAuthRequest request = new OAuthRequest(Verb.GET, url);
       service.signRequest(accessToken, request);
       Response response = request.send();
       System.out.println(response.getBody());
       System.out.println();System.out.println();		
	}

}
