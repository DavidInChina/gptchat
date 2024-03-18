package me.saket.telephoto.zoomable.internal;

import G0.X;
import Uf.A;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import kotlin.Metadata;
import l0.AbstractC4325q;
import mh.C4665J;
import oh.C5018e;
import oh.x;
import wf.AbstractC6216a;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Lme/saket/telephoto/zoomable/internal/TappableAndQuickZoomableElement;", "LG0/X;", "Loh/x;", "zoomable_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class TappableAndQuickZoomableElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final k f39242b;

    /* renamed from: c  reason: collision with root package name */
    public final k f39243c;

    /* renamed from: d  reason: collision with root package name */
    public final k f39244d;

    /* renamed from: e  reason: collision with root package name */
    public final k f39245e;

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC6216a f39246f;

    /* renamed from: g  reason: collision with root package name */
    public final C5018e f39247g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f39248h;

    public TappableAndQuickZoomableElement(C4665J c4665j, k kVar, k kVar2, C4665J c4665j2, A a5, C5018e c5018e, boolean z10) {
        AbstractC3557B.c0("transformableState", c5018e);
        this.f39242b = c4665j;
        this.f39243c = kVar;
        this.f39244d = kVar2;
        this.f39245e = c4665j2;
        this.f39246f = a5;
        this.f39247g = c5018e;
        this.f39248h = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TappableAndQuickZoomableElement)) {
            return false;
        }
        TappableAndQuickZoomableElement tappableAndQuickZoomableElement = (TappableAndQuickZoomableElement) obj;
        return AbstractC3557B.K(this.f39242b, tappableAndQuickZoomableElement.f39242b) && AbstractC3557B.K(this.f39243c, tappableAndQuickZoomableElement.f39243c) && AbstractC3557B.K(this.f39244d, tappableAndQuickZoomableElement.f39244d) && AbstractC3557B.K(this.f39245e, tappableAndQuickZoomableElement.f39245e) && AbstractC3557B.K(this.f39246f, tappableAndQuickZoomableElement.f39246f) && AbstractC3557B.K(this.f39247g, tappableAndQuickZoomableElement.f39247g) && this.f39248h == tappableAndQuickZoomableElement.f39248h;
    }

    @Override // G0.X
    public final int hashCode() {
        int hashCode = this.f39242b.hashCode() * 31;
        int i10 = 0;
        k kVar = this.f39243c;
        int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        k kVar2 = this.f39244d;
        if (kVar2 != null) {
            i10 = kVar2.hashCode();
        }
        int hashCode3 = this.f39245e.hashCode();
        return ((this.f39247g.hashCode() + ((this.f39246f.hashCode() + ((hashCode3 + ((hashCode2 + i10) * 31)) * 31)) * 31)) * 31) + (this.f39248h ? 1231 : 1237);
    }

    @Override // G0.X
    public final AbstractC4325q j() {
        return new x(this.f39242b, this.f39243c, this.f39244d, this.f39245e, this.f39246f, this.f39247g, this.f39248h);
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        x xVar = (x) abstractC4325q;
        AbstractC3557B.c0("node", xVar);
        xVar.B0(this.f39242b, this.f39243c, this.f39244d, this.f39245e, this.f39246f, this.f39247g, this.f39248h);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TappableAndQuickZoomableElement(onPress=");
        sb2.append(this.f39242b);
        sb2.append(", onTap=");
        sb2.append(this.f39243c);
        sb2.append(", onLongPress=");
        sb2.append(this.f39244d);
        sb2.append(", onDoubleTap=");
        sb2.append(this.f39245e);
        sb2.append(", onQuickZoomStopped=");
        sb2.append(this.f39246f);
        sb2.append(", transformableState=");
        sb2.append(this.f39247g);
        sb2.append(", gesturesEnabled=");
        return AbstractC4194d.w(sb2, this.f39248h, Separators.RPAREN);
    }
}
