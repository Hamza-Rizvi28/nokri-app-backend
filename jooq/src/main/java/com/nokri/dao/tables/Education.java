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
import org.jooq.Row7;
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
import src.main.java.com.nokri.dao.tables.records.EducationRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Education extends TableImpl<EducationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.education</code>
     */
    public static final Education EDUCATION = new Education();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EducationRecord> getRecordType() {
        return EducationRecord.class;
    }

    /**
     * The column <code>public.education.education_id</code>.
     */
    public final TableField<EducationRecord, Long> EDUCATION_ID = createField(DSL.name("education_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.education.profile_id</code>.
     */
    public final TableField<EducationRecord, Long> PROFILE_ID = createField(DSL.name("profile_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.education.education_level</code>.
     */
    public final TableField<EducationRecord, String> EDUCATION_LEVEL = createField(DSL.name("education_level"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>public.education.university</code>.
     */
    public final TableField<EducationRecord, String> UNIVERSITY = createField(DSL.name("university"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>public.education.degree</code>.
     */
    public final TableField<EducationRecord, String> DEGREE = createField(DSL.name("degree"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>public.education.from_date</code>.
     */
    public final TableField<EducationRecord, String> FROM_DATE = createField(DSL.name("from_date"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.education.to_date</code>.
     */
    public final TableField<EducationRecord, String> TO_DATE = createField(DSL.name("to_date"), SQLDataType.CLOB, this, "");

    private Education(Name alias, Table<EducationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Education(Name alias, Table<EducationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.education</code> table reference
     */
    public Education(String alias) {
        this(DSL.name(alias), EDUCATION);
    }

    /**
     * Create an aliased <code>public.education</code> table reference
     */
    public Education(Name alias) {
        this(alias, EDUCATION);
    }

    /**
     * Create a <code>public.education</code> table reference
     */
    public Education() {
        this(DSL.name("education"), null);
    }

    public <O extends Record> Education(Table<O> child, ForeignKey<O, EducationRecord> key) {
        super(child, key, EDUCATION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<EducationRecord, Long> getIdentity() {
        return (Identity<EducationRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<EducationRecord> getPrimaryKey() {
        return Keys.EDUCATION_PKEY;
    }

    @Override
    public List<ForeignKey<EducationRecord, ?>> getReferences() {
        return Arrays.asList(Keys.EDUCATION__FK_PROFILE);
    }

    private transient Userprofile _userprofile;

    /**
     * Get the implicit join path to the <code>public.userprofile</code> table.
     */
    public Userprofile userprofile() {
        if (_userprofile == null)
            _userprofile = new Userprofile(this, Keys.EDUCATION__FK_PROFILE);

        return _userprofile;
    }

    @Override
    public Education as(String alias) {
        return new Education(DSL.name(alias), this);
    }

    @Override
    public Education as(Name alias) {
        return new Education(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Education rename(String name) {
        return new Education(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Education rename(Name name) {
        return new Education(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, Long, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
