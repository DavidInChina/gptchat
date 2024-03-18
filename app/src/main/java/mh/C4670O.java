package mh;

import G0.AbstractC0585n;
import G0.AbstractC0587p;
import i8.C3493k;
import id.AbstractC3557B;
import me.saket.telephoto.zoomable.internal.TappableAndQuickZoomableElement;
import me.saket.telephoto.zoomable.internal.TransformableElement;

/* renamed from: mh.O  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4670O extends AbstractC0587p implements AbstractC0585n {

    /* renamed from: A0  reason: collision with root package name */
    public final oh.x f39421A0;

    /* renamed from: B0  reason: collision with root package name */
    public final oh.I f39422B0;

    /* renamed from: u0  reason: collision with root package name */
    public final C4686p f39423u0;

    /* renamed from: v0  reason: collision with root package name */
    public final C3493k f39424v0 = new C3493k(11, this);

    /* renamed from: w0  reason: collision with root package name */
    public final C4665J f39425w0;

    /* renamed from: x0  reason: collision with root package name */
    public final C4665J f39426x0;

    /* renamed from: y0  reason: collision with root package name */
    public final Uf.A f39427y0;

    /* renamed from: z0  reason: collision with root package name */
    public final C4665J f39428z0;

    public C4670O(C4686p c4686p, boolean z10, wf.k kVar, wf.k kVar2) {
        AbstractC3557B.c0("state", c4686p);
        this.f39423u0 = c4686p;
        C4665J c4665j = new C4665J(this, 1);
        this.f39425w0 = c4665j;
        C4665J c4665j2 = new C4665J(this, 0);
        this.f39426x0 = c4665j2;
        Uf.A a5 = new Uf.A(21, this);
        this.f39427y0 = a5;
        C4665J c4665j3 = new C4665J(this, 2);
        this.f39428z0 = c4665j3;
        TappableAndQuickZoomableElement tappableAndQuickZoomableElement = new TappableAndQuickZoomableElement(c4665j, kVar, kVar2, c4665j2, a5, c4686p.f39497q, z10);
        oh.x xVar = new oh.x(tappableAndQuickZoomableElement.f39242b, tappableAndQuickZoomableElement.f39243c, tappableAndQuickZoomableElement.f39244d, tappableAndQuickZoomableElement.f39245e, tappableAndQuickZoomableElement.f39246f, tappableAndQuickZoomableElement.f39247g, tappableAndQuickZoomableElement.f39248h);
        this.f39421A0 = xVar;
        TransformableElement transformableElement = new TransformableElement(c4686p.f39497q, new C4669N(0, c4686p), z10, c4665j3);
        oh.I i10 = new oh.I(transformableElement.f39249b, transformableElement.f39250c, false, transformableElement.f39252e, transformableElement.f39253f);
        this.f39422B0 = i10;
        A0(xVar);
        A0(i10);
    }
}
