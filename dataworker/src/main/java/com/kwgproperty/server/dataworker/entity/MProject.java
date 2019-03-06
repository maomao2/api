package com.kwgproperty.server.dataworker.entity;

public class MProject {

    private String city_id;
    private String city_name;
    private String project_id;
    private String project_name;
    private String periods_id;
    private String periods_number;
    private String ban_id;
    private String ban_number;
    private String room_id;
    private String room_number;

    public MProject() {
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getPeriods_id() {
        return periods_id;
    }

    public void setPeriods_id(String periods_id) {
        this.periods_id = periods_id;
    }

    public String getPeriods_number() {
        return periods_number;
    }

    public void setPeriods_number(String periods_number) {
        this.periods_number = periods_number;
    }

    public String getBan_id() {
        return ban_id;
    }

    public void setBan_id(String ban_id) {
        this.ban_id = ban_id;
    }

    public String getBan_number() {
        return ban_number;
    }

    public void setBan_number(String ban_number) {
        this.ban_number = ban_number;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MProject mProject = (MProject) o;

        if (city_id != null ? !city_id.equals(mProject.city_id) : mProject.city_id != null) return false;
        if (city_name != null ? !city_name.equals(mProject.city_name) : mProject.city_name != null) return false;
        if (project_id != null ? !project_id.equals(mProject.project_id) : mProject.project_id != null) return false;
        if (project_name != null ? !project_name.equals(mProject.project_name) : mProject.project_name != null)
            return false;
        if (periods_id != null ? !periods_id.equals(mProject.periods_id) : mProject.periods_id != null) return false;
        if (periods_number != null ? !periods_number.equals(mProject.periods_number) : mProject.periods_number != null)
            return false;
        if (ban_id != null ? !ban_id.equals(mProject.ban_id) : mProject.ban_id != null) return false;
        if (ban_number != null ? !ban_number.equals(mProject.ban_number) : mProject.ban_number != null) return false;
        if (room_id != null ? !room_id.equals(mProject.room_id) : mProject.room_id != null) return false;
        return room_number != null ? room_number.equals(mProject.room_number) : mProject.room_number == null;
    }

    @Override
    public int hashCode() {
        int result = city_id != null ? city_id.hashCode() : 0;
        result = 31 * result + (city_name != null ? city_name.hashCode() : 0);
        result = 31 * result + (project_id != null ? project_id.hashCode() : 0);
        result = 31 * result + (project_name != null ? project_name.hashCode() : 0);
        result = 31 * result + (periods_id != null ? periods_id.hashCode() : 0);
        result = 31 * result + (periods_number != null ? periods_number.hashCode() : 0);
        result = 31 * result + (ban_id != null ? ban_id.hashCode() : 0);
        result = 31 * result + (ban_number != null ? ban_number.hashCode() : 0);
        result = 31 * result + (room_id != null ? room_id.hashCode() : 0);
        result = 31 * result + (room_number != null ? room_number.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MProject{" +
                "city_id='" + city_id + '\'' +
                ", city_name='" + city_name + '\'' +
                ", project_id='" + project_id + '\'' +
                ", project_name='" + project_name + '\'' +
                ", periods_id='" + periods_id + '\'' +
                ", periods_number='" + periods_number + '\'' +
                ", ban_id='" + ban_id + '\'' +
                ", ban_number='" + ban_number + '\'' +
                ", room_id='" + room_id + '\'' +
                ", room_number='" + room_number + '\'' +
                '}';
    }
}
