package controller;

import model.HttpStatusCode;
import model.Request;
import model.Response;
import service.RateLimitSystemService;

public class RateLimitSystemController {
    RuleController ruleController = new RuleController();
    RateLimitSystemService apiKeyAndEndPointRateLimiter = new RateLimitSystemService();


    public Response mainApiController(Request request){
        String apiKey = request.getRequestApiKey();
        String apiEndpoint = request.getRequestEndPoint();

        //RateLimiterController rateLimiter = RateLimitSystemControllerFactory.getRateLimiter(RateLimiterType.);

        Response response;
        if(!this.apiKeyAndEndPointRateLimiter.isRateLimitExausted()){
            response = new Response(HttpStatusCode.HTTP_OK, "Allowed");
        }
        else{
            response = new Response(HttpStatusCode.HTTP_RATE_LIMIT_EXCEED, "Deny");
        }

        return  response;
    }
}
