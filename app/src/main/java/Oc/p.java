package oc;

import android.app.Application;
import androidx.lifecycle.P;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2398d;
import com.openai.experiment.t;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class p implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f41291a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f41292b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f41293c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f41294d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f41295e;

    /* renamed from: f  reason: collision with root package name */
    public final p000if.a f41296f;

    public p(C2398d c2398d, AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4, C2398d c2398d2) {
        this.f41291a = c2398d;
        this.f41292b = abstractC2400f;
        this.f41293c = abstractC2400f2;
        this.f41294d = abstractC2400f3;
        this.f41295e = abstractC2400f4;
        this.f41296f = c2398d2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f41291a.get();
        AbstractC3557B.b0("get(...)", obj);
        P p10 = (P) obj;
        Object obj2 = this.f41292b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Q9.j jVar = (Q9.j) obj2;
        Object obj3 = this.f41293c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Va.e eVar = (Va.e) obj3;
        Object obj4 = this.f41294d.get();
        AbstractC3557B.b0("get(...)", obj4);
        N9.c cVar = (N9.c) obj4;
        Object obj5 = this.f41295e.get();
        AbstractC3557B.b0("get(...)", obj5);
        t tVar = (t) obj5;
        Object obj6 = this.f41296f.get();
        AbstractC3557B.b0("get(...)", obj6);
        return new o(p10, jVar, eVar, cVar, tVar, (Application) obj6);
    }
}
