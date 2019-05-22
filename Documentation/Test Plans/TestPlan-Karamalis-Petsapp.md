# TEST PLAN _(Petsapp-Karamalis)_

## My Story:

> Every Shelter uploads the Tasks that need to be done by the Volunteers. Then the Volunteer is asked to choose which Tasks he/she wants to do. When he/she fulfills a Task, he/she reports it. The Task is then removed from the Tasks the Shelter published and the Volunteer receives the according EXP points.

## Test Plan / Procedures

-   **Case n1:**

    -   **Event:** Volunteer selects Tasks
    -   **Input Data:** Add Tasks to Volunteer's Task list
    -   **Events to Observe:** Tasks' hours conflicting
-   **Case n2:**

    -   **Event:** Volunteer notifies Shelter of the chosen Tasks
    -   **Input Data:** Send selected Tasks to Shelter
    -   **Events to Observe:** Check if Task list was delivered
-   **Case n3:**

    -   **Event:** Volunteer fulfills a Task
    -   **Input Data:** Volunteer marks Task as completed
    -   **Events to Observe:** Check if Task's status is updated
-   **Case n4:**

    -   **Event:** Volunteer fulfills a Task
    -   **Input Data:** Volunteer marks Task as completed
    -   **Events to Observe:** Check if Task's status is updated