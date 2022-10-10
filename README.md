# AccessSSMParamStore
#### In this project we'll learn how to get parameter value from AWS SSM Paramter Store.

## Technologies:
* Java 11
* Spring Boot 2.7.5-SNAPSHOT
* Maven 3.8.6
* AWS CLI - aws-cli/1.25.90 Python/3.8.10 Windows/10 botocore/1.27.89
## Tools:
* Intellij
* Git
* Postman
## Requirements:
We need AWS account with Systems Manger access to run and test this application.
* Create a AWS Free Tier Account
* Download and install AWS CLI
* Then open cmd and run `aws configure` and give Access_key (xxxx), Secret_key (xxxx), Default Region (us-west-2) and Defauly Out format (json)
  - AccessKey and Secret you need to get from your AWS account by creating User
    - Note: You need to give admin access to the user to access SSM Param Store.

#### For building and running the application:

* JDK 11.0.16
* Apache Maven 3.8.6
* AWS

#### Running the application locally:

* Clone the Git repository or download zip file.
* Open command promt from the cloned project directory (if downloaded zip file, then unzip file into a directory).
* Run the below commands
```
mvn clean install
mvn package
```
There are several ways to run a Spring Boot application on your local machine. One way is to execute the main method in the com.aws.ssm.SsmApplication class from your IDE.

Alternatively you can use the Spring Boot Maven command in command prompt/terminal like :
```
mvn spring-boot:run
```
This application runs on port 9191.

#### Run application in docker container:

1.Build image
```
docker build [OPTIONS] PATH | URL | -
```

2.Run application in container
```
docker run -d --name accessawsparamstore -p 9191:9191 [image id]
```
