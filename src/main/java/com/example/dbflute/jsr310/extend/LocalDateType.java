/**
 *
 */
package com.example.dbflute.jsr310.extend;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.TemporalAccessor;

import org.seasar.dbflute.s2dao.valuetype.TnAbstractValueType;
import org.seasar.dbflute.util.DfTypeUtil;

/**
 * @author takiguchi
 *
 */
public class LocalDateType extends TnAbstractValueType {

    /**
     * {@link Types#DATE} で初期化する。
     */
    public LocalDateType() {
        super(Types.DATE);
    }

    /* (非 Javadoc)
     * @see org.seasar.dbflute.jdbc.ValueType#getValue(java.sql.ResultSet, int)
     */
    @Override
    public Object getValue(ResultSet rs, int index) throws SQLException {
        Date date = rs.getDate(index);
        return date == null ? null : date.toLocalDate();
    }

    /* (非 Javadoc)
     * @see org.seasar.dbflute.jdbc.ValueType#getValue(java.sql.ResultSet, java.lang.String)
     */
    @Override
    public Object getValue(ResultSet rs, String columnName) throws SQLException {
        Date date = rs.getDate(columnName);
        return date == null ? null : date.toLocalDate();
    }

    /* (非 Javadoc)
     * @see org.seasar.dbflute.jdbc.ValueType#getValue(java.sql.CallableStatement, int)
     */
    @Override
    public Object getValue(CallableStatement cs, int index) throws SQLException {
        Date date = cs.getDate(index);
        return date == null ? null : date.toLocalDate();
    }

    /* (非 Javadoc)
     * @see org.seasar.dbflute.jdbc.ValueType#getValue(java.sql.CallableStatement, java.lang.String)
     */
    @Override
    public Object getValue(CallableStatement cs, String parameterName) throws SQLException {
        Date date = cs.getDate(parameterName);
        return date == null ? null : date.toLocalDate();
    }

    /* (非 Javadoc)
     * @see org.seasar.dbflute.jdbc.ValueType#bindValue(java.sql.Connection, java.sql.PreparedStatement, int, java.lang.Object)
     */
    @Override
    public void bindValue(Connection conn, PreparedStatement ps, int index, Object value) throws SQLException {
        if (value == null) {
            this.setNull(ps, index);
        } else {
            ps.setDate(index, this.toSqlDate(value));
        }
    }

    /* (非 Javadoc)
     * @see org.seasar.dbflute.jdbc.ValueType#bindValue(java.sql.Connection, java.sql.CallableStatement, java.lang.String, java.lang.Object)
     */
    @Override
    public void bindValue(Connection conn, CallableStatement cs, String parameterName, Object value) throws SQLException {
        if (value == null) {
            this.setNull(cs, parameterName);
        } else {
            cs.setDate(parameterName, this.toSqlDate(value));
        }
    }

    private java.sql.Date toSqlDate(final Object value) {
        assert value != null;

        if (value instanceof LocalDate) {
            return java.sql.Date.valueOf((LocalDate) value);
        }
        if (value instanceof TemporalAccessor) {
            return new java.sql.Date(java.sql.Date.from(Instant.from((TemporalAccessor) value)).getTime());
        }
        return DfTypeUtil.toSqlDate(value);
    }
}
