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
  "name" : "de1a518344c1", //UUID of the container
  "cluster_name" : "docker-cluster",
  "cluster_uuid" : "....",
  "version" : {
    "number" : "8.13.0",
    ...
  },
  ...
}
```
