CREATE TABLE IF NOT EXISTS public.organizations
(
    organization_id text COLLATE pg_catalog."default" NOT NULL,
    name text COLLATE pg_catalog."default",
    contact_name text COLLATE pg_catalog."default",
    contact_email text COLLATE pg_catalog."default",
    contact_phone text COLLATE pg_catalog."default",
    CONSTRAINT organizations_pkey PRIMARY KEY (organization_id)
)

TABLESPACE pg_default;

ALTER TABLE public.organizations
    OWNER to postgres;


CREATE TABLE IF NOT EXISTS public.licenses
(
    license_id text COLLATE pg_catalog."default" NOT NULL,
    organization_id text COLLATE pg_catalog."default" NOT NULL,
    description text COLLATE pg_catalog."default",
    product_name text COLLATE pg_catalog."default" NOT NULL,
    license_type text COLLATE pg_catalog."default" NOT NULL,
    comment text COLLATE pg_catalog."default",
    CONSTRAINT licenses_pkey PRIMARY KEY (license_id),
    CONSTRAINT licenses_organization_id_fkey FOREIGN KEY (organization_id)
        REFERENCES public.organizations (organization_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE public.licenses
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS public.users
(
    user_id serial,
    user_name text COLLATE pg_catalog."default",
    user_password text COLLATE pg_catalog."default",
    contact_email text COLLATE pg_catalog."default",
    contact_phone text COLLATE pg_catalog."default",
    contact_address text COLLATE pg_catalog."default",
    logged_in boolean,    
    CONSTRAINT users_pkey PRIMARY KEY (user_id)
)

TABLESPACE pg_default;

ALTER TABLE public.users
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS public.products
(
    product_id serial,
    product_title text COLLATE pg_catalog."default",
    product_price real ,
    product_availability integer ,
    product_stock integer,
    product_photo text COLLATE pg_catalog."default",
    product_weight text COLLATE pg_catalog."default",
    product_flavor text COLLATE pg_catalog."default",
    product_brand text COLLATE pg_catalog."default",
    product_itemForm text COLLATE pg_catalog."default",
    product_ingredients text COLLATE pg_catalog."default",
    product_package text COLLATE pg_catalog."default",
    product_info text COLLATE pg_catalog."default",    
    CONSTRAINT products_pkey PRIMARY KEY (product_id)
)

TABLESPACE pg_default;

ALTER TABLE public.products
    OWNER to postgres;