# cs407-android-lab3-ORMlab

## Step 1

Begin by implementing the TODOs in the ExampleDaoGenerator class

Helpful links: http://greenrobot.org/greendao/documentation/relations/

Once you have implemented the TODOs, select the “Generate Database” configuration (click the dropdown to the left of the green play button). This will generate the database classes and files necessary to implement the saving of data to the GreenDAO ORM for persistence. Should this option not exist, merely create a configuration of type “Application” and make the build path app/src/GuestBookDatabase/com/cs407_android/ormlab/ExampleDaoGenerator.java

The database classes will appear in ORMlab/app/src/GuestBookDatabase/com/cs407_android/ormlab/

## Step 2

Once the classes have been generated, change the configuration of the project back to “app”. Next, uncomment the ORM variables and the functions initDatabase, saveGuest, closeDatabase, and closeReopenDatabase.

Implement the aforementioned methods by following the TODOs and by using information in the GreenDAO documentation: http://greenrobot.org/greendao/documentation/, or by asking one of the TAs for assistance.

Once you have implemented the functions, uncomment the initDatabase and saveGuest calls within the onCreate method, and test your implementation!
