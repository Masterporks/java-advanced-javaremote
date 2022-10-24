package org.sda.model;

public class PrivatePassenger extends Passenger{
    private boolean isPrivate;
    private String personalIdCode;

    public PrivatePassenger(Long id, String address, String paymentType, String destinationAddress, boolean isPrivate, String personalIdCode) {
        super(id, address, paymentType, destinationAddress);
        this.isPrivate = isPrivate;
        this.personalIdCode = personalIdCode;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public String getPersonalIdCode() {
        return personalIdCode;
    }

    public void setPersonalIdCode(String personalIdCode) {
        this.personalIdCode = personalIdCode;
    }
}
