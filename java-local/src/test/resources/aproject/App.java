package aproject;

import com.google.gson.JsonObject;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {

  public static JsonObject main(JsonObject args) {
    String name = "stranger";
    if (args.has("name"))
      name = args.getAsJsonPrimitive("name").getAsString();
    JsonObject response = new JsonObject();
    response.addProperty("greeting", "Hello " + name + "!");
    return response;
  }
}
