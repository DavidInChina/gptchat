package nh;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import ji.C4116E;
import ji.C4138m;

/* renamed from: nh.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4861k {

    /* renamed from: a  reason: collision with root package name */
    public static final C4138m f40391a = ei.l.g("<svg");

    /* renamed from: b  reason: collision with root package name */
    public static final C4138m f40392b = ei.l.g(Separators.LESS_THAN);

    static {
        C4138m c4138m = C4138m.f36722i0;
    }

    public static final boolean a(C4116E c4116e) {
        long j6;
        if (!c4116e.h(0L, f40392b)) {
            return false;
        }
        C4138m c4138m = f40391a;
        AbstractC3557B.c0("bytes", c4138m);
        byte[] bArr = c4138m.f36723Y;
        if (bArr.length > 0) {
            byte b10 = bArr[0];
            long length = 1024 - bArr.length;
            long j10 = 0;
            while (true) {
                if (j10 < length) {
                    j6 = c4116e.a(b10, j10, length);
                    if (j6 == -1 || c4116e.h(j6, c4138m)) {
                        break;
                    }
                    j10 = 1 + j6;
                } else {
                    j6 = -1;
                    break;
                }
            }
            if (j6 == -1) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }
}
