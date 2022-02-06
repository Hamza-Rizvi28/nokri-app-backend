/*
 * This file is generated by jOOQ.
 */
package src.main.java.com.nokri.dao.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
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
import src.main.java.com.nokri.dao.tables.records.UserprofileRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Userprofile extends TableImpl<UserprofileRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.userprofile</code>
     */
    public static final Userprofile USERPROFILE = new Userprofile();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserprofileRecord> getRecordType() {
        return UserprofileRecord.class;
    }

    /**
     * The column <code>public.userprofile.profile_id</code>.
     */
    public final TableField<UserprofileRecord, Long> PROFILE_ID = createField(DSL.name("profile_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.userprofile.user_id</code>.
     */
    public final TableField<UserprofileRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.userprofile.objective</code>.
     */
    public final TableField<UserprofileRecord, String> OBJECTIVE = createField(DSL.name("objective"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.userprofile.country</code>.
     */
    public final TableField<UserprofileRecord, String> COUNTRY = createField(DSL.name("country"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>public.userprofile.city</code>.
     */
    public final TableField<UserprofileRecord, String> CITY = createField(DSL.name("city"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>public.userprofile.street</code>.
     */
    public final TableField<UserprofileRecord, String> STREET = createField(DSL.name("street"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>public.userprofile.zipcode</code>.
     */
    public final TableField<UserprofileRecord, Integer> ZIPCODE = createField(DSL.name("zipcode"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.userprofile.linkedin_url</code>.
     */
    public final TableField<UserprofileRecord, String> LINKEDIN_URL = createField(DSL.name("linkedin_url"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>public.userprofile.country_code</code>.
     */
    public final TableField<UserprofileRecord, String> COUNTRY_CODE = createField(DSL.name("country_code"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>public.userprofile.contact_no</code>.
     */
    public final TableField<UserprofileRecord, Integer> CONTACT_NO = createField(DSL.name("contact_no"), SQLDataType.INTEGER, this, "");

    private Userprofile(Name alias, Table<UserprofileRecord> aliased) {
        this(alias, aliased, null);
    }

    private Userprofile(Name alias, Table<UserprofileRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.userprofile</code> table reference
     */
    public Userprofile(String alias) {
        this(DSL.name(alias), USERPROFILE);
    }

    /**
     * Create an aliased <code>public.userprofile</code> table reference
     */
    public Userprofile(Name alias) {
        this(alias, USERPROFILE);
    }

    /**
     * Create a <code>public.userprofile</code> table reference
     */
    public Userprofile() {
        this(DSL.name("userprofile"), null);
    }

    public <O extends Record> Userprofile(Table<O> child, ForeignKey<O, UserprofileRecord> key) {
        super(child, key, USERPROFILE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<UserprofileRecord, Long> getIdentity() {
        return (Identity<UserprofileRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<UserprofileRecord> getPrimaryKey() {
        return Keys.USERPROFILE_PKEY;
    }

    @Override
    public List<ForeignKey<UserprofileRecord, ?>> getReferences() {
        return Arrays.asList(Keys.USERPROFILE__FK_USER);
    }

    private transient User _user;

    /**
     * Get the implicit join path to the <code>public.user</code> table.
     */
    public User user() {
        if (_user == null)
            _user = new User(this, Keys.USERPROFILE__FK_USER);

        return _user;
    }

    @Override
    public Userprofile as(String alias) {
        return new Userprofile(DSL.name(alias), this);
    }

    @Override
    public Userprofile as(Name alias) {
        return new Userprofile(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Userprofile rename(String name) {
        return new Userprofile(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Userprofile rename(Name name) {
        return new Userprofile(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, Long, String, String, String, String, Integer, String, String, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}