package com.statsig.androidsdk;

import android.util.Base64;
import id.AbstractC3557B;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a8\u0006\n"}, d2 = {"Lcom/statsig/androidsdk/Hashing;", "", "()V", "getDJB2HashString", "", "input", "getHashedString", "algorithm", "Lcom/statsig/androidsdk/HashAlgorithm;", "getSHA256HashString", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class Hashing {
    public static final Hashing INSTANCE = new Hashing();

    @Metadata(k = 3, mv = {1, 5, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HashAlgorithm.values().length];
            iArr[HashAlgorithm.DJB2.ordinal()] = 1;
            iArr[HashAlgorithm.SHA256.ordinal()] = 2;
            iArr[HashAlgorithm.NONE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private Hashing() {
    }

    private final String getDJB2HashString(String str) {
        if (str != null) {
            char[] charArray = str.toCharArray();
            AbstractC3557B.b0("(this as java.lang.String).toCharArray()", charArray);
            int length = charArray.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                char c10 = charArray[i10];
                i10++;
                int i12 = ((i11 << 5) - i11) + c10;
                i11 = i12 & i12;
            }
            return Long.toString(i11 & 4294967295L, 10);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private final String getSHA256HashString(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Charset charset = Lg.a.f11131a;
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            AbstractC3557B.b0("(this as java.lang.String).getBytes(charset)", bytes);
            String encodeToString = Base64.encodeToString(messageDigest.digest(bytes), 2);
            AbstractC3557B.b0("encodeToString(bytes, android.util.Base64.NO_WRAP)", encodeToString);
            return encodeToString;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final String getHashedString(String str, HashAlgorithm hashAlgorithm) {
        int i10;
        AbstractC3557B.c0("input", str);
        if (hashAlgorithm == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$0[hashAlgorithm.ordinal()];
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return getSHA256HashString(str);
                }
                return str;
            }
            return getSHA256HashString(str);
        }
        return getDJB2HashString(str);
    }
}
