import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/squads/new", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/squad-create.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/squads", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      String squadName = request.queryParams("squadName");
      String squadCause = request.queryParams("squadCause");
      int squadSize = Integer.parseInt(request.queryParams("squadSize"));
      Squad squad = new Squad(squadName, squadSize, squadCause);
      model.put("squads", Squad.all());
      model.put("template", "templates/squads.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/squads", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("squads", Squad.all());
      model.put("template", "templates/squads.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/squads/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Squad squad = Squad.find(Integer.parseInt(request.params(":id")));
      model.put("squadName", squad.getSquadName());
      model.put("squadCause", squad.getSquadCause());
      model.put("squadSize", squad.getMaxSize());
      model.put("squadHeroes", squad.getHeroes());
      model.put("attackPoints", squad.getAttackPoints());
      model.put("defensePoints", squad.getDefensePoints());
      model.put("healthPoints", squad.getHealthPoints());
      model.put("heroes", squad.getHeroes());
      model.put("template", "templates/squad.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/squads/:id/heroForm", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/hero-create.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/squads/:id/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/hero.vtl");
      String heroName = request.queryParams("heroName");
      Integer heroAge = Integer.parseInt(request.queryParams("heroAge"));
      String heroPower = request.queryParams("heroPower");
      String heroWeakness = request.queryParams("heroWeakness");
      Integer attackPoints = Integer.parseInt(request.queryParams("attackPoints"));
      Integer defensePoints = Integer.parseInt(request.queryParams("defensePoints"));
      Integer healthPoints = Integer.parseInt(request.queryParams("healthPoints"));
      Hero hero = new Hero(heroName, heroAge, heroPower, heroWeakness, attackPoints, defensePoints, healthPoints);
      Squad squad = Squad.find(Integer.parseInt(request.params(":id")));
      model.put("heroes", squad.getHeroes());
      model.put("heroName", heroName);
      model.put("heroAge", heroAge);
      model.put("heroPower", heroPower);
      model.put("heroWeakness", heroWeakness);
      model.put("attackPoints", attackPoints);
      model.put("defensePoints", defensePoints);
      model.put("healthPoints", healthPoints);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
