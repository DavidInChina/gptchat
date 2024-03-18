package Za;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: Za.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1855k {
    public static final C1853j Companion = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer[] f23567f = {null, null, null, new C2695d(dh.u0.f28491a, 0), new C2695d(C1843e.f23551a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final String f23568a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23569b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23570c;

    /* renamed from: d  reason: collision with root package name */
    public final List f23571d;

    /* renamed from: e  reason: collision with root package name */
    public final List f23572e;

    public C1855k(int i10, String str, String str2, String str3, List list, List list2) {
        if (7 == (i10 & 7)) {
            this.f23568a = str;
            this.f23569b = str2;
            this.f23570c = str3;
            int i11 = i10 & 8;
            kf.v vVar = kf.v.f37483Y;
            if (i11 == 0) {
                this.f23571d = vVar;
            } else {
                this.f23571d = list;
            }
            if ((i10 & 16) == 0) {
                this.f23572e = vVar;
                return;
            } else {
                this.f23572e = list2;
                return;
            }
        }
        R4.b.e2(i10, 7, C1851i.f23563b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1855k)) {
            return false;
        }
        C1855k c1855k = (C1855k) obj;
        if (AbstractC3557B.K(this.f23568a, c1855k.f23568a) && AbstractC3557B.K(this.f23569b, c1855k.f23569b) && AbstractC3557B.K(this.f23570c, c1855k.f23570c) && AbstractC3557B.K(this.f23571d, c1855k.f23571d) && AbstractC3557B.K(this.f23572e, c1855k.f23572e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f23568a.hashCode() * 31;
        int i11 = 0;
        String str = this.f23569b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f23570c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return this.f23572e.hashCode() + AbstractC4194d.s(this.f23571d, (i12 + i11) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Display(name=");
        sb2.append(this.f23568a);
        sb2.append(", description=");
        sb2.append(this.f23569b);
        sb2.append(", profilePictureUrl=");
        sb2.append(this.f23570c);
        sb2.append(", promptStarters=");
        sb2.append(this.f23571d);
        sb2.append(", commands=");
        return android.gov.nist.core.a.o(sb2, this.f23572e, Separators.RPAREN);
    }
}
