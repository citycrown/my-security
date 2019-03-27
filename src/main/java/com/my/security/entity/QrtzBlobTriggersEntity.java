package com.my.security.entity;

public class QrtzBlobTriggersEntity extends QrtzBlobTriggersEntityKey {
    private byte[] blobData;

    public byte[] getBlobData() {
        return blobData;
    }

    public void setBlobData(byte[] blobData) {
        this.blobData = blobData;
    }
}