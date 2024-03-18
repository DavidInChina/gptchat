package android.gov.nist.javax.sip;

import android.gov.nist.core.net.AddressResolver;
import android.gov.nist.javax.sip.clientauthutils.AccountManager;
import android.gov.nist.javax.sip.clientauthutils.AuthenticationHelper;
import android.gov.nist.javax.sip.clientauthutils.SecureAccountManager;
import android.gov.nist.javax.sip.header.extensions.JoinHeader;
import android.gov.nist.javax.sip.header.extensions.ReplacesHeader;
import android.javax.sip.b;
import android.javax.sip.h;
import android.javax.sip.q;
import android.javax.sip.r;
import b.AbstractC2093c;
import c.AbstractC2270z;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public interface SipStackExt extends r {
    /* synthetic */ h createListeningPoint(int i10, String str);

    /* synthetic */ h createListeningPoint(String str, int i10, String str2);

    /* synthetic */ q createSipProvider(h hVar);

    /* synthetic */ void deleteListeningPoint(h hVar);

    /* synthetic */ void deleteSipProvider(q qVar);

    AuthenticationHelper getAuthenticationHelper(AccountManager accountManager, AbstractC2270z abstractC2270z);

    Collection<b> getDialogs();

    /* synthetic */ String getIPAddress();

    b getJoinDialog(JoinHeader joinHeader);

    /* synthetic */ Iterator getListeningPoints();

    SocketAddress getLocalAddressForTcpDst(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11);

    SocketAddress getLocalAddressForTlsDst(InetAddress inetAddress, int i10, InetAddress inetAddress2);

    b getReplacesDialog(ReplacesHeader replacesHeader);

    /* synthetic */ AbstractC2093c getRouter();

    AuthenticationHelper getSecureAuthenticationHelper(SecureAccountManager secureAccountManager, AbstractC2270z abstractC2270z);

    /* synthetic */ Iterator getSipProviders();

    /* synthetic */ String getStackName();

    /* synthetic */ boolean isRetransmissionFilterActive();

    void setAddressResolver(AddressResolver addressResolver);

    void setEnabledCipherSuites(String[] strArr);

    /* synthetic */ void start();

    /* synthetic */ void stop();
}
