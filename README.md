# nokri-app-backend

### How to setup database 

We assume you have setup postgresql locally. 


We use Flyway for database migration. Use the following command to setup database locally

```
mvn flyway:migrate -Dflyway.locations=filesystem:./api/src/main/resources/db/migration -Dflyway.url=jdbc:postgresql://localhost:5432/myDB -Dflyway.user=myUser -Dflyway.password=myPassword
```

replace myDB, myUser and myPassword with your credentials. 

 also in the section in pom.xml:

 ```
 <jdbc>
    <driver>org.postgresql.Driver</driver>
    <url>jdbc:postgresql:myDB</url>
    <user>myUser</user>
    <password>myPassword</password>
</jdbc>
```

replace 
1. myDB with your local db
2. myUser with your user 
3. myPassword with your password            