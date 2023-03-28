# Getting Started with SkySQL

[![License](https://img.shields.io/badge/License-MIT-blue.svg?style=plastic)](https://opensource.org/licenses/MIT)

This repository contains the examples developed during the webinar *Developing Unstoppable Applications with the SkySQL Cloud Database Service* by [Alejandro Duarte](https://twitter.com/alejandro_du).

[Watch the recording here](https://go.mariadb.com/23Q2-WBN-GLBL-DBaaS-Developing-Unstoppable-Applications-SkySQL-2023-03-28_Registration-LP.html).

![Developing Unstoppable Applications with the SkySQL Cloud Database Service](https://repository-images.githubusercontent.com/616663439/d4b9efa5-426c-4758-b79c-0541b342415b)

MariaDB [SkySQL](https://mariadb.com/products/skysql/) is a fully-managed cloud database service enabling you to deploy and manage [MariaDB Enterprise Server](https://mariadb.com/products/enterprise/), [Xpand](https://mariadb.com/products/enterprise/xpand/) distributed SQL, [ColumnStore](https://mariadb.com/products/columnstore/) and Serverless Analytics powered by Apache Spark SQL as database services with only a few clicks.


## Requirements

The examples were developed with the following:

 * Java 17 or later
 * Python 3
 * NodeJS 19 or later

## Setting up a SkySQL service

Before running the examples, [create a new account in SkySQL](https://skysql.mariadb.com/) (free, no credit card needed), spin up a new *Enterprise Server With Replica(s)* service, and create a new `demo` schema using the *Query Editor* in the SkySQL portal. Watch the [webinar](https://go.mariadb.com/23Q2-WBN-GLBL-DBaaS-Developing-Unstoppable-Applications-SkySQL-2023-03-28_Registration-LP.html) for detailed steps.

## Configuring the connection

Before running the examples, change the following placeholders in the source code:

 * `DOMAIN_NAME`: Fully-qualified domain name from the SkySQL service that you created.
 * `USER`: Username from the SkySQL service.
 * `PASSWORD`: Password from the SkySQL service.
 * `CERT_PEM`: Full path to the PEM file downloaded from the SkySQL service.

## Running the examples

Please, watch the [webinar](https://go.mariadb.com/23Q2-WBN-GLBL-DBaaS-Developing-Unstoppable-Applications-SkySQL-2023-03-28_Registration-LP.html) for detailed steps.

## Useful resources

If you are new to data persistence and database connectivity with [MariaDB](https://mariadb.com) and Java, JavaScript, or Python, check the quick start page:

https://mariadb.com/developers/quickstart

### Java

To learn more about how to connect to MariaDB (including SkySQL) using Java persistence frameworks and libraries such as JPA/Hibernate, Spring Boot Data, R2DBC, jOOQ, MyBatis, JakartaEE, Microprofile, check the Java quick start repository:

https://github.com/mariadb-developers/java-quickstart

### JavaScript/Node.js

To learn more about how to connect to MariaDB (including SkySQL) using JavaScript with TypeORM or Sequelize, check the following repositories:

https://github.com/mariadb-developers/nodejs-typeorm-quickstart
https://github.com/mariadb-developers/nodejs-sequelize-quickstart

### Python

To learn more about how to connect to MariaDB (including SkySQL) using Python and SQLAlchemy, check the following repository:

https://github.com/mariadb-developers/todo-app-python-sqlalchemy

## Support and Contribution

Please feel free to submit PR's, issues or requests to this project
directly.

If you have any other questions, comments, or looking for more information
on MariaDB please check out:

* [MariaDB Developer Hub](https://mariadb.com/developers)
* [MariaDB Community Slack](https://r.mariadb.com/join-community-slack)

Or reach out to us directly via:

* [developers@mariadb.com](mailto:developers@mariadb.com)
* [MariaDB Twitter](https://twitter.com/mariadb)
