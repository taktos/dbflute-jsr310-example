package com.example.dbflute.jsr310.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.jsr310.allcommon.*;
import com.example.dbflute.jsr310.cbean.*;
import com.example.dbflute.jsr310.cbean.cq.*;

/**
 * The abstract condition-query of SUMMARY_WITHDRAWAL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsSummaryWithdrawalCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsSummaryWithdrawalCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "SUMMARY_WITHDRAWAL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {INTEGER(10)}
     * @param memberId The value of memberId as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberId_Equal(Integer memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Integer memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {INTEGER(10)}
     * @param memberId The value of memberId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_NotEqual(Integer memberId) {
        doSetMemberId_NotEqual(memberId);
    }

    protected void doSetMemberId_NotEqual(Integer memberId) {
        regMemberId(CK_NES, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {INTEGER(10)}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterThan(Integer memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {INTEGER(10)}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessThan(Integer memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {INTEGER(10)}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterEqual(Integer memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {INTEGER(10)}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessEqual(Integer memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {INTEGER(10)}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_ID: {INTEGER(10)}
     * @param memberIdList The collection of memberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_InScope(Collection<Integer> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Integer> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_ID: {INTEGER(10)}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_NotInScope(Collection<Integer> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Integer> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MEMBER_ID: {INTEGER(10)}
     */
    public void setMemberId_IsNull() { regMemberId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MEMBER_ID: {INTEGER(10)}
     */
    public void setMemberId_IsNotNull() { regMemberId(CK_ISNN, DOBJ); }

    protected void regMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberId(), "MEMBER_ID"); }
    protected abstract ConditionValue getCValueMemberId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_NAME: {VARCHAR(200)}
     * @param memberName The value of memberName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_Equal(String memberName) {
        doSetMemberName_Equal(fRES(memberName));
    }

    protected void doSetMemberName_Equal(String memberName) {
        regMemberName(CK_EQ, memberName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_NAME: {VARCHAR(200)}
     * @param memberName The value of memberName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_NotEqual(String memberName) {
        doSetMemberName_NotEqual(fRES(memberName));
    }

    protected void doSetMemberName_NotEqual(String memberName) {
        regMemberName(CK_NES, memberName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_NAME: {VARCHAR(200)}
     * @param memberName The value of memberName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_GreaterThan(String memberName) {
        regMemberName(CK_GT, fRES(memberName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_NAME: {VARCHAR(200)}
     * @param memberName The value of memberName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_LessThan(String memberName) {
        regMemberName(CK_LT, fRES(memberName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_NAME: {VARCHAR(200)}
     * @param memberName The value of memberName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_GreaterEqual(String memberName) {
        regMemberName(CK_GE, fRES(memberName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_NAME: {VARCHAR(200)}
     * @param memberName The value of memberName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_LessEqual(String memberName) {
        regMemberName(CK_LE, fRES(memberName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_NAME: {VARCHAR(200)}
     * @param memberNameList The collection of memberName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_InScope(Collection<String> memberNameList) {
        doSetMemberName_InScope(memberNameList);
    }

    public void doSetMemberName_InScope(Collection<String> memberNameList) {
        regINS(CK_INS, cTL(memberNameList), getCValueMemberName(), "MEMBER_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_NAME: {VARCHAR(200)}
     * @param memberNameList The collection of memberName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_NotInScope(Collection<String> memberNameList) {
        doSetMemberName_NotInScope(memberNameList);
    }

    public void doSetMemberName_NotInScope(Collection<String> memberNameList) {
        regINS(CK_NINS, cTL(memberNameList), getCValueMemberName(), "MEMBER_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_NAME: {VARCHAR(200)}
     * @param memberName The value of memberName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_PrefixSearch(String memberName) {
        setMemberName_LikeSearch(memberName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_NAME: {VARCHAR(200)} <br />
     * <pre>e.g. setMemberName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberName The value of memberName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberName_LikeSearch(String memberName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberName), getCValueMemberName(), "MEMBER_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_NAME: {VARCHAR(200)}
     * @param memberName The value of memberName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberName_NotLikeSearch(String memberName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberName), getCValueMemberName(), "MEMBER_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MEMBER_NAME: {VARCHAR(200)}
     */
    public void setMemberName_IsNull() { regMemberName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * MEMBER_NAME: {VARCHAR(200)}
     */
    public void setMemberName_IsNullOrEmpty() { regMemberName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MEMBER_NAME: {VARCHAR(200)}
     */
    public void setMemberName_IsNotNull() { regMemberName(CK_ISNN, DOBJ); }

    protected void regMemberName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberName(), "MEMBER_NAME"); }
    protected abstract ConditionValue getCValueMemberName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {CHAR(3)}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonCode_Equal(String withdrawalReasonCode) {
        doSetWithdrawalReasonCode_Equal(fRES(withdrawalReasonCode));
    }

    protected void doSetWithdrawalReasonCode_Equal(String withdrawalReasonCode) {
        regWithdrawalReasonCode(CK_EQ, withdrawalReasonCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {CHAR(3)}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonCode_NotEqual(String withdrawalReasonCode) {
        doSetWithdrawalReasonCode_NotEqual(fRES(withdrawalReasonCode));
    }

    protected void doSetWithdrawalReasonCode_NotEqual(String withdrawalReasonCode) {
        regWithdrawalReasonCode(CK_NES, withdrawalReasonCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {CHAR(3)}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonCode_GreaterThan(String withdrawalReasonCode) {
        regWithdrawalReasonCode(CK_GT, fRES(withdrawalReasonCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {CHAR(3)}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonCode_LessThan(String withdrawalReasonCode) {
        regWithdrawalReasonCode(CK_LT, fRES(withdrawalReasonCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {CHAR(3)}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonCode_GreaterEqual(String withdrawalReasonCode) {
        regWithdrawalReasonCode(CK_GE, fRES(withdrawalReasonCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {CHAR(3)}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonCode_LessEqual(String withdrawalReasonCode) {
        regWithdrawalReasonCode(CK_LE, fRES(withdrawalReasonCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {CHAR(3)}
     * @param withdrawalReasonCodeList The collection of withdrawalReasonCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonCode_InScope(Collection<String> withdrawalReasonCodeList) {
        doSetWithdrawalReasonCode_InScope(withdrawalReasonCodeList);
    }

    public void doSetWithdrawalReasonCode_InScope(Collection<String> withdrawalReasonCodeList) {
        regINS(CK_INS, cTL(withdrawalReasonCodeList), getCValueWithdrawalReasonCode(), "WITHDRAWAL_REASON_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {CHAR(3)}
     * @param withdrawalReasonCodeList The collection of withdrawalReasonCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonCode_NotInScope(Collection<String> withdrawalReasonCodeList) {
        doSetWithdrawalReasonCode_NotInScope(withdrawalReasonCodeList);
    }

    public void doSetWithdrawalReasonCode_NotInScope(Collection<String> withdrawalReasonCodeList) {
        regINS(CK_NINS, cTL(withdrawalReasonCodeList), getCValueWithdrawalReasonCode(), "WITHDRAWAL_REASON_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {CHAR(3)}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonCode_PrefixSearch(String withdrawalReasonCode) {
        setWithdrawalReasonCode_LikeSearch(withdrawalReasonCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {CHAR(3)} <br />
     * <pre>e.g. setWithdrawalReasonCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param withdrawalReasonCode The value of withdrawalReasonCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWithdrawalReasonCode_LikeSearch(String withdrawalReasonCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(withdrawalReasonCode), getCValueWithdrawalReasonCode(), "WITHDRAWAL_REASON_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {CHAR(3)}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWithdrawalReasonCode_NotLikeSearch(String withdrawalReasonCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(withdrawalReasonCode), getCValueWithdrawalReasonCode(), "WITHDRAWAL_REASON_CODE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {CHAR(3)}
     */
    public void setWithdrawalReasonCode_IsNull() { regWithdrawalReasonCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {CHAR(3)}
     */
    public void setWithdrawalReasonCode_IsNullOrEmpty() { regWithdrawalReasonCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {CHAR(3)}
     */
    public void setWithdrawalReasonCode_IsNotNull() { regWithdrawalReasonCode(CK_ISNN, DOBJ); }

    protected void regWithdrawalReasonCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueWithdrawalReasonCode(), "WITHDRAWAL_REASON_CODE"); }
    protected abstract ConditionValue getCValueWithdrawalReasonCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)}
     * @param withdrawalReasonText The value of withdrawalReasonText as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonText_Equal(String withdrawalReasonText) {
        doSetWithdrawalReasonText_Equal(fRES(withdrawalReasonText));
    }

    protected void doSetWithdrawalReasonText_Equal(String withdrawalReasonText) {
        regWithdrawalReasonText(CK_EQ, withdrawalReasonText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)}
     * @param withdrawalReasonText The value of withdrawalReasonText as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonText_NotEqual(String withdrawalReasonText) {
        doSetWithdrawalReasonText_NotEqual(fRES(withdrawalReasonText));
    }

    protected void doSetWithdrawalReasonText_NotEqual(String withdrawalReasonText) {
        regWithdrawalReasonText(CK_NES, withdrawalReasonText);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)}
     * @param withdrawalReasonText The value of withdrawalReasonText as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonText_GreaterThan(String withdrawalReasonText) {
        regWithdrawalReasonText(CK_GT, fRES(withdrawalReasonText));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)}
     * @param withdrawalReasonText The value of withdrawalReasonText as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonText_LessThan(String withdrawalReasonText) {
        regWithdrawalReasonText(CK_LT, fRES(withdrawalReasonText));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)}
     * @param withdrawalReasonText The value of withdrawalReasonText as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonText_GreaterEqual(String withdrawalReasonText) {
        regWithdrawalReasonText(CK_GE, fRES(withdrawalReasonText));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)}
     * @param withdrawalReasonText The value of withdrawalReasonText as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonText_LessEqual(String withdrawalReasonText) {
        regWithdrawalReasonText(CK_LE, fRES(withdrawalReasonText));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)}
     * @param withdrawalReasonTextList The collection of withdrawalReasonText as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonText_InScope(Collection<String> withdrawalReasonTextList) {
        doSetWithdrawalReasonText_InScope(withdrawalReasonTextList);
    }

    public void doSetWithdrawalReasonText_InScope(Collection<String> withdrawalReasonTextList) {
        regINS(CK_INS, cTL(withdrawalReasonTextList), getCValueWithdrawalReasonText(), "WITHDRAWAL_REASON_TEXT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)}
     * @param withdrawalReasonTextList The collection of withdrawalReasonText as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonText_NotInScope(Collection<String> withdrawalReasonTextList) {
        doSetWithdrawalReasonText_NotInScope(withdrawalReasonTextList);
    }

    public void doSetWithdrawalReasonText_NotInScope(Collection<String> withdrawalReasonTextList) {
        regINS(CK_NINS, cTL(withdrawalReasonTextList), getCValueWithdrawalReasonText(), "WITHDRAWAL_REASON_TEXT");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)}
     * @param withdrawalReasonText The value of withdrawalReasonText as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonText_PrefixSearch(String withdrawalReasonText) {
        setWithdrawalReasonText_LikeSearch(withdrawalReasonText, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)} <br />
     * <pre>e.g. setWithdrawalReasonText_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param withdrawalReasonText The value of withdrawalReasonText as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWithdrawalReasonText_LikeSearch(String withdrawalReasonText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(withdrawalReasonText), getCValueWithdrawalReasonText(), "WITHDRAWAL_REASON_TEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)}
     * @param withdrawalReasonText The value of withdrawalReasonText as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWithdrawalReasonText_NotLikeSearch(String withdrawalReasonText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(withdrawalReasonText), getCValueWithdrawalReasonText(), "WITHDRAWAL_REASON_TEXT", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)}
     */
    public void setWithdrawalReasonText_IsNull() { regWithdrawalReasonText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)}
     */
    public void setWithdrawalReasonText_IsNullOrEmpty() { regWithdrawalReasonText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)}
     */
    public void setWithdrawalReasonText_IsNotNull() { regWithdrawalReasonText(CK_ISNN, DOBJ); }

    protected void regWithdrawalReasonText(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueWithdrawalReasonText(), "WITHDRAWAL_REASON_TEXT"); }
    protected abstract ConditionValue getCValueWithdrawalReasonText();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)}
     * @param withdrawalReasonInputText The value of withdrawalReasonInputText as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonInputText_Equal(String withdrawalReasonInputText) {
        doSetWithdrawalReasonInputText_Equal(fRES(withdrawalReasonInputText));
    }

    protected void doSetWithdrawalReasonInputText_Equal(String withdrawalReasonInputText) {
        regWithdrawalReasonInputText(CK_EQ, withdrawalReasonInputText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)}
     * @param withdrawalReasonInputText The value of withdrawalReasonInputText as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonInputText_NotEqual(String withdrawalReasonInputText) {
        doSetWithdrawalReasonInputText_NotEqual(fRES(withdrawalReasonInputText));
    }

    protected void doSetWithdrawalReasonInputText_NotEqual(String withdrawalReasonInputText) {
        regWithdrawalReasonInputText(CK_NES, withdrawalReasonInputText);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)}
     * @param withdrawalReasonInputText The value of withdrawalReasonInputText as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonInputText_GreaterThan(String withdrawalReasonInputText) {
        regWithdrawalReasonInputText(CK_GT, fRES(withdrawalReasonInputText));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)}
     * @param withdrawalReasonInputText The value of withdrawalReasonInputText as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonInputText_LessThan(String withdrawalReasonInputText) {
        regWithdrawalReasonInputText(CK_LT, fRES(withdrawalReasonInputText));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)}
     * @param withdrawalReasonInputText The value of withdrawalReasonInputText as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonInputText_GreaterEqual(String withdrawalReasonInputText) {
        regWithdrawalReasonInputText(CK_GE, fRES(withdrawalReasonInputText));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)}
     * @param withdrawalReasonInputText The value of withdrawalReasonInputText as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonInputText_LessEqual(String withdrawalReasonInputText) {
        regWithdrawalReasonInputText(CK_LE, fRES(withdrawalReasonInputText));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)}
     * @param withdrawalReasonInputTextList The collection of withdrawalReasonInputText as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonInputText_InScope(Collection<String> withdrawalReasonInputTextList) {
        doSetWithdrawalReasonInputText_InScope(withdrawalReasonInputTextList);
    }

    public void doSetWithdrawalReasonInputText_InScope(Collection<String> withdrawalReasonInputTextList) {
        regINS(CK_INS, cTL(withdrawalReasonInputTextList), getCValueWithdrawalReasonInputText(), "WITHDRAWAL_REASON_INPUT_TEXT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)}
     * @param withdrawalReasonInputTextList The collection of withdrawalReasonInputText as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonInputText_NotInScope(Collection<String> withdrawalReasonInputTextList) {
        doSetWithdrawalReasonInputText_NotInScope(withdrawalReasonInputTextList);
    }

    public void doSetWithdrawalReasonInputText_NotInScope(Collection<String> withdrawalReasonInputTextList) {
        regINS(CK_NINS, cTL(withdrawalReasonInputTextList), getCValueWithdrawalReasonInputText(), "WITHDRAWAL_REASON_INPUT_TEXT");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)}
     * @param withdrawalReasonInputText The value of withdrawalReasonInputText as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonInputText_PrefixSearch(String withdrawalReasonInputText) {
        setWithdrawalReasonInputText_LikeSearch(withdrawalReasonInputText, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)} <br />
     * <pre>e.g. setWithdrawalReasonInputText_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param withdrawalReasonInputText The value of withdrawalReasonInputText as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWithdrawalReasonInputText_LikeSearch(String withdrawalReasonInputText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(withdrawalReasonInputText), getCValueWithdrawalReasonInputText(), "WITHDRAWAL_REASON_INPUT_TEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)}
     * @param withdrawalReasonInputText The value of withdrawalReasonInputText as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWithdrawalReasonInputText_NotLikeSearch(String withdrawalReasonInputText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(withdrawalReasonInputText), getCValueWithdrawalReasonInputText(), "WITHDRAWAL_REASON_INPUT_TEXT", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)}
     */
    public void setWithdrawalReasonInputText_IsNull() { regWithdrawalReasonInputText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)}
     */
    public void setWithdrawalReasonInputText_IsNullOrEmpty() { regWithdrawalReasonInputText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)}
     */
    public void setWithdrawalReasonInputText_IsNotNull() { regWithdrawalReasonInputText(CK_ISNN, DOBJ); }

    protected void regWithdrawalReasonInputText(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueWithdrawalReasonInputText(), "WITHDRAWAL_REASON_INPUT_TEXT"); }
    protected abstract ConditionValue getCValueWithdrawalReasonInputText();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_DATETIME: {TIMESTAMP(23, 10)}
     * @param withdrawalDatetime The value of withdrawalDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setWithdrawalDatetime_Equal(java.time.LocalDateTime withdrawalDatetime) {
        regWithdrawalDatetime(CK_EQ,  withdrawalDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_DATETIME: {TIMESTAMP(23, 10)}
     * @param withdrawalDatetime The value of withdrawalDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setWithdrawalDatetime_GreaterThan(java.time.LocalDateTime withdrawalDatetime) {
        regWithdrawalDatetime(CK_GT,  withdrawalDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_DATETIME: {TIMESTAMP(23, 10)}
     * @param withdrawalDatetime The value of withdrawalDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setWithdrawalDatetime_LessThan(java.time.LocalDateTime withdrawalDatetime) {
        regWithdrawalDatetime(CK_LT,  withdrawalDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_DATETIME: {TIMESTAMP(23, 10)}
     * @param withdrawalDatetime The value of withdrawalDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setWithdrawalDatetime_GreaterEqual(java.time.LocalDateTime withdrawalDatetime) {
        regWithdrawalDatetime(CK_GE,  withdrawalDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_DATETIME: {TIMESTAMP(23, 10)}
     * @param withdrawalDatetime The value of withdrawalDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setWithdrawalDatetime_LessEqual(java.time.LocalDateTime withdrawalDatetime) {
        regWithdrawalDatetime(CK_LE, withdrawalDatetime);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * WITHDRAWAL_DATETIME: {TIMESTAMP(23, 10)}
     */
    public void setWithdrawalDatetime_IsNull() { regWithdrawalDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * WITHDRAWAL_DATETIME: {TIMESTAMP(23, 10)}
     */
    public void setWithdrawalDatetime_IsNotNull() { regWithdrawalDatetime(CK_ISNN, DOBJ); }

    protected void regWithdrawalDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueWithdrawalDatetime(), "WITHDRAWAL_DATETIME"); }
    protected abstract ConditionValue getCValueWithdrawalDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {CHAR(3)}
     * @param memberStatusCode The value of memberStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_Equal(String memberStatusCode) {
        doSetMemberStatusCode_Equal(fRES(memberStatusCode));
    }

    protected void doSetMemberStatusCode_Equal(String memberStatusCode) {
        regMemberStatusCode(CK_EQ, memberStatusCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {CHAR(3)}
     * @param memberStatusCode The value of memberStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_NotEqual(String memberStatusCode) {
        doSetMemberStatusCode_NotEqual(fRES(memberStatusCode));
    }

    protected void doSetMemberStatusCode_NotEqual(String memberStatusCode) {
        regMemberStatusCode(CK_NES, memberStatusCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {CHAR(3)}
     * @param memberStatusCode The value of memberStatusCode as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_GreaterThan(String memberStatusCode) {
        regMemberStatusCode(CK_GT, fRES(memberStatusCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {CHAR(3)}
     * @param memberStatusCode The value of memberStatusCode as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_LessThan(String memberStatusCode) {
        regMemberStatusCode(CK_LT, fRES(memberStatusCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {CHAR(3)}
     * @param memberStatusCode The value of memberStatusCode as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_GreaterEqual(String memberStatusCode) {
        regMemberStatusCode(CK_GE, fRES(memberStatusCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {CHAR(3)}
     * @param memberStatusCode The value of memberStatusCode as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_LessEqual(String memberStatusCode) {
        regMemberStatusCode(CK_LE, fRES(memberStatusCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_CODE: {CHAR(3)}
     * @param memberStatusCodeList The collection of memberStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_InScope(Collection<String> memberStatusCodeList) {
        doSetMemberStatusCode_InScope(memberStatusCodeList);
    }

    public void doSetMemberStatusCode_InScope(Collection<String> memberStatusCodeList) {
        regINS(CK_INS, cTL(memberStatusCodeList), getCValueMemberStatusCode(), "MEMBER_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_CODE: {CHAR(3)}
     * @param memberStatusCodeList The collection of memberStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_NotInScope(Collection<String> memberStatusCodeList) {
        doSetMemberStatusCode_NotInScope(memberStatusCodeList);
    }

    public void doSetMemberStatusCode_NotInScope(Collection<String> memberStatusCodeList) {
        regINS(CK_NINS, cTL(memberStatusCodeList), getCValueMemberStatusCode(), "MEMBER_STATUS_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_CODE: {CHAR(3)}
     * @param memberStatusCode The value of memberStatusCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_PrefixSearch(String memberStatusCode) {
        setMemberStatusCode_LikeSearch(memberStatusCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_CODE: {CHAR(3)} <br />
     * <pre>e.g. setMemberStatusCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberStatusCode The value of memberStatusCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberStatusCode_LikeSearch(String memberStatusCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberStatusCode), getCValueMemberStatusCode(), "MEMBER_STATUS_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_CODE: {CHAR(3)}
     * @param memberStatusCode The value of memberStatusCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberStatusCode_NotLikeSearch(String memberStatusCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberStatusCode), getCValueMemberStatusCode(), "MEMBER_STATUS_CODE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {CHAR(3)}
     */
    public void setMemberStatusCode_IsNull() { regMemberStatusCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {CHAR(3)}
     */
    public void setMemberStatusCode_IsNullOrEmpty() { regMemberStatusCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {CHAR(3)}
     */
    public void setMemberStatusCode_IsNotNull() { regMemberStatusCode(CK_ISNN, DOBJ); }

    protected void regMemberStatusCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberStatusCode(), "MEMBER_STATUS_CODE"); }
    protected abstract ConditionValue getCValueMemberStatusCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_NAME: {VARCHAR(50)}
     * @param memberStatusName The value of memberStatusName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusName_Equal(String memberStatusName) {
        doSetMemberStatusName_Equal(fRES(memberStatusName));
    }

    protected void doSetMemberStatusName_Equal(String memberStatusName) {
        regMemberStatusName(CK_EQ, memberStatusName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_NAME: {VARCHAR(50)}
     * @param memberStatusName The value of memberStatusName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusName_NotEqual(String memberStatusName) {
        doSetMemberStatusName_NotEqual(fRES(memberStatusName));
    }

    protected void doSetMemberStatusName_NotEqual(String memberStatusName) {
        regMemberStatusName(CK_NES, memberStatusName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_NAME: {VARCHAR(50)}
     * @param memberStatusName The value of memberStatusName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusName_GreaterThan(String memberStatusName) {
        regMemberStatusName(CK_GT, fRES(memberStatusName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_NAME: {VARCHAR(50)}
     * @param memberStatusName The value of memberStatusName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusName_LessThan(String memberStatusName) {
        regMemberStatusName(CK_LT, fRES(memberStatusName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_NAME: {VARCHAR(50)}
     * @param memberStatusName The value of memberStatusName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusName_GreaterEqual(String memberStatusName) {
        regMemberStatusName(CK_GE, fRES(memberStatusName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_NAME: {VARCHAR(50)}
     * @param memberStatusName The value of memberStatusName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusName_LessEqual(String memberStatusName) {
        regMemberStatusName(CK_LE, fRES(memberStatusName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_NAME: {VARCHAR(50)}
     * @param memberStatusNameList The collection of memberStatusName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusName_InScope(Collection<String> memberStatusNameList) {
        doSetMemberStatusName_InScope(memberStatusNameList);
    }

    public void doSetMemberStatusName_InScope(Collection<String> memberStatusNameList) {
        regINS(CK_INS, cTL(memberStatusNameList), getCValueMemberStatusName(), "MEMBER_STATUS_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_NAME: {VARCHAR(50)}
     * @param memberStatusNameList The collection of memberStatusName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusName_NotInScope(Collection<String> memberStatusNameList) {
        doSetMemberStatusName_NotInScope(memberStatusNameList);
    }

    public void doSetMemberStatusName_NotInScope(Collection<String> memberStatusNameList) {
        regINS(CK_NINS, cTL(memberStatusNameList), getCValueMemberStatusName(), "MEMBER_STATUS_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_NAME: {VARCHAR(50)}
     * @param memberStatusName The value of memberStatusName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusName_PrefixSearch(String memberStatusName) {
        setMemberStatusName_LikeSearch(memberStatusName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_NAME: {VARCHAR(50)} <br />
     * <pre>e.g. setMemberStatusName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberStatusName The value of memberStatusName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberStatusName_LikeSearch(String memberStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberStatusName), getCValueMemberStatusName(), "MEMBER_STATUS_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_NAME: {VARCHAR(50)}
     * @param memberStatusName The value of memberStatusName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberStatusName_NotLikeSearch(String memberStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberStatusName), getCValueMemberStatusName(), "MEMBER_STATUS_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MEMBER_STATUS_NAME: {VARCHAR(50)}
     */
    public void setMemberStatusName_IsNull() { regMemberStatusName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * MEMBER_STATUS_NAME: {VARCHAR(50)}
     */
    public void setMemberStatusName_IsNullOrEmpty() { regMemberStatusName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MEMBER_STATUS_NAME: {VARCHAR(50)}
     */
    public void setMemberStatusName_IsNotNull() { regMemberStatusName(CK_ISNN, DOBJ); }

    protected void regMemberStatusName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberStatusName(), "MEMBER_STATUS_NAME"); }
    protected abstract ConditionValue getCValueMemberStatusName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MAX_PURCHASE_PRICE: {INTEGER(10)}
     * @param maxPurchasePrice The value of maxPurchasePrice as equal. (NullAllowed: if null, no condition)
     */
    public void setMaxPurchasePrice_Equal(Integer maxPurchasePrice) {
        doSetMaxPurchasePrice_Equal(maxPurchasePrice);
    }

    protected void doSetMaxPurchasePrice_Equal(Integer maxPurchasePrice) {
        regMaxPurchasePrice(CK_EQ, maxPurchasePrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MAX_PURCHASE_PRICE: {INTEGER(10)}
     * @param maxPurchasePrice The value of maxPurchasePrice as notEqual. (NullAllowed: if null, no condition)
     */
    public void setMaxPurchasePrice_NotEqual(Integer maxPurchasePrice) {
        doSetMaxPurchasePrice_NotEqual(maxPurchasePrice);
    }

    protected void doSetMaxPurchasePrice_NotEqual(Integer maxPurchasePrice) {
        regMaxPurchasePrice(CK_NES, maxPurchasePrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MAX_PURCHASE_PRICE: {INTEGER(10)}
     * @param maxPurchasePrice The value of maxPurchasePrice as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMaxPurchasePrice_GreaterThan(Integer maxPurchasePrice) {
        regMaxPurchasePrice(CK_GT, maxPurchasePrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MAX_PURCHASE_PRICE: {INTEGER(10)}
     * @param maxPurchasePrice The value of maxPurchasePrice as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMaxPurchasePrice_LessThan(Integer maxPurchasePrice) {
        regMaxPurchasePrice(CK_LT, maxPurchasePrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MAX_PURCHASE_PRICE: {INTEGER(10)}
     * @param maxPurchasePrice The value of maxPurchasePrice as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMaxPurchasePrice_GreaterEqual(Integer maxPurchasePrice) {
        regMaxPurchasePrice(CK_GE, maxPurchasePrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MAX_PURCHASE_PRICE: {INTEGER(10)}
     * @param maxPurchasePrice The value of maxPurchasePrice as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMaxPurchasePrice_LessEqual(Integer maxPurchasePrice) {
        regMaxPurchasePrice(CK_LE, maxPurchasePrice);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MAX_PURCHASE_PRICE: {INTEGER(10)}
     * @param minNumber The min number of maxPurchasePrice. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of maxPurchasePrice. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMaxPurchasePrice_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMaxPurchasePrice(), "MAX_PURCHASE_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MAX_PURCHASE_PRICE: {INTEGER(10)}
     * @param maxPurchasePriceList The collection of maxPurchasePrice as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMaxPurchasePrice_InScope(Collection<Integer> maxPurchasePriceList) {
        doSetMaxPurchasePrice_InScope(maxPurchasePriceList);
    }

    protected void doSetMaxPurchasePrice_InScope(Collection<Integer> maxPurchasePriceList) {
        regINS(CK_INS, cTL(maxPurchasePriceList), getCValueMaxPurchasePrice(), "MAX_PURCHASE_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MAX_PURCHASE_PRICE: {INTEGER(10)}
     * @param maxPurchasePriceList The collection of maxPurchasePrice as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMaxPurchasePrice_NotInScope(Collection<Integer> maxPurchasePriceList) {
        doSetMaxPurchasePrice_NotInScope(maxPurchasePriceList);
    }

    protected void doSetMaxPurchasePrice_NotInScope(Collection<Integer> maxPurchasePriceList) {
        regINS(CK_NINS, cTL(maxPurchasePriceList), getCValueMaxPurchasePrice(), "MAX_PURCHASE_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MAX_PURCHASE_PRICE: {INTEGER(10)}
     */
    public void setMaxPurchasePrice_IsNull() { regMaxPurchasePrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MAX_PURCHASE_PRICE: {INTEGER(10)}
     */
    public void setMaxPurchasePrice_IsNotNull() { regMaxPurchasePrice(CK_ISNN, DOBJ); }

    protected void regMaxPurchasePrice(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMaxPurchasePrice(), "MAX_PURCHASE_PRICE"); }
    protected abstract ConditionValue getCValueMaxPurchasePrice();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected SummaryWithdrawalCB newMyCB() {
        return new SummaryWithdrawalCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return SummaryWithdrawalCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
