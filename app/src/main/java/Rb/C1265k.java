package Rb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: Rb.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1265k {
    public static final C1260f Companion = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer[] f15357e = {null, P4.a.E("com.openai.feature.reporting.ReportAdditionalField.Type", EnumC1264j.values()), null, null};

    /* renamed from: a  reason: collision with root package name */
    public final String f15358a;

    /* renamed from: b  reason: collision with root package name */
    public final EnumC1264j f15359b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15360c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f15361d;

    public C1265k(int i10, String str, EnumC1264j enumC1264j, String str2, boolean z10) {
        if (1 != (i10 & 1)) {
            R4.b.e2(i10, 1, C1259e.f15348b);
            throw null;
        }
        this.f15358a = str;
        if ((i10 & 2) == 0) {
            this.f15359b = EnumC1264j.f15354h0;
        } else {
            this.f15359b = enumC1264j;
        }
        if ((i10 & 4) == 0) {
            this.f15360c = null;
        } else {
            this.f15360c = str2;
        }
        if ((i10 & 8) == 0) {
            this.f15361d = false;
        } else {
            this.f15361d = z10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1265k)) {
            return false;
        }
        C1265k c1265k = (C1265k) obj;
        if (AbstractC3557B.K(this.f15358a, c1265k.f15358a) && this.f15359b == c1265k.f15359b && AbstractC3557B.K(this.f15360c, c1265k.f15360c) && this.f15361d == c1265k.f15361d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = (this.f15359b.hashCode() + (this.f15358a.hashCode() * 31)) * 31;
        String str = this.f15360c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = (hashCode + i10) * 31;
        if (this.f15361d) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder s10 = android.gov.nist.core.a.s("ReportAdditionalField(id=", R.a.t(new StringBuilder("Id(value="), this.f15358a, Separators.RPAREN), ", type=");
        s10.append(this.f15359b);
        s10.append(", placeholder=");
        s10.append(this.f15360c);
        s10.append(", required=");
        return AbstractC4194d.w(s10, this.f15361d, Separators.RPAREN);
    }

    public C1265k(EnumC1264j enumC1264j, String str) {
        this.f15358a = ParameterNames.ID;
        this.f15359b = enumC1264j;
        this.f15360c = str;
        this.f15361d = true;
    }
}
