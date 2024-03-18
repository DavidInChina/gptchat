package T0;

import A2.O;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import b0.C2104h;
import g.RunnableC3111d;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import z.C6672L;

/* loaded from: classes.dex */
public final class D implements u {

    /* renamed from: a  reason: collision with root package name */
    public final View f16738a;

    /* renamed from: b  reason: collision with root package name */
    public final p f16739b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f16740c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16741d;

    /* renamed from: k  reason: collision with root package name */
    public Rect f16748k;

    /* renamed from: l  reason: collision with root package name */
    public final C1410e f16749l;

    /* renamed from: n  reason: collision with root package name */
    public RunnableC3111d f16751n;

    /* renamed from: e  reason: collision with root package name */
    public wf.k f16742e = C1409d.f16763i0;

    /* renamed from: f  reason: collision with root package name */
    public wf.k f16743f = C1409d.f16764j0;

    /* renamed from: g  reason: collision with root package name */
    public z f16744g = new z("", N0.D.f12483b, 4);

    /* renamed from: h  reason: collision with root package name */
    public o f16745h = o.f16802f;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f16746i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final AbstractC3957g f16747j = R4.b.C1(EnumC3958h.f36153Z, new C6672L(29, this));

    /* renamed from: m  reason: collision with root package name */
    public final C2104h f16750m = new C2104h(new B[16]);

    public D(View view, B0.G g10) {
        q qVar = new q(view);
        O o10 = new O(3, Choreographer.getInstance());
        this.f16738a = view;
        this.f16739b = qVar;
        this.f16740c = o10;
        this.f16749l = new C1410e(g10, qVar);
    }

    public final void a(B b10) {
        this.f16750m.b(b10);
        if (this.f16751n == null) {
            RunnableC3111d runnableC3111d = new RunnableC3111d(7, this);
            this.f16740c.execute(runnableC3111d);
            this.f16751n = runnableC3111d;
        }
    }
}
