package com.bridgetestmiklan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import com.bridgetestmiklan.model.History;
import java.util.ArrayList;


import java.util.List;

@RestController
public class Controller {
    ArrayList<History> historyFat =  new ArrayList<History>();

     private void put(Long result){
        historyFat.add(new History(result));
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/fatorial/{number}")
    public Long resolveFatorial(@PathVariable Long number) {
      return fatorial(number);
   }

    @CrossOrigin(origins="http://localhost:3000")
    @GetMapping("/history")
    public ArrayList<History> getHistory(){
      return historyFat;
    }

     private Long fatorial(Long number){
      Long size = number;
      Long n = number;
      Long mult = number;

      for(int i = 0 ; i < size-1;i++){
        mult *= (n-1);
        n = n-1;
      }
      
      if(mult == 0){
        mult =1L;
      }

      put(mult);

      return mult;
    }
  
}

