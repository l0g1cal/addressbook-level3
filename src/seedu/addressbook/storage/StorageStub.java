package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

public class StorageStub extends StorageFile{
    /**
     * @throws InvalidStorageFilePathException if the default path is invalid
     */
    public StorageStub() throws InvalidStorageFilePathException {
        super();
    }

    /**
     * @throws InvalidStorageFilePathException if the given file path is invalid
     */
    public StorageStub(String filePath) throws InvalidStorageFilePathException {
        super(filePath);
    }
    
    @Override
    public void save(AddressBook addressBook) {
        
    }
}
