
package com.mobisprint.aurika.coorg.pojo.ticketing;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("ticket_number")
    @Expose
    private String ticketNumber;
    @SerializedName("escalated_level")
    @Expose
    private Object escalatedLevel;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("details")
    @Expose
    private List<Detail> details = null;
    @SerializedName("start_date_time")
    @Expose
    private String startDateTime;
    @SerializedName("end_date_time")
    @Expose
    private Object endDateTime;
    @SerializedName("last_activity_on")
    @Expose
    private String lastActivityOn;
    @SerializedName("location_id")
    @Expose
    private Integer locationId;
    @SerializedName("last_escalated_date_time")
    @Expose
    private String lastEscalatedDateTime;
    @SerializedName("booking")
    @Expose
    private Integer booking;
    @SerializedName("level")
    @Expose
    private String level;
    @SerializedName("department")
    @Expose
    private String department;
    @SerializedName("current_status")
    @Expose
    private CurrentStatus currentStatus;
    @SerializedName("ticketActivity")
    @Expose
    private List<TicketActivity> ticketActivity = null;
    @SerializedName("assignee")
    @Expose
    private Object assignee;
    @SerializedName("current_escalated_level")
    @Expose
    private Object currentEscalatedLevel;
    @SerializedName("layout")
    @Expose
    private Object layout;
    @SerializedName("special_instructions")
    @Expose
    private String specialInstructions;
    @SerializedName("delivery_type")
    @Expose
    private Object deliveryType;
    @SerializedName("surcharges")
    @Expose
    private Object surcharges;
    @SerializedName("hangertype")
    @Expose
    private String hangertype;
    @SerializedName("RequestDate")
    @Expose
    private String requestDate;
    @SerializedName("RequestHours")
    @Expose
    private String requestHours;
    @SerializedName("RequestTime")
    @Expose
    private String requestTime;
    @SerializedName("Deliverydate")
    @Expose
    private Object deliverydate;
    @SerializedName("DeliveryTIme")
    @Expose
    private Object deliveryTIme;
    @SerializedName("room_number")
    @Expose
    private String roomNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Object getEscalatedLevel() {
        return escalatedLevel;
    }

    public void setEscalatedLevel(Object escalatedLevel) {
        this.escalatedLevel = escalatedLevel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Object getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Object endDateTime) {
        this.endDateTime = endDateTime;
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

    public String getLastEscalatedDateTime() {
        return lastEscalatedDateTime;
    }

    public void setLastEscalatedDateTime(String lastEscalatedDateTime) {
        this.lastEscalatedDateTime = lastEscalatedDateTime;
    }

    public Integer getBooking() {
        return booking;
    }

    public void setBooking(Integer booking) {
        this.booking = booking;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public CurrentStatus getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(CurrentStatus currentStatus) {
        this.currentStatus = currentStatus;
    }

    public List<TicketActivity> getTicketActivity() {
        return ticketActivity;
    }

    public void setTicketActivity(List<TicketActivity> ticketActivity) {
        this.ticketActivity = ticketActivity;
    }

    public Object getAssignee() {
        return assignee;
    }

    public void setAssignee(Object assignee) {
        this.assignee = assignee;
    }

    public Object getCurrentEscalatedLevel() {
        return currentEscalatedLevel;
    }

    public void setCurrentEscalatedLevel(Object currentEscalatedLevel) {
        this.currentEscalatedLevel = currentEscalatedLevel;
    }

    public Object getLayout() {
        return layout;
    }

    public void setLayout(Object layout) {
        this.layout = layout;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    public Object getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Object deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Object getSurcharges() {
        return surcharges;
    }

    public void setSurcharges(Object surcharges) {
        this.surcharges = surcharges;
    }

    public String getHangertype() {
        return hangertype;
    }

    public void setHangertype(String hangertype) {
        this.hangertype = hangertype;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getRequestHours() {
        return requestHours;
    }

    public void setRequestHours(String requestHours) {
        this.requestHours = requestHours;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public Object getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Object deliverydate) {
        this.deliverydate = deliverydate;
    }

    public Object getDeliveryTIme() {
        return deliveryTIme;
    }

    public void setDeliveryTIme(Object deliveryTIme) {
        this.deliveryTIme = deliveryTIme;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

}
