import controller.RateLimitSystemController;
import model.Response;
import controller.RuleController;
import model.*;

public class Client {
    public static void main(String[] args) {

        RuleController ruleController = new RuleController();
        ruleController.addRule(new Rule("X123A-24DDD",1,10));
        ruleController.addRule(new Rule("/v1/details", 2, 10));
        ruleController.addRule(new Rule("Y223A-24DD0",2,10));

        Request requestOne = new Request("X123A-24DDD", "/v1/details");

        Request requestTwo = new Request("X123A-24DDD", "/v1/details");

        RateLimitSystemController rms = new RateLimitSystemController();

        Response response = rms.mainApiController(requestOne);
        System.out.printf(response.getStatusCode().toString());

        Response response2 = rms.mainApiController(requestTwo);
        System.out.printf(response.getStatusCode().toString());

    }
}