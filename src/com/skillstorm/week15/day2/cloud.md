# What is Cloud?

Services offered over the internet by a third party vendor to solve our technical issues

These tech services come in many forms:
- Storage (iCloud, OneDrive, etc.)
- Compute (Dedicated, Virtual Machines, etc.)
- Networking (Load Balancers, Virtual Firewalls)

Often times these services come from a single Cloud Service Provider (CSP)
- CSPs offer us a fraction of their systems for us to use for our own needs
- Each CSP has variable amount of services so pick the CSP that best suits your needs

Popular Cloud Service Providers (CSP):
- AWS (Amazon Web Services) *
- Google Cloud Platform *
- Microsoft Azure *
- Oracle Cloud
- DigitalOcean
- Linode
The * represents the Big 3 CSPs

# History of AWS
- AWS (Amazon Web Services) was created by Amazon in its early days (early 2000s) out of necessity
- In the mid 90s, Amazon was specifically a book company, but as the internet grew, so did Amazon
- As a result of the internet boom, it had to drastically upscale its own infrastructure to compete
  - Their solution was what is seen as AWS today
  - This infrastructure gave them a serious edge over the comptetition
- In its early days, AWS was privately used by Amazon, but was looking promising

- In 2006, AWS launched for the general public with a total of 1 region and 3 services
  - The region is (US East 1 located in Northern Virginia)
  - The first 3 services were
    1. Simple Storage Service (S3)
    2. Elastic Cloud Compute (EC2)
    3. Simple Queue Service (SQS)

- It was the first major "Cloud Service Provider"
  - Speed to market is everything
  - Today, it is the biggest CSP

- Today, AWS has over 200+ services and 26 regions
  - AWS is ALWAYS expanding their global infrastructure to add new regions and Availability Zones

# Benefits of Cloud Computing

AWS 6 Advantages of Cloud

1. Trade Fixed Expense for Variable Expense
   - Adopts a "pay as you go" price model where you only pay for what you use
   - Imagine I am builing a startup company and need servers to run my application
     - Without Cloud
        - To get started, I need to buy the hardware I need and the space to store it securely
        - If my startup fails, I'm left with all the leftover hardware
        - A lot of upfront cost and a lot of risk involved
     - With Cloud
        - I pick out all the hardware I want/need and continue from there
        - If my startup fails, I just deactivate the machines in the cloud and payments stop
        - A lot less risky
2. Benefit from Massive Economies of Scale
   - Due to the fact that there's so many using AWS, its cheaper because we can share the resources
   - These machines in the data center are often partitioned with multiple users on the same machine
     - Sharing these computers results in a lower price
     - If you don't want to share, AWS offers dedicated servers with just you on it
3. Stop Guessing Capcity
   - Instead of overestimating and building more servers than need be, I can instead use AWS
     to spin up more servers as I need in a matter of minutes
   - Alternatively, if I underestimate my needs I can always spin up more instances with little up front cost
     or time
4. Increase Speed and Agility
   - If I have an app that blows up overnight and I am using "on premise" servers (AKA Non Cloud)
     - Then the app likely goes down due to traffic overload
     - And I need to order more hardware to supply these increased traffic demands
       - This process can take a couple of days to a couple of weeks
         - In today's climate with supply chain shortages, it could be longer
   - With the cloud, I can scale up more servers in a matter of minutes and a few button clicks
     - Also, I can set up "auto scaling" to automatically more servers as traffic increases
     - This also, kills the servers if traffic dips
       - If you're not careful with auto scaling, it can REALLY hurt your wallet
5. Stop spending money maintaining data centers
   - Instead of focusing on common utilities for your data centers such as:
     - Electricity to power the data center
     - Renting out the physical space to hold your computers
     - Hire personnel to monitor the data center (security guards, security cameras, padlocks, etc.)
     - Building out complex cooling systems to prevent overheating and combustion
     - Doing routine updates on the OS's and CPU chips
   - Instead, cloud abstracts all of that away from you so that you just focus on app development
6. Go Global in Minutes
   - AWS offers many different regions around the globe
   - If I want to deploy in China or Australia, I can do so easily in a matter of minutes

# Cloud Computing Models

Without the cloud, you have to manage EVERYTHING
With the cloud, there are varying levels of control they offer you

1. Software as a Service (SaaS)
- You as the customer are provided a complete, working application for your business needs
- Minimal control over low level things such as hardware, OS, and codebase itself
- Examples of SaaS:
  - G-Mail
  - Microsoft Office Suite (Word, PowerPoint, Excel, Publisher, etc.)
  - Salesforce

2. Platform as a Service (PaaS)
- You as a customer are provided with a preconfigured environment to develop applications in
- It masks a lot of the low level features such as OS, Hardware
- BUT, we now have control over the code we write
- Example of PaaS:
  - AWS Elastic Beanstalk
    - A culmination of services that provides a nice friendly UI to create
      virtual machines in cloud

3. Infrastructure as a Service (IaaS)
- Provides you as the customer the "highest" level of control in a cloud setting
- They mask the hardware
- BUT, you get control over the OS, code, etc.
  - We can install our own OS instead of using the one they chose
- Example of IaaS:
  - AWS EC2
    - EC2 allows us to select our computer specs and with it, install anything
      we want on it

# Core AWS Services
AWS offers many services that aid your development needs:

# Compute
- Allows you to leverage Amazon's computing power
- Often comes in the form of Virtual Machines (VMs)
- Popular AWS Compute Services:
  1. Elastic Cloud Compute (EC2)
     - This was one of the first offerings by AWS and is the most popular service on the platform
     - IaaS
     - Allows you to launch VMs
     - Very popular in hosting web servers
  2. Elastic Container Registry (ECS)
     - Used for deploying container "clusters" to the cloud
     - Containers are an alternative to VMs 
       - Docker is the most popular container service
  3. AWS Lambda
     - "Serverless" functions
     - All you do is upload your code to the cloud and AWS will run your code on specific events
       - You can define these events
         - HTTP requests
         - CRON jobs (scheduler)
           - Run once every M-F at 8 AM
           - Run every week Sunday at midnight
     - You only pay for the time the code is actually running
       - As such, Lambda is super cost effective
     - Instead of running a server 24/7, AWS starts up the server whenever a request is made
       - This does have a downside known as "cold starts"
         - Cold starts is the time it takes the container to start up so that it can run your code
           - Latency
         - You can specify times for the server to stay warm after servicing a request so that it's ready
           for the next
           - Ex. After booting up and running the function, keep alive for 3 more seconds so that if another
             request comes, it's already up and is quicker to run. If no request comes, go ahead and shut down 

# Storage
- Allows you to store data in the cloud

- Popular AWS Storage Services:
  1. Simple Storage Service (S3)
     - One of the first services and is the second most popular service
     - Used for "object" storage and is essentially a big dump for static content
     - Store the data in things known as "buckets"
     - Commonly stored "objects":
       - Images
       - Videos
       - Documents
       - HTML
       - CSS
       - JavaScript
     - One very popular for S3 is static website hosting
       - I just upload my HTML, CSS, and JS and configure my bucket to be publicly accessible
         - I can dish up my frontend to anyone that visits
  2. Glacier
     - Think of this as a specific use case of S3
     - It used primarily for data that needs to be stored, but infrequently accessed
     - The storage here is cheaper than S3 due to the fact that it's archived
     - Common use case would be for records that must be stored by law, but don't need frequent access
  3. Elastic Block Storage (EBS)
     - Made to be mounted on an EC2 instance
     - Used to store persistent data for EC2

# Databases
- AWS allows you the ability to leverage their managed databases in the cloud
- They run maintenance on your database such as updating driver to the latest version of SQL
- Makes it very easy to replicate and have redundant data to ensure fault tolerance

- Popular AWS Database Services:
  1. Amazon RDS (Amazon Relational Database Service)
     - Most the common service for managing relational databases
     - Allows you to run multiple variants of SQL
       - MySQL
       - PostgreSQL
       - Amazon Aurora (Amazon's variant of MySQL)
       - Oracle
       - And many others
  2. Amazon DynamoDB
     - AWS made NoSQL database
     - Very good at optimized read queries
  3. DocumentDB
     - Document based NoSQL database
     - AWS's variant of MongoDB
  4. Amazon Elasticache
     - In memory database used for caching data
     - Amazon's variant of Redis

# Networking
- AWS services for controlling the networking side of things for your applications

- Popular AWS Networking Services:
  1. Virtual Private Cloud (VPC)
     - Allows you to have a private, secure section of the AWS Cloud for your applications
     - Devices can securely communicate with one another
     - You can adjust "security groups" to prevent access to certain resources from the outside world
       - "Security Groups" behave as virtual firewalls of sorts
  2. Route 53
     - AWS's DNS service
       - DNS (Domain Name System)
       - Translates IP addresses into human readable addresses
         - Ex. www.google.com -> 10.10.10.10
     - Create your own domains that map directly to your AWS services
       - Ex. EC2 or S3 bucket
  3. Amazon CloudFront
     - AWS's Content Delivery Network (CDN)
     - Amazon offers various "edge locations" around the world
       - You can deploy resources to these edge locations for even faster lookup times
  4. Elastic Load Balancer (ELB)
     - Works to route traffic to specific EC2 instances based on their overall traffic
     - Enables switching of EC2 instances based off that traffic
     - Example:
       - If traffic incrases suddenly (Black Friday/Cyber Monday), I can easily add another EC2 server
         and have my Elastic Load Balancer automatically start dishing traffic to it
       - If my app is hosted in multiple Availability Zones and one goes down, ELB will auto redirect traffic
         away from the downed EC2