package com.bzy.template.controller;

import com.bzy.template.vo.Listing;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by baishengjia on 2017/11/30.
 */
@Controller
public class JspTestController {


    /**
     * jsp
     * @param model
     * @return
     */
    @RequestMapping("/jsp")
    public String httl(Model model) {
        List<Listing> lists= new ArrayList<>();
        for (int i=0 ; i<10 ;i++) {
            Listing listing = new Listing();
            listing.setListId(1245L+i);
            listing.setListName("测试室"+i);
            listing.setMerchantId(4545L+i);
            listing.setStoreName("店铺"+i);
            listing.setPrdId(65L+i);
            listing.setTimeDate(new Date());
            listing.setPrice(12.1F+i);
            listing.setCreatTime(1512035816);
            lists.add(listing);
        }
        model.addAttribute("lists",lists);
        return "listing";
    }
}
