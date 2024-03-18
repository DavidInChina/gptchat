package m9;

import E9.f;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;

/* renamed from: m9.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4573e {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC4572d f39003a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39004b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39005c;

    /* renamed from: d  reason: collision with root package name */
    public final A7.b f39006d;

    /* renamed from: e  reason: collision with root package name */
    public final String f39007e;

    /* renamed from: f  reason: collision with root package name */
    public final A7.b f39008f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f39009g;

    public C4573e(String str, String str2, C4570b c4570b, String str3, C4571c c4571c, boolean z10) {
        EnumC4572d enumC4572d = EnumC4572d.f39001Y;
        AbstractC3557B.c0("messageMarkdown", str);
        AbstractC3557B.c0("primaryCta", str2);
        this.f39003a = enumC4572d;
        this.f39004b = str;
        this.f39005c = str2;
        this.f39006d = c4570b;
        this.f39007e = str3;
        this.f39008f = c4571c;
        this.f39009g = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4573e)) {
            return false;
        }
        C4573e c4573e = (C4573e) obj;
        if (this.f39003a == c4573e.f39003a && AbstractC3557B.K(this.f39004b, c4573e.f39004b) && AbstractC3557B.K(this.f39005c, c4573e.f39005c) && AbstractC3557B.K(this.f39006d, c4573e.f39006d) && AbstractC3557B.K(this.f39007e, c4573e.f39007e) && AbstractC3557B.K(this.f39008f, c4573e.f39008f) && this.f39009g == c4573e.f39009g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = (this.f39006d.hashCode() + f.v(this.f39005c, f.v(this.f39004b, this.f39003a.hashCode() * 31, 31), 31)) * 31;
        int i12 = 0;
        String str = this.f39007e;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = (hashCode + i10) * 31;
        A7.b bVar = this.f39008f;
        if (bVar != null) {
            i12 = bVar.hashCode();
        }
        int i14 = (i13 + i12) * 31;
        if (this.f39009g) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return i14 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NonComplianceWarning(nonComplianceReason=");
        sb2.append(this.f39003a);
        sb2.append(", messageMarkdown=");
        sb2.append(this.f39004b);
        sb2.append(", primaryCta=");
        sb2.append(this.f39005c);
        sb2.append(", primaryCtaAction=");
        sb2.append(this.f39006d);
        sb2.append(", secondaryCta=");
        sb2.append(this.f39007e);
        sb2.append(", secondaryCtaAction=");
        sb2.append(this.f39008f);
        sb2.append(", secondaryCtaDismissOnAction=");
        return AbstractC4194d.w(sb2, this.f39009g, Separators.RPAREN);
    }
}
