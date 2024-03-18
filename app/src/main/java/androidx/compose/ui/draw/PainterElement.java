package androidx.compose.ui.draw;

import E0.AbstractC0454m;
import G0.AbstractC0579h;
import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4313e;
import l0.AbstractC4325q;
import o0.C4875j;
import q0.C5254f;
import r0.C5347k;
import u0.AbstractC5824b;
import y.AbstractC6463a;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "LG0/X;", "Lo0/j;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PainterElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC5824b f24784b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f24785c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC4313e f24786d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC0454m f24787e;

    /* renamed from: f  reason: collision with root package name */
    public final float f24788f;

    /* renamed from: g  reason: collision with root package name */
    public final C5347k f24789g;

    public PainterElement(AbstractC5824b abstractC5824b, boolean z10, AbstractC4313e abstractC4313e, AbstractC0454m abstractC0454m, float f6, C5347k c5347k) {
        this.f24784b = abstractC5824b;
        this.f24785c = z10;
        this.f24786d = abstractC4313e;
        this.f24787e = abstractC0454m;
        this.f24788f = f6;
        this.f24789g = c5347k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return AbstractC3557B.K(this.f24784b, painterElement.f24784b) && this.f24785c == painterElement.f24785c && AbstractC3557B.K(this.f24786d, painterElement.f24786d) && AbstractC3557B.K(this.f24787e, painterElement.f24787e) && Float.compare(this.f24788f, painterElement.f24788f) == 0 && AbstractC3557B.K(this.f24789g, painterElement.f24789g);
    }

    @Override // G0.X
    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f24784b.hashCode() * 31;
        if (this.f24785c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode2 = this.f24786d.hashCode();
        int hashCode3 = this.f24787e.hashCode();
        int e10 = AbstractC6463a.e(this.f24788f, (hashCode3 + ((hashCode2 + ((hashCode + i10) * 31)) * 31)) * 31, 31);
        C5347k c5347k = this.f24789g;
        if (c5347k == null) {
            i11 = 0;
        } else {
            i11 = c5347k.hashCode();
        }
        return e10 + i11;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.q, o0.j] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f40424s0 = this.f24784b;
        abstractC4325q.f40425t0 = this.f24785c;
        abstractC4325q.f40426u0 = this.f24786d;
        abstractC4325q.f40427v0 = this.f24787e;
        abstractC4325q.f40428w0 = this.f24788f;
        abstractC4325q.f40429x0 = this.f24789g;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        boolean z10;
        C4875j c4875j = (C4875j) abstractC4325q;
        boolean z11 = c4875j.f40425t0;
        AbstractC5824b abstractC5824b = this.f24784b;
        boolean z12 = this.f24785c;
        if (z11 == z12 && (!z12 || C5254f.a(c4875j.f40424s0.h(), abstractC5824b.h()))) {
            z10 = false;
        } else {
            z10 = true;
        }
        c4875j.f40424s0 = abstractC5824b;
        c4875j.f40425t0 = z12;
        c4875j.f40426u0 = this.f24786d;
        c4875j.f40427v0 = this.f24787e;
        c4875j.f40428w0 = this.f24788f;
        c4875j.f40429x0 = this.f24789g;
        if (z10) {
            AbstractC0579h.u(c4875j);
        }
        AbstractC0579h.t(c4875j);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f24784b + ", sizeToIntrinsics=" + this.f24785c + ", alignment=" + this.f24786d + ", contentScale=" + this.f24787e + ", alpha=" + this.f24788f + ", colorFilter=" + this.f24789g + ')';
    }
}
