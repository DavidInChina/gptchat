package T0;

import id.AbstractC3557B;
import nf.AbstractC4828h;
import q1.AbstractC5260f;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: f  reason: collision with root package name */
    public static final o f16802f = new o(false, 0, true, 1, 1);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f16803a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16804b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f16805c;

    /* renamed from: d  reason: collision with root package name */
    public final int f16806d;

    /* renamed from: e  reason: collision with root package name */
    public final int f16807e;

    public o(boolean z10, int i10, boolean z11, int i11, int i12) {
        this.f16803a = z10;
        this.f16804b = i10;
        this.f16805c = z11;
        this.f16806d = i11;
        this.f16807e = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f16803a != oVar.f16803a || !AbstractC4828h.G(this.f16804b, oVar.f16804b) || this.f16805c != oVar.f16805c || !AbstractC5260f.r(this.f16806d, oVar.f16806d) || !n.a(this.f16807e, oVar.f16807e)) {
            return false;
        }
        oVar.getClass();
        if (AbstractC3557B.K(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 1237;
        if (this.f16803a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = ((i10 * 31) + this.f16804b) * 31;
        if (this.f16805c) {
            i11 = 1231;
        }
        return (((((i12 + i11) * 31) + this.f16806d) * 31) + this.f16807e) * 31;
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.f16803a + ", capitalization=" + ((Object) AbstractC4828h.t0(this.f16804b)) + ", autoCorrect=" + this.f16805c + ", keyboardType=" + ((Object) AbstractC5260f.T(this.f16806d)) + ", imeAction=" + ((Object) n.b(this.f16807e)) + ", platformImeOptions=null)";
    }
}
