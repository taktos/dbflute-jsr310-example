/**
 *
 */
package com.example.dbflute.jsr310.extend;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAccessor;

import org.seasar.dbflute.s2dao.valuetype.TnAbstractValueType;
import org.seasar.dbflute.util.DfTypeUtil;

/**
 * @author takiguchi
 *
 */
public class LocalDateTimeType extends TnAbstractValueType {

    public LocalDateTimeType() {
        super(Types.TIMESTAMP);
    }

    /* (非 Javadoc)
     * @see org.seasar.dbflute.jdbc.ValueType#getValue(java.sql.ResultSet, int)
     */
    @Override
    public Object getValue(ResultSet rs, int index) throws SQLException {
        Timestamp timestamp = rs.getTimestamp(index);
        return timestamp == null ? null : timestamp.toLocalDateTime();
    }

    /* (非 Javadoc)
     * @see org.seasar.dbflute.jdbc.ValueType#getValue(java.sql.ResultSet, java.lang.String)
     */
    @Override
    public Object getValue(ResultSet rs, String columnName) throws SQLException {
        Timestamp timestamp = rs.getTimestamp(columnName);
        return timestamp == null ? null : timestamp.toLocalDateTime();
    }

    /* (非 Javadoc)
     * @see org.seasar.dbflute.jdbc.ValueType#getValue(java.sql.CallableStatement, int)
     */
    @Override
    public Object getValue(CallableStatement cs, int index) throws SQLException {
        Timestamp timestamp = cs.getTimestamp(index);
        return timestamp == null ? null : timestamp.toLocalDateTime();
    }

    /* (非 Javadoc)
     * @see org.seasar.dbflute.jdbc.ValueType#getValue(java.sql.CallableStatement, java.lang.String)
     */
    @Override
    public Object getValue(CallableStatement cs, String parameterName) throws SQLException {
        Timestamp timestamp = cs.getTimestamp(parameterName);
        return timestamp == null ? null : timestamp.toLocalDateTime();
    }

    /* (非 Javadoc)
     * @see org.seasar.dbflute.jdbc.ValueType#bindValue(java.sql.Connection, java.sql.PreparedStatement, int, java.lang.Object)
     */
    @Override
    public void bindValue(Connection conn, PreparedStatement ps, int index, Object value) throws SQLException {
        if (value == null) {
            this.setNull(ps, index);
        } else {
            ps.setTimestamp(index, toTimestamp(value));
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
            cs.setTimestamp(parameterName, this.toTimestamp(value));
        }
    }

    private Timestamp toTimestamp(final Object value) {
        assert value != null;

        if (value instanceof LocalDateTime) {
            return Timestamp.valueOf((LocalDateTime) value);
        }
        if (value instanceof TemporalAccessor) {
            return Timestamp.from(Instant.from((TemporalAccessor) value));
        }

        return DfTypeUtil.toTimestamp(value);
    }

}
