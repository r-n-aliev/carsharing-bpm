-- Runtime:
alter table ACT_RU_EXECUTION add constraint ACT_UNIQ_RU_BUS_KEY unique(PROC_DEF_ID_, BUSINESS_KEY_);

-- Не используем, т.к.
-- если уже нет АКТИВНЫХ процессов по данному carID (были и завершились),
-- то может быть запущен новый.

-- History:
-- alter table ACT_HI_PROCINST add constraint ACT_UNIQ_HI_BUS_KEY unique(PROC_DEF_ID_, BUSINESS_KEY_);
