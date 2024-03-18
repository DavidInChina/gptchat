package android.gov.nist.javax.sip.clientauthutils;

import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.a;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import b.AbstractC2096f;
import c.AbstractC2238J;
import c.AbstractC2239K;
import c.AbstractC2270z;
import d.AbstractC2561b;
import d.AbstractC2562c;
import java.security.MessageDigest;
import java.util.Date;
import java.util.Random;

/* loaded from: classes.dex */
public class DigestServerAuthenticationHelper {
    public static final String DEFAULT_ALGORITHM = "MD5";
    public static final String DEFAULT_SCHEME = "Digest";
    private static final char[] toHex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private MessageDigest messageDigest = MessageDigest.getInstance(DEFAULT_ALGORITHM);

    private String generateNonce() {
        long time = new Date().getTime();
        long nextLong = new Random().nextLong();
        return toHexString(this.messageDigest.digest((new Long(time).toString() + new Long(nextLong).toString()).getBytes()));
    }

    public static String toHexString(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = toHex;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public boolean doAuthenticateHashedPassword(AbstractC2561b abstractC2561b, String str) {
        AbstractC2239K abstractC2239K = (AbstractC2239K) abstractC2561b.getHeader(SIPHeaderNames.PROXY_AUTHORIZATION);
        if (abstractC2239K == null) {
            return false;
        }
        String realm = abstractC2239K.getRealm();
        if (abstractC2239K.getUsername() == null || realm == null) {
            return false;
        }
        String nonce = abstractC2239K.getNonce();
        AbstractC2096f uri = abstractC2239K.getURI();
        if (uri == null) {
            return false;
        }
        String hexString = toHexString(this.messageDigest.digest((abstractC2561b.getMethod().toUpperCase() + ":" + uri.toString()).getBytes()));
        String cNonce = abstractC2239K.getCNonce();
        String j6 = a.j(str, ":", nonce);
        if (cNonce != null) {
            j6 = a.j(j6, ":", cNonce);
        }
        return toHexString(this.messageDigest.digest(a.j(j6, ":", hexString).getBytes())).equals(abstractC2239K.getResponse());
    }

    public boolean doAuthenticatePlainTextPassword(AbstractC2561b abstractC2561b, String str) {
        AbstractC2096f uri;
        AbstractC2239K abstractC2239K = (AbstractC2239K) abstractC2561b.getHeader(SIPHeaderNames.PROXY_AUTHORIZATION);
        if (abstractC2239K == null) {
            return false;
        }
        String realm = abstractC2239K.getRealm();
        String username = abstractC2239K.getUsername();
        if (username == null || realm == null) {
            return false;
        }
        String nonce = abstractC2239K.getNonce();
        if (abstractC2239K.getURI() == null) {
            return false;
        }
        String hexString = toHexString(this.messageDigest.digest((username + ":" + realm + ":" + str).getBytes()));
        String hexString2 = toHexString(this.messageDigest.digest((abstractC2561b.getMethod().toUpperCase() + ":" + uri.toString()).getBytes()));
        String cNonce = abstractC2239K.getCNonce();
        String j6 = a.j(hexString, ":", nonce);
        if (cNonce != null) {
            j6 = a.j(j6, ":", cNonce);
        }
        return toHexString(this.messageDigest.digest(a.j(j6, ":", hexString2).getBytes())).equals(abstractC2239K.getResponse());
    }

    public void generateChallenge(AbstractC2270z abstractC2270z, AbstractC2562c abstractC2562c, String str) {
        try {
            AbstractC2238J createProxyAuthenticateHeader = abstractC2270z.createProxyAuthenticateHeader("Digest");
            createProxyAuthenticateHeader.setParameter("realm", str);
            createProxyAuthenticateHeader.setParameter("nonce", generateNonce());
            createProxyAuthenticateHeader.setParameter("opaque", "");
            createProxyAuthenticateHeader.setParameter("stale", "FALSE");
            createProxyAuthenticateHeader.setParameter("algorithm", DEFAULT_ALGORITHM);
            abstractC2562c.setHeader(createProxyAuthenticateHeader);
        } catch (Exception e10) {
            InternalErrorHandler.handleException(e10);
        }
    }
}
