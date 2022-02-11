package edu.wctc.springbootassignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController
{
  @RequestMapping("ideal-building-conditions")
  public String getBuildingConditionsPage()
  {
      return "pages/idealconditions";
  }

  @RequestMapping("best-building-sites")
  public String getBuildingSitesPage()
  {
      return "pages/buildingsite";
  }

  @RequestMapping("building-techniques")
  public String getBuildingTechniquesPage()
  {
      return "pages/buildingtechniques";
  }

  @RequestMapping("home")
  public String getHomePage()
  {
      return "index";
  }


}
