package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.core.a;
import android.gov.nist.javax.sip.address.GenericURI;
import android.gov.nist.javax.sip.header.extensions.Join;
import android.gov.nist.javax.sip.header.extensions.JoinHeader;
import android.gov.nist.javax.sip.header.extensions.MinSE;
import android.gov.nist.javax.sip.header.extensions.References;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.header.extensions.ReferredBy;
import android.gov.nist.javax.sip.header.extensions.ReferredByHeader;
import android.gov.nist.javax.sip.header.extensions.Replaces;
import android.gov.nist.javax.sip.header.extensions.ReplacesHeader;
import android.gov.nist.javax.sip.header.extensions.SessionExpires;
import android.gov.nist.javax.sip.header.extensions.SessionExpiresHeader;
import android.gov.nist.javax.sip.header.ims.PAccessNetworkInfo;
import android.gov.nist.javax.sip.header.ims.PAccessNetworkInfoHeader;
import android.gov.nist.javax.sip.header.ims.PAssertedIdentity;
import android.gov.nist.javax.sip.header.ims.PAssertedIdentityHeader;
import android.gov.nist.javax.sip.header.ims.PAssertedService;
import android.gov.nist.javax.sip.header.ims.PAssertedServiceHeader;
import android.gov.nist.javax.sip.header.ims.PAssociatedURI;
import android.gov.nist.javax.sip.header.ims.PAssociatedURIHeader;
import android.gov.nist.javax.sip.header.ims.PCalledPartyID;
import android.gov.nist.javax.sip.header.ims.PCalledPartyIDHeader;
import android.gov.nist.javax.sip.header.ims.PChargingFunctionAddresses;
import android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader;
import android.gov.nist.javax.sip.header.ims.PChargingVector;
import android.gov.nist.javax.sip.header.ims.PChargingVectorHeader;
import android.gov.nist.javax.sip.header.ims.PMediaAuthorization;
import android.gov.nist.javax.sip.header.ims.PMediaAuthorizationHeader;
import android.gov.nist.javax.sip.header.ims.PPreferredIdentity;
import android.gov.nist.javax.sip.header.ims.PPreferredIdentityHeader;
import android.gov.nist.javax.sip.header.ims.PPreferredService;
import android.gov.nist.javax.sip.header.ims.PPreferredServiceHeader;
import android.gov.nist.javax.sip.header.ims.PProfileKey;
import android.gov.nist.javax.sip.header.ims.PProfileKeyHeader;
import android.gov.nist.javax.sip.header.ims.PServedUser;
import android.gov.nist.javax.sip.header.ims.PServedUserHeader;
import android.gov.nist.javax.sip.header.ims.PUserDatabase;
import android.gov.nist.javax.sip.header.ims.PUserDatabaseHeader;
import android.gov.nist.javax.sip.header.ims.PVisitedNetworkID;
import android.gov.nist.javax.sip.header.ims.PVisitedNetworkIDHeader;
import android.gov.nist.javax.sip.header.ims.Path;
import android.gov.nist.javax.sip.header.ims.PathHeader;
import android.gov.nist.javax.sip.header.ims.Privacy;
import android.gov.nist.javax.sip.header.ims.PrivacyHeader;
import android.gov.nist.javax.sip.header.ims.SecurityClient;
import android.gov.nist.javax.sip.header.ims.SecurityClientHeader;
import android.gov.nist.javax.sip.header.ims.SecurityServer;
import android.gov.nist.javax.sip.header.ims.SecurityServerHeader;
import android.gov.nist.javax.sip.header.ims.SecurityVerify;
import android.gov.nist.javax.sip.header.ims.SecurityVerifyHeader;
import android.gov.nist.javax.sip.header.ims.ServiceRoute;
import android.gov.nist.javax.sip.header.ims.ServiceRouteHeader;
import android.gov.nist.javax.sip.parser.RequestLineParser;
import android.gov.nist.javax.sip.parser.StatusLineParser;
import android.gov.nist.javax.sip.parser.StringMsgParser;
import android.javax.sip.g;
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
import c.AbstractC2266v;
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
import java.text.ParseException;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class HeaderFactoryImpl implements AbstractC2270z, HeaderFactoryExt {
    private boolean stripAddressScopeZones;

    public HeaderFactoryImpl() {
        this.stripAddressScopeZones = false;
        this.stripAddressScopeZones = Boolean.getBoolean("android.gov.nist.core.STRIP_ADDR_SCOPES");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2246a createAcceptEncodingHeader(String str) {
        if (str != null) {
            AcceptEncoding acceptEncoding = new AcceptEncoding();
            acceptEncoding.setEncoding(str);
            return acceptEncoding;
        }
        throw new NullPointerException("the encoding parameter is null");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2247b createAcceptHeader(String str, String str2) {
        if (str != null && str2 != null) {
            Accept accept = new Accept();
            accept.setContentType(str);
            accept.setContentSubType(str2);
            return accept;
        }
        throw new NullPointerException("contentType or subtype is null ");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2248c createAcceptLanguageHeader(Locale locale) {
        if (locale != null) {
            AcceptLanguage acceptLanguage = new AcceptLanguage();
            acceptLanguage.setAcceptLanguage(locale);
            return acceptLanguage;
        }
        throw new NullPointerException("null arg");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2249d createAlertInfoHeader(AbstractC2096f abstractC2096f) {
        if (abstractC2096f != null) {
            AlertInfo alertInfo = new AlertInfo();
            alertInfo.setAlertInfo(abstractC2096f);
            return alertInfo;
        }
        throw new NullPointerException("null arg alertInfo");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2250e createAllowEventsHeader(String str) {
        if (str != null) {
            AllowEvents allowEvents = new AllowEvents();
            allowEvents.setEventType(str);
            return allowEvents;
        }
        throw new NullPointerException("null arg eventType");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2251f createAllowHeader(String str) {
        if (str != null) {
            Allow allow = new Allow();
            allow.setMethod(str);
            return allow;
        }
        throw new NullPointerException("null arg method");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2252g createAuthenticationInfoHeader(String str) {
        if (str != null) {
            AuthenticationInfo authenticationInfo = new AuthenticationInfo();
            authenticationInfo.setResponse(str);
            return authenticationInfo;
        }
        throw new NullPointerException("null arg response");
    }

    @Override // c.AbstractC2270z
    public AbstractC2253h createAuthorizationHeader(String str) {
        if (str != null) {
            Authorization authorization = new Authorization();
            authorization.setScheme(str);
            return authorization;
        }
        throw new NullPointerException("null arg scheme ");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2254i createCSeqHeader(int i10, String str) {
        return createCSeqHeader(i10, str);
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2255j createCallIdHeader(String str) {
        if (str != null) {
            CallID callID = new CallID();
            callID.setCallId(str);
            return callID;
        }
        throw new NullPointerException("null arg callId");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2256k createCallInfoHeader(AbstractC2096f abstractC2096f) {
        if (abstractC2096f != null) {
            CallInfo callInfo = new CallInfo();
            callInfo.setInfo(abstractC2096f);
            return callInfo;
        }
        throw new NullPointerException("null arg callInfo");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PChargingVectorHeader createChargingVectorHeader(String str) {
        if (str != null) {
            PChargingVector pChargingVector = new PChargingVector();
            pChargingVector.setICID(str);
            return pChargingVector;
        }
        throw new NullPointerException("null icid arg!");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2257l createContactHeader(AbstractC2091a abstractC2091a) {
        if (abstractC2091a != null) {
            Contact contact = new Contact();
            contact.setAddress(abstractC2091a);
            return contact;
        }
        throw new NullPointerException("null arg address");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2258m createContentDispositionHeader(String str) {
        if (str != null) {
            ContentDisposition contentDisposition = new ContentDisposition();
            contentDisposition.setDispositionType(str);
            return contentDisposition;
        }
        throw new NullPointerException("null arg contentDisposition");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2259n createContentEncodingHeader(String str) {
        if (str != null) {
            ContentEncoding contentEncoding = new ContentEncoding();
            contentEncoding.setEncoding(str);
            return contentEncoding;
        }
        throw new NullPointerException("null encoding");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2260o createContentLanguageHeader(Locale locale) {
        if (locale != null) {
            ContentLanguage contentLanguage = new ContentLanguage();
            contentLanguage.setContentLanguage(locale);
            return contentLanguage;
        }
        throw new NullPointerException("null arg contentLanguage");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2261p createContentLengthHeader(int i10) {
        if (i10 >= 0) {
            ContentLength contentLength = new ContentLength();
            contentLength.setContentLength(i10);
            return contentLength;
        }
        throw new g("bad contentLength");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2262q createContentTypeHeader(String str, String str2) {
        if (str != null && str2 != null) {
            ContentType contentType = new ContentType();
            contentType.setContentType(str);
            contentType.setContentSubType(str2);
            return contentType;
        }
        throw new NullPointerException("null contentType or subType");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public r createDateHeader(Calendar calendar) {
        SIPDateHeader sIPDateHeader = new SIPDateHeader();
        if (calendar != null) {
            sIPDateHeader.setDate(calendar);
            return sIPDateHeader;
        }
        throw new NullPointerException("null date");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2263s createErrorInfoHeader(AbstractC2096f abstractC2096f) {
        if (abstractC2096f != null) {
            return new ErrorInfo((GenericURI) abstractC2096f);
        }
        throw new NullPointerException("null arg");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2264t createEventHeader(String str) {
        if (str != null) {
            Event event = new Event();
            event.setEventType(str);
            return event;
        }
        throw new NullPointerException("null eventType");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2265u createExpiresHeader(int i10) {
        if (i10 >= 0) {
            Expires expires = new Expires();
            expires.setExpires(i10);
            return expires;
        }
        throw new g(a.e("bad value ", i10));
    }

    public AbstractC2266v createExtensionHeader(String str, String str2) {
        if (str != null) {
            ExtensionHeaderImpl extensionHeaderImpl = new ExtensionHeaderImpl();
            extensionHeaderImpl.setName(str);
            extensionHeaderImpl.setValue(str2);
            return extensionHeaderImpl;
        }
        throw new NullPointerException("bad name");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2267w createFromHeader(AbstractC2091a abstractC2091a, String str) {
        if (abstractC2091a != null) {
            From from = new From();
            from.setAddress(abstractC2091a);
            if (str != null) {
                from.setTag(str);
            }
            return from;
        }
        throw new NullPointerException("null address arg");
    }

    @Override // c.AbstractC2270z
    public AbstractC2268x createHeader(String str, String str2) {
        if (str != null) {
            return createHeader(str + ":" + str2);
        }
        throw new NullPointerException("header name is null");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public List createHeaders(String str) {
        if (str != null) {
            new StringMsgParser();
            SIPHeader parseSIPHeader = StringMsgParser.parseSIPHeader(str);
            if (parseSIPHeader instanceof SIPHeaderList) {
                return (SIPHeaderList) parseSIPHeader;
            }
            throw new ParseException("List of headers of this type is not allowed in a message", 0);
        }
        throw new NullPointerException("null arg!");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2229A createInReplyToHeader(String str) {
        if (str != null) {
            InReplyTo inReplyTo = new InReplyTo();
            inReplyTo.setCallId(str);
            return inReplyTo;
        }
        throw new NullPointerException("null callId arg");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public JoinHeader createJoinHeader(String str, String str2, String str3) {
        Join join = new Join();
        join.setCallId(str);
        join.setFromTag(str3);
        join.setToTag(str2);
        return join;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2230B createMaxForwardsHeader(int i10) {
        if (i10 >= 0 && i10 <= 255) {
            MaxForwards maxForwards = new MaxForwards();
            maxForwards.setMaxForwards(i10);
            return maxForwards;
        }
        throw new g(a.e("bad maxForwards arg ", i10));
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2232D createMimeVersionHeader(int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            MimeVersion mimeVersion = new MimeVersion();
            mimeVersion.setMajorVersion(i10);
            mimeVersion.setMinorVersion(i11);
            return mimeVersion;
        }
        throw new g("bad major/minor version");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2233E createMinExpiresHeader(int i10) {
        if (i10 >= 0) {
            MinExpires minExpires = new MinExpires();
            minExpires.setExpires(i10);
            return minExpires;
        }
        throw new g(a.e("bad minExpires ", i10));
    }

    public AbstractC2266v createMinSEHeader(int i10) {
        if (i10 >= 0) {
            MinSE minSE = new MinSE();
            minSE.setExpires(i10);
            return minSE;
        }
        throw new g(a.e("bad value ", i10));
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2235G createOrganizationHeader(String str) {
        if (str != null) {
            Organization organization = new Organization();
            organization.setOrganization(str);
            return organization;
        }
        throw new NullPointerException("bad organization arg");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PAccessNetworkInfoHeader createPAccessNetworkInfoHeader() {
        return new PAccessNetworkInfo();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PAssertedIdentityHeader createPAssertedIdentityHeader(AbstractC2091a abstractC2091a) {
        if (abstractC2091a != null) {
            PAssertedIdentity pAssertedIdentity = new PAssertedIdentity();
            pAssertedIdentity.setAddress(abstractC2091a);
            return pAssertedIdentity;
        }
        throw new NullPointerException("null address!");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PAssertedServiceHeader createPAssertedServiceHeader() {
        return new PAssertedService();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PAssociatedURIHeader createPAssociatedURIHeader(AbstractC2091a abstractC2091a) {
        if (abstractC2091a != null) {
            PAssociatedURI pAssociatedURI = new PAssociatedURI();
            pAssociatedURI.setAddress(abstractC2091a);
            return pAssociatedURI;
        }
        throw new NullPointerException("null associatedURI!");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PCalledPartyIDHeader createPCalledPartyIDHeader(AbstractC2091a abstractC2091a) {
        if (abstractC2091a != null) {
            PCalledPartyID pCalledPartyID = new PCalledPartyID();
            pCalledPartyID.setAddress(abstractC2091a);
            return pCalledPartyID;
        }
        throw new NullPointerException("null address!");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PChargingFunctionAddressesHeader createPChargingFunctionAddressesHeader() {
        return new PChargingFunctionAddresses();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PMediaAuthorizationHeader createPMediaAuthorizationHeader(String str) {
        if (str != null && str != "") {
            PMediaAuthorization pMediaAuthorization = new PMediaAuthorization();
            pMediaAuthorization.setMediaAuthorizationToken(str);
            return pMediaAuthorization;
        }
        throw new g("The Media-Authorization-Token parameter is null or empty");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PPreferredIdentityHeader createPPreferredIdentityHeader(AbstractC2091a abstractC2091a) {
        if (abstractC2091a != null) {
            PPreferredIdentity pPreferredIdentity = new PPreferredIdentity();
            pPreferredIdentity.setAddress(abstractC2091a);
            return pPreferredIdentity;
        }
        throw new NullPointerException("null address!");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PPreferredServiceHeader createPPreferredServiceHeader() {
        return new PPreferredService();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PProfileKeyHeader createPProfileKeyHeader(AbstractC2091a abstractC2091a) {
        if (abstractC2091a != null) {
            PProfileKey pProfileKey = new PProfileKey();
            pProfileKey.setAddress(abstractC2091a);
            return pProfileKey;
        }
        throw new NullPointerException("Address is null");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PServedUserHeader createPServedUserHeader(AbstractC2091a abstractC2091a) {
        if (abstractC2091a != null) {
            PServedUser pServedUser = new PServedUser();
            pServedUser.setAddress(abstractC2091a);
            return pServedUser;
        }
        throw new NullPointerException("Address is null");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PUserDatabaseHeader createPUserDatabaseHeader(String str) {
        if (str != null && !str.equals(Separators.SP)) {
            PUserDatabase pUserDatabase = new PUserDatabase();
            pUserDatabase.setDatabaseName(str);
            return pUserDatabase;
        }
        throw new NullPointerException("Database name is null");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PVisitedNetworkIDHeader createPVisitedNetworkIDHeader() {
        return new PVisitedNetworkID();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PathHeader createPathHeader(AbstractC2091a abstractC2091a) {
        if (abstractC2091a != null) {
            Path path = new Path();
            path.setAddress(abstractC2091a);
            return path;
        }
        throw new NullPointerException("null address!");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2237I createPriorityHeader(String str) {
        if (str != null) {
            Priority priority = new Priority();
            priority.setPriority(str);
            return priority;
        }
        throw new NullPointerException("bad priority arg");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PrivacyHeader createPrivacyHeader(String str) {
        if (str != null) {
            return new Privacy(str);
        }
        throw new NullPointerException("null privacyType arg");
    }

    @Override // c.AbstractC2270z
    public AbstractC2238J createProxyAuthenticateHeader(String str) {
        if (str != null) {
            ProxyAuthenticate proxyAuthenticate = new ProxyAuthenticate();
            proxyAuthenticate.setScheme(str);
            return proxyAuthenticate;
        }
        throw new NullPointerException("bad scheme arg");
    }

    @Override // c.AbstractC2270z
    public AbstractC2239K createProxyAuthorizationHeader(String str) {
        if (str != null) {
            ProxyAuthorization proxyAuthorization = new ProxyAuthorization();
            proxyAuthorization.setScheme(str);
            return proxyAuthorization;
        }
        throw new NullPointerException("bad scheme arg");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2240L createProxyRequireHeader(String str) {
        if (str != null) {
            ProxyRequire proxyRequire = new ProxyRequire();
            proxyRequire.setOptionTag(str);
            return proxyRequire;
        }
        throw new NullPointerException("bad optionTag arg");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2241M createRAckHeader(int i10, int i11, String str) {
        return createRAckHeader(i10, i11, str);
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2242N createRSeqHeader(int i10) {
        return createRSeqHeader(i10);
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2243O createReasonHeader(String str, int i10, String str2) {
        if (str != null) {
            if (i10 >= 0) {
                Reason reason = new Reason();
                reason.setProtocol(str);
                reason.setCause(i10);
                reason.setText(str2);
                return reason;
            }
            throw new g("bad cause");
        }
        throw new NullPointerException("bad protocol arg");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2244P createRecordRouteHeader(AbstractC2091a abstractC2091a) {
        if (abstractC2091a != null) {
            RecordRoute recordRoute = new RecordRoute();
            recordRoute.setAddress(abstractC2091a);
            return recordRoute;
        }
        throw new NullPointerException("Null argument!");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2245Q createReferToHeader(AbstractC2091a abstractC2091a) {
        if (abstractC2091a != null) {
            ReferTo referTo = new ReferTo();
            referTo.setAddress(abstractC2091a);
            return referTo;
        }
        throw new NullPointerException("null address!");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public ReferencesHeader createReferencesHeader(String str, String str2) {
        References references = new References();
        references.setCallId(str);
        references.setRel(str2);
        return references;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public ReferredByHeader createReferredByHeader(AbstractC2091a abstractC2091a) {
        if (abstractC2091a != null) {
            ReferredBy referredBy = new ReferredBy();
            referredBy.setAddress(abstractC2091a);
            return referredBy;
        }
        throw new NullPointerException("null address!");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public ReplacesHeader createReplacesHeader(String str, String str2, String str3) {
        Replaces replaces = new Replaces();
        replaces.setCallId(str);
        replaces.setFromTag(str3);
        replaces.setToTag(str2);
        return replaces;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public S createReplyToHeader(AbstractC2091a abstractC2091a) {
        if (abstractC2091a != null) {
            ReplyTo replyTo = new ReplyTo();
            replyTo.setAddress(abstractC2091a);
            return replyTo;
        }
        throw new NullPointerException("null address");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public SipRequestLine createRequestLine(String str) {
        return new RequestLineParser(str).parse();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public T createRequireHeader(String str) {
        if (str != null) {
            Require require = new Require();
            require.setOptionTag(str);
            return require;
        }
        throw new NullPointerException("null optionTag");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public U createRetryAfterHeader(int i10) {
        if (i10 >= 0) {
            RetryAfter retryAfter = new RetryAfter();
            retryAfter.setRetryAfter(i10);
            return retryAfter;
        }
        throw new g("bad retryAfter arg");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public V createRouteHeader(AbstractC2091a abstractC2091a) {
        if (abstractC2091a != null) {
            Route route = new Route();
            route.setAddress(abstractC2091a);
            return route;
        }
        throw new NullPointerException("null address arg");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public W createSIPETagHeader(String str) {
        return new SIPETag(str);
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public X createSIPIfMatchHeader(String str) {
        return new SIPIfMatch(str);
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public SecurityClientHeader createSecurityClientHeader() {
        return new SecurityClient();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public SecurityServerHeader createSecurityServerHeader() {
        return new SecurityServer();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public SecurityVerifyHeader createSecurityVerifyHeader() {
        return new SecurityVerify();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public Y createServerHeader(List list) {
        if (list != null) {
            Server server = new Server();
            server.setProduct(list);
            return server;
        }
        throw new NullPointerException("null productList arg");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public ServiceRouteHeader createServiceRouteHeader(AbstractC2091a abstractC2091a) {
        if (abstractC2091a != null) {
            ServiceRoute serviceRoute = new ServiceRoute();
            serviceRoute.setAddress(abstractC2091a);
            return serviceRoute;
        }
        throw new NullPointerException("null address!");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public SessionExpiresHeader createSessionExpiresHeader(int i10) {
        if (i10 >= 0) {
            SessionExpires sessionExpires = new SessionExpires();
            sessionExpires.setExpires(i10);
            return sessionExpires;
        }
        throw new g(a.e("bad value ", i10));
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public SipStatusLine createStatusLine(String str) {
        return new StatusLineParser(str).parse();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public Z createSubjectHeader(String str) {
        if (str != null) {
            Subject subject = new Subject();
            subject.setSubject(str);
            return subject;
        }
        throw new NullPointerException("null subject arg");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public a0 createSubscriptionStateHeader(String str) {
        if (str != null) {
            SubscriptionState subscriptionState = new SubscriptionState();
            subscriptionState.setState(str);
            return subscriptionState;
        }
        throw new NullPointerException("null subscriptionState arg");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public b0 createSupportedHeader(String str) {
        if (str != null) {
            Supported supported = new Supported();
            supported.setOptionTag(str);
            return supported;
        }
        throw new NullPointerException("null optionTag arg");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public c0 createTimeStampHeader(float f6) {
        if (f6 >= 0.0f) {
            TimeStamp timeStamp = new TimeStamp();
            timeStamp.setTimeStamp(f6);
            return timeStamp;
        }
        throw new IllegalArgumentException("illegal timeStamp");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public d0 createToHeader(AbstractC2091a abstractC2091a, String str) {
        if (abstractC2091a != null) {
            To to = new To();
            to.setAddress(abstractC2091a);
            if (str != null) {
                to.setTag(str);
            }
            return to;
        }
        throw new NullPointerException("null address");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public e0 createUnsupportedHeader(String str) {
        if (str != null) {
            Unsupported unsupported = new Unsupported();
            unsupported.setOptionTag(str);
            return unsupported;
        }
        throw new NullPointerException(str);
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public f0 createUserAgentHeader(List list) {
        if (list != null) {
            UserAgent userAgent = new UserAgent();
            userAgent.setProduct(list);
            return userAgent;
        }
        throw new NullPointerException("null user agent");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public g0 createViaHeader(String str, int i10, String str2, String str3) {
        int indexOf;
        if (str != null && str2 != null) {
            Via via = new Via();
            if (str3 != null) {
                via.setBranch(str3);
            }
            if (str.indexOf(58) >= 0 && str.indexOf(91) < 0) {
                if (this.stripAddressScopeZones && (indexOf = str.indexOf(37)) != -1) {
                    str = str.substring(0, indexOf);
                }
                str = a.h("[", str, ']');
            }
            via.setHost(str);
            via.setPort(i10);
            via.setTransport(str2);
            return via;
        }
        throw new NullPointerException("null arg");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public h0 createWWWAuthenticateHeader(String str) {
        if (str != null) {
            WWWAuthenticate wWWAuthenticate = new WWWAuthenticate();
            wWWAuthenticate.setScheme(str);
            return wWWAuthenticate;
        }
        throw new NullPointerException("null scheme");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public i0 createWarningHeader(String str, int i10, String str2) {
        if (str != null) {
            Warning warning = new Warning();
            warning.setAgent(str);
            warning.setCode(i10);
            warning.setText(str2);
            return warning;
        }
        throw new NullPointerException("null arg");
    }

    public void setPrettyEncoding(boolean z10) {
        SIPHeaderList.setPrettyEncode(z10);
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2254i createCSeqHeader(long j6, String str) {
        if (j6 >= 0) {
            if (str != null) {
                CSeq cSeq = new CSeq();
                cSeq.setMethod(str);
                cSeq.setSeqNumber(j6);
                return cSeq;
            }
            throw new NullPointerException("null arg method");
        }
        throw new g(a.f("bad arg ", j6));
    }

    public AbstractC2241M createRAckHeader(long j6, long j10, String str) {
        if (str != null) {
            if (j10 >= 0 && j6 >= 0) {
                RAck rAck = new RAck();
                rAck.setMethod(str);
                rAck.setCSequenceNumber(j10);
                rAck.setRSequenceNumber(j6);
                return rAck;
            }
            throw new g("bad cseq/rseq arg");
        }
        throw new NullPointerException("Bad method");
    }

    public AbstractC2242N createRSeqHeader(long j6) {
        if (j6 >= 0) {
            RSeq rSeq = new RSeq();
            rSeq.setSeqNumber(j6);
            return rSeq;
        }
        throw new g(a.f("invalid sequenceNumber arg ", j6));
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2257l createContactHeader() {
        Contact contact = new Contact();
        contact.setWildCardFlag(true);
        contact.setExpires(0);
        return contact;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public AbstractC2268x createHeader(String str) {
        new StringMsgParser();
        SIPHeader parseSIPHeader = StringMsgParser.parseSIPHeader(str.trim());
        if (parseSIPHeader instanceof SIPHeaderList) {
            SIPHeaderList sIPHeaderList = (SIPHeaderList) parseSIPHeader;
            if (sIPHeaderList.size() <= 1) {
                if (sIPHeaderList.size() == 0) {
                    try {
                        return (AbstractC2268x) ((SIPHeaderList) parseSIPHeader).getMyClass().newInstance();
                    } catch (IllegalAccessException e10) {
                        e10.printStackTrace();
                        return null;
                    } catch (InstantiationException e11) {
                        e11.printStackTrace();
                        return null;
                    }
                }
                return sIPHeaderList.getFirst();
            }
            throw new ParseException("Only singleton allowed ".concat(str), 0);
        }
        return parseSIPHeader;
    }
}
