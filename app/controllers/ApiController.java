package controllers;

import play.mvc.*;
import play.libs.*;
import java.util.*;
import models.Province;

import views.html.*;

import com.fasterxml.jackson.databind.*;

public class ApiController extends Controller {

		public Result Provinces() {
			JsonNode json = Json.toJson(models.Province.find.all());
			return ok(Json.prettyPrint(json));
		}

		public Result search(String term) {
			List<Province> result = new ArrayList<>();
			for (Province p : Province.find.all()) {
				if (p.contains(term)) {
					result.add(p);
				}
			}
			return ok(Json.prettyPrint(Json.toJson(result)));
		}
}
