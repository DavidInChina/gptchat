package me.saket.telephoto.zoomable.internal;

import G0.X;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import mh.C4665J;
import mh.C4669N;
import oh.C5018e;
import oh.I;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Lme/saket/telephoto/zoomable/internal/TransformableElement;", "LG0/X;", "Loh/I;", "zoomable_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class TransformableElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final C5018e f39249b;

    /* renamed from: c  reason: collision with root package name */
    public final k f39250c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f39251d = false;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f39252e;

    /* renamed from: f  reason: collision with root package name */
    public final k f39253f;

    public TransformableElement(C5018e c5018e, C4669N c4669n, boolean z10, C4665J c4665j) {
        AbstractC3557B.c0("state", c5018e);
        this.f39249b = c5018e;
        this.f39250c = c4669n;
        this.f39252e = z10;
        this.f39253f = c4665j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformableElement)) {
            return false;
        }
        TransformableElement transformableElement = (TransformableElement) obj;
        return AbstractC3557B.K(this.f39249b, transformableElement.f39249b) && AbstractC3557B.K(this.f39250c, transformableElement.f39250c) && this.f39251d == transformableElement.f39251d && this.f39252e == transformableElement.f39252e && AbstractC3557B.K(this.f39253f, transformableElement.f39253f);
    }

    @Override // G0.X
    public final int hashCode() {
        int i10 = 1237;
        int hashCode = (((this.f39250c.hashCode() + (this.f39249b.hashCode() * 31)) * 31) + (this.f39251d ? 1231 : 1237)) * 31;
        if (this.f39252e) {
            i10 = 1231;
        }
        return this.f39253f.hashCode() + ((hashCode + i10) * 31);
    }

    @Override // G0.X
    public final AbstractC4325q j() {
        return new I(this.f39249b, this.f39250c, this.f39251d, this.f39252e, this.f39253f);
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        I i10 = (I) abstractC4325q;
        AbstractC3557B.c0("node", i10);
        i10.B0(this.f39249b, this.f39250c, this.f39251d, this.f39252e, this.f39253f);
    }

    public final String toString() {
        return "TransformableElement(state=" + this.f39249b + ", canPan=" + this.f39250c + ", lockRotationOnZoomPan=" + this.f39251d + ", enabled=" + this.f39252e + ", onTransformStopped=" + this.f39253f + Separators.RPAREN;
    }
}
