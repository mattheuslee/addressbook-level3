package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

/**
 * Storage stub class for dependency injection for a Storage object.
 * Does not perform any reading/writing of data to storage.
 */
public class StorageStub extends Storage {

    public StorageStub() throws InvalidStorageLocationException {
        // Do nothing
    }

    public void save(AddressBook addressBook) {
        // Do nothing
    }

    public AddressBook load() {
        return new AddressBook();
    }
}