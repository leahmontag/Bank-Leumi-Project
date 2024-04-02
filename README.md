# Bank-Leumi-Project
# המשימה:
יצירת תהליך בJenkins מבוסס Jenkins declarative pipeline, אשר:
1. בונה את התוצר  Lambda (מסוג API) מבוסס כל שפה שתחליט.
2. יוצר באמצעות Terraform תשתית Lambda + S3, פורס לשם ומעלה את התוצר.
3. יוצר באמצעות Terraform API gateway ומקשר אותו לLambda.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# ניגשתי למשימה קודם כל ע"י:
1. לימוד החומרים החדשים בעיקר לימוד AWS, וכל הסרביסים שנדרשו למשימה - Lambda, S3, API Gateway.
2. פתיחת ריפוזיטורי חדש בגיטהב שאותו עדכנתי במהלך כל התרגיל.
3. חיפוש באינטרנט של חומרים וקישורים שיעזרו לי לפתרון התרגיל.
4. פתרון התרגיל לוקאלית מVS Code לAWS בעזרת קבצי Terraform.
5. פתרון התרגיל על גבי שרת Jenkins ע"י Pipeline.

# צילומי מסך לאורך שלבי הפרויקט:
### Github:

![image](https://github.com/leahmontag/Bank-Leumi-Project/assets/89600755/34091d4c-e53c-4764-b075-8c18ed3cd86b)

### SSH Authentication between GitHub and Jenkins:

![image](https://github.com/leahmontag/Bank-Leumi-Project/assets/89600755/709bae15-8d10-4fe4-a1ab-1ddb7b1dd740)

![image](https://github.com/leahmontag/Bank-Leumi-Project/assets/89600755/d7cfa411-4dcc-4833-aa85-7eb6eaff0c88)

### Terraform:

![image](https://github.com/leahmontag/Bank-Leumi-Project/assets/89600755/de3a131e-5032-43a3-a7f1-d65c1465e2fe)

### AWS:

![image](https://github.com/leahmontag/Bank-Leumi-Project/assets/89600755/bff7e08a-9132-4f71-98e2-c6ec8aa85d39)


![image](https://github.com/leahmontag/Bank-Leumi-Project/assets/89600755/e4eb4f00-3f16-470f-9030-b2275c970db2)


![image](https://github.com/leahmontag/Bank-Leumi-Project/assets/89600755/c50c6935-82f5-43de-9cc8-8dcedff16503)


![image](https://github.com/leahmontag/Bank-Leumi-Project/assets/89600755/ab9535e8-ef79-4b7f-a9da-34b2f84b2292)


![image](https://github.com/leahmontag/Bank-Leumi-Project/assets/89600755/f18b06d1-a96b-48be-bc86-292d0ec96941)


![image](https://github.com/leahmontag/Bank-Leumi-Project/assets/89600755/b421f619-fb68-4ea0-afff-d0bbcd33d6d3)

### Jenkins:

![image](https://github.com/leahmontag/Bank-Leumi-Project/assets/89600755/8c0ca66d-e919-4568-82a2-3ab2b7a93479)


![image](https://github.com/leahmontag/Bank-Leumi-Project/assets/89600755/610c3ccb-5beb-4325-b82e-aa629ad1472f)


![image](https://github.com/leahmontag/Bank-Leumi-Project/assets/89600755/7628798d-3ac5-47d2-87cc-906de9c73bec)


![image](https://github.com/leahmontag/Bank-Leumi-Project/assets/89600755/496cc944-41e8-4397-9682-5c5828478643)


### https://hk7qus7pbl.execute-api.us-west-2.amazonaws.com/lambda_stage/

![image](https://github.com/leahmontag/Bank-Leumi-Project/assets/89600755/1f89a1da-e2a5-432d-9610-61f9b27ef709)


---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# קישורים שנעזרתי בהם:
1. https://medium.com/@nikhil.nagarajappa/configuring-the-git-credentials-in-jenkins-4b584a797b45
2. https://stackoverflow.com/questions/13363553/git-error-host-key-verification-failed-when-connecting-to-remote-repository
3. https://www.youtube.com/watch?v=XEeRmxEZZj8
4. https://spacelift.io/blog/terraform-jenkins
5. https://www.youtube.com/watch?v=bybQxpM0kSQ
6. https://www.tocode.co.il/blog/2021-05-aws-lambda-gateway
7. https://github.com/eladjmc/terraform-lambda-aws/blob/main/README.md

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# ארכיטקטורת הפרויקט:

![image](https://github.com/leahmontag/Bank-Leumi-Project/assets/89600755/4ca55932-2309-4cec-95e5-61b8091d6d09)

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


