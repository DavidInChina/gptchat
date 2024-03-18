package android.gov.nist.javax.sip.header;

import android.gov.nist.core.PackageNames;
import android.gov.nist.core.a;
import android.gov.nist.javax.sip.header.ims.PAccessNetworkInfo;
import android.gov.nist.javax.sip.header.ims.PAssertedIdentity;
import android.gov.nist.javax.sip.header.ims.PAssociatedURI;
import android.gov.nist.javax.sip.header.ims.PCalledPartyID;
import android.gov.nist.javax.sip.header.ims.PChargingFunctionAddresses;
import android.gov.nist.javax.sip.header.ims.PChargingVector;
import android.gov.nist.javax.sip.header.ims.PMediaAuthorization;
import android.gov.nist.javax.sip.header.ims.PPreferredIdentity;
import android.gov.nist.javax.sip.header.ims.PVisitedNetworkID;
import android.gov.nist.javax.sip.header.ims.Path;
import android.gov.nist.javax.sip.header.ims.Privacy;
import android.gov.nist.javax.sip.header.ims.ServiceRoute;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class NameMap implements SIPHeaderNames, PackageNames {
    static Map<String, String> nameMap;

    static {
        initializeNameMap();
    }

    public static void addExtensionHeader(String str, String str2) {
        nameMap.put(str.toLowerCase(), str2);
    }

    public static Class getClassFromName(String str) {
        String str2 = nameMap.get(str.toLowerCase());
        if (str2 == null) {
            return null;
        }
        try {
            return Class.forName(str2);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static void initializeNameMap() {
        nameMap = new HashMap(63);
        putNameMap(SIPHeaderNames.MIN_EXPIRES, MinExpires.class.getName());
        putNameMap(SIPHeaderNames.ERROR_INFO, ErrorInfo.class.getName());
        putNameMap(SIPHeaderNames.EVENT, a.i(SIPHeaderNames.REPLY_TO, a.i(SIPHeaderNames.EXPIRES, a.i(SIPHeaderNames.PRIORITY, a.i(SIPHeaderNames.USER_AGENT, a.i(SIPHeaderNames.CONTENT_DISPOSITION, a.i(SIPHeaderNames.PROXY_REQUIRE, a.i(SIPHeaderNames.ORGANIZATION, a.i(SIPHeaderNames.WWW_AUTHENTICATE, a.i(SIPHeaderNames.ROUTE, a.i(SIPHeaderNames.CONTENT_ENCODING, a.i(SIPHeaderNames.RETRY_AFTER, a.i(SIPHeaderNames.SERVER, a.i(SIPHeaderNames.AUTHORIZATION, a.i(SIPHeaderNames.FROM, a.i(SIPHeaderNames.TO, a.i(SIPHeaderNames.RECORD_ROUTE, a.i(SIPHeaderNames.ACCEPT, a.i(SIPHeaderNames.ALERT_INFO, a.i(SIPHeaderNames.CALL_INFO, a.i(SIPHeaderNames.ALLOW, a.i(SIPHeaderNames.MIME_VERSION, MimeVersion.class.getName(), InReplyTo.class, SIPHeaderNames.IN_REPLY_TO, Allow.class), ContentLanguage.class, SIPHeaderNames.CONTENT_LANGUAGE, CallInfo.class), CSeq.class, SIPHeaderNames.CSEQ, AlertInfo.class), AcceptEncoding.class, SIPHeaderNames.ACCEPT_ENCODING, Accept.class), AcceptLanguage.class, SIPHeaderNames.ACCEPT_LANGUAGE, RecordRoute.class), TimeStamp.class, SIPHeaderNames.TIMESTAMP, To.class), Via.class, SIPHeaderNames.VIA, From.class), CallID.class, SIPHeaderNames.CALL_ID, Authorization.class), ProxyAuthenticate.class, SIPHeaderNames.PROXY_AUTHENTICATE, Server.class), Unsupported.class, SIPHeaderNames.UNSUPPORTED, RetryAfter.class), ContentType.class, SIPHeaderNames.CONTENT_TYPE, ContentEncoding.class), ContentLength.class, SIPHeaderNames.CONTENT_LENGTH, Route.class), Contact.class, SIPHeaderNames.CONTACT, WWWAuthenticate.class), MaxForwards.class, SIPHeaderNames.MAX_FORWARDS, Organization.class), ProxyAuthorization.class, SIPHeaderNames.PROXY_AUTHORIZATION, ProxyRequire.class), Require.class, SIPHeaderNames.REQUIRE, ContentDisposition.class), Subject.class, SIPHeaderNames.SUBJECT, UserAgent.class), Warning.class, SIPHeaderNames.WARNING, Priority.class), SIPDateHeader.class, SIPHeaderNames.DATE, Expires.class), Supported.class, SIPHeaderNames.SUPPORTED, ReplyTo.class), SubscriptionState.class, SIPHeaderNames.SUBSCRIPTION_STATE, Event.class));
        putNameMap(SIPHeaderNames.ALLOW_EVENTS, AllowEvents.class.getName());
        putNameMap("Referred-By", "ReferredBy");
        putNameMap("Session-Expires", "SessionExpires");
        putNameMap("Min-SE", "MinSE");
        putNameMap("Replaces", "Replaces");
        putNameMap("Join", "Join");
        putNameMap("Service-Route", a.i("P-Preferred-Identity", a.i("P-Media-Authorization", a.i("P-Charging-Function-Addresses", a.i("P-Associated-URI", a.i("P-Access-Network-Info", PAccessNetworkInfo.class.getName(), PAssertedIdentity.class, "P-Asserted-Identity", PAssociatedURI.class), PCalledPartyID.class, "P-Called-Party-ID", PChargingFunctionAddresses.class), PChargingVector.class, "P-Charging-Vector", PMediaAuthorization.class), Path.class, "Path", PPreferredIdentity.class), Privacy.class, "Privacy", ServiceRoute.class));
        putNameMap("P-Visited-Network-ID", PVisitedNetworkID.class.getName());
    }

    public static void putNameMap(String str, String str2) {
        nameMap.put(str.toLowerCase(), str2);
    }
}
