import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<Object, String> {

    @Override
    public String handleRequest(Object input, Context context) {
        String body = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Leah Montag's Lambda | Terraform</title>\n" +
                "    <style>\n" +
                "        * {\n" +
                "            margin: 0;\n" +
                "            padding: 0;\n" +
                "            box-sizing: border-box;\n" +
                "        }\n" +
                "        body {\n" +
                "            height: 100vh;\n" +
                "            width: 100%;\n" +
                "            background-color: #b0b0f2;\n" +
                "            display: flex;\n" +
                "            flex-direction: column;\n" +
                "            gap: 10px;\n" +
                "            padding-top: 100px;\n" +
                "            align-items: center;\n" +
                "        }\n" +
                "        h2 {\n" +
                "            font-size: 3rem;\n" +
                "            color: rgb(54, 53, 53);\n" +
                "            background-color: rgba(0, 0, 255, 0.473);\n" +
                "            width: 350px;\n" +
                "            border-radius: 20px;\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>This lambda website was deployed by:</h1>\n" +
                "    <h2>Leah Montag</h2>\n" +
                "    <p>Using Terraform to deploy the AWS Lambda and S3 bucket</p>\n" +
                "</body>\n" +
                "</html>";

        return body;
    }
}
