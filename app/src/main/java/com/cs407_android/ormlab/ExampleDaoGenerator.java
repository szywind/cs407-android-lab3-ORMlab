package com.cs407_android.ormlab;

/**
 * Created by njaunich on 2/18/16.
 */
import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Property;
import de.greenrobot.daogenerator.Schema;


public class ExampleDaoGenerator {
    public static void main(String[] args) throws Exception {
        Schema schema = new Schema(1, "com.cs407_android.ormlab"); //Scheme for GreenDAO ORM
        createDB(schema);
        new DaoGenerator().generateAll(schema, "./app/src/main/java/");
    }

    private static void createDB(Schema schema) {

        //Add Guest
        Entity guest = schema.addEntity("Guest");
        guest.addIdProperty();
        //TODO: Add the following string properties to the Guest entity
        //TODO: (cont.) firstName, lastName, email, phone
        //TODO: Add a Boolean property named "display" (this will always be set to true)

        guest.addStringProperty("firstName").notNull();
        guest.addStringProperty("lastName").notNull();
        guest.addStringProperty("email");
        guest.addStringProperty("phone");
        guest.addBooleanProperty("display");


    }

}