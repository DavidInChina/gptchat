package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.address.GenericURI;
import android.gov.nist.javax.sip.address.ParameterNames;
import android.gov.nist.javax.sip.address.SipUri;
import android.gov.nist.javax.sip.header.RequestLine;
import android.gov.nist.javax.sip.header.Route;
import android.gov.nist.javax.sip.header.RouteList;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.javax.sip.n;
import android.javax.sip.r;
import b.AbstractC2092b;
import b.AbstractC2093c;
import b.AbstractC2094d;
import b.AbstractC2096f;
import c.g0;
import d.AbstractC2561b;
import java.util.LinkedList;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public class DefaultRouter implements AbstractC2093c {
    private static StackLogger logger = CommonLogger.getLogger(DefaultRouter.class);
    private AbstractC2092b defaultRoute;
    private SIPTransactionStack sipStack;

    private DefaultRouter() {
    }

    public final AbstractC2092b createHop(AbstractC2094d abstractC2094d, AbstractC2561b abstractC2561b) {
        String str;
        int i10;
        String str2;
        if (abstractC2094d.isSecure()) {
            str = ParameterNames.TLS;
        } else {
            str = abstractC2094d.getTransportParam();
        }
        if (str == null) {
            g0 g0Var = (g0) abstractC2561b.getHeader(SIPHeaderNames.VIA);
            if (g0Var != null) {
                str = g0Var.getTransport();
            }
            if (str == null) {
                str = "UDP";
            }
        }
        if (abstractC2094d.getPort() != -1) {
            i10 = abstractC2094d.getPort();
        } else if (str.equalsIgnoreCase(ParameterNames.TLS)) {
            i10 = SIPConstants.DEFAULT_TLS_PORT;
        } else {
            i10 = SIPConstants.DEFAULT_PORT;
        }
        if (abstractC2094d.getMAddrParam() != null) {
            str2 = abstractC2094d.getMAddrParam();
        } else {
            str2 = abstractC2094d.getHost();
        }
        return this.sipStack.getAddressResolver().resolveAddress(new HopImpl(str2, i10, str));
    }

    public void fixStrictRouting(SIPRequest sIPRequest) {
        RouteList routeHeaders = sIPRequest.getRouteHeaders();
        routeHeaders.removeFirst();
        AddressImpl addressImpl = new AddressImpl();
        addressImpl.setAddess(sIPRequest.getRequestURI());
        routeHeaders.add((RouteList) new Route(addressImpl));
        sIPRequest.setRequestURI((SipUri) ((Route) routeHeaders.getFirst()).getAddress().getURI());
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("post: fixStrictRouting" + sIPRequest);
        }
    }

    @Override // b.AbstractC2093c
    public AbstractC2092b getNextHop(AbstractC2561b abstractC2561b) {
        SIPRequest sIPRequest = (SIPRequest) abstractC2561b;
        RequestLine requestLine = sIPRequest.getRequestLine();
        if (requestLine == null) {
            return this.defaultRoute;
        }
        GenericURI uri = requestLine.getUri();
        if (uri != null) {
            RouteList routeHeaders = sIPRequest.getRouteHeaders();
            if (routeHeaders != null && routeHeaders.getFirst() != null) {
                AbstractC2096f uri2 = ((Route) routeHeaders.getFirst()).getAddress().getURI();
                if (uri2.isSipURI()) {
                    AbstractC2094d abstractC2094d = (AbstractC2094d) uri2;
                    if (!abstractC2094d.hasLrParam()) {
                        fixStrictRouting(sIPRequest);
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Route post processing fixed strict routing");
                        }
                    }
                    AbstractC2092b createHop = createHop(abstractC2094d, abstractC2561b);
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger = logger;
                        stackLogger.logDebug("NextHop based on Route:" + createHop);
                    }
                    return createHop;
                }
                throw new n("First Route not a SIP URI");
            }
            if (uri.isSipURI()) {
                AbstractC2094d abstractC2094d2 = (AbstractC2094d) uri;
                if (abstractC2094d2.getMAddrParam() != null) {
                    AbstractC2092b createHop2 = createHop(abstractC2094d2, abstractC2561b);
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger2 = logger;
                        stackLogger2.logDebug("Using request URI maddr to route the request = " + createHop2.toString());
                    }
                    return createHop2;
                }
            }
            if (this.defaultRoute != null) {
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger3 = logger;
                    stackLogger3.logDebug("Using outbound proxy to route the request = " + this.defaultRoute.toString());
                }
                return this.defaultRoute;
            } else if (uri.isSipURI()) {
                AbstractC2092b createHop3 = createHop((AbstractC2094d) uri, abstractC2561b);
                if (createHop3 != null && logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger4 = logger;
                    stackLogger4.logDebug("Used request-URI for nextHop = " + createHop3.toString());
                } else if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("returning null hop -- loop detected");
                }
                return createHop3;
            } else {
                InternalErrorHandler.handleException("Unexpected non-sip URI", logger);
                return null;
            }
        }
        throw new IllegalArgumentException("Bad message: Null requestURI");
    }

    public ListIterator getNextHops(AbstractC2561b abstractC2561b) {
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(getNextHop(abstractC2561b));
            return linkedList.listIterator();
        } catch (n unused) {
            return null;
        }
    }

    @Override // b.AbstractC2093c
    public AbstractC2092b getOutboundProxy() {
        return this.defaultRoute;
    }

    public DefaultRouter(r rVar, String str) {
        SIPTransactionStack sIPTransactionStack = (SIPTransactionStack) rVar;
        this.sipStack = sIPTransactionStack;
        if (str != null) {
            try {
                this.defaultRoute = sIPTransactionStack.getAddressResolver().resolveAddress(new HopImpl(str));
            } catch (IllegalArgumentException e10) {
                logger.logError("Invalid default route specification - need host:port/transport");
                throw e10;
            }
        }
    }
}
