package com.openai.experiment;

import android.app.Application;
import ce.AbstractC2397c;
import ce.C2398d;
import com.statsig.androidsdk.StatsigUser;
import f9.C2959k;
import id.AbstractC3557B;
import u7.C5848d;
import wd.EnumC6206t;

/* loaded from: classes2.dex */
public final class x implements AbstractC2397c {

    /* renamed from: d  reason: collision with root package name */
    public static final C5848d f27700d = new C5848d(27, 0);

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f27701a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f27702b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f27703c;

    public x(C2398d c2398d, C2398d c2398d2, C2959k c2959k) {
        this.f27701a = c2398d;
        this.f27702b = c2398d2;
        this.f27703c = c2959k;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f27701a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f27702b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f27703c.get();
        AbstractC3557B.b0("get(...)", obj3);
        f27700d.getClass();
        StatsigUser statsigUser = new StatsigUser(null, 1, null);
        C.f27657f.getClass();
        statsigUser.setCustom(C.f27658g);
        return new C(statsigUser, Bi.c.N((EnumC6206t) obj3), (Application) obj, (ld.j) obj2);
    }
}
