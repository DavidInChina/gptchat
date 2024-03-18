package androidx.compose.foundation;

import A.C0056z0;
import A.N0;
import G0.X;
import Z0.e;
import Z0.g;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import wf.k;
import y.AbstractC6463a;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "LG0/X;", "LA/z0;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MagnifierElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final k f24662b;

    /* renamed from: c  reason: collision with root package name */
    public final k f24663c;

    /* renamed from: d  reason: collision with root package name */
    public final k f24664d;

    /* renamed from: e  reason: collision with root package name */
    public final float f24665e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f24666f;

    /* renamed from: g  reason: collision with root package name */
    public final long f24667g;

    /* renamed from: h  reason: collision with root package name */
    public final float f24668h;

    /* renamed from: i  reason: collision with root package name */
    public final float f24669i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f24670j;

    /* renamed from: k  reason: collision with root package name */
    public final N0 f24671k;

    public MagnifierElement(G.X x10, k kVar, k kVar2, float f6, boolean z10, long j6, float f10, float f11, boolean z11, N0 n02) {
        this.f24662b = x10;
        this.f24663c = kVar;
        this.f24664d = kVar2;
        this.f24665e = f6;
        this.f24666f = z10;
        this.f24667g = j6;
        this.f24668h = f10;
        this.f24669i = f11;
        this.f24670j = z11;
        this.f24671k = n02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        if (!AbstractC3557B.K(this.f24662b, magnifierElement.f24662b) || !AbstractC3557B.K(this.f24663c, magnifierElement.f24663c) || this.f24665e != magnifierElement.f24665e || this.f24666f != magnifierElement.f24666f) {
            return false;
        }
        int i10 = g.f22794d;
        if (this.f24667g == magnifierElement.f24667g && e.a(this.f24668h, magnifierElement.f24668h) && e.a(this.f24669i, magnifierElement.f24669i) && this.f24670j == magnifierElement.f24670j && AbstractC3557B.K(this.f24664d, magnifierElement.f24664d) && AbstractC3557B.K(this.f24671k, magnifierElement.f24671k)) {
            return true;
        }
        return false;
    }

    @Override // G0.X
    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f24662b.hashCode() * 31;
        int i12 = 0;
        k kVar = this.f24663c;
        if (kVar != null) {
            i10 = kVar.hashCode();
        } else {
            i10 = 0;
        }
        int e10 = AbstractC6463a.e(this.f24665e, (hashCode + i10) * 31, 31);
        int i13 = 1237;
        if (this.f24666f) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i14 = g.f22794d;
        long j6 = this.f24667g;
        int e11 = AbstractC6463a.e(this.f24669i, AbstractC6463a.e(this.f24668h, (((int) (j6 ^ (j6 >>> 32))) + ((e10 + i11) * 31)) * 31, 31), 31);
        if (this.f24670j) {
            i13 = 1231;
        }
        int i15 = (e11 + i13) * 31;
        k kVar2 = this.f24664d;
        if (kVar2 != null) {
            i12 = kVar2.hashCode();
        }
        return this.f24671k.hashCode() + ((i15 + i12) * 31);
    }

    @Override // G0.X
    public final AbstractC4325q j() {
        return new C0056z0(this.f24662b, this.f24663c, this.f24664d, this.f24665e, this.f24666f, this.f24667g, this.f24668h, this.f24669i, this.f24670j, this.f24671k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
        if (id.AbstractC3557B.K(r15, r8) != false) goto L18;
     */
    @Override // G0.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(AbstractC4325q abstractC4325q) {
        C0056z0 c0056z0 = (C0056z0) abstractC4325q;
        float f6 = c0056z0.f347v0;
        long j6 = c0056z0.f349x0;
        float f10 = c0056z0.f350y0;
        float f11 = c0056z0.f351z0;
        boolean z10 = c0056z0.f336A0;
        N0 n02 = c0056z0.f337B0;
        c0056z0.f344s0 = this.f24662b;
        c0056z0.f345t0 = this.f24663c;
        float f12 = this.f24665e;
        c0056z0.f347v0 = f12;
        c0056z0.f348w0 = this.f24666f;
        long j10 = this.f24667g;
        c0056z0.f349x0 = j10;
        float f13 = this.f24668h;
        c0056z0.f350y0 = f13;
        float f14 = this.f24669i;
        c0056z0.f351z0 = f14;
        boolean z11 = this.f24670j;
        c0056z0.f336A0 = z11;
        c0056z0.f346u0 = this.f24664d;
        N0 n03 = this.f24671k;
        c0056z0.f337B0 = n03;
        if (c0056z0.f340E0 != null && (f12 == f6 || n03.a())) {
            int i10 = g.f22794d;
            if (j10 == j6) {
                if (e.a(f13, f10)) {
                    if (e.a(f14, f11)) {
                        if (z11 == z10) {
                        }
                    }
                }
            }
        }
        c0056z0.A0();
        c0056z0.B0();
    }
}
