--
-- PostgreSQL database dump
--

-- Dumped from database version 10.15 (Ubuntu 10.15-0ubuntu0.18.04.1)
-- Dumped by pg_dump version 13.1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

ALTER TABLE ONLY public.users DROP CONSTRAINT users_pkey;
ALTER TABLE ONLY public.users2 DROP CONSTRAINT users2_pkey;
ALTER TABLE public.users2 ALTER COLUMN id DROP DEFAULT;
DROP SEQUENCE public.users2_id_seq;
DROP TABLE public.users2;
DROP TABLE public.users;
DROP SEQUENCE public.user_ids;
DROP SCHEMA booking;
--
-- Name: booking; Type: SCHEMA; Schema: -; Owner: usr
--

CREATE SCHEMA booking;


ALTER SCHEMA booking OWNER TO usr;

--
-- Name: user_ids; Type: SEQUENCE; Schema: public; Owner: usr
--

CREATE SEQUENCE public.user_ids
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.user_ids OWNER TO usr;

SET default_tablespace = '';

--
-- Name: users; Type: TABLE; Schema: public; Owner: usr
--

CREATE TABLE public.users (
    id integer DEFAULT nextval('public.user_ids'::regclass) NOT NULL,
    login character(64),
    password character(64)
);


ALTER TABLE public.users OWNER TO usr;

--
-- Name: users2; Type: TABLE; Schema: public; Owner: usr
--

CREATE TABLE public.users2 (
    id integer NOT NULL,
    login character(64),
    password character(64)
);


ALTER TABLE public.users2 OWNER TO usr;

--
-- Name: users2_id_seq; Type: SEQUENCE; Schema: public; Owner: usr
--

CREATE SEQUENCE public.users2_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.users2_id_seq OWNER TO usr;

--
-- Name: users2_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: usr
--

ALTER SEQUENCE public.users2_id_seq OWNED BY public.users2.id;


--
-- Name: users2 id; Type: DEFAULT; Schema: public; Owner: usr
--

ALTER TABLE ONLY public.users2 ALTER COLUMN id SET DEFAULT nextval('public.users2_id_seq'::regclass);


--
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: usr
--

COPY public.users (id, login, password) FROM stdin;
6	asdf                                                            	123                                                             
7	asdf                                                            	123                                                             
8	as1df                                                           	12q3                                                            
\.


--
-- Data for Name: users2; Type: TABLE DATA; Schema: public; Owner: usr
--

COPY public.users2 (id, login, password) FROM stdin;
\.


--
-- Name: user_ids; Type: SEQUENCE SET; Schema: public; Owner: usr
--

SELECT pg_catalog.setval('public.user_ids', 8, true);


--
-- Name: users2_id_seq; Type: SEQUENCE SET; Schema: public; Owner: usr
--

SELECT pg_catalog.setval('public.users2_id_seq', 1, false);


--
-- Name: users2 users2_pkey; Type: CONSTRAINT; Schema: public; Owner: usr
--

ALTER TABLE ONLY public.users2
    ADD CONSTRAINT users2_pkey PRIMARY KEY (id);


--
-- Name: users users_pkey; Type: CONSTRAINT; Schema: public; Owner: usr
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

