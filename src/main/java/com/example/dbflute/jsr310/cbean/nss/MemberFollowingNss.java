package com.example.dbflute.jsr310.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.jsr310.cbean.cq.MemberFollowingCQ;

/**
 * The nest select set-upper of MEMBER_FOLLOWING.
 * @author DBFlute(AutoGenerator)
 */
public class MemberFollowingNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberFollowingCQ _query;
    public MemberFollowingNss(MemberFollowingCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * MEMBER by my MY_MEMBER_ID, named 'memberByMyMemberId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberNss withMemberByMyMemberId() {
        _query.doNss(new MemberFollowingCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberByMyMemberId(); }});
        return new MemberNss(_query.queryMemberByMyMemberId());
    }
    /**
     * With nested relation columns to select clause. <br />
     * MEMBER by my YOUR_MEMBER_ID, named 'memberByYourMemberId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberNss withMemberByYourMemberId() {
        _query.doNss(new MemberFollowingCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberByYourMemberId(); }});
        return new MemberNss(_query.queryMemberByYourMemberId());
    }

}
