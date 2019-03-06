package com.kwgproperty.server.dataworker.entity;

public class MUser {

    private Long id;
    private String membership;
    private String name;
    private String certificate_type;
    private String identity_no;
    private String phone;
    private String all_phone;
    private String member_type;
    private String join_date;
    private String card_no;
    private String issuing_date;
    private String consumption_points;
    private String total_points;
    private String member_level;
    private String is_wechat;
    private String first_login;
    private String is_approve;
    private String approve_date;
    private String birthday;
    private String sex;
    private String postcode;
    private String post_address;
    private String first_buy_home;
    private String home_count;
    private String total_home_money;
    private String all_room;
    private String is_erp_sync;
    private String create_time;
    private String modify_time;
    private String modify_user;

    public MUser() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCertificate_type() {
        return certificate_type;
    }

    public void setCertificate_type(String certificate_type) {
        this.certificate_type = certificate_type;
    }

    public String getIdentity_no() {
        return identity_no;
    }

    public void setIdentity_no(String identity_no) {
        this.identity_no = identity_no;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAll_phone() {
        return all_phone;
    }

    public void setAll_phone(String all_phone) {
        this.all_phone = all_phone;
    }

    public String getMember_type() {
        return member_type;
    }

    public void setMember_type(String member_type) {
        this.member_type = member_type;
    }

    public String getJoin_date() {
        return join_date;
    }

    public void setJoin_date(String join_date) {
        this.join_date = join_date;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getIssuing_date() {
        return issuing_date;
    }

    public void setIssuing_date(String issuing_date) {
        this.issuing_date = issuing_date;
    }

    public String getConsumption_points() {
        return consumption_points;
    }

    public void setConsumption_points(String consumption_points) {
        this.consumption_points = consumption_points;
    }

    public String getTotal_points() {
        return total_points;
    }

    public void setTotal_points(String total_points) {
        this.total_points = total_points;
    }

    public String getMember_level() {
        return member_level;
    }

    public void setMember_level(String member_level) {
        this.member_level = member_level;
    }

    public String getIs_wechat() {
        return is_wechat;
    }

    public void setIs_wechat(String is_wechat) {
        this.is_wechat = is_wechat;
    }

    public String getFirst_login() {
        return first_login;
    }

    public void setFirst_login(String first_login) {
        this.first_login = first_login;
    }

    public String getIs_approve() {
        return is_approve;
    }

    public void setIs_approve(String is_approve) {
        this.is_approve = is_approve;
    }

    public String getApprove_date() {
        return approve_date;
    }

    public void setApprove_date(String approve_date) {
        this.approve_date = approve_date;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPost_address() {
        return post_address;
    }

    public void setPost_address(String post_address) {
        this.post_address = post_address;
    }

    public String getFirst_buy_home() {
        return first_buy_home;
    }

    public void setFirst_buy_home(String first_buy_home) {
        this.first_buy_home = first_buy_home;
    }

    public String getHome_count() {
        return home_count;
    }

    public void setHome_count(String home_count) {
        this.home_count = home_count;
    }

    public String getTotal_home_money() {
        return total_home_money;
    }

    public void setTotal_home_money(String total_home_money) {
        this.total_home_money = total_home_money;
    }

    public String getAll_room() {
        return all_room;
    }

    public void setAll_room(String all_room) {
        this.all_room = all_room;
    }

    public String getIs_erp_sync() {
        return is_erp_sync;
    }

    public void setIs_erp_sync(String is_erp_sync) {
        this.is_erp_sync = is_erp_sync;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getModify_time() {
        return modify_time;
    }

    public void setModify_time(String modify_time) {
        this.modify_time = modify_time;
    }

    public String getModify_user() {
        return modify_user;
    }

    public void setModify_user(String modify_user) {
        this.modify_user = modify_user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MUser mUser = (MUser) o;

        if (id != null ? !id.equals(mUser.id) : mUser.id != null) return false;
        if (membership != null ? !membership.equals(mUser.membership) : mUser.membership != null) return false;
        if (name != null ? !name.equals(mUser.name) : mUser.name != null) return false;
        if (certificate_type != null ? !certificate_type.equals(mUser.certificate_type) : mUser.certificate_type != null)
            return false;
        if (identity_no != null ? !identity_no.equals(mUser.identity_no) : mUser.identity_no != null) return false;
        if (phone != null ? !phone.equals(mUser.phone) : mUser.phone != null) return false;
        if (all_phone != null ? !all_phone.equals(mUser.all_phone) : mUser.all_phone != null) return false;
        if (member_type != null ? !member_type.equals(mUser.member_type) : mUser.member_type != null) return false;
        if (join_date != null ? !join_date.equals(mUser.join_date) : mUser.join_date != null) return false;
        if (card_no != null ? !card_no.equals(mUser.card_no) : mUser.card_no != null) return false;
        if (issuing_date != null ? !issuing_date.equals(mUser.issuing_date) : mUser.issuing_date != null) return false;
        if (consumption_points != null ? !consumption_points.equals(mUser.consumption_points) : mUser.consumption_points != null)
            return false;
        if (total_points != null ? !total_points.equals(mUser.total_points) : mUser.total_points != null) return false;
        if (member_level != null ? !member_level.equals(mUser.member_level) : mUser.member_level != null) return false;
        if (is_wechat != null ? !is_wechat.equals(mUser.is_wechat) : mUser.is_wechat != null) return false;
        if (first_login != null ? !first_login.equals(mUser.first_login) : mUser.first_login != null) return false;
        if (is_approve != null ? !is_approve.equals(mUser.is_approve) : mUser.is_approve != null) return false;
        if (approve_date != null ? !approve_date.equals(mUser.approve_date) : mUser.approve_date != null) return false;
        if (birthday != null ? !birthday.equals(mUser.birthday) : mUser.birthday != null) return false;
        if (sex != null ? !sex.equals(mUser.sex) : mUser.sex != null) return false;
        if (postcode != null ? !postcode.equals(mUser.postcode) : mUser.postcode != null) return false;
        if (post_address != null ? !post_address.equals(mUser.post_address) : mUser.post_address != null) return false;
        if (first_buy_home != null ? !first_buy_home.equals(mUser.first_buy_home) : mUser.first_buy_home != null)
            return false;
        if (home_count != null ? !home_count.equals(mUser.home_count) : mUser.home_count != null) return false;
        if (total_home_money != null ? !total_home_money.equals(mUser.total_home_money) : mUser.total_home_money != null)
            return false;
        if (all_room != null ? !all_room.equals(mUser.all_room) : mUser.all_room != null) return false;
        if (is_erp_sync != null ? !is_erp_sync.equals(mUser.is_erp_sync) : mUser.is_erp_sync != null) return false;
        if (create_time != null ? !create_time.equals(mUser.create_time) : mUser.create_time != null) return false;
        if (modify_time != null ? !modify_time.equals(mUser.modify_time) : mUser.modify_time != null) return false;
        return modify_user != null ? modify_user.equals(mUser.modify_user) : mUser.modify_user == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (membership != null ? membership.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (certificate_type != null ? certificate_type.hashCode() : 0);
        result = 31 * result + (identity_no != null ? identity_no.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (all_phone != null ? all_phone.hashCode() : 0);
        result = 31 * result + (member_type != null ? member_type.hashCode() : 0);
        result = 31 * result + (join_date != null ? join_date.hashCode() : 0);
        result = 31 * result + (card_no != null ? card_no.hashCode() : 0);
        result = 31 * result + (issuing_date != null ? issuing_date.hashCode() : 0);
        result = 31 * result + (consumption_points != null ? consumption_points.hashCode() : 0);
        result = 31 * result + (total_points != null ? total_points.hashCode() : 0);
        result = 31 * result + (member_level != null ? member_level.hashCode() : 0);
        result = 31 * result + (is_wechat != null ? is_wechat.hashCode() : 0);
        result = 31 * result + (first_login != null ? first_login.hashCode() : 0);
        result = 31 * result + (is_approve != null ? is_approve.hashCode() : 0);
        result = 31 * result + (approve_date != null ? approve_date.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (postcode != null ? postcode.hashCode() : 0);
        result = 31 * result + (post_address != null ? post_address.hashCode() : 0);
        result = 31 * result + (first_buy_home != null ? first_buy_home.hashCode() : 0);
        result = 31 * result + (home_count != null ? home_count.hashCode() : 0);
        result = 31 * result + (total_home_money != null ? total_home_money.hashCode() : 0);
        result = 31 * result + (all_room != null ? all_room.hashCode() : 0);
        result = 31 * result + (is_erp_sync != null ? is_erp_sync.hashCode() : 0);
        result = 31 * result + (create_time != null ? create_time.hashCode() : 0);
        result = 31 * result + (modify_time != null ? modify_time.hashCode() : 0);
        result = 31 * result + (modify_user != null ? modify_user.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MUser{" +
                "id=" + id +
                ", membership='" + membership + '\'' +
                ", name='" + name + '\'' +
                ", certificate_type='" + certificate_type + '\'' +
                ", identity_no='" + identity_no + '\'' +
                ", phone='" + phone + '\'' +
                ", all_phone='" + all_phone + '\'' +
                ", member_type='" + member_type + '\'' +
                ", join_date='" + join_date + '\'' +
                ", card_no='" + card_no + '\'' +
                ", issuing_date='" + issuing_date + '\'' +
                ", consumption_points='" + consumption_points + '\'' +
                ", total_points='" + total_points + '\'' +
                ", member_level='" + member_level + '\'' +
                ", is_wechat='" + is_wechat + '\'' +
                ", first_login='" + first_login + '\'' +
                ", is_approve='" + is_approve + '\'' +
                ", approve_date='" + approve_date + '\'' +
                ", birthday='" + birthday + '\'' +
                ", sex='" + sex + '\'' +
                ", postcode='" + postcode + '\'' +
                ", post_address='" + post_address + '\'' +
                ", first_buy_home='" + first_buy_home + '\'' +
                ", home_count='" + home_count + '\'' +
                ", total_home_money='" + total_home_money + '\'' +
                ", all_room='" + all_room + '\'' +
                ", is_erp_sync='" + is_erp_sync + '\'' +
                ", create_time='" + create_time + '\'' +
                ", modify_time='" + modify_time + '\'' +
                ", modify_user='" + modify_user + '\'' +
                '}';
    }
}
