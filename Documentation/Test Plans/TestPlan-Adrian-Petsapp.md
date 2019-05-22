# TEST PLAN _(Petsapp-Adrian)_

## My Story:

> I'm a user who has lost his pet. I want to create a notification (alert) if someone finds my pet (or a pet with similar characteristics)

## Test Plan / Procedures

-   **Case n1:**

    -   **Event:** Create a Notification
    -   **Input Data:** Add a notification to Notification Manager
    -   **Events to Observe:** Check if the notification is inside NotificationManager
-   **Case n2:**

    -   **Event:** Create a post with a pet that would prompt an alert (previous notification in NotificationManager)
    -   **Input Data:** Create a new Post valid
    -   **Events to Observe:** NotificationManager send an alert to user
-   **Case n3:**

    -   **Event:** Create a post with a pet that would NOT prompt an alert (previous notification in NotificationManager)
    -   **Input Data:** Create a new Post (invalid)
    -   **Events to Observe:** NotificationManager is NOT sending an alert to user
-   **Case n4:**

    -   **Event:** Save different types of notifications
    -   **Input Data:** create different types of notifications
    -   **Events to Observe:** Notifications are saved and can run case n2 and case n3 to them
-   **Case n5:**

    -   **Event:** Add more notifications than expected
    -   **Input Data:** Add enough notifications to get out of the array
    -   **Events to Observe:** New notifications must be saved, you can not get out of the array
-   **Case n6:**

    -   **Event:** User delete notification, do not send alert to user for that notification anymore
    -   **Input Data:** Delete user notification, create a post that would have prompt an alert
    -   **Events to Observe:** Alert is not being sent
-   **Case n7:**

    -   **Event:** User delete notification, do not send alert to user for that notification anymore
    -   **Input Data:** Delete user notification, create a post that would have prompt an alert
    -   **Events to Observe:** Alert is not being sent to the user