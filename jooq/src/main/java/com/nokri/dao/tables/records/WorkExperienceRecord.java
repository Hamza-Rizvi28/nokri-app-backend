/*
 * This file is generated by jOOQ.
 */
package src.main.java.com.nokri.dao.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import src.main.java.com.nokri.dao.tables.WorkExperience;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WorkExperienceRecord extends UpdatableRecordImpl<WorkExperienceRecord> implements Record7<Long, Long, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.work_experience.work_experience_id</code>.
     */
    public void setWorkExperienceId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.work_experience.work_experience_id</code>.
     */
    public Long getWorkExperienceId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.work_experience.profile_id</code>.
     */
    public void setProfileId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.work_experience.profile_id</code>.
     */
    public Long getProfileId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.work_experience.from_date</code>.
     */
    public void setFromDate(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.work_experience.from_date</code>.
     */
    public String getFromDate() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.work_experience.to_date</code>.
     */
    public void setToDate(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.work_experience.to_date</code>.
     */
    public String getToDate() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.work_experience.organization</code>.
     */
    public void setOrganization(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.work_experience.organization</code>.
     */
    public String getOrganization() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.work_experience.designation</code>.
     */
    public void setDesignation(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.work_experience.designation</code>.
     */
    public String getDesignation() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.work_experience.descripton</code>.
     */
    public void setDescripton(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.work_experience.descripton</code>.
     */
    public String getDescripton() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, Long, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, Long, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return WorkExperience.WORK_EXPERIENCE.WORK_EXPERIENCE_ID;
    }

    @Override
    public Field<Long> field2() {
        return WorkExperience.WORK_EXPERIENCE.PROFILE_ID;
    }

    @Override
    public Field<String> field3() {
        return WorkExperience.WORK_EXPERIENCE.FROM_DATE;
    }

    @Override
    public Field<String> field4() {
        return WorkExperience.WORK_EXPERIENCE.TO_DATE;
    }

    @Override
    public Field<String> field5() {
        return WorkExperience.WORK_EXPERIENCE.ORGANIZATION;
    }

    @Override
    public Field<String> field6() {
        return WorkExperience.WORK_EXPERIENCE.DESIGNATION;
    }

    @Override
    public Field<String> field7() {
        return WorkExperience.WORK_EXPERIENCE.DESCRIPTON;
    }

    @Override
    public Long component1() {
        return getWorkExperienceId();
    }

    @Override
    public Long component2() {
        return getProfileId();
    }

    @Override
    public String component3() {
        return getFromDate();
    }

    @Override
    public String component4() {
        return getToDate();
    }

    @Override
    public String component5() {
        return getOrganization();
    }

    @Override
    public String component6() {
        return getDesignation();
    }

    @Override
    public String component7() {
        return getDescripton();
    }

    @Override
    public Long value1() {
        return getWorkExperienceId();
    }

    @Override
    public Long value2() {
        return getProfileId();
    }

    @Override
    public String value3() {
        return getFromDate();
    }

    @Override
    public String value4() {
        return getToDate();
    }

    @Override
    public String value5() {
        return getOrganization();
    }

    @Override
    public String value6() {
        return getDesignation();
    }

    @Override
    public String value7() {
        return getDescripton();
    }

    @Override
    public WorkExperienceRecord value1(Long value) {
        setWorkExperienceId(value);
        return this;
    }

    @Override
    public WorkExperienceRecord value2(Long value) {
        setProfileId(value);
        return this;
    }

    @Override
    public WorkExperienceRecord value3(String value) {
        setFromDate(value);
        return this;
    }

    @Override
    public WorkExperienceRecord value4(String value) {
        setToDate(value);
        return this;
    }

    @Override
    public WorkExperienceRecord value5(String value) {
        setOrganization(value);
        return this;
    }

    @Override
    public WorkExperienceRecord value6(String value) {
        setDesignation(value);
        return this;
    }

    @Override
    public WorkExperienceRecord value7(String value) {
        setDescripton(value);
        return this;
    }

    @Override
    public WorkExperienceRecord values(Long value1, Long value2, String value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WorkExperienceRecord
     */
    public WorkExperienceRecord() {
        super(WorkExperience.WORK_EXPERIENCE);
    }

    /**
     * Create a detached, initialised WorkExperienceRecord
     */
    public WorkExperienceRecord(Long workExperienceId, Long profileId, String fromDate, String toDate, String organization, String designation, String descripton) {
        super(WorkExperience.WORK_EXPERIENCE);

        setWorkExperienceId(workExperienceId);
        setProfileId(profileId);
        setFromDate(fromDate);
        setToDate(toDate);
        setOrganization(organization);
        setDesignation(designation);
        setDescripton(descripton);
    }
}
