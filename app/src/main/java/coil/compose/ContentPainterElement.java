package coil.compose;

import E0.AbstractC0454m;
import G0.AbstractC0579h;
import G0.X;
import g4.C3194v;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4313e;
import l0.AbstractC4325q;
import q0.C5254f;
import r0.C5347k;
import u0.AbstractC5824b;
import y.AbstractC6463a;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Lcoil/compose/ContentPainterElement;", "LG0/X;", "Lg4/v;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ContentPainterElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC5824b f26688b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC4313e f26689c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC0454m f26690d;

    /* renamed from: e  reason: collision with root package name */
    public final float f26691e;

    /* renamed from: f  reason: collision with root package name */
    public final C5347k f26692f;

    public ContentPainterElement(AbstractC5824b abstractC5824b, AbstractC4313e abstractC4313e, AbstractC0454m abstractC0454m, float f6, C5347k c5347k) {
        this.f26688b = abstractC5824b;
        this.f26689c = abstractC4313e;
        this.f26690d = abstractC0454m;
        this.f26691e = f6;
        this.f26692f = c5347k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return AbstractC3557B.K(this.f26688b, contentPainterElement.f26688b) && AbstractC3557B.K(this.f26689c, contentPainterElement.f26689c) && AbstractC3557B.K(this.f26690d, contentPainterElement.f26690d) && Float.compare(this.f26691e, contentPainterElement.f26691e) == 0 && AbstractC3557B.K(this.f26692f, contentPainterElement.f26692f);
    }

    @Override // G0.X
    public final int hashCode() {
        int i10;
        int hashCode = this.f26689c.hashCode();
        int hashCode2 = this.f26690d.hashCode();
        int e10 = AbstractC6463a.e(this.f26691e, (hashCode2 + ((hashCode + (this.f26688b.hashCode() * 31)) * 31)) * 31, 31);
        C5347k c5347k = this.f26692f;
        if (c5347k == null) {
            i10 = 0;
        } else {
            i10 = c5347k.hashCode();
        }
        return e10 + i10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.q, g4.v] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f31261s0 = this.f26688b;
        abstractC4325q.f31262t0 = this.f26689c;
        abstractC4325q.f31263u0 = this.f26690d;
        abstractC4325q.f31264v0 = this.f26691e;
        abstractC4325q.f31265w0 = this.f26692f;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        C3194v c3194v = (C3194v) abstractC4325q;
        long h10 = c3194v.f31261s0.h();
        AbstractC5824b abstractC5824b = this.f26688b;
        boolean z10 = !C5254f.a(h10, abstractC5824b.h());
        c3194v.f31261s0 = abstractC5824b;
        c3194v.f31262t0 = this.f26689c;
        c3194v.f31263u0 = this.f26690d;
        c3194v.f31264v0 = this.f26691e;
        c3194v.f31265w0 = this.f26692f;
        if (z10) {
            AbstractC0579h.u(c3194v);
        }
        AbstractC0579h.t(c3194v);
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.f26688b + ", alignment=" + this.f26689c + ", contentScale=" + this.f26690d + ", alpha=" + this.f26691e + ", colorFilter=" + this.f26692f + ')';
    }
}
