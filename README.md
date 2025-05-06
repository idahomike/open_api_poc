# OpenAPI (Swagger) Proof of Concept
The goal fo this project was to have a proof of concept and evaluate OpenAPI framework for API development. Additionally
it offered an opportunity to explore the various tool sets, tool sets, integration points and other questions that
affect teh long term support, quality and reliability of the code base.

### Advantages of OpenAPI
* Well established standard
* Design first approach for earlier integration and partner development
* Integrates and is supported by many tools, plugins, etc.
* Helps decouple the API spec from the implementation
* Makes keeping documentation up to date easy

### Tools Used
### Docker
I ran my toolset in docker containers on my development machine. This had many advantages. The was no requirement to
do any installs, The Docker container environment very well controlled, so the process and end results are consistant,
and portable. The could be run on a cloud server, locally, etc.
### openapi-generator
This is engine for generating the open api based on the configuration file. It generates the bones of the api including
the documentation and supporting code used in the implementation. The generator support many languages. I chose Java
but could just as easily have chosen C#, go or TypeScript. 
### WireMock
With this tool I was able to create a mock server that supports the OpenAPI. This allows for services that are dependent
on the new API even before it is fully implemented. With it I was able to create a server that mocked the endpoints
of the API and return stubbed out results.

## Requirements
Install Docker on your local machine first. 

## OpenAPI

I created the spec for my API using API-fiddle. There are many other options. Once the spec was done I used the 
following command to run the generator.

```commandline
docker run --rm     -v $PWD:/local openapitools/openapi-generator-cli generate     -i /local/fishing.yaml     -g java -o /local/out/java
```

## Build And Run WireMock server in a Docker Container
I next build my WireMock server and ran it in a Docker container. There are tools for automatically building and maintaining 
a WireMock as it changes based on info available on OpenAPI. This would be ideal for a production environment. Given
my goals and time, I chose to implement a single endpoint manually.

Here is the command to build the docker image.
```
 docker build -t wiremock-fish wiremock-docker/fish
```
Here is the command to run a container of that image and the endpoint to check.
```
docker run -it --rm -p 8080:8080 wiremock-fish
http://localhost:8080/api/v1/fish
```



