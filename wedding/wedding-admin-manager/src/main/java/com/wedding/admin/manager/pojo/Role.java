package com.wedding.admin.manager.pojo;

import java.util.Date;

public class Role {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_role.id
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_role.role_name
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_role.role_description
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    private String roleDescription;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_role.create_time
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_role.create_person
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    private String createPerson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_role.last_update_time
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_role.last_update_person
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    private String lastUpdatePerson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_role.stat
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    private Integer stat;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_role.id
     *
     * @return the value of admin_role.id
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_role.id
     *
     * @param id the value for admin_role.id
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_role.role_name
     *
     * @return the value of admin_role.role_name
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_role.role_name
     *
     * @param roleName the value for admin_role.role_name
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_role.role_description
     *
     * @return the value of admin_role.role_description
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    public String getRoleDescription() {
        return roleDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_role.role_description
     *
     * @param roleDescription the value for admin_role.role_description
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription == null ? null : roleDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_role.create_time
     *
     * @return the value of admin_role.create_time
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_role.create_time
     *
     * @param createTime the value for admin_role.create_time
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_role.create_person
     *
     * @return the value of admin_role.create_person
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_role.create_person
     *
     * @param createPerson the value for admin_role.create_person
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson == null ? null : createPerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_role.last_update_time
     *
     * @return the value of admin_role.last_update_time
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_role.last_update_time
     *
     * @param lastUpdateTime the value for admin_role.last_update_time
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_role.last_update_person
     *
     * @return the value of admin_role.last_update_person
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    public String getLastUpdatePerson() {
        return lastUpdatePerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_role.last_update_person
     *
     * @param lastUpdatePerson the value for admin_role.last_update_person
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    public void setLastUpdatePerson(String lastUpdatePerson) {
        this.lastUpdatePerson = lastUpdatePerson == null ? null : lastUpdatePerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_role.stat
     *
     * @return the value of admin_role.stat
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    public Integer getStat() {
        return stat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_role.stat
     *
     * @param stat the value for admin_role.stat
     *
     * @mbggenerated Thu Aug 28 14:42:12 CST 2014
     */
    public void setStat(Integer stat) {
        this.stat = stat;
    }
}