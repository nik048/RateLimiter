package controller;

import model.HttpStatusCode;
import model.Request;
import model.Response;
import service.RateLimitSystemService;

import java.util.ArrayList;
import java.util.List;

public class RateLimitSystemController {
    RuleController ruleController = new RuleController();
    RateLimitSystemService apiKeyAndEndPointRateLimiter = new RateLimitSystemService();


    public Response mainApiController(Request request){
        List<String> keys = new ArrayList<>();
        keys.add(request.getRequestApiKey());
        keys.add(request.getRequestEndPoint());

        //RateLimiterController rateLimiter = RateLimitSystemControllerFactory.getRateLimiter(RateLimiterType.);

        Response response;
        if(!this.apiKeyAndEndPointRateLimiter.isRateLimitExausted(keys)){
            response = new Response(HttpStatusCode.HTTP_OK, "Allowed");
        }
        else{
            response = new Response(HttpStatusCode.HTTP_RATE_LIMIT_EXCEED, "Deny");
        }

        return  response;
    }
}
