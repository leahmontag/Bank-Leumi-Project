def lambda_handler(event, context):
    body = '''
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>My Lambda Website</title>
                <style>
                    * {
                        margin: 0;
                        padding: 0;
                        box-sizing: border-box;
                    }
                    body {
                        height: 100vh;
                        width: 100%;
                        background-color: #007bff;
                        display: flex;
                        flex-direction: column;
                        gap: 20px;
                        justify-content: center;
                        align-items: center;
                        font-family: Arial, sans-serif;
                        padding: 50px;
                    }
                    h1 {
                        font-size: 2.5rem;
                        color: #150463;
                        text-align: center;
                    }
                    h2 {
                        font-size: 1.2rem;
                        color: #007bff;
                        text-align: center;
                    }
                    .container {
                        max-width: 1000px;
                        padding: 20px;
                        background-color: #fff;
                        border-radius: 10px;
                        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                    }
                </style>
            </head>
            <body>
                <div class="container">
                    <h1>Welcome To My Home Task Of Bank Leumi</h1>
                    <br> 
                    <h2>Submitted by Leah Gutfroind - Montag</h2>
                    <br> 
                    <h2>Tools: AWS, Lambda, API Gateway, Jenkins and more...</h2>
                </div>
            </body>
            </html>
    '''
    return {
        'statusCode': 200,
        'body': body,
        'headers': {
            'Content-Type': 'text/html',
        }
    }
