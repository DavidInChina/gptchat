package androidx.compose.foundation;

import A.K;
import A.N;
import A.P;
import D.m;
import G0.X;
import L0.g;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import wf.AbstractC6216a;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "LG0/X;", "LA/N;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CombinedClickableElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final m f24652b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f24653c;

    /* renamed from: d  reason: collision with root package name */
    public final String f24654d;

    /* renamed from: e  reason: collision with root package name */
    public final g f24655e;

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC6216a f24656f;

    /* renamed from: g  reason: collision with root package name */
    public final String f24657g;

    /* renamed from: h  reason: collision with root package name */
    public final AbstractC6216a f24658h;

    /* renamed from: i  reason: collision with root package name */
    public final AbstractC6216a f24659i;

    public CombinedClickableElement(m mVar, g gVar, String str, String str2, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, AbstractC6216a abstractC6216a3, boolean z10) {
        this.f24652b = mVar;
        this.f24653c = z10;
        this.f24654d = str;
        this.f24655e = gVar;
        this.f24656f = abstractC6216a;
        this.f24657g = str2;
        this.f24658h = abstractC6216a2;
        this.f24659i = abstractC6216a3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        if (AbstractC3557B.K(this.f24652b, combinedClickableElement.f24652b) && this.f24653c == combinedClickableElement.f24653c && AbstractC3557B.K(this.f24654d, combinedClickableElement.f24654d) && AbstractC3557B.K(this.f24655e, combinedClickableElement.f24655e) && AbstractC3557B.K(this.f24656f, combinedClickableElement.f24656f) && AbstractC3557B.K(this.f24657g, combinedClickableElement.f24657g) && AbstractC3557B.K(this.f24658h, combinedClickableElement.f24658h) && AbstractC3557B.K(this.f24659i, combinedClickableElement.f24659i)) {
            return true;
        }
        return false;
    }

    @Override // G0.X
    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int hashCode = this.f24652b.hashCode() * 31;
        if (this.f24653c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i15 = (hashCode + i10) * 31;
        int i16 = 0;
        String str = this.f24654d;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        int i17 = (i15 + i11) * 31;
        g gVar = this.f24655e;
        if (gVar != null) {
            i12 = gVar.f10380a;
        } else {
            i12 = 0;
        }
        int hashCode2 = (this.f24656f.hashCode() + ((i17 + i12) * 31)) * 31;
        String str2 = this.f24657g;
        if (str2 != null) {
            i13 = str2.hashCode();
        } else {
            i13 = 0;
        }
        int i18 = (hashCode2 + i13) * 31;
        AbstractC6216a abstractC6216a = this.f24658h;
        if (abstractC6216a != null) {
            i14 = abstractC6216a.hashCode();
        } else {
            i14 = 0;
        }
        int i19 = (i18 + i14) * 31;
        AbstractC6216a abstractC6216a2 = this.f24659i;
        if (abstractC6216a2 != null) {
            i16 = abstractC6216a2.hashCode();
        }
        return i19 + i16;
    }

    @Override // G0.X
    public final AbstractC4325q j() {
        return new N(this.f24652b, this.f24655e, this.f24657g, this.f24654d, this.f24656f, this.f24658h, this.f24659i, this.f24653c);
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        N n10 = (N) abstractC4325q;
        boolean z16 = false;
        boolean z17 = true;
        if (n10.f95y0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC6216a abstractC6216a = this.f24658h;
        if (abstractC6216a == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            n10.B0();
        }
        n10.f95y0 = abstractC6216a;
        m mVar = this.f24652b;
        boolean z18 = this.f24653c;
        AbstractC6216a abstractC6216a2 = this.f24656f;
        n10.D0(mVar, z18, abstractC6216a2);
        K k10 = n10.f96z0;
        k10.f82s0 = z18;
        k10.f83t0 = this.f24654d;
        k10.f84u0 = this.f24655e;
        k10.f85v0 = abstractC6216a2;
        k10.f86w0 = this.f24657g;
        k10.f87x0 = abstractC6216a;
        P p10 = n10.f94A0;
        p10.f195w0 = abstractC6216a2;
        p10.f194v0 = mVar;
        if (p10.f193u0 != z18) {
            p10.f193u0 = z18;
            z12 = true;
        } else {
            z12 = false;
        }
        if (p10.f100A0 == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (abstractC6216a == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 != z14) {
            z12 = true;
        }
        p10.f100A0 = abstractC6216a;
        if (p10.f101B0 == null) {
            z15 = true;
        } else {
            z15 = false;
        }
        AbstractC6216a abstractC6216a3 = this.f24659i;
        if (abstractC6216a3 == null) {
            z16 = true;
        }
        if (z15 == z16) {
            z17 = z12;
        }
        p10.f101B0 = abstractC6216a3;
        if (z17) {
            ((B0.P) p10.f198z0).C0();
        }
    }
}
