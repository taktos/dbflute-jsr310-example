package com.example.dbflute.jsr310.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.jsr310.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.jsr310.exentity.*;

/**
 * The entity of MEMBER_FOLLOWING as TABLE. <br />
 * 会員フォローイング: とある会員が他の会員をフォローできる。すると、フォローした会員の購入履歴が閲覧できる。
 * <pre>
 * [primary-key]
 *     MEMBER_FOLLOWING_ID
 * 
 * [column]
 *     MEMBER_FOLLOWING_ID, MY_MEMBER_ID, YOUR_MEMBER_ID, FOLLOW_DATETIME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     MEMBER_FOLLOWING_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     MEMBER
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     memberByMyMemberId, memberByYourMemberId
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long memberFollowingId = entity.getMemberFollowingId();
 * Integer myMemberId = entity.getMyMemberId();
 * Integer yourMemberId = entity.getYourMemberId();
 * java.time.LocalDateTime followDatetime = entity.getFollowDatetime();
 * entity.setMemberFollowingId(memberFollowingId);
 * entity.setMyMemberId(myMemberId);
 * entity.setYourMemberId(yourMemberId);
 * entity.setFollowDatetime(followDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMemberFollowing implements Entity, Serializable, Cloneable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _memberFollowingId;

    /** MY_MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER} */
    protected Integer _myMemberId;

    /** YOUR_MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER} */
    protected Integer _yourMemberId;

    /** FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)} */
    protected java.time.LocalDateTime _followDatetime;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    /** Is the entity created by DBFlute select process? */
    protected boolean __createdBySelect;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "MEMBER_FOLLOWING";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "memberFollowing";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        if (getMemberFollowingId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** MEMBER by my MY_MEMBER_ID, named 'memberByMyMemberId'. */
    protected Member _memberByMyMemberId;

    /**
     * MEMBER by my MY_MEMBER_ID, named 'memberByMyMemberId'.
     * @return The entity of foreign property 'memberByMyMemberId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public Member getMemberByMyMemberId() {
        return _memberByMyMemberId;
    }

    /**
     * MEMBER by my MY_MEMBER_ID, named 'memberByMyMemberId'.
     * @param memberByMyMemberId The entity of foreign property 'memberByMyMemberId'. (NullAllowed)
     */
    public void setMemberByMyMemberId(Member memberByMyMemberId) {
        _memberByMyMemberId = memberByMyMemberId;
    }

    /** MEMBER by my YOUR_MEMBER_ID, named 'memberByYourMemberId'. */
    protected Member _memberByYourMemberId;

    /**
     * MEMBER by my YOUR_MEMBER_ID, named 'memberByYourMemberId'.
     * @return The entity of foreign property 'memberByYourMemberId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public Member getMemberByYourMemberId() {
        return _memberByYourMemberId;
    }

    /**
     * MEMBER by my YOUR_MEMBER_ID, named 'memberByYourMemberId'.
     * @param memberByYourMemberId The entity of foreign property 'memberByYourMemberId'. (NullAllowed)
     */
    public void setMemberByYourMemberId(Member memberByYourMemberId) {
        _memberByYourMemberId = memberByYourMemberId;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    public Set<String> modifiedProperties() {
        return __modifiedProperties.getPropertyNames();
    }

    /**
     * {@inheritDoc}
     */
    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    protected EntityModifiedProperties newModifiedProperties() {
        return new EntityModifiedProperties();
    }

    // ===================================================================================
    //                                                                     Birthplace Mark
    //                                                                     ===============
    /**
     * {@inheritDoc}
     */
    public void markAsSelect() {
        __createdBySelect = true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean createdBySelect() {
        return __createdBySelect;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param other The other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMemberFollowing)) { return false; }
        BsMemberFollowing otherEntity = (BsMemberFollowing)other;
        if (!xSV(getMemberFollowingId(), otherEntity.getMemberFollowingId())) { return false; }
        return true;
    }
    protected boolean xSV(Object value1, Object value2) { // isSameValue()
        return InternalUtil.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getMemberFollowingId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        return InternalUtil.calculateHashcode(result, value);
    }

    /**
     * {@inheritDoc}
     */
    public int instanceHash() {
        return super.hashCode();
    }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    public String toString() {
        return buildDisplayString(InternalUtil.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        String l = "\n  ";
        if (_memberByMyMemberId != null)
        { sb.append(l).append(xbRDS(_memberByMyMemberId, "memberByMyMemberId")); }
        if (_memberByYourMemberId != null)
        { sb.append(l).append(xbRDS(_memberByYourMemberId, "memberByYourMemberId")); }
        return sb.toString();
    }
    protected String xbRDS(Entity e, String name) { // buildRelationDisplayString()
        return e.buildDisplayString(name, true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String buildDisplayString(String name, boolean column, boolean relation) {
        StringBuilder sb = new StringBuilder();
        if (name != null) { sb.append(name).append(column || relation ? ":" : ""); }
        if (column) { sb.append(buildColumnString()); }
        if (relation) { sb.append(buildRelationString()); }
        sb.append("@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }
    protected String buildColumnString() {
        StringBuilder sb = new StringBuilder();
        String delimiter = ", ";
        sb.append(delimiter).append(getMemberFollowingId());
        sb.append(delimiter).append(getMyMemberId());
        sb.append(delimiter).append(getYourMemberId());
        sb.append(delimiter).append(getFollowDatetime());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_memberByMyMemberId != null) { sb.append(c).append("memberByMyMemberId"); }
        if (_memberByYourMemberId != null) { sb.append(c).append("memberByYourMemberId"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public MemberFollowing clone() {
        try {
            return (MemberFollowing)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * 会員フォローイングID: 連番
     * @return The value of the column 'MEMBER_FOLLOWING_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMemberFollowingId() {
        return _memberFollowingId;
    }

    /**
     * [set] MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * 会員フォローイングID: 連番
     * @param memberFollowingId The value of the column 'MEMBER_FOLLOWING_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberFollowingId(Long memberFollowingId) {
        __modifiedProperties.addPropertyName("memberFollowingId");
        this._memberFollowingId = memberFollowingId;
    }

    /**
     * [get] MY_MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER} <br />
     * わたし: 気になった人がいて...勇気を振り絞った会員のID。
     * @return The value of the column 'MY_MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMyMemberId() {
        return _myMemberId;
    }

    /**
     * [set] MY_MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER} <br />
     * わたし: 気になった人がいて...勇気を振り絞った会員のID。
     * @param myMemberId The value of the column 'MY_MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMyMemberId(Integer myMemberId) {
        __modifiedProperties.addPropertyName("myMemberId");
        this._myMemberId = myMemberId;
    }

    /**
     * [get] YOUR_MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER} <br />
     * あなた: いきなりのアクションに...ちょっと心揺らいだ会員のID。
     * @return The value of the column 'YOUR_MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getYourMemberId() {
        return _yourMemberId;
    }

    /**
     * [set] YOUR_MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER} <br />
     * あなた: いきなりのアクションに...ちょっと心揺らいだ会員のID。
     * @param yourMemberId The value of the column 'YOUR_MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setYourMemberId(Integer yourMemberId) {
        __modifiedProperties.addPropertyName("yourMemberId");
        this._yourMemberId = yourMemberId;
    }

    /**
     * [get] FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)} <br />
     * その瞬間: ふりかえるとちょっと恥ずかしい気持ちになる日時
     * @return The value of the column 'FOLLOW_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getFollowDatetime() {
        return _followDatetime;
    }

    /**
     * [set] FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)} <br />
     * その瞬間: ふりかえるとちょっと恥ずかしい気持ちになる日時
     * @param followDatetime The value of the column 'FOLLOW_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setFollowDatetime(java.time.LocalDateTime followDatetime) {
        __modifiedProperties.addPropertyName("followDatetime");
        this._followDatetime = followDatetime;
    }
}
