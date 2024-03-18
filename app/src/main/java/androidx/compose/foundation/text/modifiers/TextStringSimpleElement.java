package androidx.compose.foundation.text.modifiers;

import G0.AbstractC0579h;
import G0.X;
import H0.B0;
import M.e;
import M.q;
import N0.E;
import Ng.H;
import S0.r;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "LG0/X;", "LM/q;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class TextStringSimpleElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final String f24772b;

    /* renamed from: c  reason: collision with root package name */
    public final E f24773c;

    /* renamed from: d  reason: collision with root package name */
    public final r f24774d;

    /* renamed from: e  reason: collision with root package name */
    public final int f24775e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f24776f;

    /* renamed from: g  reason: collision with root package name */
    public final int f24777g;

    /* renamed from: h  reason: collision with root package name */
    public final int f24778h;

    public TextStringSimpleElement(String str, E e10, r rVar, int i10, boolean z10, int i11, int i12) {
        this.f24772b = str;
        this.f24773c = e10;
        this.f24774d = rVar;
        this.f24775e = i10;
        this.f24776f = z10;
        this.f24777g = i11;
        this.f24778h = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        textStringSimpleElement.getClass();
        if (AbstractC3557B.K(null, null) && AbstractC3557B.K(this.f24772b, textStringSimpleElement.f24772b) && AbstractC3557B.K(this.f24773c, textStringSimpleElement.f24773c) && AbstractC3557B.K(this.f24774d, textStringSimpleElement.f24774d) && AbstractC3557B.D0(this.f24775e, textStringSimpleElement.f24775e) && this.f24776f == textStringSimpleElement.f24776f && this.f24777g == textStringSimpleElement.f24777g && this.f24778h == textStringSimpleElement.f24778h) {
            return true;
        }
        return false;
    }

    @Override // G0.X
    public final int hashCode() {
        int i10;
        int hashCode = this.f24773c.hashCode();
        int hashCode2 = (((this.f24774d.hashCode() + ((hashCode + (this.f24772b.hashCode() * 31)) * 31)) * 31) + this.f24775e) * 31;
        if (this.f24776f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return (((((hashCode2 + i10) * 31) + this.f24777g) * 31) + this.f24778h) * 31;
    }

    @Override // G0.X
    public final AbstractC4325q j() {
        return new q(this.f24772b, this.f24773c, this.f24774d, this.f24775e, this.f24776f, this.f24777g, this.f24778h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r4.f12487a.b(r1.f12487a) != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // G0.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(AbstractC4325q abstractC4325q) {
        boolean z10;
        String str;
        String str2;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z12;
        boolean z13;
        r rVar;
        r rVar2;
        int i14;
        int i15;
        q qVar = (q) abstractC4325q;
        qVar.getClass();
        boolean z14 = true;
        boolean z15 = !AbstractC3557B.K(null, null);
        E e10 = this.f24773c;
        if (!z15) {
            E e11 = qVar.f11359t0;
            if (e10 == e11) {
                e10.getClass();
            }
            z10 = false;
            str = qVar.f11358s0;
            str2 = this.f24772b;
            if (!AbstractC3557B.K(str, str2)) {
                z11 = false;
            } else {
                qVar.f11358s0 = str2;
                qVar.f11357C0.setValue(null);
                z11 = true;
            }
            boolean z16 = !qVar.f11359t0.d(e10);
            qVar.f11359t0 = e10;
            i10 = qVar.f11364y0;
            i11 = this.f24778h;
            if (i10 != i11) {
                qVar.f11364y0 = i11;
                z16 = true;
            }
            i12 = qVar.f11363x0;
            i13 = this.f24777g;
            if (i12 != i13) {
                qVar.f11363x0 = i13;
                z16 = true;
            }
            z12 = qVar.f11362w0;
            z13 = this.f24776f;
            if (z12 != z13) {
                qVar.f11362w0 = z13;
                z16 = true;
            }
            rVar = qVar.f11360u0;
            rVar2 = this.f24774d;
            if (!AbstractC3557B.K(rVar, rVar2)) {
                qVar.f11360u0 = rVar2;
                z16 = true;
            }
            i14 = qVar.f11361v0;
            i15 = this.f24775e;
            if (AbstractC3557B.D0(i14, i15)) {
                qVar.f11361v0 = i15;
            } else {
                z14 = z16;
            }
            if (!qVar.f37732r0) {
                if (z11 || (z10 && qVar.f11356B0 != null)) {
                    AbstractC0579h.v(qVar);
                }
                if (z11 || z14) {
                    e A02 = qVar.A0();
                    String str3 = qVar.f11358s0;
                    E e12 = qVar.f11359t0;
                    r rVar3 = qVar.f11360u0;
                    int i16 = qVar.f11361v0;
                    boolean z17 = qVar.f11362w0;
                    int i17 = qVar.f11363x0;
                    int i18 = qVar.f11364y0;
                    A02.f11288a = str3;
                    A02.f11289b = e12;
                    A02.f11290c = rVar3;
                    A02.f11291d = i16;
                    A02.f11292e = z17;
                    A02.f11293f = i17;
                    A02.f11294g = i18;
                    A02.f11297j = null;
                    A02.f11301n = null;
                    A02.f11302o = null;
                    A02.f11304q = -1;
                    A02.f11305r = -1;
                    A02.f11303p = B0.d(0, 0);
                    A02.f11299l = H.c(0, 0);
                    A02.f11298k = false;
                    AbstractC0579h.u(qVar);
                    AbstractC0579h.t(qVar);
                }
                if (z10) {
                    AbstractC0579h.t(qVar);
                    return;
                }
                return;
            }
            return;
        }
        z10 = true;
        str = qVar.f11358s0;
        str2 = this.f24772b;
        if (!AbstractC3557B.K(str, str2)) {
        }
        boolean z162 = !qVar.f11359t0.d(e10);
        qVar.f11359t0 = e10;
        i10 = qVar.f11364y0;
        i11 = this.f24778h;
        if (i10 != i11) {
        }
        i12 = qVar.f11363x0;
        i13 = this.f24777g;
        if (i12 != i13) {
        }
        z12 = qVar.f11362w0;
        z13 = this.f24776f;
        if (z12 != z13) {
        }
        rVar = qVar.f11360u0;
        rVar2 = this.f24774d;
        if (!AbstractC3557B.K(rVar, rVar2)) {
        }
        i14 = qVar.f11361v0;
        i15 = this.f24775e;
        if (AbstractC3557B.D0(i14, i15)) {
        }
        if (!qVar.f37732r0) {
        }
    }
}
