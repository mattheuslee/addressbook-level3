package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Abstract class to represent a form of storage.
 */
public abstract class Storage {

    /**
     * Signals that an error has occured in trying to setup the storage location.
     */
    public static class InvalidStorageLocationException extends IllegalValueException{
        public InvalidStorageLocationException(String message) {
            super(message);
        }
    }

    /**
     * Signals that some error has occured while trying to convert and read/write data between the application
     * and the storage.
     */
    public static class StorageOperationException extends Exception {
        public StorageOperationException(String message) {
            super(message);
        }
    }

    /**
     * Default constructor, uses defaults.
     * @throws InvalidStorageLocationException if the default storage location is invalid.
     */
    public Storage() throws InvalidStorageLocationException {
    };

    /**
     * Saves all data to storage.
     *
     * @throws StorageOperationException if there were errors converting and/or storing data to storage.
     */
    public abstract void save(AddressBook addressBook) throws StorageOperationException;

    /**
     * Loads data from storage.
     *
     * @throws StorageOperationException if there were errors reading and/or converting data from storage.
     */
    public abstract AddressBook load() throws StorageOperationException;
}