# Agile/Scrum

- Agile is a philosophy
- Scrum is a specific implementation of the philosophy
  - Scrum is the most popular version of agile

- Agile is also an iterative process that seeks to routinely ship out software (like the Spiral)
- Agile seeks to ammend a lot of what developers weren't liking about Waterfall
  - Invites more creativity for the developer
  - Allows the client more say over how the product evolves
    - They are made part of the process
- Agile came to be because waterfall isn't fit for small scoped projects where the scope changes
  - Since Agile is all about responding to change, it's much better suited for these types of projects

- Scrum ships smaller releases frequently as opposed to one "lump sum" product at the end
  - This is done to help ensure the client is happy with what they're getting
  - Ensuring the client has the ability to provide feedback over the product
  - These smaller releases occur over "sprints"
    - "Sprints" are just 2-4 week periods where a small subsection of the project is worked on


- Product Item Backlog
  - Comrpised of "user stories"
    - Stories describe the process of a given task
      - "As a user, I should be able to do _________"
      - "As a manager, I should be able to add items to a warehouse"
      - "As a manager, I'd like to ensure that items can't be added to a warehouse at max capacity"
  - The product owner/client is in charge of what goes into and out of the backlog
    - As such, they also determine the order of the backlog

- Story Pointing
  - Not done by the product owner, this is done by the dev team
  - The dev team will vote on what a given story is in terms of difficutly
    - Numeric
      - "On a scale of 1 to 10, how difficult would this be to implement"
      - Using the Fibonacci sequence to indicate how tough something is compared to others
    - Non-Numeric
      - T-Shirt sizing (Small, Medium, Large, Xtra-Large
  - Biggest benefit of story pointing is being able to reasonably assess how much work you're undertaking for a given sprint
  - It's great for the scrum master (project manager) to forecast how much work your team can achieve
    - Use past sprints and how many story points were done on each, calculate the average
      - That average represents your "velocity"
  - Stories with super large points might be an indication that the story is actually an "epic"
    - An epic is comprised of many smaller stories
    - Product owner might give something too general and we need to break it apart
    - Example: "As a manager, I'd like to be able to see information about a given warehouse"
      - "As a manager, I'd like to be able to see all items currently held in a warehouse"
      - "As a manager, I'd like to be able to see the number of each item in a warehouse"
      - "As a manager, I'd like to be able to filter items in a warehouse to get more specific results"
      - "As a manager, I'd like to be able to see how close a warehouse is to max capacity"

- Daily Standup
  - Involves the developers, the scrum master, and the product owner (typically doesn't show up)
  - Short, 15-30 minute meeting
  - 3 main topics that're covered
    1. What did I work on yesterday?
    2. What will I work on today?
    3. What are my "blockers" or impediments?
       - "Blockers" can be anything preventing you from getting something done
       - Being unfamiliar with a given framework is a good example
       - Impediments are usually out of my control (waiting for another team to finish an item)
  - Ground rules:
    1. Keep it short and sweet
       - Don't waste everyone's time
       - If you do need to say extra stuff, just ask to meet up with the scrum master after the meeting
    2. Keep the blame polite
       - Scrum masters will handle the impediments in their own PM meeting

# Sprint Review Meeting
- End of Sprint demo with the product owner
- THe product owner decides what worked and what didn't
- Completed items will be removed from the backlog
- New items can be added to it
- Unfinished items from that sprint will remain on the backlog and roll over onto next sprint

# Sprint Retospection
- This meeting is just between the developers and the scrum master
- Start, Stop, Continue (Kudos)
  - Start: "We should start doing these in sprints to make us more productive"
  - Stop: "We should stop doing these things as they're hurting our productivity"
  - Continue: "This is working great, let's keep doing this"
  - Kudos: "Kudos to you, we're awesome"

# Scrum of Scrums

- Scrum of Scrums is a scrum master for all scrum masters
- Scrum of Scrums is essentially a meeting where all scrum masters of all teams meet to assess how each of
  their projects are going
- This is a good meeting to have one scrum master work with another to solve those impediments

# Kanban

- Term comes from the Japanese car manufacturer Toyota
- Came from assembly lines as you can look at the car to determine what state it's in
- Widely used in software development now to visualize the project tasks/stories and where they're at
- Kanban applies to a sprint

Common Stages:
1. Sprint Backlog/Todo Items for a Sprint
2. In Progress (Work In Progress AKA WIP)
   - Development phase
3. Test
   - Software testing:
     - Unit Testing (Indivual Functions)
     - Regression Testing (Ensuring new code doesn't break old tests)
     - Integration Testing (Functions working with one another)
     - End to End Testing (Entire process AKA frontend to backend)
4. User Acceptance Testing (UAT)
   - A/B Testing
   - Control groups to ensure the general public likes the product
5. Finished