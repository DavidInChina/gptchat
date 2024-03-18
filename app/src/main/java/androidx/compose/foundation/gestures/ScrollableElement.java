package androidx.compose.foundation.gestures;

import A.L0;
import B.A1;
import B.AbstractC0168u1;
import B.B0;
import B.C0110b;
import B.C0121e1;
import B.C0139k1;
import B.C0165t1;
import B.C0169v;
import B.J0;
import B.N;
import B.S;
import B.W0;
import D.m;
import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "LG0/X;", "LB/t1;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ScrollableElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0168u1 f24684b;

    /* renamed from: c  reason: collision with root package name */
    public final W0 f24685c;

    /* renamed from: d  reason: collision with root package name */
    public final L0 f24686d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f24687e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f24688f;

    /* renamed from: g  reason: collision with root package name */
    public final B.L0 f24689g;

    /* renamed from: h  reason: collision with root package name */
    public final m f24690h;

    /* renamed from: i  reason: collision with root package name */
    public final N f24691i;

    public ScrollableElement(AbstractC0168u1 abstractC0168u1, W0 w02, L0 l02, boolean z10, boolean z11, B.L0 l03, m mVar, N n10) {
        this.f24684b = abstractC0168u1;
        this.f24685c = w02;
        this.f24686d = l02;
        this.f24687e = z10;
        this.f24688f = z11;
        this.f24689g = l03;
        this.f24690h = mVar;
        this.f24691i = n10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        if (AbstractC3557B.K(this.f24684b, scrollableElement.f24684b) && this.f24685c == scrollableElement.f24685c && AbstractC3557B.K(this.f24686d, scrollableElement.f24686d) && this.f24687e == scrollableElement.f24687e && this.f24688f == scrollableElement.f24688f && AbstractC3557B.K(this.f24689g, scrollableElement.f24689g) && AbstractC3557B.K(this.f24690h, scrollableElement.f24690h) && AbstractC3557B.K(this.f24691i, scrollableElement.f24691i)) {
            return true;
        }
        return false;
    }

    @Override // G0.X
    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int hashCode = (this.f24685c.hashCode() + (this.f24684b.hashCode() * 31)) * 31;
        int i13 = 0;
        L0 l02 = this.f24686d;
        if (l02 != null) {
            i10 = l02.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (hashCode + i10) * 31;
        int i15 = 1237;
        if (this.f24687e) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i16 = (i14 + i11) * 31;
        if (this.f24688f) {
            i15 = 1231;
        }
        int i17 = (i16 + i15) * 31;
        B.L0 l03 = this.f24689g;
        if (l03 != null) {
            i12 = l03.hashCode();
        } else {
            i12 = 0;
        }
        int i18 = (i17 + i12) * 31;
        m mVar = this.f24690h;
        if (mVar != null) {
            i13 = mVar.hashCode();
        }
        return this.f24691i.hashCode() + ((i18 + i13) * 31);
    }

    @Override // G0.X
    public final AbstractC4325q j() {
        return new C0165t1(this.f24684b, this.f24685c, this.f24686d, this.f24687e, this.f24688f, this.f24689g, this.f24690h, this.f24691i);
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        B.L0 l02;
        C0165t1 c0165t1 = (C0165t1) abstractC4325q;
        boolean z10 = c0165t1.f1514x0;
        boolean z11 = this.f24687e;
        if (z10 != z11) {
            c0165t1.f1507E0.f1467Z = z11;
            c0165t1.f1509G0.f1154s0 = z11;
        }
        B.L0 l03 = this.f24689g;
        if (l03 == null) {
            l02 = c0165t1.f1505C0;
        } else {
            l02 = l03;
        }
        A1 a12 = c0165t1.f1506D0;
        AbstractC0168u1 abstractC0168u1 = this.f24684b;
        a12.f1022a = abstractC0168u1;
        W0 w02 = this.f24685c;
        a12.f1023b = w02;
        L0 l04 = this.f24686d;
        a12.f1024c = l04;
        boolean z12 = this.f24688f;
        a12.f1025d = z12;
        a12.f1026e = l02;
        a12.f1027f = c0165t1.f1504B0;
        C0139k1 c0139k1 = c0165t1.f1510H0;
        C0110b c0110b = c0139k1.f1399x0;
        B0 b02 = a.f24692a;
        C0169v c0169v = C0169v.f1532l0;
        J0 j02 = c0139k1.f1401z0;
        C0121e1 c0121e1 = c0139k1.f1398w0;
        m mVar = this.f24690h;
        j02.F0(c0121e1, c0169v, w02, z11, mVar, c0110b, b02, c0139k1.f1400y0, false);
        S s10 = c0165t1.f1508F0;
        s10.f1166s0 = w02;
        s10.f1167t0 = abstractC0168u1;
        s10.f1168u0 = z12;
        s10.f1169v0 = this.f24691i;
        c0165t1.f1511u0 = abstractC0168u1;
        c0165t1.f1512v0 = w02;
        c0165t1.f1513w0 = l04;
        c0165t1.f1514x0 = z11;
        c0165t1.f1515y0 = z12;
        c0165t1.f1516z0 = l03;
        c0165t1.f1503A0 = mVar;
    }
}
