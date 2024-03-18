package Eb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class c {
    public static final b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f4578a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4579b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4580c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4581d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4582e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4583f;

    public c(int i10, String str, String str2, String str3, String str4, String str5, boolean z10) {
        if (30 == (i10 & 30)) {
            this.f4578a = (i10 & 1) == 0 ? "androidchat" : str;
            this.f4579b = str2;
            this.f4580c = str3;
            this.f4581d = str4;
            this.f4582e = str5;
            if ((i10 & 32) == 0) {
                this.f4583f = true;
                return;
            } else {
                this.f4583f = z10;
                return;
            }
        }
        R4.b.e2(i10, 30, a.f4577b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3557B.K(this.f4578a, cVar.f4578a) && AbstractC3557B.K(this.f4579b, cVar.f4579b) && AbstractC3557B.K(this.f4580c, cVar.f4580c) && AbstractC3557B.K(this.f4581d, cVar.f4581d) && AbstractC3557B.K(this.f4582e, cVar.f4582e) && this.f4583f == cVar.f4583f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int v10 = E9.f.v(this.f4580c, E9.f.v(this.f4579b, this.f4578a.hashCode() * 31, 31), 31);
        int i12 = 0;
        String str = this.f4581d;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = (v10 + i10) * 31;
        String str2 = this.f4582e;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        int i14 = (i13 + i12) * 31;
        if (this.f4583f) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return i14 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreateAccountRequest(app=");
        sb2.append(this.f4578a);
        sb2.append(", firstName=");
        sb2.append(this.f4579b);
        sb2.append(", lastName=");
        sb2.append(this.f4580c);
        sb2.append(", phoneVerificationId=");
        sb2.append(this.f4581d);
        sb2.append(", arkoseToken=");
        sb2.append(this.f4582e);
        sb2.append(", isMobile=");
        return AbstractC4194d.w(sb2, this.f4583f, Separators.RPAREN);
    }

    public c(String str, String str2, String str3, String str4) {
        AbstractC3557B.c0("firstName", str);
        AbstractC3557B.c0("lastName", str2);
        this.f4578a = "androidchat";
        this.f4579b = str;
        this.f4580c = str2;
        this.f4581d = str3;
        this.f4582e = str4;
        this.f4583f = true;
    }
}
