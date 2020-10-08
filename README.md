# TwitterApi_search
 #This is a spring boot application for retrieving tweets based on two parameters(By account name and keywords).
 #Download this project and open it using IDE.
  #There is a GreetingController class in the project(/demo2/SRC/main/java/com/example)
  #In the GreetingSubmit method, replace the text 'BEARERTOKEN' with that of bearer token obtained from twitter developer account.
  On how to obtain a bearer token visit: https://developer.twitter.com/en
  After entering the bearertoken, run the Demo2Application.java file
  Open your browser and go to localhost:8080/greeting to access the application.(Note:Some IDE's may host at a different address. In that case, go to the address at which your IDE hosted)
  You will be greeted with a page which asks you to enter your parameters for retreiving the tweets. If you hit submit without any parameters, then tweets you will see are the trending tweets in your region.
  If you wish to see recent tweets of a particular account, then enter the name of the account handle in the account section.
  If you wish to see the tweets of a particular hashtag or keyword, then the enter your input in the keywords section.
  If you want to see the tweets which contain the keyword and had been tweeted by a particular account, then fill out both the sections with your inputs.
  The tweets received are real time and provided by Twitter API. The JSON object received from Twitter API are stored in a file(/demo2). 
  For more advanced twitter functions visit: https://developer.twitter.com/en/support/twitter-api
  
  
  
