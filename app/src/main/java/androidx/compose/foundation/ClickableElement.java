package androidx.compose.foundation;

import A.G;
import A.I;
import A.K;
import D.m;
import G0.X;
import L0.g;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import wf.AbstractC6216a;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "LG0/X;", "LA/G;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ClickableElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final m f24647b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f24648c;

    /* renamed from: d  reason: collision with root package name */
    public final String f24649d;

    /* renamed from: e  reason: collision with root package name */
    public final g f24650e;

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC6216a f24651f;

    public ClickableElement(m mVar, boolean z10, String str, g gVar, AbstractC6216a abstractC6216a) {
        this.f24647b = mVar;
        this.f24648c = z10;
        this.f24649d = str;
        this.f24650e = gVar;
        this.f24651f = abstractC6216a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        if (AbstractC3557B.K(this.f24647b, clickableElement.f24647b) && this.f24648c == clickableElement.f24648c && AbstractC3557B.K(this.f24649d, clickableElement.f24649d) && AbstractC3557B.K(this.f24650e, clickableElement.f24650e) && AbstractC3557B.K(this.f24651f, clickableElement.f24651f)) {
            return true;
        }
        return false;
    }

    @Override // G0.X
    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f24647b.hashCode() * 31;
        if (this.f24648c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (hashCode + i10) * 31;
        int i13 = 0;
        String str = this.f24649d;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i12 + i11) * 31;
        g gVar = this.f24650e;
        if (gVar != null) {
            i13 = gVar.f10380a;
        }
        return this.f24651f.hashCode() + ((i14 + i13) * 31);
    }

    @Override // G0.X
    public final AbstractC4325q j() {
        return new G(this.f24647b, this.f24648c, this.f24649d, this.f24650e, this.f24651f);
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        G g10 = (G) abstractC4325q;
        m mVar = this.f24647b;
        boolean z10 = this.f24648c;
        AbstractC6216a abstractC6216a = this.f24651f;
        g10.D0(mVar, z10, abstractC6216a);
        K k10 = g10.f68y0;
        k10.f82s0 = z10;
        k10.f83t0 = this.f24649d;
        k10.f84u0 = this.f24650e;
        k10.f85v0 = abstractC6216a;
        k10.f86w0 = null;
        k10.f87x0 = null;
        I i10 = g10.f69z0;
        i10.f193u0 = z10;
        i10.f195w0 = abstractC6216a;
        i10.f194v0 = mVar;
    }
}
