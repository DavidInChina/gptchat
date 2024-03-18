package android.gov.nist.javax.sip.header;

import android.gov.nist.javax.sip.header.extensions.JoinHeader;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.header.extensions.ReferredByHeader;
import android.gov.nist.javax.sip.header.extensions.ReplacesHeader;
import android.gov.nist.javax.sip.header.extensions.SessionExpiresHeader;
import android.gov.nist.javax.sip.header.ims.PAccessNetworkInfoHeader;
import android.gov.nist.javax.sip.header.ims.PAssertedIdentityHeader;
import android.gov.nist.javax.sip.header.ims.PAssertedServiceHeader;
import android.gov.nist.javax.sip.header.ims.PAssociatedURIHeader;
import android.gov.nist.javax.sip.header.ims.PCalledPartyIDHeader;
import android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader;
import android.gov.nist.javax.sip.header.ims.PChargingVectorHeader;
import android.gov.nist.javax.sip.header.ims.PMediaAuthorizationHeader;
import android.gov.nist.javax.sip.header.ims.PPreferredIdentityHeader;
import android.gov.nist.javax.sip.header.ims.PPreferredServiceHeader;
import android.gov.nist.javax.sip.header.ims.PProfileKeyHeader;
import android.gov.nist.javax.sip.header.ims.PServedUserHeader;
import android.gov.nist.javax.sip.header.ims.PUserDatabaseHeader;
import android.gov.nist.javax.sip.header.ims.PVisitedNetworkIDHeader;
import android.gov.nist.javax.sip.header.ims.PathHeader;
import android.gov.nist.javax.sip.header.ims.PrivacyHeader;
import android.gov.nist.javax.sip.header.ims.SecurityClientHeader;
import android.gov.nist.javax.sip.header.ims.SecurityServerHeader;
import android.gov.nist.javax.sip.header.ims.SecurityVerifyHeader;
import android.gov.nist.javax.sip.header.ims.ServiceRouteHeader;
import b.AbstractC2091a;
import b.AbstractC2096f;
import c.AbstractC2229A;
import c.AbstractC2230B;
import c.AbstractC2232D;
import c.AbstractC2233E;
import c.AbstractC2235G;
import c.AbstractC2237I;
import c.AbstractC2238J;
import c.AbstractC2239K;
import c.AbstractC2240L;
import c.AbstractC2241M;
import c.AbstractC2242N;
import c.AbstractC2243O;
import c.AbstractC2244P;
import c.AbstractC2245Q;
import c.AbstractC2246a;
import c.AbstractC2247b;
import c.AbstractC2248c;
import c.AbstractC2249d;
import c.AbstractC2250e;
import c.AbstractC2251f;
import c.AbstractC2252g;
import c.AbstractC2253h;
import c.AbstractC2254i;
import c.AbstractC2255j;
import c.AbstractC2256k;
import c.AbstractC2257l;
import c.AbstractC2258m;
import c.AbstractC2259n;
import c.AbstractC2260o;
import c.AbstractC2261p;
import c.AbstractC2262q;
import c.AbstractC2263s;
import c.AbstractC2264t;
import c.AbstractC2265u;
import c.AbstractC2267w;
import c.AbstractC2268x;
import c.AbstractC2270z;
import c.S;
import c.T;
import c.U;
import c.V;
import c.W;
import c.X;
import c.Y;
import c.Z;
import c.a0;
import c.b0;
import c.c0;
import c.d0;
import c.e0;
import c.f0;
import c.g0;
import c.h0;
import c.i0;
import c.r;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public interface HeaderFactoryExt extends AbstractC2270z {
    /* synthetic */ AbstractC2246a createAcceptEncodingHeader(String str);

    /* synthetic */ AbstractC2247b createAcceptHeader(String str, String str2);

    /* synthetic */ AbstractC2248c createAcceptLanguageHeader(Locale locale);

    /* synthetic */ AbstractC2249d createAlertInfoHeader(AbstractC2096f abstractC2096f);

    /* synthetic */ AbstractC2250e createAllowEventsHeader(String str);

    /* synthetic */ AbstractC2251f createAllowHeader(String str);

    /* synthetic */ AbstractC2252g createAuthenticationInfoHeader(String str);

    @Override // c.AbstractC2270z
    /* synthetic */ AbstractC2253h createAuthorizationHeader(String str);

    /* synthetic */ AbstractC2254i createCSeqHeader(int i10, String str);

    /* synthetic */ AbstractC2254i createCSeqHeader(long j6, String str);

    /* synthetic */ AbstractC2255j createCallIdHeader(String str);

    /* synthetic */ AbstractC2256k createCallInfoHeader(AbstractC2096f abstractC2096f);

    PChargingVectorHeader createChargingVectorHeader(String str);

    /* synthetic */ AbstractC2257l createContactHeader();

    /* synthetic */ AbstractC2257l createContactHeader(AbstractC2091a abstractC2091a);

    /* synthetic */ AbstractC2258m createContentDispositionHeader(String str);

    /* synthetic */ AbstractC2259n createContentEncodingHeader(String str);

    /* synthetic */ AbstractC2260o createContentLanguageHeader(Locale locale);

    /* synthetic */ AbstractC2261p createContentLengthHeader(int i10);

    /* synthetic */ AbstractC2262q createContentTypeHeader(String str, String str2);

    /* synthetic */ r createDateHeader(Calendar calendar);

    /* synthetic */ AbstractC2263s createErrorInfoHeader(AbstractC2096f abstractC2096f);

    /* synthetic */ AbstractC2264t createEventHeader(String str);

    /* synthetic */ AbstractC2265u createExpiresHeader(int i10);

    /* synthetic */ AbstractC2267w createFromHeader(AbstractC2091a abstractC2091a, String str);

    AbstractC2268x createHeader(String str);

    @Override // c.AbstractC2270z
    /* synthetic */ AbstractC2268x createHeader(String str, String str2);

    /* synthetic */ List createHeaders(String str);

    /* synthetic */ AbstractC2229A createInReplyToHeader(String str);

    JoinHeader createJoinHeader(String str, String str2, String str3);

    /* synthetic */ AbstractC2230B createMaxForwardsHeader(int i10);

    /* synthetic */ AbstractC2232D createMimeVersionHeader(int i10, int i11);

    /* synthetic */ AbstractC2233E createMinExpiresHeader(int i10);

    /* synthetic */ AbstractC2235G createOrganizationHeader(String str);

    PAccessNetworkInfoHeader createPAccessNetworkInfoHeader();

    PAssertedIdentityHeader createPAssertedIdentityHeader(AbstractC2091a abstractC2091a);

    PAssertedServiceHeader createPAssertedServiceHeader();

    PAssociatedURIHeader createPAssociatedURIHeader(AbstractC2091a abstractC2091a);

    PCalledPartyIDHeader createPCalledPartyIDHeader(AbstractC2091a abstractC2091a);

    PChargingFunctionAddressesHeader createPChargingFunctionAddressesHeader();

    PMediaAuthorizationHeader createPMediaAuthorizationHeader(String str);

    PPreferredIdentityHeader createPPreferredIdentityHeader(AbstractC2091a abstractC2091a);

    PPreferredServiceHeader createPPreferredServiceHeader();

    PProfileKeyHeader createPProfileKeyHeader(AbstractC2091a abstractC2091a);

    PServedUserHeader createPServedUserHeader(AbstractC2091a abstractC2091a);

    PUserDatabaseHeader createPUserDatabaseHeader(String str);

    PVisitedNetworkIDHeader createPVisitedNetworkIDHeader();

    PathHeader createPathHeader(AbstractC2091a abstractC2091a);

    /* synthetic */ AbstractC2237I createPriorityHeader(String str);

    PrivacyHeader createPrivacyHeader(String str);

    @Override // c.AbstractC2270z
    /* synthetic */ AbstractC2238J createProxyAuthenticateHeader(String str);

    @Override // c.AbstractC2270z
    /* synthetic */ AbstractC2239K createProxyAuthorizationHeader(String str);

    /* synthetic */ AbstractC2240L createProxyRequireHeader(String str);

    /* synthetic */ AbstractC2241M createRAckHeader(int i10, int i11, String str);

    /* synthetic */ AbstractC2242N createRSeqHeader(int i10);

    /* synthetic */ AbstractC2243O createReasonHeader(String str, int i10, String str2);

    /* synthetic */ AbstractC2244P createRecordRouteHeader(AbstractC2091a abstractC2091a);

    /* synthetic */ AbstractC2245Q createReferToHeader(AbstractC2091a abstractC2091a);

    ReferencesHeader createReferencesHeader(String str, String str2);

    ReferredByHeader createReferredByHeader(AbstractC2091a abstractC2091a);

    ReplacesHeader createReplacesHeader(String str, String str2, String str3);

    /* synthetic */ S createReplyToHeader(AbstractC2091a abstractC2091a);

    SipRequestLine createRequestLine(String str);

    /* synthetic */ T createRequireHeader(String str);

    /* synthetic */ U createRetryAfterHeader(int i10);

    /* synthetic */ V createRouteHeader(AbstractC2091a abstractC2091a);

    /* synthetic */ W createSIPETagHeader(String str);

    /* synthetic */ X createSIPIfMatchHeader(String str);

    SecurityClientHeader createSecurityClientHeader();

    SecurityServerHeader createSecurityServerHeader();

    SecurityVerifyHeader createSecurityVerifyHeader();

    /* synthetic */ Y createServerHeader(List list);

    ServiceRouteHeader createServiceRouteHeader(AbstractC2091a abstractC2091a);

    SessionExpiresHeader createSessionExpiresHeader(int i10);

    SipStatusLine createStatusLine(String str);

    /* synthetic */ Z createSubjectHeader(String str);

    /* synthetic */ a0 createSubscriptionStateHeader(String str);

    /* synthetic */ b0 createSupportedHeader(String str);

    /* synthetic */ c0 createTimeStampHeader(float f6);

    /* synthetic */ d0 createToHeader(AbstractC2091a abstractC2091a, String str);

    /* synthetic */ e0 createUnsupportedHeader(String str);

    /* synthetic */ f0 createUserAgentHeader(List list);

    /* synthetic */ g0 createViaHeader(String str, int i10, String str2, String str3);

    /* synthetic */ h0 createWWWAuthenticateHeader(String str);

    /* synthetic */ i0 createWarningHeader(String str, int i10, String str2);
}
