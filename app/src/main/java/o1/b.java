package O1;

import A.C0007a0;
import A.C0033n0;
import Df.v;
import M1.C0923d;
import M1.J;
import Ng.F;
import android.content.Context;
import id.AbstractC3557B;
import java.util.List;
import l8.AbstractC4344b;
import wf.k;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public final k f13336b;

    /* renamed from: c  reason: collision with root package name */
    public final F f13337c;

    /* renamed from: e  reason: collision with root package name */
    public volatile P1.d f13339e;

    /* renamed from: a  reason: collision with root package name */
    public final String f13335a = "GlanceAppWidgetManager";

    /* renamed from: d  reason: collision with root package name */
    public final Object f13338d = new Object();

    public b(k kVar, F f6) {
        this.f13336b = kVar;
        this.f13337c = f6;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [R4.a, java.lang.Object] */
    public final Object a(Object obj, v vVar) {
        P1.d dVar;
        Context context = (Context) obj;
        AbstractC3557B.c0("thisRef", context);
        AbstractC3557B.c0("property", vVar);
        P1.d dVar2 = this.f13339e;
        if (dVar2 == null) {
            synchronized (this.f13338d) {
                try {
                    if (this.f13339e == null) {
                        Context applicationContext = context.getApplicationContext();
                        k kVar = this.f13336b;
                        AbstractC3557B.b0("applicationContext", applicationContext);
                        List list = (List) kVar.invoke(applicationContext);
                        F f6 = this.f13337c;
                        C0007a0 c0007a0 = new C0007a0(applicationContext, 17, this);
                        AbstractC3557B.c0("migrations", list);
                        AbstractC3557B.c0("scope", f6);
                        P1.e eVar = P1.e.f13781a;
                        this.f13339e = new P1.d(new J(new C0033n0(c0007a0, 8), eVar, AbstractC4344b.F0(new C0923d(list, null)), new Object(), f6));
                    }
                    dVar = this.f13339e;
                    AbstractC3557B.Z(dVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return dVar;
        }
        return dVar2;
    }
}
