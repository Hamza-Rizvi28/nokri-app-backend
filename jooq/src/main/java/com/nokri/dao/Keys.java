/*
 * This file is generated by jOOQ.
 */
package src.main.java.com.nokri.dao;


import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;

import src.main.java.com.nokri.dao.tables.Education;
import src.main.java.com.nokri.dao.tables.FlywaySchemaHistory;
import src.main.java.com.nokri.dao.tables.Job;
import src.main.java.com.nokri.dao.tables.Project;
import src.main.java.com.nokri.dao.tables.User;
import src.main.java.com.nokri.dao.tables.UserJob;
import src.main.java.com.nokri.dao.tables.Userprofile;
import src.main.java.com.nokri.dao.tables.WorkExperience;
import src.main.java.com.nokri.dao.tables.records.EducationRecord;
import src.main.java.com.nokri.dao.tables.records.FlywaySchemaHistoryRecord;
import src.main.java.com.nokri.dao.tables.records.JobRecord;
import src.main.java.com.nokri.dao.tables.records.ProjectRecord;
import src.main.java.com.nokri.dao.tables.records.UserJobRecord;
import src.main.java.com.nokri.dao.tables.records.UserRecord;
import src.main.java.com.nokri.dao.tables.records.UserprofileRecord;
import src.main.java.com.nokri.dao.tables.records.WorkExperienceRecord;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<EducationRecord> EDUCATION_PKEY = Internal.createUniqueKey(Education.EDUCATION, DSL.name("education_pkey"), new TableField[] { Education.EDUCATION.EDUCATION_ID }, true);
    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, DSL.name("flyway_schema_history_pk"), new TableField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
    public static final UniqueKey<JobRecord> JOB_PKEY = Internal.createUniqueKey(Job.JOB, DSL.name("job_pkey"), new TableField[] { Job.JOB.JOB_ID }, true);
    public static final UniqueKey<ProjectRecord> PROJECT_PKEY = Internal.createUniqueKey(Project.PROJECT, DSL.name("project_pkey"), new TableField[] { Project.PROJECT.PROJECT_ID }, true);
    public static final UniqueKey<UserRecord> USER_PKEY = Internal.createUniqueKey(User.USER, DSL.name("user_pkey"), new TableField[] { User.USER.USER_ID }, true);
    public static final UniqueKey<UserJobRecord> USER_JOB_PKEY = Internal.createUniqueKey(UserJob.USER_JOB, DSL.name("user_job_pkey"), new TableField[] { UserJob.USER_JOB.USER_ID, UserJob.USER_JOB.JOB_ID }, true);
    public static final UniqueKey<UserprofileRecord> USERPROFILE_PKEY = Internal.createUniqueKey(Userprofile.USERPROFILE, DSL.name("userprofile_pkey"), new TableField[] { Userprofile.USERPROFILE.PROFILE_ID }, true);
    public static final UniqueKey<WorkExperienceRecord> WORK_EXPERIENCE_PKEY = Internal.createUniqueKey(WorkExperience.WORK_EXPERIENCE, DSL.name("work_experience_pkey"), new TableField[] { WorkExperience.WORK_EXPERIENCE.WORK_EXPERIENCE_ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<EducationRecord, UserprofileRecord> EDUCATION__FK_PROFILE = Internal.createForeignKey(Education.EDUCATION, DSL.name("fk_profile"), new TableField[] { Education.EDUCATION.PROFILE_ID }, Keys.USERPROFILE_PKEY, new TableField[] { Userprofile.USERPROFILE.PROFILE_ID }, true);
    public static final ForeignKey<ProjectRecord, UserprofileRecord> PROJECT__FK_PROFILE = Internal.createForeignKey(Project.PROJECT, DSL.name("fk_profile"), new TableField[] { Project.PROJECT.PROFILE_ID }, Keys.USERPROFILE_PKEY, new TableField[] { Userprofile.USERPROFILE.PROFILE_ID }, true);
    public static final ForeignKey<UserJobRecord, JobRecord> USER_JOB__FK_JOB = Internal.createForeignKey(UserJob.USER_JOB, DSL.name("fk_job"), new TableField[] { UserJob.USER_JOB.JOB_ID }, Keys.JOB_PKEY, new TableField[] { Job.JOB.JOB_ID }, true);
    public static final ForeignKey<UserJobRecord, UserRecord> USER_JOB__FK_USER = Internal.createForeignKey(UserJob.USER_JOB, DSL.name("fk_user"), new TableField[] { UserJob.USER_JOB.USER_ID }, Keys.USER_PKEY, new TableField[] { User.USER.USER_ID }, true);
    public static final ForeignKey<UserprofileRecord, UserRecord> USERPROFILE__FK_USER = Internal.createForeignKey(Userprofile.USERPROFILE, DSL.name("fk_user"), new TableField[] { Userprofile.USERPROFILE.USER_ID }, Keys.USER_PKEY, new TableField[] { User.USER.USER_ID }, true);
    public static final ForeignKey<WorkExperienceRecord, UserprofileRecord> WORK_EXPERIENCE__FK_PROFILE = Internal.createForeignKey(WorkExperience.WORK_EXPERIENCE, DSL.name("fk_profile"), new TableField[] { WorkExperience.WORK_EXPERIENCE.PROFILE_ID }, Keys.USERPROFILE_PKEY, new TableField[] { Userprofile.USERPROFILE.PROFILE_ID }, true);
}
