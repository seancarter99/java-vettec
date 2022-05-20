# Monolith
- One big, huge server containing every service
  - Posts
  - Likes
  - Accounts
  - Recommendations
  - Payment
  - Ads
- If one of those services (likes) receives more traffic than the others, we still have to scale the entire monolith
  - Horizontal scaling (more instances behind a load balancer) of these huge servers

# Pros of Monoliths
- Speed
  - It's all contained in one spot so we can call functions quicker
- Simplicity
  - Test
  - Deploy
  - Write (kinda)
- Security
  - Since it's all self contained, there's no over the wire data transfer which can be more secure
  - It's easier to be secure

# Cons of Monoliths
- Making a change to the monolith makes me have to rebuild the entire monolith
  - This can take hours even for a small change
- Scalability
  - To get another instance, we have to scale the entire monolith
  - If it's a 64 GB RAM system, I have to scale it all up again
- Separation of Concerns
  - If one service (payment) has to adhere to regulations, the others shouldn't also be subjected to it
- Uniform Language
  - If my app is written in Java, I can't call functions written in Python
  - The entire app must be written in Java

# Domain Driven Design
- Instead of thinking in terms of software, we think in terms of business
- Break out our services into separate, logical groups based on business needs
  - Sales
  - Marketing
  - Accounting
  - Retail

# Microservices
- Essentially are slices of the monolith
- We break them into logical services/domains
- All of your microservices will have their database attached
  - These can be any type of DB
    - MySQL
    - PostgresSQL
    - MongoDB
- Each microservice has a dynamic, private IP address that will constantly change as services are spun up
  and spun back down

# API Gateway
- Since there are so many different services and each service does its own thing and runs on its own IP,
  we need a way to direct the user to the right service
- A standard load balancer (LB) just picks the shortest line, but now all the lines do something different
  - No longer applicable
  - Works when all lines are the same, but not here
- API Gateway, much like an LB, is a static, public IP address that maps incoming requests to the intended 
  microservice
  - A request starting with /accounts will be mapped to the accounts microservice
  - A request starting with /likes will be mapped to the likes microservice

# Service Discovery
- Acts as a registry that keeps tabs on all available services
- As soon as a service spins up, it registers itself with service discovery
  - Something like, "I am an account microservice and this is my IP: 172.0.0.24"
- We use this so that the API Gateway and other microservices known where to find or "discover" each other
- Service Discovery might have a list so that if a request comes into /movies we can give them one of
  potentially many copies of the movie microservice to call on

# Pros of Microservices
- Great for separating teams
  - New hires at a company don't have to think about EVERYTHING, instead they just focus on their microservice
- Since they're all separated, swapping a piece (microservice) is much quicker
  - I just need to rebuild that service, the rest can remain as is
- Scalability
  - If "likes" receives increased traffic, we can just scale up that microservice and leave all the others
    untouched
  - This reduces potential redundancies in computing power
    - Instead of 2 giant 64 GB RAM machines running at half capacity
    - We might have 20 microservice machines of 8GB RAM running at full
- Availability
- Decoupled (Independent)
  - Loose coupling
  - All the services independent and they only about the other services they need and the data they supply
    - RESTful endpoints
- Choice of Programming Language
  - I can now choose whatever language best suits that microservice
  - Each language, has its own strengths and weaknesses and their own ecosystem of frameworks
    - If I'm doing data analytics I might Python
      - PyTorch, TensorFlow, Pandas
    - If I'm doing a lot asynchronous event based requests, I might use NodeJS
      - Express
    - If I require applications with strong throughput, I might use Java
      - Spring Boot

# Cons of Microservices
- Stability/Resilience
  - Services can (and will) go down
    - When they do, a service called upon another service might be unable to function
      - To account for this, we need a system of retries and fallback measures to account
  - We MUST have high availability (99.9999% uptime) on our services otherwise it's a runaway problem
    - If I have 100 services with 99% uptime
- Debugging/Tracing
  - Instead of all the problem being present on one machine
    - I now have retrace the steps I followed to find what went wrong
    - I need reconstruct the environment where something went wronge
    - These are potentially logs across 1-100 different services and machines
- Complexity
  - Instead of one singular application, we now have hundreds
  - To manage the architecture you need to know how to do microservices
  - DevOps is a MUST
    - With this many services (hundreds or thousands), we need automation
    - Since DevOps "Automate everything", we should look use it for each microservice
    - Each micoservice has its own build/deploy pipeline (CI/CD)
- Latency
  - All microservices reside on different, physical machines and may be located in different geographic areas
  - All calls to other services are done via HTTP or some other protocol and are done over the wire