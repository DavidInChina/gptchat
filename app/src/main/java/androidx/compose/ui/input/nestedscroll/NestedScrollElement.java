package androidx.compose.ui.input.nestedscroll;

import A0.d;
import A0.g;
import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import z.C6672L;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "LG0/X;", "LA0/g;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NestedScrollElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final A0.a f24813b;

    /* renamed from: c  reason: collision with root package name */
    public final d f24814c;

    public NestedScrollElement(A0.a aVar, d dVar) {
        this.f24813b = aVar;
        this.f24814c = dVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        if (!AbstractC3557B.K(nestedScrollElement.f24813b, this.f24813b) || !AbstractC3557B.K(nestedScrollElement.f24814c, this.f24814c)) {
            return false;
        }
        return true;
    }

    @Override // G0.X
    public final int hashCode() {
        int i10;
        int hashCode = this.f24813b.hashCode() * 31;
        d dVar = this.f24814c;
        if (dVar != null) {
            i10 = dVar.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    @Override // G0.X
    public final AbstractC4325q j() {
        return new g(this.f24813b, this.f24814c);
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        g gVar = (g) abstractC4325q;
        gVar.f372s0 = this.f24813b;
        d dVar = gVar.f373t0;
        if (dVar.f358a == gVar) {
            dVar.f358a = null;
        }
        d dVar2 = this.f24814c;
        if (dVar2 == null) {
            gVar.f373t0 = new d();
        } else if (!AbstractC3557B.K(dVar2, dVar)) {
            gVar.f373t0 = dVar2;
        }
        if (gVar.f37732r0) {
            d dVar3 = gVar.f373t0;
            dVar3.f358a = gVar;
            dVar3.f359b = new C6672L(18, gVar);
            dVar3.f360c = gVar.p0();
        }
    }
}
