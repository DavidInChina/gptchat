package androidx.compose.animation;

import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import y.W;
import y.c0;
import y.d0;
import y.e0;
import z.C6715o0;
import z.C6729v0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "LG0/X;", "Ly/c0;", "animation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class EnterExitTransitionElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final C6729v0 f24626b;

    /* renamed from: c  reason: collision with root package name */
    public final C6715o0 f24627c;

    /* renamed from: d  reason: collision with root package name */
    public final C6715o0 f24628d;

    /* renamed from: e  reason: collision with root package name */
    public final C6715o0 f24629e;

    /* renamed from: f  reason: collision with root package name */
    public final d0 f24630f;

    /* renamed from: g  reason: collision with root package name */
    public final e0 f24631g;

    /* renamed from: h  reason: collision with root package name */
    public final W f24632h;

    public EnterExitTransitionElement(C6729v0 c6729v0, C6715o0 c6715o0, C6715o0 c6715o02, C6715o0 c6715o03, d0 d0Var, e0 e0Var, W w10) {
        this.f24626b = c6729v0;
        this.f24627c = c6715o0;
        this.f24628d = c6715o02;
        this.f24629e = c6715o03;
        this.f24630f = d0Var;
        this.f24631g = e0Var;
        this.f24632h = w10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return AbstractC3557B.K(this.f24626b, enterExitTransitionElement.f24626b) && AbstractC3557B.K(this.f24627c, enterExitTransitionElement.f24627c) && AbstractC3557B.K(this.f24628d, enterExitTransitionElement.f24628d) && AbstractC3557B.K(this.f24629e, enterExitTransitionElement.f24629e) && AbstractC3557B.K(this.f24630f, enterExitTransitionElement.f24630f) && AbstractC3557B.K(this.f24631g, enterExitTransitionElement.f24631g) && AbstractC3557B.K(this.f24632h, enterExitTransitionElement.f24632h);
    }

    @Override // G0.X
    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f24626b.hashCode() * 31;
        int i12 = 0;
        C6715o0 c6715o0 = this.f24627c;
        if (c6715o0 == null) {
            i10 = 0;
        } else {
            i10 = c6715o0.hashCode();
        }
        int i13 = (hashCode + i10) * 31;
        C6715o0 c6715o02 = this.f24628d;
        if (c6715o02 == null) {
            i11 = 0;
        } else {
            i11 = c6715o02.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        C6715o0 c6715o03 = this.f24629e;
        if (c6715o03 != null) {
            i12 = c6715o03.hashCode();
        }
        int hashCode2 = this.f24630f.f50197a.hashCode();
        return this.f24632h.hashCode() + ((this.f24631g.f50201a.hashCode() + ((hashCode2 + ((i14 + i12) * 31)) * 31)) * 31);
    }

    @Override // G0.X
    public final AbstractC4325q j() {
        return new c0(this.f24626b, this.f24627c, this.f24628d, this.f24629e, this.f24630f, this.f24631g, this.f24632h);
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        c0 c0Var = (c0) abstractC4325q;
        c0Var.f50187s0 = this.f24626b;
        c0Var.f50188t0 = this.f24627c;
        c0Var.f50189u0 = this.f24628d;
        c0Var.f50190v0 = this.f24629e;
        c0Var.f50191w0 = this.f24630f;
        c0Var.f50192x0 = this.f24631g;
        c0Var.f50193y0 = this.f24632h;
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f24626b + ", sizeAnimation=" + this.f24627c + ", offsetAnimation=" + this.f24628d + ", slideAnimation=" + this.f24629e + ", enter=" + this.f24630f + ", exit=" + this.f24631g + ", graphicsLayerBlock=" + this.f24632h + ')';
    }
}
