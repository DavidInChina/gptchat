package B;

import Uc.C1422g;
import W.C1550f3;
import W.EnumC1555g3;
import android.app.Activity;
import android.os.SystemClock;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import q0.C5251c;
import s3.C5545H;
import s3.C5549L;
import s3.C5562l;
import wb.C6158c;
import wd.EnumC6212z;
import yf.AbstractC6583a;
import z.C6678S;

/* loaded from: classes.dex */
public final class A0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f1018Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f1019Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f1020h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f1021i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A0(Object obj, Object obj2, boolean z10, int i10) {
        super(1);
        this.f1018Y = i10;
        this.f1020h0 = obj;
        this.f1021i0 = obj2;
        this.f1019Z = z10;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [Hi.a, Hi.b] */
    @Override // wf.k
    public final Object invoke(Object obj) {
        Sc.f fVar;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f1018Y;
        boolean z10 = this.f1019Z;
        Object obj2 = this.f1021i0;
        Object obj3 = this.f1020h0;
        switch (i10) {
            case 0:
                B0.u uVar = (B0.u) obj;
                C0.e.a((C0.d) obj3, uVar);
                if (!r9.y.Y(uVar)) {
                    long Q02 = r9.y.Q0(uVar, false);
                    uVar.a();
                    Pg.D d10 = (Pg.D) obj2;
                    if (z10) {
                        Q02 = C5251c.i(-1.0f, Q02);
                    }
                    d10.t(new C0114c0(Q02));
                }
                return yVar;
            case 1:
            case 2:
            default:
                Hi.c cVar = (Hi.c) obj;
                AbstractC3557B.c0("appStart", cVar);
                SystemClock.uptimeMillis();
                ((Activity) obj3).getIntent();
                String str = (String) obj2;
                AbstractC3557B.b0("activityClassName", str);
                return Hi.c.a(cVar, null, null, null, null, null, new Hi.b(str), null, null, null, null, null, null, null, null, -2097153);
            case 3:
                return new C1550f3(z10, (Z0.b) obj3, (EnumC1555g3) obj, (wf.k) obj2, false);
            case 4:
                Z.N n10 = (Z.N) obj;
                C5562l c5562l = (C5562l) obj3;
                t3.k kVar = new t3.k(c5562l, (List) obj2, z10);
                c5562l.f45312m0.a(kVar);
                return new C6678S(c5562l, 8, kVar);
            case 5:
                AbstractC3557B.c0("it", (Sc.c) obj);
                Sc.w wVar = (Sc.w) obj2;
                ((C6158c) obj3).getClass();
                List list = wVar.f16561b;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (((Sc.n) obj4).f16533a == EnumC6212z.f48476h0) {
                        arrayList.add(obj4);
                    }
                }
                Sc.n nVar = (Sc.n) kf.t.h2(arrayList);
                Sc.f fVar2 = null;
                if (nVar != null) {
                    Sc.j jVar = new Sc.j(EnumC6212z.f48476h0, "Alpha", Sc.v.f16556Z, nVar.f16534b);
                    fVar = new Sc.f(jVar, arrayList, nVar, C6158c.a(arrayList, jVar));
                } else {
                    fVar = null;
                }
                ArrayList arrayList2 = new ArrayList();
                List list2 = wVar.f16561b;
                for (Object obj5 : list2) {
                    if (((Sc.n) obj5).f16533a == EnumC6212z.f48477i0) {
                        arrayList2.add(obj5);
                    }
                }
                Sc.n nVar2 = (Sc.n) kf.t.h2(arrayList2);
                if (nVar2 != null) {
                    Sc.j jVar2 = new Sc.j(EnumC6212z.f48477i0, "Experimental", Sc.v.f16556Z, nVar2.f16534b);
                    fVar2 = new Sc.f(jVar2, arrayList2, nVar2, C6158c.a(arrayList2, jVar2));
                }
                List<Sc.j> list3 = wVar.f16560a;
                ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(list3, 10));
                for (Sc.j jVar3 : list3) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj6 : list2) {
                        if (((Sc.n) obj6).f16533a == jVar3.f16521a) {
                            arrayList4.add(obj6);
                        }
                    }
                    arrayList3.add(new Sc.f(jVar3, arrayList4, wVar.a(jVar3), C6158c.a(arrayList4, jVar3)));
                }
                if (z10) {
                    arrayList3 = kf.t.x2(fVar2, kf.t.x2(fVar, arrayList3));
                }
                return new Sc.c(kf.t.d2(arrayList3), wVar.a(wVar.b()));
            case 6:
                AbstractC3557B.c0("$this$navigate", (C5549L) obj);
                if (z10) {
                    C1422g c1422g = C1422g.f17674i;
                    String str2 = (String) obj3;
                    AbstractC3557B.c0("route", str2);
                    if (Lg.n.I2(str2, "conversation?", false)) {
                        C5545H c5545h = (C5545H) obj2;
                        String str3 = C1422g.f17676k;
                        c5545h.getClass();
                        AbstractC3557B.c0("route", str3);
                        if (c5545h.r(str3, true, false)) {
                            c5545h.c();
                        }
                    }
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(C5562l c5562l, List list, boolean z10) {
        super(1);
        this.f1018Y = 4;
        this.f1020h0 = c5562l;
        this.f1019Z = z10;
        this.f1021i0 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A0(boolean z10, Object obj, Object obj2, int i10) {
        super(1);
        this.f1018Y = i10;
        this.f1019Z = z10;
        this.f1020h0 = obj;
        this.f1021i0 = obj2;
    }
}
