# William Newman - Merch Project java Backend
Business logic for the Merch project

## Project Repos
This the application layer of the Merch project held in the repository located at:

## Getting Started

These instructions will help you run the Merch project

Open up this project with IntelliJ and make sure that Maven has imported all dependencies
Default socket is set to port 27018 as the database is set to publish to this host and port

Run the MerchRunner class

For the detailed documentation on using this API, refer to the Swagger Documentation
To view the Swagger Documentation, navigate your browser to http://localhost:8080/swagger-ui.html with MapMakerRunner running

## Setup Testing

It is recommended to have the project database running on port 27018 before running tests

## A note about Code Quality

IntelliJ's code formatter has been run on each file in this project, however the spaces between the import statements
    have been removed. Using the formatter will re-create these empty lines
    
#### Building The Docker Image
	
```
$ docker build -t merch .
```
#### Running The Docker Image
	
```
$ docker run -d -p 27023:27018 --name merch mongo
```

```
In a terminal window:

$ docker exec -it merch mongo
- will connect to the running container and start the mongo shell.
...
> show databases
	admin
	merch
	local
> type your commands here...
```