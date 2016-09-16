import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("words", Word.all());
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("words", Word.all());
      model.put("template", "templates/index.vtl");
      String wordInput = request.queryParams("wordInput");
      Word word = new Word(wordInput);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/word.vtl");
      Word word= Word.find(Integer.parseInt(request.params(":id")));
      model.put("word", word.getWord());
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/word.vtl");
      Word word= Word.find(Integer.parseInt(request.params(":id")));
      String definitionInput= request.queryParams("definitionInput");
      Definition wordDefinition = new Definition(definitionInput);
      word.define(wordDefinition);
      model.put("word", word.getWord());
      model.put("definitions", word.getDefinitions());
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
