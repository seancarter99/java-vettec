# REST
Stands for "Representational State Transfer"
Great for data transfer (not sending HTML pages)
- JSON is the default format (you can use XML though)

- It has become the defacto way of setting up web APIs
  - Other alternatives include SOAP/SOA or GraphQL

# The 6 Architectural Constraints of REST

1. Uniform Interface
  - One logical URI/URL per resource
2. Client-Server
  - Client and Server should be completely separate
  - Client will only know about the server through these API endpoints and the data that they send back
  - Allows them to develop individually
3. Stateless
  - Make all client-server interactions stateless where no data from the request is stored on the server
  - Treat all HTTP requests as brand new request (even if they've visited before)
  - Client is in charge of all state management
4. Cacheable
  - Requests should be able to be cached in order to speed up lookup time
  - A resource to be cached will have indicated in the HTTP headers
  - GET requests are cacheable by default
  - Appears in HTTP headers such as Expires or Cache-Control
5. Layered Systems
  - Gateways
  - Can store logic on separate servers, but the client will only know the one gateway server
  - API Gateway
6. Code on Demand (optional)
  - Have the option to return executable code

# Constructing REST compliant URLs

1. Uniform Interface
   - Due to the Uniform Interface constraint I shouldn't have API endpoints that return the same thing
   - ex. /authors and /writers both return all authors in the database
2. Avoiding Verbs
   - You should avoid using verbs in url as it is unnecessary
   - Instead, let the HTTP verb do the talking 
   - ex. Avoid routes like /getUsers or /updateUsers
   - Instead do something like this GET /users or PUT /users
3. URL Hierarchy
   - URLs should have a hierarchy going from most specific to least specific
   - ex. https://www.mysite.com/users/28/orders
   - ex. https://www.mysite.com/users/28/orders/51
4. Filtering
   - We can add filters in the form of "request parameters" to indicate constraints or filter criteria
   - If I wanted to retrieve the first 10 orders of a user's all time orders I could do this:
     - ex. https://www.mysite.com/users/28/orders (This implies retrieve ALL orders)
     - ex. https://www.mysite.com/users/28/orders?limit=10 (Implies to retrieve the first 10 orders)
     - ex. https://www.mysite.com/users/28/orders?type=sameDay (Only retrieves orders with same day delivery)
5. Versioning
   - Versioning endpoints allows new endpoints to be added without breaking the old ones
   - Imagine I have endpoint /movies which retrieves a movies if they do a GET request
     - At first maybe the data back as just the movie title
       - "Star Wars"
     - Now that my app is bigger, only sending the title is not enough anymore and I want to add new data
     - So I change it to now send back a JSON object containing movie data
       - {"title": "Star Wars", "year": "1977"}
   - Instead, we want to version our URLs such that the old URL still works, but we promote the new one
     - https://www.mysite.com/v1/movies returns ["Star Wars", "Harry Potter"]
     - https://www.mysite.com/v2/movies returns [{"title": "Star Wars", "year": "1977"}, {"title": "Harry Potter", "year": "2001"}]