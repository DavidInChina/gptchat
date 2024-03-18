package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;

/* renamed from: x6.z1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6354z1 {

    /* renamed from: a  reason: collision with root package name */
    public final A1 f49491a;

    /* renamed from: b  reason: collision with root package name */
    public final C6333s1 f49492b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49493c;

    /* renamed from: d  reason: collision with root package name */
    public final long f49494d;

    /* renamed from: e  reason: collision with root package name */
    public final List f49495e;

    /* renamed from: f  reason: collision with root package name */
    public final O1 f49496f;

    public C6354z1(A1 a12, C6333s1 c6333s1, String str, long j6, List list, O1 o12) {
        this.f49491a = a12;
        this.f49492b = c6333s1;
        this.f49493c = str;
        this.f49494d = j6;
        this.f49495e = list;
        this.f49496f = o12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6354z1)) {
            return false;
        }
        C6354z1 c6354z1 = (C6354z1) obj;
        if (AbstractC3557B.K(this.f49491a, c6354z1.f49491a) && AbstractC3557B.K(this.f49492b, c6354z1.f49492b) && AbstractC3557B.K(this.f49493c, c6354z1.f49493c) && this.f49494d == c6354z1.f49494d && AbstractC3557B.K(this.f49495e, c6354z1.f49495e) && AbstractC3557B.K(this.f49496f, c6354z1.f49496f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        A1 a12 = this.f49491a;
        if (a12 == null) {
            i10 = 0;
        } else {
            i10 = a12.hashCode();
        }
        int i15 = i10 * 31;
        C6333s1 c6333s1 = this.f49492b;
        if (c6333s1 == null) {
            i11 = 0;
        } else {
            i11 = c6333s1.hashCode();
        }
        int i16 = (i15 + i11) * 31;
        String str = this.f49493c;
        if (str == null) {
            i12 = 0;
        } else {
            i12 = str.hashCode();
        }
        long j6 = this.f49494d;
        int i17 = (((i16 + i12) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        List list = this.f49495e;
        if (list == null) {
            i13 = 0;
        } else {
            i13 = list.hashCode();
        }
        int i18 = (i17 + i13) * 31;
        O1 o12 = this.f49496f;
        if (o12 != null) {
            i14 = o12.hashCode();
        }
        return i18 + i14;
    }

    public final String toString() {
        return "Dd(session=" + this.f49491a + ", configuration=" + this.f49492b + ", browserSdkVersion=" + this.f49493c + ", documentVersion=" + this.f49494d + ", pageStates=" + this.f49495e + ", replayStats=" + this.f49496f + Separators.RPAREN;
    }
}
