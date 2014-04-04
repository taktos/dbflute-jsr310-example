package com.example.dbflute.jsr310.extend;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.sql.DataSource;

import com.example.dbflute.jsr310.allcommon.DBFluteConfig;
import com.example.dbflute.jsr310.allcommon.DBFluteInitializer;

import org.seasar.dbflute.jdbc.ValueType;

public class ExtendedDBFluteInitializer extends DBFluteInitializer {
    private static final ValueType DATE_TYPE = new LocalDateType();
    private static final ValueType TIMESTAMP_TYPE = new LocalDateTimeType();

    public ExtendedDBFluteInitializer(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected void prologue() {
        super.prologue();
        DBFluteConfig config = DBFluteConfig.getInstance();
        if (config.isLocked()) {
            config.unlock();
        }
        config.registerBasicValueType(LocalDate.class, DATE_TYPE);
        config.registerBasicValueType(LocalDateTime.class, TIMESTAMP_TYPE);
        config.lock();
    }
}
