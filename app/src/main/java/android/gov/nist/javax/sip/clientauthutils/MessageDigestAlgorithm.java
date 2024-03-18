package android.gov.nist.javax.sip.clientauthutils;

import android.gov.nist.core.StackLogger;
import android.gov.nist.core.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class MessageDigestAlgorithm {
    private static final char[] toHex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private static String H(String str) {
        try {
            return toHexString(MessageDigest.getInstance(DigestServerAuthenticationHelper.DEFAULT_ALGORITHM).digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException("Failed to instantiate an MD5 algorithm", e10);
        }
    }

    private static String KD(String str, String str2) {
        return H(a.j(str, ":", str2));
    }

    public static String calculateResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, StackLogger stackLogger) {
        String str10;
        if (stackLogger.isLoggingEnabled(32)) {
            StringBuilder t10 = a.t("trying to authenticate using : ", str, ", ", str2, ", ");
            a.y(t10, str3, ", ", str4, ", ");
            a.y(t10, str5, ", ", str6, ", ");
            a.y(t10, str7, ", ", str8, ", ");
            t10.append(str9);
            stackLogger.logDebug(t10.toString());
        }
        if (str2 != null && str6 != null && str7 != null && str3 != null) {
            if (str5 != null && str5.length() != 0) {
                if (str9 != null && str9.trim().length() != 0 && !str9.trim().equalsIgnoreCase("auth")) {
                    if (str8 == null) {
                        str8 = "";
                    }
                    str10 = str6 + ":" + str7 + ":" + H(str8);
                } else {
                    str10 = a.j(str6, ":", str7);
                }
                if (str9 != null && str4 != null && (str9.equalsIgnoreCase("auth") || str9.equalsIgnoreCase("auth-int"))) {
                    return KD(str2, str3 + ":" + str4 + ":" + str5 + ":" + str9 + ":" + H(str10));
                }
                StringBuilder r10 = a.r(str3, ":");
                r10.append(H(str10));
                return KD(str2, r10.toString());
            }
            throw new NullPointerException("cnonce_value may not be absent for MD5-Sess algorithm.");
        }
        throw new NullPointerException("Null parameter to MessageDigestAlgorithm.calculateResponse()");
    }

    private static String toHexString(byte[] bArr) {
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

    public static String calculateResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, StackLogger stackLogger) {
        String str12;
        String str13;
        if (stackLogger.isLoggingEnabled(32)) {
            StringBuilder t10 = a.t("trying to authenticate using : ", str, ", ", str2, ", ");
            t10.append(str3);
            t10.append(", ");
            t10.append(str4 != null && str4.trim().length() > 0);
            t10.append(", ");
            t10.append(str5);
            t10.append(", ");
            a.y(t10, str6, ", ", str7, ", ");
            a.y(t10, str8, ", ", str9, ", ");
            t10.append(str10);
            t10.append(", ");
            t10.append(str11);
            stackLogger.logDebug(t10.toString());
        }
        if (str2 != null && str3 != null && str4 != null && str8 != null && str9 != null && str5 != null) {
            if (str != null && str.trim().length() != 0 && !str.trim().equalsIgnoreCase(DigestServerAuthenticationHelper.DEFAULT_ALGORITHM)) {
                if (str7 != null && str7.length() != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    a.y(sb2, H(str2 + ":" + str3 + ":" + str4), ":", str5, ":");
                    sb2.append(str7);
                    str12 = sb2.toString();
                } else {
                    throw new NullPointerException("cnonce_value may not be absent for MD5-Sess algorithm.");
                }
            } else {
                str12 = str2 + ":" + str3 + ":" + str4;
            }
            if (str11 != null && str11.trim().length() != 0 && !str11.trim().equalsIgnoreCase("auth")) {
                if (str10 == null) {
                    str10 = "";
                }
                str13 = str8 + ":" + str9 + ":" + H(str10);
            } else {
                str13 = a.j(str8, ":", str9);
            }
            if (str7 != null && str11 != null && str6 != null && (str11.equalsIgnoreCase("auth") || str11.equalsIgnoreCase("auth-int"))) {
                return KD(H(str12), str5 + ":" + str6 + ":" + str7 + ":" + str11 + ":" + H(str13));
            }
            String H6 = H(str12);
            StringBuilder r10 = a.r(str5, ":");
            r10.append(H(str13));
            return KD(H6, r10.toString());
        }
        throw new NullPointerException("Null parameter to MessageDigestAlgorithm.calculateResponse()");
    }
}
