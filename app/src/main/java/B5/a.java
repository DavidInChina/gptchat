package B5;

import M3.F;
import android.content.Context;
import id.AbstractC3557B;
import java.lang.ref.WeakReference;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import p5.AbstractC5091c;
import p5.EnumC5090b;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC5091c f1865Y;

    /* renamed from: Z  reason: collision with root package name */
    public final WeakReference f1866Z;

    public a(Context context, AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("appContext", context);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f1865Y = abstractC5091c;
        this.f1866Z = new WeakReference(context);
    }

    @Override // B5.b
    public final void b() {
        Context context = (Context) this.f1866Z.get();
        if (context != null && F.f0() != null) {
            AbstractC5091c abstractC5091c = this.f1865Y;
            AbstractC3557B.c0("internalLogger", abstractC5091c);
            try {
                F g02 = F.g0(context);
                g02.f11520i.a(new V3.b(g02, "DatadogBackgroundUpload", 1));
            } catch (IllegalStateException e10) {
                P4.a.l0(abstractC5091c, 5, AbstractC4344b.G0(EnumC5090b.f42739Z, EnumC5090b.f42740h0), Q5.a.f14428j0, e10, 48);
            }
        }
    }

    @Override // B5.b
    public final void d() {
        Context context = (Context) this.f1866Z.get();
        if (context != null && F.f0() != null) {
            AbstractC4828h.u0(context, this.f1865Y);
        }
    }

    @Override // B5.b
    public final void a() {
    }

    @Override // B5.b
    public final void c() {
    }
}
