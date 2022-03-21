# Backend-Spring-Cloud
<div id="top"></div>

<h3 align="center">Backend-Spring-Cloud</h3>

  <p align="center">
    Project of the course "Software-Engineering for the Cloud - M2" | Nathan Picchiottino & Victor Tang
    <br />
    <br />
  </p>

<!-- TABLE OF CONTENTS-->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

This is the backend part of the project. It is used as a REST API with HTTP requests.
The frontend made with Angular CLI will use HTTP Requests to the backend to manipulate data and manipulate indirectly the database.

With the API it's possible to:
* Get information of all sensitivities or a specific sensitivity by using a specific ID (GET Method)
* Create a sensitivity (POST Method)
* Modify a sensitivity or creating a new one (PUT Method)
* Delete a sensitivity (DELETE Method)


Use the `BLANK_README.md` to get started.

<p align="right">(<a href="#top">Back to top of page</a>)</p>



### Built With

This section should list any major frameworks/libraries used to bootstrap your project. Leave any add-ons/plugins for the acknowledgements section. Here are a few examples.

* [Java](https://www.java.com/fr/)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [PostgreSQL](https://www.postgresql.org/)

<p align="right">(<a href="#top">Back to top of page</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

Instructions to get the project working locally on the machine. But it's not recommanded here because we have already a solution to build the whole project with only two command lines using Docker.

### Prerequisites

It's important to have Docker installed on the machine, also Java of course.

### Installation

To initialise the database, the command is the following:

```sh
docker run -p 12321:5432 --name pgdbcloud -e POSTGRES_PASSWORD=rootpass -d postgres
```
Then we need to create a database named clouddb with default settings on pgAdmin.
But when we build the entire project with the docker-compose file, it's not important to do that.
To access it on pgAdmin, the URL for connection is localhost:12321.
The username and the password of the database are postgres/rootpass.

The others command to build this part of the project are:

```sh
./gradlew clean build
```

Then here we have the Docker part for building.
```sh
docker build -t backspringcloud .
```

And finally the command for running the project:

```sh
docker run -it -p 12322:8080 backspringcloud
```

<p align="right">(<a href="#top">Back to top of page</a>)</p>



