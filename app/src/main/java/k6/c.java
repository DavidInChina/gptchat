package K6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f9491a;

    /* renamed from: b  reason: collision with root package name */
    public final a f9492b;

    /* renamed from: c  reason: collision with root package name */
    public final g f9493c;

    /* renamed from: d  reason: collision with root package name */
    public final k f9494d;

    public c(String str, a aVar, g gVar, k kVar) {
        this.f9491a = str;
        this.f9492b = aVar;
        this.f9493c = gVar;
        this.f9494d = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3557B.K(this.f9491a, cVar.f9491a) && AbstractC3557B.K(this.f9492b, cVar.f9492b) && AbstractC3557B.K(this.f9493c, cVar.f9493c) && AbstractC3557B.K(this.f9494d, cVar.f9494d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        String str = this.f9491a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i14 = i10 * 31;
        a aVar = this.f9492b;
        if (aVar == null) {
            i11 = 0;
        } else {
            i11 = aVar.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        g gVar = this.f9493c;
        if (gVar == null) {
            i12 = 0;
        } else {
            i12 = gVar.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        k kVar = this.f9494d;
        if (kVar != null) {
            i13 = kVar.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        return "Dd(source=" + this.f9491a + ", application=" + this.f9492b + ", session=" + this.f9493c + ", view=" + this.f9494d + Separators.RPAREN;
    }
}
