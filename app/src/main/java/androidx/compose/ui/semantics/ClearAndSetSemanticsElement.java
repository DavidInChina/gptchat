package androidx.compose.ui.semantics;

import G0.X;
import L0.c;
import L0.j;
import L0.k;
import W.S;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003\u00a8\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;", "LG0/X;", "LL0/c;", "LL0/k;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ClearAndSetSemanticsElement extends X implements k {

    /* renamed from: b  reason: collision with root package name */
    public final wf.k f24867b;

    public ClearAndSetSemanticsElement(S s10) {
        this.f24867b = s10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && AbstractC3557B.K(this.f24867b, ((ClearAndSetSemanticsElement) obj).f24867b);
    }

    @Override // G0.X
    public final int hashCode() {
        return this.f24867b.hashCode();
    }

    @Override // G0.X
    public final AbstractC4325q j() {
        return new c(false, true, this.f24867b);
    }

    @Override // L0.k
    public final j k() {
        j jVar = new j();
        jVar.f10410Z = false;
        jVar.f10411h0 = true;
        this.f24867b.invoke(jVar);
        return jVar;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        ((c) abstractC4325q).f10374u0 = this.f24867b;
    }

    public final String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.f24867b + ')';
    }
}
