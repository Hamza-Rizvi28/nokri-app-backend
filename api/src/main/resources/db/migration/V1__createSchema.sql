create table "user" (
    user_id bigserial not null primary key,
    user_name varchar(128) not null,
    email varchar(128) not null,
    "password" varchar(128) not null,
    last_logged_in date,
    email_verified boolean,
    active boolean,
    "role" int
);

create table job (
        job_id bigserial not null primary key,
        descripton text not null,
        country varchar(128) not null,
        city varchar(128) not null,
        contract_type varchar(128) not null,
        seniority_level varchar(128) not null,
        title varchar(128) not null,
        active boolean not null
);

create table user_job (
        user_id bigint not null,
        job_id bigint not null,
        primary key(user_id, job_id),
        constraint fk_user foreign key(user_id) references "user"(user_id),
        constraint fk_job foreign key(job_id) references job(job_id)
);

create table education (
        education_id bigserial not null primary key,
        profile_id bigserial not null,
        education_level varchar(128) not null,
        university varchar(128),
        "degree" varchar(128),
        from_date text,
        "to_date" text
);

create table project (
        project_id bigserial not null primary key,
        profile_id bigserial not null,
        descripton text not null
);

create table work_experience (
        work_experience_id bigserial not null primary key,
        profile_id bigserial not null,
        from_date text not null,
        "to_date" text not null,
        organization varchar(128) not null,
        designation varchar(128) not null,
        descripton text
);

create table userprofile (
        profile_id bigserial not null primary key,
        user_id bigserial unique not null,
	education_id bigserial not null,
	project_id bigserial not null,
	work_experience_id bigserial not null,
        objective varchar(256),
        country varchar(128),
        city varchar(128),
        street varchar(128),
        zipcode serial,
        linkedin_url varchar(128),
        country_code varchar(128),
        contact_no int,
        constraint fk_user_profile foreign key(user_id) references "user"(user_id),
	constraint fk_education foreign key(education_id) references education(education_id),
	constraint fk_project foreign key(project_id) references project(project_id),
	constraint fk_work_experience foreign key(work_experience_id) references work_experience(work_experience_id)
);
