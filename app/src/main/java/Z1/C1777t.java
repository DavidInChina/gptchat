package Z1;

import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import e2.C2782n;
import e2.C2784p;
import e2.C2790v;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import j2.AbstractC3899a;
import j2.C3906h;
import j2.C3907i;

/* renamed from: Z1.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1777t extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f23102Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f23103Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f23104h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ RemoteViews f23105i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C1763g0 f23106j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f23107k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f23108l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f23109m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f23110n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1777t(kotlin.jvm.internal.B b10, kotlin.jvm.internal.B b11, kotlin.jvm.internal.B b12, Context context, RemoteViews remoteViews, C1763g0 c1763g0, kotlin.jvm.internal.B b13, kotlin.jvm.internal.B b14, kotlin.jvm.internal.B b15, H0 h02, kotlin.jvm.internal.B b16, kotlin.jvm.internal.B b17, kotlin.jvm.internal.B b18) {
        super(2);
        this.f23102Y = b10;
        this.f23103Z = b11;
        this.f23104h0 = b12;
        this.f23105i0 = remoteViews;
        this.f23106j0 = c1763g0;
        this.f23107k0 = b13;
        this.f23108l0 = b15;
        this.f23109m0 = b17;
        this.f23110n0 = b18;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        C2784p c2784p;
        jf.y yVar = (jf.y) obj;
        X1.l lVar = (X1.l) obj2;
        if (lVar instanceof Y1.b) {
            kotlin.jvm.internal.B b10 = this.f23102Y;
            if (b10.f37622Y != null) {
                AbstractC3612c.r("GlanceAppWidget", "More than one clickable defined on the same GlanceModifier, only the last one will be used.");
            }
            b10.f37622Y = lVar;
        } else if (lVar instanceof C2790v) {
            this.f23103Z.f37622Y = lVar;
        } else if (lVar instanceof C2782n) {
            this.f23104h0.f37622Y = lVar;
        } else if (lVar instanceof X1.c) {
            X1.c cVar = (X1.c) lVar;
            int i10 = this.f23106j0.f22961a;
            cVar.getClass();
            AbstractC3899a abstractC3899a = cVar.f21725b;
            boolean z10 = abstractC3899a instanceof C3906h;
            RemoteViews remoteViews = this.f23105i0;
            if (z10) {
                int s10 = androidx.compose.ui.graphics.a.s(((C3906h) abstractC3899a).f36008a);
                AbstractC3557B.c0("<this>", remoteViews);
                remoteViews.setInt(i10, "setBackgroundColor", s10);
            } else if (abstractC3899a instanceof C3907i) {
                int i11 = ((C3907i) abstractC3899a).f36009a;
                AbstractC3557B.c0("<this>", remoteViews);
                if (Build.VERSION.SDK_INT >= 31) {
                    H1.o.d(remoteViews, i10, "setBackgroundColor", i11);
                } else {
                    remoteViews.setInt(i10, "setBackgroundResource", i11);
                }
            } else {
                AbstractC3612c.r("GlanceAppWidget", "Unexpected background color modifier: " + abstractC3899a);
            }
        } else if (lVar instanceof C2784p) {
            kotlin.jvm.internal.B b11 = this.f23107k0;
            C2784p c2784p2 = (C2784p) b11.f37622Y;
            if (c2784p2 != null) {
                C2784p c2784p3 = (C2784p) lVar;
                c2784p = new C2784p(c2784p2.f28784b.a(c2784p3.f28784b), c2784p2.f28785c.a(c2784p3.f28785c), c2784p2.f28786d.a(c2784p3.f28786d), c2784p2.f28787e.a(c2784p3.f28787e), c2784p2.f28788f.a(c2784p3.f28788f), c2784p2.f28789g.a(c2784p3.f28789g));
            } else {
                c2784p = (C2784p) lVar;
            }
            b11.f37622Y = c2784p;
        } else if (lVar instanceof B) {
            this.f23108l0.f37622Y = ((B) lVar).f22817b;
        } else if (!(lVar instanceof C1750a)) {
            if (lVar instanceof F) {
                this.f23109m0.f37622Y = lVar;
            } else if (lVar instanceof f2.b) {
                this.f23110n0.f37622Y = lVar;
            } else {
                AbstractC3612c.r("GlanceAppWidget", "Unknown modifier '" + lVar + "', nothing done.");
            }
        }
        return jf.y.f36177a;
    }
}
