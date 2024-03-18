package cb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;

@AbstractC1998i
/* renamed from: cb.W  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2353W {
    public static final C2352V Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f26493a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26494b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26495c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f26496d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f26497e;

    public /* synthetic */ C2353W() {
        this(null, null, null, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2353W)) {
            return false;
        }
        C2353W c2353w = (C2353W) obj;
        if (AbstractC3557B.K(this.f26493a, c2353w.f26493a) && AbstractC3557B.K(this.f26494b, c2353w.f26494b) && AbstractC3557B.K(this.f26495c, c2353w.f26495c) && this.f26496d == c2353w.f26496d && this.f26497e == c2353w.f26497e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        String str = this.f26493a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i14 = i10 * 31;
        String str2 = this.f26494b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.f26495c;
        if (str3 != null) {
            i13 = str3.hashCode();
        }
        int i16 = (i15 + i13) * 31;
        int i17 = 1237;
        if (this.f26496d) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i18 = (i16 + i12) * 31;
        if (this.f26497e) {
            i17 = 1231;
        }
        return i18 + i17;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GizmoCategoryInfo(id=");
        sb2.append(this.f26493a);
        sb2.append(", title=");
        sb2.append(this.f26494b);
        sb2.append(", description=");
        sb2.append(this.f26495c);
        sb2.append(", isFeatured=");
        sb2.append(this.f26496d);
        sb2.append(", isRanked=");
        return AbstractC4194d.w(sb2, this.f26497e, Separators.RPAREN);
    }

    public C2353W(int i10, String str, String str2, String str3, boolean z10, boolean z11) {
        if ((i10 & 1) == 0) {
            this.f26493a = null;
        } else {
            this.f26493a = str;
        }
        if ((i10 & 2) == 0) {
            this.f26494b = null;
        } else {
            this.f26494b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f26495c = null;
        } else {
            this.f26495c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f26496d = false;
        } else {
            this.f26496d = z10;
        }
        if ((i10 & 16) == 0) {
            this.f26497e = false;
        } else {
            this.f26497e = z11;
        }
    }

    public C2353W(String str, String str2, String str3, boolean z10, boolean z11) {
        this.f26493a = str;
        this.f26494b = str2;
        this.f26495c = str3;
        this.f26496d = z10;
        this.f26497e = z11;
    }
}
