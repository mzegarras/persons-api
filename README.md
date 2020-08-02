
## Build api
```
mvn package
```

## Start api
```
docker-compose up
```

## Call api

### api v1
```
curl --location --request GET 'http://localhost:8080/persons/1' \
--header 'X-API-Version: 1'
```

### api v1

```
curl --location --request GET 'http://localhost:8080/persons/1' \
--header 'X-API-Version: 2'
```