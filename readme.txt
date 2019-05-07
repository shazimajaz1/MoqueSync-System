Specifications:(In Development Phase)
  This project is a combinatin of three different Applications:
    1. MosqueSyncAdmin  --> Used by the Mosque.
    2. MosqueSyncScholar --> Used by the scholar
    3. MosqueSync  --> Used by the User.
    
MosqueSync Admin:
  1. The admin can login using account created by the developer.
  2. Admin accounts are maintained by the developer on Firebase.
  3. Developer has the capability to add or remove mosques after a verification process.
  4. Once the Admin is logged in, 4 choices are given on the next screen:
     - Add/Remove events and send notifications
     - Update Prayer Times
     - Add/Remove scholar authentication method.
     - Ask the developer for help.
   5. In the add remove events, the admin is asked to enter the details of the event. Once the details are entered,
    the confrim button on the screen allows the admin to verify infomration through a Fragment displayed on the screen. 
    The fragment used is a Dynamic Fragment that is added only when needed. Once the admin confirms the event, the
    following stuff happens:
      1. The event is send in a live database, where every user will get an update once he or she is online.
      2. The event will stay pending for each user until it is removed by the admin.
      3. Once it is removed by the admin, it will not longer be sent to the user.
   6. In the update prayer times, the admin is able to change the times of prayers either for all of them at once or one at
    a time. Once the times are updated, the admin can submit the changes to the user. A confirmation popup dialog appears
    that asks the admin to confirm the details. After confirmation, the following steps happen in the infrastructure:
      1. The update stays pending for the user until he/she is online.
      2. Once the user is online, the update is sent to the application, a feature implemented using firebases on change
        listener.
      3. The update can also be cancelled by the administrator as necessary.
      4. If there is a new update before the user goes live the next time, the previous update gets replaced by the new update.
Mosque Sync Scholar:
  The scholar app have the following functionality:
   1. Scholar is able to directly login to the application. The scholar logins are maintained by the mosque.
   2. Once the scholar is logged in, he/she can see all the sessions of chat that are still pending. 
   3. Each chat has the following functionality:
      - Only the user can initiate a chat with the scholar. 
      - The chat acceptance request is sent to all the available scholars.
      - Once the request is accepted by one of the scholars, it gets added to a list of sessions for the scholar.
      - Each session is alive until it is ended by either the user or by the scholar.
      - The chat is not live, so the question asked might be answered over a period of time.
      - (A functionality that is still not decided is a review option for the scholar)
Mosque Sync Scholar:
  This is the core of the entire project where a service is being provided to the user. User gets multiple features and a very
  elegant UI. Some of the features are listed below:
    1. Rceiver Notifications about events. An events Fragment that in a Recycler View keeps track of all the events.
    2. The events get updated as there is an update from the server.
    3. There is also a separate fragment for Notifications where the user can view recent notifications. 
    4. There is another fragment for Prayer Times that gets updated as there is an update from the user. A recycler view
    is used in this case to show each prayer as a time view. Clicking each card takes the user to a new activity. This activity 
    gives the user more details.
    5. There is also a tab for portable devices that allows the user to connect their portable devices such that each
      portable device is listed that is connected. Various type of portable devices will have a different fucntionality with
      the application depending on what services they are able to provide.
    6. The tab for preferences tab allows the users to customize when and how the updates and notifications are received.
    All the preferences are stored locally and are lost when the application is uninstalled. 
