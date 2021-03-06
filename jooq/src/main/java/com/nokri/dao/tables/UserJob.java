/*
 * This file is generated by jOOQ.
 */
package src.main.java.com.nokri.dao.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
import src.main.java.com.nokri.dao.tables.records.UserJobRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserJob extends TableImpl<UserJobRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.user_job</code>
     */
    public static final UserJob USER_JOB = new UserJob();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserJobRecord> getRecordType() {
        return UserJobRecord.class;
    }

    /**
     * The column <code>public.user_job.user_id</code>.
     */
    public final TableField<UserJobRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.user_job.job_id</code>.
     */
    public final TableField<UserJobRecord, Long> JOB_ID = createField(DSL.name("job_id"), SQLDataType.BIGINT.nullable(false), this, "");

    private UserJob(Name alias, Table<UserJobRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserJob(Name alias, Table<UserJobRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.user_job</code> table reference
     */
    public UserJob(String alias) {
        this(DSL.name(alias), USER_JOB);
    }

    /**
     * Create an aliased <code>public.user_job</code> table reference
     */
    public UserJob(Name alias) {
        this(alias, USER_JOB);
    }

    /**
     * Create a <code>public.user_job</code> table reference
     */
    public UserJob() {
        this(DSL.name("user_job"), null);
    }

    public <O extends Record> UserJob(Table<O> child, ForeignKey<O, UserJobRecord> key) {
        super(child, key, USER_JOB);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<UserJobRecord> getPrimaryKey() {
        return Keys.USER_JOB_PKEY;
    }

    @Override
    public List<ForeignKey<UserJobRecord, ?>> getReferences() {
        return Arrays.asList(Keys.USER_JOB__FK_USER, Keys.USER_JOB__FK_JOB);
    }

    private transient User _user;
    private transient Job _job;

    /**
     * Get the implicit join path to the <code>public.user</code> table.
     */
    public User user() {
        if (_user == null)
            _user = new User(this, Keys.USER_JOB__FK_USER);

        return _user;
    }

    /**
     * Get the implicit join path to the <code>public.job</code> table.
     */
    public Job job() {
        if (_job == null)
            _job = new Job(this, Keys.USER_JOB__FK_JOB);

        return _job;
    }

    @Override
    public UserJob as(String alias) {
        return new UserJob(DSL.name(alias), this);
    }

    @Override
    public UserJob as(Name alias) {
        return new UserJob(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserJob rename(String name) {
        return new UserJob(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserJob rename(Name name) {
        return new UserJob(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
