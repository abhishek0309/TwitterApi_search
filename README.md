# TwitterApi_search
## This is a spring boot application for retrieving tweets based on two parameters(By account name and keywords).
Download this project and open it using IDE.<br>
 There is a GreetingController class in the project(/demo2/SRC/main/java/com/example)<br>
  In the GreetingSubmit method, replace the text 'BEARERTOKEN' with that of bearer token obtained from twitter developer account.<br>
  On how to obtain a bearer token visit: https://developer.twitter.com/en<br>
  After entering the bearertoken, run the Demo2Application.java file.<br>
  Open your browser and go to localhost:8080/greeting to access the application.(Note:Some IDE's may host at a different address. In that case, go to the address at which your IDE hosted)<br>
  You will be greeted with a page which asks you to enter your parameters for retreiving the tweets.<br>If you hit submit without any parameters, then tweets you will see are the trending tweets in your region.<br>
  If you wish to see recent tweets of a particular account, then enter the name of the account handle in the account section.<br>
  If you wish to see the tweets of a particular hashtag or keyword, then the enter your input in the keywords section.<br>
  If you want to see the tweets which contain the keyword and had been tweeted by a particular account, then fill out both the sections with your inputs.<br>
  The tweets received are real time and provided by Twitter API. The JSON object received from Twitter API are stored in a file(/demo2). <br>
  For more advanced twitter functions visit: https://developer.twitter.com/en/support/twitter-api
  
  
  
