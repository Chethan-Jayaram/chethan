
package com.mobisprint.aurika.pojo.doorunlock;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ActiveBooking {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("location_detail")
    @Expose
    private LocationDetail locationDetail;
    @SerializedName("guest")
    @Expose
    private Guest_ guest;
    @SerializedName("booking_number")
    @Expose
    private String bookingNumber;
    @SerializedName("room")
    @Expose
    private Integer room;
    @SerializedName("guest_count")
    @Expose
    private Object guestCount;
    @SerializedName("checkin_date_time")
    @Expose
    private String checkinDateTime;
    @SerializedName("checkout_date_time")
    @Expose
    private String checkoutDateTime;
    @SerializedName("guest_checkin_date_time")
    @Expose
    private Object guestCheckinDateTime;
    @SerializedName("guest_checkout_date_time")
    @Expose
    private Object guestCheckoutDateTime;
    @SerializedName("guest_document")
    @Expose
    private String guestDocument;
    @SerializedName("guest_document_verification_status")
    @Expose
    private String guestDocumentVerificationStatus;
    @SerializedName("last_activity_on")
    @Expose
    private String lastActivityOn;
    @SerializedName("location_id")
    @Expose
    private Integer locationId;
    @SerializedName("booking_status")
    @Expose
    private Boolean bookingStatus;
    @SerializedName("last_activity_by")
    @Expose
    private Integer lastActivityBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocationDetail getLocationDetail() {
        return locationDetail;
    }

    public void setLocationDetail(LocationDetail locationDetail) {
        this.locationDetail = locationDetail;
    }

    public Guest_ getGuest() {
        return guest;
    }

    public void setGuest(Guest_ guest) {
        this.guest = guest;
    }

    public String getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public Object getGuestCount() {
        return guestCount;
    }

    public void setGuestCount(Object guestCount) {
        this.guestCount = guestCount;
    }

    public String getCheckinDateTime() {
        return checkinDateTime;
    }

    public void setCheckinDateTime(String checkinDateTime) {
        this.checkinDateTime = checkinDateTime;
    }

    public String getCheckoutDateTime() {
        return checkoutDateTime;
    }

    public void setCheckoutDateTime(String checkoutDateTime) {
        this.checkoutDateTime = checkoutDateTime;
    }

    public Object getGuestCheckinDateTime() {
        return guestCheckinDateTime;
    }

    public void setGuestCheckinDateTime(Object guestCheckinDateTime) {
        this.guestCheckinDateTime = guestCheckinDateTime;
    }

    public Object getGuestCheckoutDateTime() {
        return guestCheckoutDateTime;
    }

    public void setGuestCheckoutDateTime(Object guestCheckoutDateTime) {
        this.guestCheckoutDateTime = guestCheckoutDateTime;
    }

    public String getGuestDocument() {
        return guestDocument;
    }

    public void setGuestDocument(String guestDocument) {
        this.guestDocument = guestDocument;
    }

    public String getGuestDocumentVerificationStatus() {
        return guestDocumentVerificationStatus;
    }

    public void setGuestDocumentVerificationStatus(String guestDocumentVerificationStatus) {
        this.guestDocumentVerificationStatus = guestDocumentVerificationStatus;
    }

    public String getLastActivityOn() {
        return lastActivityOn;
    }

    public void setLastActivityOn(String lastActivityOn) {
        this.lastActivityOn = lastActivityOn;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Boolean getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(Boolean bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public Integer getLastActivityBy() {
        return lastActivityBy;
    }

    public void setLastActivityBy(Integer lastActivityBy) {
        this.lastActivityBy = lastActivityBy;
    }

}
