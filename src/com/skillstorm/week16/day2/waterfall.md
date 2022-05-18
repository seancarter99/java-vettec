# What is Waterfall?

- Waterfall/Software Development LifeCycle (SDLC) is older approach to developing software per project specifications
- It gets the name "waterfall" due to how each phase flows into the next
- It is very rigid, in that each "phase" must be fully completed before moving to the next phase

# Phases of Waterfall

1. Requirements
   - What should the application do?
   - Functional Requirements
     - What should the application be able to do?
     - Examples:
       - Store data in a warehouse
       - Display warehouse contents on a webpage
       - Remove existing items from a warehouse
   - Non-Functional Requirements
     - How should the application behave?
     - Examples:
       - Security
       - Performance
       - Quality of Life (QoL)
       - UI/UX Features (Glitter Pink)
   - Construct a "Business Requirement Document" (BRD)
     - Contains all of the functional and non-functional requirements laid out by the client
     - Acts as the basis for the entire project moving forward
2. Analysis
   - Brings in Business Analysts and Project Managers
     - Negotiate realistic expectations
     - Set up reasonable timelines for project completion
   - Doesn't really include software developers
   - Once the timelines and cost have been measured, a contract is signed with the client
     - Once signed, it is VERY hard to change things
     - "Essentially" set in stone
3. Design
   - Brings in the technical architects and senior engineers
   - Create diagrams that outline all of the code to be written
     - Paints a clear picture for the next phase
   - Example Diagrams:
     - Unified Modeling Language (UML)
     - Entity Relational Diagram (ERD)
     - Control Flow Diagram
     - Sequence Diagram
   - Take your hands the keyboard until you know exactly what you're going to type
4. Implementation
   - Software Developers enter and begin coding basesd on the project requirements and diagrams from the previous phase
5. Testing
   - Sometimes lumped in with the implementation phase
     - Done so that we uphold Test Driven Development (TDD)
   - Work with Quality Assurance (QA) teams to ensure the product is bug free and working per the BRD
6. Deploy
   - The project is "complete" and is given to the client
   - Think of this phase as us having built a boat, and we're setting it out to sea
7. Maintenance
   - We also send a few engineers with product to keep it alive and functioning
     - All software we write is a sinking ship
     - They're there to perform small patches and updates
   - The boat we build is a sinking ship and we send engineers with it to patch it up as it sails
     - These softwares can sometimes last 20 years or so
     - Sail until a request for a new boat is put in

# Waterfall

- Project Managers use the "triple constraint" to keep the project rigid
  1. Scope
  2. Budget
  3. Time

We can't increase the scope without also increasing either the time or the budget
- This is why we have the client sign the document
  - The client needs to know exactly what they want up front

- Waterfall excels in an environment with a "fixed scope"
  - The project is set in stone and there's no "moving of the goalposts"

- It's very costly to change the requirements in a waterfall system as it requires going back to phase 1
  - This is regardless of what phase we're in
  - As such, there's often a "Change Control Board" that oversees any potential to the project
    - This is a panel of people that will determine if the change request by the client is feasible
    - If the change is approved, the project is moved back to the Requirements phase

- Spiral Model:
  - "Iterative Waterfall"
  - This can be used for major release of stuff like OSs or Java