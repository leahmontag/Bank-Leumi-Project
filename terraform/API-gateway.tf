resource "aws_apigatewayv2_api" "lambda" {
  name          = "lambda_gateway"
  protocol_type = "HTTP"
}

resource "aws_apigatewayv2_integration" "home_task" {
  api_id = aws_apigatewayv2_api.lambda.id

  integration_uri    = aws_lambda_function.app_lambda.invoke_arn
  integration_type   = "AWS_PROXY"
  integration_method = "POST"
}

resource "aws_apigatewayv2_stage" "lambda" { 
  api_id = aws_apigatewayv2_api.lambda.id

  name  = "lambda_stage"
  auto_deploy = true

}

resource "aws_apigatewayv2_route" "home_task" {
  api_id = aws_apigatewayv2_api.lambda.id

  route_key = "GET /"
  target    = "integrations/${aws_apigatewayv2_integration.home_task.id}"
}

resource "aws_lambda_permission" "api_gw" {
  statement_id  = "AllowExecutionFromAPIGateway"
  action        = "lambda:InvokeFunction"
  function_name = aws_lambda_function.app_lambda.function_name
  principal     = "apigateway.amazonaws.com"

  source_arn = "${aws_apigatewayv2_api.lambda.execution_arn}/*/*"
}