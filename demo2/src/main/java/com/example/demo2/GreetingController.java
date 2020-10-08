package com.example.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        // Run this on Windows, cmd, /c = terminate after this run
        ProcessBuilder processBuilder = new ProcessBuilder();

        StringBuffer sb=new StringBuffer("curl -X GET -H \"Authorization: Bearer BEARERTOKEN\" ");
        if (greeting.getKeywords()==null) {
            sb.append("https://api.twitter.com/1.1/search/tweets.json?q=from%3A");
            sb.append(greeting.getFollowers());
            sb.append("&result_type=recent");
        }
        else if(greeting.getFollowers()==null){
            sb.append("https://api.twitter.com/1.1/search/tweets.json?q=%23");
            sb.append(greeting.getKeywords());
            sb.append("&result_type=popular");

        }
        else{
            sb.append("https://api.twitter.com/1.1/search/tweets.json?q=from%3A");
            sb.append(greeting.getFollowers());
            sb.append("%20");
            sb.append(greeting.getKeywords());
            sb.append("&result_type=popular");

        }



        processBuilder.command("cmd.exe", "/c",sb.toString());
        try {
            StringBuffer sb2=new StringBuffer("DataBase");
            sb2.append(greeting.getFollowers());
            sb2.append(greeting.getKeywords());
            sb2.append(".json");
            FileWriter myWriter = new FileWriter(sb2.toString());

            Process process = processBuilder.start();

            // blocked :(
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            StringBuffer dev=new StringBuffer();

            while ((line = reader.readLine()) != null) {
                dev.append(line);
                myWriter.write(line);
            }
            greeting.setTwitter(dev.toString());
            myWriter.close();

            int exitCode = process.waitFor();
            System.out.println("\nExited with error code : " + exitCode);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "result";
    }

}
