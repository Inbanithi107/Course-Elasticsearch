# Elasticsearch (Single Node) with Docker Compose

This setup spins up a **single-node Elasticsearch cluster**   

## To start Elasticsearch

```bash
docker-compose up -d //run this from root of the project
```
This will:

Pull the Elasticsearch Docker image

Start the container

Expose Elasticsearch at http://localhost:9200

How to verify it’s running
Run:

```bash
curl http://localhost:9200
```
You should see a JSON response like:

```json
{
  "name" : "de1a518344c1",
  "cluster_name" : "docker-cluster",
  "cluster_uuid" : "....",
  "version" : {
    "number" : "8.13.0",
    ...
  },
  ...
}
```
## Initializing courses in Elasticsearch

Just during the startup of the application all 
the courses will be added to Elasticsearch.
After application satartup you will see a prompt in console

```bash
courses saved successfully
```
if you see this line in the console then the courses are initialized in the Elasticsearch

# API
http://localhost:8080/api/search/searchcourse?q=S

Here **q** is the query for fuzzy search
