package android.gov.nist.javax.sip.clientauthutils;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.stack.SIPClientTransaction;
import android.gov.nist.javax.sip.stack.SIPTransactionStack;
import android.javax.sip.a;
import android.javax.sip.d;
import android.javax.sip.g;
import android.javax.sip.n;
import android.javax.sip.q;
import b.AbstractC2092b;
import b.AbstractC2094d;
import b.AbstractC2096f;
import c.AbstractC2238J;
import c.AbstractC2253h;
import c.AbstractC2254i;
import c.AbstractC2270z;
import c.g0;
import c.h0;
import d.AbstractC2561b;
import d.AbstractC2562c;
import java.text.ParseException;
import java.util.Collection;
import java.util.ListIterator;
import java.util.Timer;

/* loaded from: classes.dex */
public class AuthenticationHelperImpl implements AuthenticationHelper {
    private static StackLogger logger = CommonLogger.getLogger(AuthenticationHelperImpl.class);
    private Object accountManager;
    private CredentialsCache cachedCredentials;
    private AbstractC2270z headerFactory;
    private SIPTransactionStack sipStack;
    Timer timer;

    public AuthenticationHelperImpl(SIPTransactionStack sIPTransactionStack, AccountManager accountManager, AbstractC2270z abstractC2270z) {
        this.accountManager = accountManager;
        this.headerFactory = abstractC2270z;
        this.sipStack = sIPTransactionStack;
        this.cachedCredentials = new CredentialsCache(sIPTransactionStack.getTimer());
    }

    private AbstractC2253h getAuthorization(String str, String str2, String str3, h0 h0Var, UserCredentialHash userCredentialHash) {
        AbstractC2253h abstractC2253h;
        String str4 = h0Var.getQop() != null ? "auth" : null;
        String calculateResponse = MessageDigestAlgorithm.calculateResponse(h0Var.getAlgorithm(), userCredentialHash.getHashUserDomainPassword(), h0Var.getNonce(), "00000001", "xyz", str, str2, str3, str4, logger);
        try {
            if (h0Var instanceof AbstractC2238J) {
                abstractC2253h = this.headerFactory.createProxyAuthorizationHeader(h0Var.getScheme());
            } else {
                abstractC2253h = this.headerFactory.createAuthorizationHeader(h0Var.getScheme());
            }
            abstractC2253h.setUsername(userCredentialHash.getUserName());
            abstractC2253h.setRealm(h0Var.getRealm());
            abstractC2253h.setNonce(h0Var.getNonce());
            abstractC2253h.setParameter("uri", str2);
            abstractC2253h.setResponse(calculateResponse);
            if (h0Var.getAlgorithm() != null) {
                abstractC2253h.setAlgorithm(h0Var.getAlgorithm());
            }
            if (h0Var.getOpaque() != null) {
                abstractC2253h.setOpaque(h0Var.getOpaque());
            }
            if (str4 != null) {
                abstractC2253h.setQop(str4);
                abstractC2253h.setCNonce("xyz");
                abstractC2253h.setNonceCount(Integer.parseInt("00000001"));
            }
            abstractC2253h.setResponse(calculateResponse);
            return abstractC2253h;
        } catch (ParseException unused) {
            throw new RuntimeException("Failed to create an authorization header!");
        }
    }

    private void removeBranchID(AbstractC2561b abstractC2561b) {
        ((g0) abstractC2561b.getHeader(SIPHeaderNames.VIA)).removeParameter("branch");
    }

    @Override // android.gov.nist.javax.sip.clientauthutils.AuthenticationHelper
    public a handleChallenge(AbstractC2562c abstractC2562c, a aVar, q qVar, int i10) {
        return handleChallenge(abstractC2562c, aVar, qVar, i10, false);
    }

    @Override // android.gov.nist.javax.sip.clientauthutils.AuthenticationHelper
    public void removeCachedAuthenticationHeaders(String str) {
        if (str != null) {
            this.cachedCredentials.removeAuthenticationHeader(str);
            return;
        }
        throw new NullPointerException("Null callId argument ");
    }

    @Override // android.gov.nist.javax.sip.clientauthutils.AuthenticationHelper
    public void setAuthenticationHeaders(AbstractC2561b abstractC2561b) {
        String callId = ((SIPRequest) abstractC2561b).getCallId().getCallId();
        abstractC2561b.removeHeader(SIPHeaderNames.AUTHORIZATION);
        Collection<AbstractC2253h> cachedAuthorizationHeaders = this.cachedCredentials.getCachedAuthorizationHeaders(callId);
        if (cachedAuthorizationHeaders == null) {
            if (logger.isLoggingEnabled(32)) {
                android.gov.nist.core.a.w("Could not find authentication headers for ", callId, logger);
                return;
            }
            return;
        }
        for (AbstractC2253h abstractC2253h : cachedAuthorizationHeaders) {
            abstractC2561b.addHeader(abstractC2253h);
        }
    }

    @Override // android.gov.nist.javax.sip.clientauthutils.AuthenticationHelper
    public a handleChallenge(AbstractC2562c abstractC2562c, a aVar, q qVar, int i10, boolean z10) {
        AbstractC2561b abstractC2561b;
        ListIterator listIterator;
        AbstractC2253h abstractC2253h;
        try {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("handleChallenge: " + abstractC2562c);
            }
            SIPRequest sIPRequest = (SIPRequest) aVar.getRequest();
            if (sIPRequest.getToTag() == null && aVar.getDialog() != null && aVar.getDialog().getState() == d.f24328i0) {
                abstractC2561b = aVar.getDialog().createRequest(sIPRequest.getMethod());
                ListIterator<String> headerNames = sIPRequest.getHeaderNames();
                while (headerNames.hasNext()) {
                    String next = headerNames.next();
                    if (abstractC2561b.getHeader(next) == null) {
                        ListIterator<SIPHeader> headers = sIPRequest.getHeaders(next);
                        while (headers.hasNext()) {
                            abstractC2561b.addHeader(headers.next());
                        }
                    }
                }
                removeBranchID(abstractC2561b);
                if (abstractC2562c == null && abstractC2561b != null) {
                    if (abstractC2562c.getStatusCode() == 401) {
                        listIterator = abstractC2562c.getHeaders(SIPHeaderNames.WWW_AUTHENTICATE);
                    } else if (abstractC2562c.getStatusCode() == 407) {
                        listIterator = abstractC2562c.getHeaders(SIPHeaderNames.PROXY_AUTHENTICATE);
                    } else {
                        throw new IllegalArgumentException("Unexpected status code ");
                    }
                    if (listIterator != null) {
                        abstractC2561b.removeHeader(SIPHeaderNames.AUTHORIZATION);
                        abstractC2561b.removeHeader(SIPHeaderNames.PROXY_AUTHORIZATION);
                        AbstractC2254i abstractC2254i = (AbstractC2254i) abstractC2561b.getHeader(SIPHeaderNames.CSEQ);
                        try {
                            abstractC2254i.setSeqNumber(abstractC2254i.getSeqNumber() + 1);
                            if (!z10 && sIPRequest.getRouteHeaders() == null) {
                                AbstractC2092b nextHop = ((SIPClientTransaction) aVar).getNextHop();
                                AbstractC2094d abstractC2094d = (AbstractC2094d) abstractC2561b.getRequestURI();
                                abstractC2094d.setMAddrParam(nextHop.getHost());
                                if (nextHop.getPort() != -1) {
                                    abstractC2094d.setPort(nextHop.getPort());
                                }
                            }
                            a newClientTransaction = qVar.getNewClientTransaction(abstractC2561b);
                            AbstractC2094d abstractC2094d2 = (AbstractC2094d) aVar.getRequest().getRequestURI();
                            while (listIterator.hasNext()) {
                                h0 h0Var = (h0) listIterator.next();
                                String realm = h0Var.getRealm();
                                Object obj = this.accountManager;
                                if (obj instanceof SecureAccountManager) {
                                    UserCredentialHash credentialHash = ((SecureAccountManager) obj).getCredentialHash(aVar, realm);
                                    if (credentialHash != null) {
                                        AbstractC2096f requestURI = abstractC2561b.getRequestURI();
                                        credentialHash.getSipDomain();
                                        abstractC2253h = getAuthorization(abstractC2561b.getMethod(), requestURI.toString(), abstractC2561b.getContent() == null ? "" : new String(abstractC2561b.getRawContent()), h0Var, credentialHash);
                                    } else {
                                        logger.logDebug("Could not find creds");
                                        throw new n("Cannot find user creds for the given user name and realm");
                                    }
                                } else {
                                    UserCredentials credentials = ((AccountManager) obj).getCredentials(aVar, realm);
                                    if (credentials != null) {
                                        credentials.getSipDomain();
                                        abstractC2253h = getAuthorization(abstractC2561b.getMethod(), abstractC2561b.getRequestURI().toString(), abstractC2561b.getContent() == null ? "" : new String(abstractC2561b.getRawContent()), h0Var, credentials);
                                    } else {
                                        throw new n("Cannot find user creds for the given user name and realm");
                                    }
                                }
                                if (logger.isLoggingEnabled(32)) {
                                    StackLogger stackLogger2 = logger;
                                    stackLogger2.logDebug("Created authorization header: " + abstractC2253h.toString());
                                }
                                if (i10 != 0) {
                                    this.cachedCredentials.cacheAuthorizationHeader(sIPRequest.getCallId().getCallId(), abstractC2253h, i10);
                                }
                                abstractC2561b.addHeader(abstractC2253h);
                            }
                            if (logger.isLoggingEnabled(32)) {
                                StackLogger stackLogger3 = logger;
                                stackLogger3.logDebug("Returning authorization transaction." + newClientTransaction);
                            }
                            return newClientTransaction;
                        } catch (g unused) {
                            throw new n("Invalid CSeq -- could not increment : " + abstractC2254i.getSeqNumber());
                        }
                    }
                    throw new IllegalArgumentException("Could not find WWWAuthenticate or ProxyAuthenticate headers");
                }
                throw new NullPointerException("A null argument was passed to handle challenge.");
            }
            abstractC2561b = (AbstractC2561b) sIPRequest.clone();
            removeBranchID(abstractC2561b);
            if (abstractC2562c == null) {
            }
            throw new NullPointerException("A null argument was passed to handle challenge.");
        } catch (n e10) {
            throw e10;
        } catch (Exception e11) {
            logger.logError("Unexpected exception ", e11);
            throw new n("Unexpected exception ", e11);
        }
    }

    public AuthenticationHelperImpl(SIPTransactionStack sIPTransactionStack, SecureAccountManager secureAccountManager, AbstractC2270z abstractC2270z) {
        this.accountManager = secureAccountManager;
        this.headerFactory = abstractC2270z;
        this.sipStack = sIPTransactionStack;
        this.cachedCredentials = new CredentialsCache(sIPTransactionStack.getTimer());
    }

    private AbstractC2253h getAuthorization(String str, String str2, String str3, h0 h0Var, UserCredentials userCredentials) {
        AbstractC2253h abstractC2253h;
        String str4 = h0Var.getQop() != null ? "auth" : null;
        String calculateResponse = MessageDigestAlgorithm.calculateResponse(h0Var.getAlgorithm(), userCredentials.getUserName(), h0Var.getRealm(), userCredentials.getPassword(), h0Var.getNonce(), "00000001", "xyz", str, str2, str3, str4, logger);
        try {
            if (h0Var instanceof AbstractC2238J) {
                abstractC2253h = this.headerFactory.createProxyAuthorizationHeader(h0Var.getScheme());
            } else {
                abstractC2253h = this.headerFactory.createAuthorizationHeader(h0Var.getScheme());
            }
            abstractC2253h.setUsername(userCredentials.getUserName());
            abstractC2253h.setRealm(h0Var.getRealm());
            abstractC2253h.setNonce(h0Var.getNonce());
            abstractC2253h.setParameter("uri", str2);
            abstractC2253h.setResponse(calculateResponse);
            if (h0Var.getAlgorithm() != null) {
                abstractC2253h.setAlgorithm(h0Var.getAlgorithm());
            }
            if (h0Var.getOpaque() != null) {
                abstractC2253h.setOpaque(h0Var.getOpaque());
            }
            if (str4 != null) {
                abstractC2253h.setQop(str4);
                abstractC2253h.setCNonce("xyz");
                abstractC2253h.setNonceCount(Integer.parseInt("00000001"));
            }
            abstractC2253h.setResponse(calculateResponse);
            return abstractC2253h;
        } catch (ParseException unused) {
            throw new RuntimeException("Failed to create an authorization header!");
        }
    }
}
