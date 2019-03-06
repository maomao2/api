package com.kwgproperty.server.dataworker.entity;

/**
 * Created by jclang on 2017/9/18.
 */
public class MProduceEvidence {

    private String contract_id;
    private String room_id;
    private String room_number;
    private String status;
    private String finish_time;

    public MProduceEvidence() {
    }

    public String getContract_id() {
        return contract_id;
    }

    public void setContract_id(String contract_id) {
        this.contract_id = contract_id;
    }

    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFinish_time() {
        return finish_time;
    }

    public void setFinish_time(String finish_time) {
        this.finish_time = finish_time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MProduceEvidence that = (MProduceEvidence) o;

        if (contract_id != null ? !contract_id.equals(that.contract_id) : that.contract_id != null) return false;
        if (room_id != null ? !room_id.equals(that.room_id) : that.room_id != null) return false;
        if (room_number != null ? !room_number.equals(that.room_number) : that.room_number != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        return finish_time != null ? finish_time.equals(that.finish_time) : that.finish_time == null;
    }

    @Override
    public int hashCode() {
        int result = contract_id != null ? contract_id.hashCode() : 0;
        result = 31 * result + (room_id != null ? room_id.hashCode() : 0);
        result = 31 * result + (room_number != null ? room_number.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (finish_time != null ? finish_time.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MProduceEvidence{" +
                "contract_id='" + contract_id + '\'' +
                ", room_id='" + room_id + '\'' +
                ", room_number='" + room_number + '\'' +
                ", status='" + status + '\'' +
                ", finish_time='" + finish_time + '\'' +
                '}';
    }
}
