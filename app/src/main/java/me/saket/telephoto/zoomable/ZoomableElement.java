package me.saket.telephoto.zoomable;

import G0.X;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import mh.C4669N;
import mh.C4670O;
import mh.C4686p;
import oh.C5018e;
import oh.I;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Lme/saket/telephoto/zoomable/ZoomableElement;", "LG0/X;", "Lmh/O;", "zoomable_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
final class ZoomableElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final C4686p f39238b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f39239c;

    /* renamed from: d  reason: collision with root package name */
    public final k f39240d;

    /* renamed from: e  reason: collision with root package name */
    public final k f39241e;

    public ZoomableElement(C4686p c4686p, boolean z10, k kVar, k kVar2) {
        AbstractC3557B.c0("state", c4686p);
        this.f39238b = c4686p;
        this.f39239c = z10;
        this.f39240d = kVar;
        this.f39241e = kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoomableElement)) {
            return false;
        }
        ZoomableElement zoomableElement = (ZoomableElement) obj;
        return AbstractC3557B.K(this.f39238b, zoomableElement.f39238b) && this.f39239c == zoomableElement.f39239c && AbstractC3557B.K(this.f39240d, zoomableElement.f39240d) && AbstractC3557B.K(this.f39241e, zoomableElement.f39241e);
    }

    @Override // G0.X
    public final int hashCode() {
        int hashCode = ((this.f39238b.hashCode() * 31) + (this.f39239c ? 1231 : 1237)) * 31;
        int i10 = 0;
        k kVar = this.f39240d;
        int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        k kVar2 = this.f39241e;
        if (kVar2 != null) {
            i10 = kVar2.hashCode();
        }
        return hashCode2 + i10;
    }

    @Override // G0.X
    public final AbstractC4325q j() {
        return new C4670O(this.f39238b, this.f39239c, this.f39240d, this.f39241e);
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        C4670O c4670o = (C4670O) abstractC4325q;
        AbstractC3557B.c0("node", c4670o);
        C4686p c4686p = this.f39238b;
        AbstractC3557B.c0("state", c4686p);
        C4669N c4669n = new C4669N(1, c4686p);
        I i10 = c4670o.f39422B0;
        C5018e c5018e = c4686p.f39497q;
        boolean z10 = this.f39239c;
        i10.B0(c5018e, c4669n, false, z10, c4670o.f39428z0);
        c4670o.f39421A0.B0(c4670o.f39425w0, this.f39240d, this.f39241e, c4670o.f39426x0, c4670o.f39427y0, c4686p.f39497q, z10);
    }

    public final String toString() {
        return "ZoomableElement(state=" + this.f39238b + ", enabled=" + this.f39239c + ", onClick=" + this.f39240d + ", onLongClick=" + this.f39241e + Separators.RPAREN;
    }
}
