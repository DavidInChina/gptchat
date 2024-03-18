package Rh;

import java.util.ArrayList;
import java.util.HashMap;
import th.C5784P;

/* loaded from: classes.dex */
public final class e1 extends io.sentry.vendor.b {

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC1315n f15835d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC1324s f15836e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ i1 f15837f;

    public e1(i1 i1Var, String str, ArrayList arrayList, C1319p c1319p) {
        this(i1Var, new C1307j(str, arrayList), c1319p);
    }

    @Override // io.sentry.vendor.b
    public final void b(String str, Object obj) {
        String str2;
        boolean z10 = obj instanceof Nh.r;
        AbstractC1315n abstractC1315n = this.f15835d;
        if (z10) {
            Nh.r rVar = (Nh.r) obj;
            j1 j1Var = this.f15837f.f15910y;
            if (rVar.s() == 9) {
                str2 = rVar.j().replace('/', '.');
            } else {
                str2 = rVar.f();
            }
            abstractC1315n.h(str, new C0(j1Var, str2));
            return;
        }
        abstractC1315n.h(str, C5784P.e(obj));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Rh.n, java.lang.Object, U3.i] */
    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b c(String str, String str2) {
        ?? obj = new Object();
        obj.f17417i0 = this;
        obj.f17414Y = str2;
        obj.f17415Z = str;
        obj.f17416h0 = new HashMap();
        i1 i1Var = this.f15837f;
        return new e1(i1Var, obj, new C1319p(i1Var.f15910y, str2));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Rh.n, U3.n, java.lang.Object] */
    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b e(String str) {
        AbstractC1291b b10 = this.f15836e.b(str);
        ?? obj = new Object();
        obj.f17429i0 = this;
        obj.f17426Y = str;
        obj.f17427Z = b10;
        obj.f17428h0 = new ArrayList();
        return new e1(this.f15837f, obj, r.f15939Y);
    }

    @Override // io.sentry.vendor.b
    public final void g() {
        this.f15835d.c();
    }

    @Override // io.sentry.vendor.b
    public final void h(String str, String str2, String str3) {
        this.f15835d.h(str, new D0(this.f15837f.f15910y, str2.substring(1, str2.length() - 1).replace('/', '.'), str3));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(i1 i1Var, AbstractC1315n abstractC1315n, AbstractC1324s abstractC1324s) {
        super(Sh.I.f16703b, 1);
        this.f15837f = i1Var;
        this.f15835d = abstractC1315n;
        this.f15836e = abstractC1324s;
    }
}
