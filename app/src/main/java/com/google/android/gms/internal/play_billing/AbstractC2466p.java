package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.play_billing.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2466p {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        throw new java.lang.IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r a(String str) {
        C2477v c2477v;
        int length;
        int i10;
        ByteBuffer byteBuffer;
        int length2 = str.length();
        int i11 = length2 + length2;
        if (i11 >= 0) {
            C2479w c2479w = (C2479w) this;
            boolean z10 = c2479w.f26983h0;
            int i12 = c2479w.f26982Z;
            MessageDigest messageDigest = c2479w.f26981Y;
            try {
                if (z10) {
                    try {
                        c2477v = new C2477v((MessageDigest) messageDigest.clone(), i12);
                    } catch (CloneNotSupportedException unused) {
                    }
                    length = str.length();
                    i10 = 0;
                    while (true) {
                        MessageDigest messageDigest2 = c2477v.f26978i;
                        if (i10 >= length) {
                            char charAt = str.charAt(i10);
                            byteBuffer = c2477v.f26977h;
                            byteBuffer.putChar(charAt);
                            try {
                                byte[] array = byteBuffer.array();
                                if (!(!c2477v.f26980k)) {
                                    break;
                                }
                                messageDigest2.update(array, 0, 2);
                                byteBuffer.clear();
                                i10++;
                            } catch (Throwable th2) {
                                byteBuffer.clear();
                                throw th2;
                            }
                        } else if (!c2477v.f26980k) {
                            c2477v.f26980k = true;
                            int digestLength = messageDigest2.getDigestLength();
                            int i13 = c2477v.f26979j;
                            if (i13 == digestLength) {
                                byte[] digest = messageDigest2.digest();
                                char[] cArr = AbstractC2471s.f26969Y;
                                return new r(digest);
                            }
                            byte[] copyOf = Arrays.copyOf(messageDigest2.digest(), i13);
                            char[] cArr2 = AbstractC2471s.f26969Y;
                            return new r(copyOf);
                        } else {
                            throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
                        }
                    }
                }
                c2477v = new C2477v(MessageDigest.getInstance(messageDigest.getAlgorithm()), i12);
                length = str.length();
                i10 = 0;
                while (true) {
                    MessageDigest messageDigest22 = c2477v.f26978i;
                    if (i10 >= length) {
                    }
                    byteBuffer.clear();
                    i10++;
                }
            } catch (NoSuchAlgorithmException e10) {
                throw new AssertionError(e10);
            }
        } else {
            throw new IllegalArgumentException(r9.y.i1("expectedInputSize must be >= 0 but was %s", Integer.valueOf(i11)));
        }
    }
}
