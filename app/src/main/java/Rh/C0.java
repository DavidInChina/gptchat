package Rh;

import th.AbstractC5809q;
import th.C5790W;
import th.C5792Y;
import th.C5811s;

/* loaded from: classes.dex */
public final class C0 extends F0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f15605b;

    /* renamed from: c  reason: collision with root package name */
    public final p1 f15606c;

    /* renamed from: d  reason: collision with root package name */
    public transient /* synthetic */ AbstractC5809q f15607d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f15608e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0(j1 j1Var, K k10) {
        this(j1Var, k10, 0);
        this.f15605b = 0;
    }

    @Override // th.h0
    public final int c() {
        switch (this.f15605b) {
            case 0:
                return 12;
            default:
                return 10;
        }
    }

    @Override // Rh.F0
    public final AbstractC5809q e() {
        int i10 = this.f15605b;
        Object obj = this.f15608e;
        p1 p1Var = this.f15606c;
        AbstractC5809q abstractC5809q = null;
        switch (i10) {
            case 0:
                if (this.f15607d == null) {
                    K k10 = (K) obj;
                    J a5 = K.a(k10, p1Var);
                    if (!a5.b()) {
                        abstractC5809q = new C5790W(k10.b());
                    } else if (!a5.a().d().M0()) {
                        abstractC5809q = new E0(a5.a().d().getName(), 12);
                    } else {
                        abstractC5809q = new C5811s(a5.a());
                    }
                }
                if (abstractC5809q == null) {
                    return this.f15607d;
                }
                this.f15607d = abstractC5809q;
                return abstractC5809q;
            default:
                if (this.f15607d == null) {
                    String str = (String) obj;
                    o1 a10 = p1Var.a(str);
                    if (a10.b()) {
                        abstractC5809q = new C5792Y(a10.a());
                    } else {
                        abstractC5809q = new C5790W(str);
                    }
                }
                if (abstractC5809q == null) {
                    return this.f15607d;
                }
                this.f15607d = abstractC5809q;
                return abstractC5809q;
        }
    }

    public C0(j1 j1Var, Object obj, int i10) {
        this.f15605b = i10;
        this.f15606c = j1Var;
        this.f15608e = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0(j1 j1Var, String str) {
        this(j1Var, str, 1);
        this.f15605b = 1;
    }
}
