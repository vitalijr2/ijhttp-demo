create table if not exists FUNDS
(
    CURRENCY char(3) primary key,
    CREDIT   numeric(20, 2) not null
);

