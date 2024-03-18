package Eb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class i {
    public static final h Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f4591a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4592b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4593c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4594d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4595e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4596f;

    public i(int i10, String str, int i11, String str2, boolean z10, String str3, String str4) {
        if (13 != (i10 & 13)) {
            R4.b.e2(i10, 13, g.f4590b);
            throw null;
        }
        this.f4591a = str;
        if ((i10 & 2) == 0) {
            this.f4592b = "sms";
        } else {
            this.f4592b = str2;
        }
        this.f4593c = str3;
        this.f4594d = str4;
        if ((i10 & 16) == 0) {
            this.f4595e = 1;
        } else {
            this.f4595e = i11;
        }
        if ((i10 & 32) == 0) {
            this.f4596f = true;
        } else {
            this.f4596f = z10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (AbstractC3557B.K(this.f4591a, iVar.f4591a) && AbstractC3557B.K(this.f4592b, iVar.f4592b) && AbstractC3557B.K(this.f4593c, iVar.f4593c) && AbstractC3557B.K(this.f4594d, iVar.f4594d) && this.f4595e == iVar.f4595e && this.f4596f == iVar.f4596f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int v10 = E9.f.v(this.f4593c, E9.f.v(this.f4592b, this.f4591a.hashCode() * 31, 31), 31);
        String str = this.f4594d;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = (((v10 + i10) * 31) + this.f4595e) * 31;
        if (this.f4596f) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneSendVerifyRequest(phoneNumber=");
        sb2.append(this.f4591a);
        sb2.append(", channel=");
        sb2.append(this.f4592b);
        sb2.append(", countryIso=");
        sb2.append(this.f4593c);
        sb2.append(", arkoseToken=");
        sb2.append(this.f4594d);
        sb2.append(", version=");
        sb2.append(this.f4595e);
        sb2.append(", isMobile=");
        return AbstractC4194d.w(sb2, this.f4596f, Separators.RPAREN);
    }

    public i(String str, String str2, String str3) {
        AbstractC3557B.c0("countryIso", str2);
        this.f4591a = str;
        this.f4592b = "sms";
        this.f4593c = str2;
        this.f4594d = str3;
        this.f4595e = 1;
        this.f4596f = true;
    }
}
