/*
 * This file is generated by jOOQ.
 */
package src.main.java.com.nokri.dao.tables;


import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import src.main.java.com.nokri.dao.Keys;
import src.main.java.com.nokri.dao.Public;
import src.main.java.com.nokri.dao.tables.records.JobRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Job extends TableImpl<JobRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.job</code>
     */
    public static final Job JOB = new Job();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JobRecord> getRecordType() {
        return JobRecord.class;
    }

    /**
     * The column <code>public.job.job_id</code>.
     */
    public final TableField<JobRecord, Long> JOB_ID = createField(DSL.name("job_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.job.descripton</code>.
     */
    public final TableField<JobRecord, String> DESCRIPTON = createField(DSL.name("descripton"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.job.country</code>.
     */
    public final TableField<JobRecord, String> COUNTRY = createField(DSL.name("country"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>public.job.city</code>.
     */
    public final TableField<JobRecord, String> CITY = createField(DSL.name("city"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>public.job.contract_type</code>.
     */
    public final TableField<JobRecord, String> CONTRACT_TYPE = createField(DSL.name("contract_type"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>public.job.seniority_level</code>.
     */
    public final TableField<JobRecord, String> SENIORITY_LEVEL = createField(DSL.name("seniority_level"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>public.job.title</code>.
     */
    public final TableField<JobRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>public.job.active</code>.
     */
    public final TableField<JobRecord, Boolean> ACTIVE = createField(DSL.name("active"), SQLDataType.BOOLEAN.nullable(false), this, "");

    private Job(Name alias, Table<JobRecord> aliased) {
        this(alias, aliased, null);
    }

    private Job(Name alias, Table<JobRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.job</code> table reference
     */
    public Job(String alias) {
        this(DSL.name(alias), JOB);
    }

    /**
     * Create an aliased <code>public.job</code> table reference
     */
    public Job(Name alias) {
        this(alias, JOB);
    }

    /**
     * Create a <code>public.job</code> table reference
     */
    public Job() {
        this(DSL.name("job"), null);
    }

    public <O extends Record> Job(Table<O> child, ForeignKey<O, JobRecord> key) {
        super(child, key, JOB);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<JobRecord, Long> getIdentity() {
        return (Identity<JobRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<JobRecord> getPrimaryKey() {
        return Keys.JOB_PKEY;
    }

    @Override
    public Job as(String alias) {
        return new Job(DSL.name(alias), this);
    }

    @Override
    public Job as(Name alias) {
        return new Job(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Job rename(String name) {
        return new Job(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Job rename(Name name) {
        return new Job(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, String, String, String, String, String, Boolean> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
