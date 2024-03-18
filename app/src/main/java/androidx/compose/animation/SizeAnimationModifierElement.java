package androidx.compose.animation;

import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import wf.n;
import y.o0;
import z.AbstractC6659E;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierElement;", "LG0/X;", "Ly/o0;", "animation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SizeAnimationModifierElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC6659E f24633b;

    /* renamed from: c  reason: collision with root package name */
    public final n f24634c;

    public SizeAnimationModifierElement(AbstractC6659E abstractC6659E, n nVar) {
        this.f24633b = abstractC6659E;
        this.f24634c = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        return AbstractC3557B.K(this.f24633b, sizeAnimationModifierElement.f24633b) && AbstractC3557B.K(this.f24634c, sizeAnimationModifierElement.f24634c);
    }

    @Override // G0.X
    public final int hashCode() {
        int hashCode = this.f24633b.hashCode() * 31;
        n nVar = this.f24634c;
        return hashCode + (nVar == null ? 0 : nVar.hashCode());
    }

    @Override // G0.X
    public final AbstractC4325q j() {
        return new o0(this.f24633b, this.f24634c);
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        o0 o0Var = (o0) abstractC4325q;
        o0Var.f50262s0 = this.f24633b;
        o0Var.f50263t0 = this.f24634c;
    }

    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.f24633b + ", finishedListener=" + this.f24634c + ')';
    }
}
