package cb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: cb.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2332A {
    public static final C2385z Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f26424a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26425b;

    /* renamed from: c  reason: collision with root package name */
    public final C2382w f26426c;

    /* renamed from: d  reason: collision with root package name */
    public final String f26427d;

    public C2332A(int i10, String str, String str2, C2382w c2382w, String str3) {
        if (3 != (i10 & 3)) {
            R4.b.e2(i10, 3, C2384y.f26560b);
            throw null;
        }
        this.f26424a = str;
        this.f26425b = str2;
        if ((i10 & 4) == 0) {
            this.f26426c = null;
        } else {
            this.f26426c = c2382w;
        }
        if ((i10 & 8) == 0) {
            this.f26427d = null;
        } else {
            this.f26427d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2332A)) {
            return false;
        }
        C2332A c2332a = (C2332A) obj;
        if (AbstractC3557B.K(this.f26424a, c2332a.f26424a) && AbstractC3557B.K(this.f26425b, c2332a.f26425b) && AbstractC3557B.K(this.f26426c, c2332a.f26426c) && AbstractC3557B.K(this.f26427d, c2332a.f26427d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f26424a.hashCode() * 31;
        int i12 = 0;
        String str = this.f26425b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = (hashCode + i10) * 31;
        C2382w c2382w = this.f26426c;
        if (c2382w == null) {
            i11 = 0;
        } else {
            i11 = c2382w.f26555a.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str2 = this.f26427d;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ToolMetadata(actionId=");
        sb2.append(this.f26424a);
        sb2.append(", domain=");
        sb2.append(this.f26425b);
        sb2.append(", auth=");
        sb2.append(this.f26426c);
        sb2.append(", privacyPolicyUrl=");
        return R.a.t(sb2, this.f26427d, Separators.RPAREN);
    }

    public C2332A(String str, String str2, C2382w c2382w, String str3) {
        AbstractC3557B.c0("actionId", str);
        this.f26424a = str;
        this.f26425b = str2;
        this.f26426c = c2382w;
        this.f26427d = str3;
    }
}
