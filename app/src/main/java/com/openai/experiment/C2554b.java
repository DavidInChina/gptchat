package com.openai.experiment;

import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2398d;
import com.statsig.androidsdk.StatsigUser;
import f9.C2959k;
import id.AbstractC3557B;
import java.util.Locale;
import jf.C3959i;
import kf.AbstractC4268D;
import ld.C4428a;
import nd.C4812a;
import u7.C5848d;
import wd.C6189g;
import wd.C6205s;
import wd.EnumC6187f;
import wd.EnumC6206t;

/* renamed from: com.openai.experiment.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2554b implements AbstractC2397c {

    /* renamed from: e  reason: collision with root package name */
    public static final C5848d f27677e = new C5848d(26, 0);

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f27678a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f27679b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f27680c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f27681d;

    public C2554b(AbstractC2400f abstractC2400f, C2398d c2398d, C2398d c2398d2, C2959k c2959k) {
        this.f27678a = abstractC2400f;
        this.f27679b = c2398d;
        this.f27680c = c2398d2;
        this.f27681d = c2959k;
    }

    @Override // p000if.a
    public final Object get() {
        String str;
        EnumC6187f enumC6187f;
        String name;
        Object obj = this.f27678a.get();
        AbstractC3557B.b0("get(...)", obj);
        C4812a c4812a = (C4812a) obj;
        Object obj2 = this.f27679b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Application application = (Application) obj2;
        Object obj3 = this.f27680c.get();
        AbstractC3557B.b0("get(...)", obj3);
        C4428a c4428a = (C4428a) obj3;
        Object obj4 = this.f27681d.get();
        AbstractC3557B.b0("get(...)", obj4);
        EnumC6206t enumC6206t = (EnumC6206t) obj4;
        f27677e.getClass();
        StatsigUser statsigUser = new StatsigUser(c4812a.f40277d);
        statsigUser.setCustomIDs(P4.a.o0(new C3959i("account_id", c4812a.f40276c)));
        C6205s c6205s = c4812a.f40275b;
        statsigUser.setPrivateAttributes(P4.a.o0(new C3959i("email", c6205s.f48458b.f48353b)));
        C.f27657f.getClass();
        C3959i[] c3959iArr = new C3959i[5];
        boolean e10 = c6205s.e();
        String str2 = null;
        C6189g c6189g = c6205s.f48457a;
        if (e10 && c6189g != null) {
            str = c6189g.f48410a;
        } else {
            str = null;
        }
        if (str == null) {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        C3959i c3959i = new C3959i("workspace_id", str);
        boolean z10 = false;
        c3959iArr[0] = c3959i;
        c3959iArr[1] = new C3959i("is_plus_user", Boolean.valueOf(AbstractC3557B.K(c6205s.c(), "plus")));
        if (c6189g != null && c6189g.a()) {
            z10 = true;
        }
        c3959iArr[2] = new C3959i("has_active_subscription", Boolean.valueOf(z10));
        String c10 = c6205s.c();
        if (c10 == null) {
            c10 = str3;
        }
        c3959iArr[3] = new C3959i("plan_type", c10);
        if (c6189g != null && (enumC6187f = c6189g.f48414e) != null && (name = enumC6187f.name()) != null) {
            str2 = name.toLowerCase(Locale.ROOT);
            AbstractC3557B.b0("toLowerCase(...)", str2);
        }
        if (str2 != null) {
            str3 = str2;
        }
        c3959iArr[4] = new C3959i("account_structure", str3);
        statsigUser.setCustom(AbstractC4268D.e1(C.f27658g, AbstractC4268D.a1(c3959iArr)));
        return new C(statsigUser, Bi.c.N(enumC6206t), application, c4428a);
    }
}
