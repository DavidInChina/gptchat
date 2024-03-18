package n0;

import Z0.l;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import q0.C5254f;
import r0.AbstractC5340d;
import r0.AbstractC5352p;
import r0.C5339c;
import t0.C5642a;
import t0.C5644c;
import wf.k;

/* renamed from: n0.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4702a extends View.DragShadowBuilder {

    /* renamed from: a  reason: collision with root package name */
    public final Z0.b f39581a;

    /* renamed from: b  reason: collision with root package name */
    public final long f39582b;

    /* renamed from: c  reason: collision with root package name */
    public final k f39583c;

    public C4702a(Z0.c cVar, long j6, k kVar) {
        this.f39581a = cVar;
        this.f39582b = j6;
        this.f39583c = kVar;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        C5644c c5644c = new C5644c();
        l lVar = l.f22805Y;
        Canvas canvas2 = AbstractC5340d.f44233a;
        C5339c c5339c = new C5339c();
        c5339c.f44230a = canvas;
        C5642a c5642a = c5644c.f45611Y;
        Z0.b bVar = c5642a.f45605a;
        l lVar2 = c5642a.f45606b;
        AbstractC5352p abstractC5352p = c5642a.f45607c;
        long j6 = c5642a.f45608d;
        c5642a.f45605a = this.f39581a;
        c5642a.f45606b = lVar;
        c5642a.f45607c = c5339c;
        c5642a.f45608d = this.f39582b;
        c5339c.h();
        this.f39583c.invoke(c5644c);
        c5339c.q();
        c5642a.f45605a = bVar;
        c5642a.f45606b = lVar2;
        c5642a.f45607c = abstractC5352p;
        c5642a.f45608d = j6;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j6 = this.f39582b;
        float d10 = C5254f.d(j6);
        Z0.b bVar = this.f39581a;
        point.set(bVar.a0(bVar.K(d10)), bVar.a0(bVar.K(C5254f.b(j6))));
        point2.set(point.x / 2, point.y / 2);
    }
}
