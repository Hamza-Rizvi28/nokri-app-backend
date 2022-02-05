# nokri-app-backend

### How to setup database 

We use Flyway for database migration. Use the following command to setup database locally

```
mvn flyway:migrate -Dflyway.url=jdbc:postgresql://localhost:5432/{database} -Dflyway.user={user} -Dflyway.password={password}
```

replace {database}, {user} and {password} with your credentials. 

We assume you have setup postgresql locally. 
 

