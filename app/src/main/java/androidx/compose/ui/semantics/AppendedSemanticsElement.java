package androidx.compose.ui.semantics;

import G0.X;
import L0.c;
import L0.j;
import L0.k;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003\u00a8\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "LG0/X;", "LL0/c;", "LL0/k;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends X implements k {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f24865b;

    /* renamed from: c  reason: collision with root package name */
    public final wf.k f24866c;

    public AppendedSemanticsElement(wf.k kVar, boolean z10) {
        this.f24865b = z10;
        this.f24866c = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f24865b == appendedSemanticsElement.f24865b && AbstractC3557B.K(this.f24866c, appendedSemanticsElement.f24866c);
    }

    @Override // G0.X
    public final int hashCode() {
        return this.f24866c.hashCode() + ((this.f24865b ? 1231 : 1237) * 31);
    }

    @Override // G0.X
    public final AbstractC4325q j() {
        return new c(this.f24865b, false, this.f24866c);
    }

    @Override // L0.k
    public final j k() {
        j jVar = new j();
        jVar.f10410Z = this.f24865b;
        this.f24866c.invoke(jVar);
        return jVar;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        c cVar = (c) abstractC4325q;
        cVar.f10372s0 = this.f24865b;
        cVar.f10374u0 = this.f24866c;
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f24865b + ", properties=" + this.f24866c + ')';
    }
}
