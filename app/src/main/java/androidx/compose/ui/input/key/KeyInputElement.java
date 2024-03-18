package androidx.compose.ui.input.key;

import A.C0043t;
import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import wf.k;
import z0.C6741d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "LG0/X;", "Lz0/d;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class KeyInputElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final k f24811b;

    /* renamed from: c  reason: collision with root package name */
    public final k f24812c;

    public KeyInputElement(k kVar, C0043t c0043t) {
        this.f24811b = kVar;
        this.f24812c = c0043t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return AbstractC3557B.K(this.f24811b, keyInputElement.f24811b) && AbstractC3557B.K(this.f24812c, keyInputElement.f24812c);
    }

    @Override // G0.X
    public final int hashCode() {
        int i10 = 0;
        k kVar = this.f24811b;
        int hashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        k kVar2 = this.f24812c;
        if (kVar2 != null) {
            i10 = kVar2.hashCode();
        }
        return hashCode + i10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z0.d, l0.q] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f51433s0 = this.f24811b;
        abstractC4325q.f51434t0 = this.f24812c;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        C6741d c6741d = (C6741d) abstractC4325q;
        c6741d.f51433s0 = this.f24811b;
        c6741d.f51434t0 = this.f24812c;
    }

    public final String toString() {
        return "KeyInputElement(onKeyEvent=" + this.f24811b + ", onPreKeyEvent=" + this.f24812c + ')';
    }
}
