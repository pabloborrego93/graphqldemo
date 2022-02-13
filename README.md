# GraphQL Demo

## How to run
### 1. Clone project: 
`
    git clone [project]
`
### 2. Build Spring Boot App: 
`
    mvn clean package -DskipTests
`
### 3. Build Docker image: 
`
    docker build -t gqldemo .
`
### 4. Change absolute route in [docker-compose.yml](docker-compose.yml)
#### From
    - /absolute-route-to/cnprovider.json:/data/db.json
    - /absolute-route-to/appsprovider.json:/data/db.json
#### To something like
    - /home/myprofile/Documents/graphqldemo/cnprovider.json:/data/db.json
    - /home/myprofile/Documents/graphqldemo/appsprovider.json:/data/db.json
  
### 5. Run
#### To Start
`
    docker-compose up -d
`
#### To Stop
`
    docker-compose down -v
`