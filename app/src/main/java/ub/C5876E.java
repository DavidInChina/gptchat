package ub;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import ca.EnumC2323o;
import id.AbstractC3557B;

/* renamed from: ub.E  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5876E {

    /* renamed from: a  reason: collision with root package name */
    public final String f46527a;

    /* renamed from: b  reason: collision with root package name */
    public final z4.o f46528b;

    /* renamed from: c  reason: collision with root package name */
    public final EnumC2323o f46529c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f46530d;

    /* renamed from: e  reason: collision with root package name */
    public final int f46531e;

    /* renamed from: f  reason: collision with root package name */
    public final Yg.p f46532f;

    public C5876E(String str, z4.o oVar, EnumC2323o enumC2323o, boolean z10, int i10, Yg.p pVar) {
        AbstractC3557B.c0(ParameterNames.TEXT, str);
        AbstractC3557B.c0(ParameterNames.ICON, oVar);
        AbstractC3557B.c0("status", enumC2323o);
        AbstractC3557B.c0("startTime", pVar);
        this.f46527a = str;
        this.f46528b = oVar;
        this.f46529c = enumC2323o;
        this.f46530d = z10;
        this.f46531e = i10;
        this.f46532f = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5876E)) {
            return false;
        }
        C5876E c5876e = (C5876E) obj;
        if (AbstractC3557B.K(this.f46527a, c5876e.f46527a) && AbstractC3557B.K(this.f46528b, c5876e.f46528b) && this.f46529c == c5876e.f46529c && this.f46530d == c5876e.f46530d && this.f46531e == c5876e.f46531e && AbstractC3557B.K(this.f46532f, c5876e.f46532f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f46528b.hashCode();
        int hashCode2 = (this.f46529c.hashCode() + ((hashCode + (this.f46527a.hashCode() * 31)) * 31)) * 31;
        if (this.f46530d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return this.f46532f.f22419Y.hashCode() + ((((hashCode2 + i10) * 31) + this.f46531e) * 31);
    }

    public final String toString() {
        return "ToolStatusData(text=" + this.f46527a + ", icon=" + this.f46528b + ", status=" + this.f46529c + ", isVisible=" + this.f46530d + ", updateCount=" + this.f46531e + ", startTime=" + this.f46532f + Separators.RPAREN;
    }
}
