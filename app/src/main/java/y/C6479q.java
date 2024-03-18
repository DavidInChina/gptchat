package y;

import G.C0548c;
import G.C0550e;
import w.C6072s;

/* renamed from: y.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6479q extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50273Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f50274Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f50275h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f50276i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f50277j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6479q(int i10, int i11, C6072s c6072s, G.e0 e0Var) {
        super(1);
        this.f50274Z = i10;
        this.f50275h0 = i11;
        this.f50276i0 = c6072s;
        this.f50277j0 = e0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
        if (r5 == null) goto L9;
     */
    @Override // wf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        E0.d0[] d0VarArr;
        Object obj2;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f50273Y;
        Object obj3 = this.f50277j0;
        Object obj4 = this.f50276i0;
        int i11 = this.f50275h0;
        int i12 = this.f50274Z;
        switch (i10) {
            case 0:
                E0.c0 c0Var = (E0.c0) obj;
                r rVar = (r) obj3;
                for (E0.d0 d0Var : (E0.d0[]) obj4) {
                    if (d0Var != null) {
                        long a5 = rVar.f50280a.f50079b.a(Ng.H.c(d0Var.f4053Y, d0Var.f4054Z), Ng.H.c(i12, i11), Z0.l.f22805Y);
                        int i13 = Z0.i.f22798c;
                        E0.c0.d(c0Var, d0Var, (int) (a5 >> 32), (int) (a5 & 4294967295L));
                    }
                }
                return yVar;
            default:
                C0550e c0550e = (C0550e) obj;
                wf.k key = ((G.B) c0550e.f5498c).getKey();
                int i14 = c0550e.f5496a;
                int max = Math.max(i12, i14);
                int min = Math.min(i11, (c0550e.f5497b + i14) - 1);
                if (max <= min) {
                    while (true) {
                        if (key != null) {
                            obj2 = key.invoke(Integer.valueOf(max - i14));
                            break;
                        }
                        obj2 = new C0548c(max);
                        C6072s c6072s = (C6072s) obj4;
                        int c10 = c6072s.c(obj2);
                        if (c10 < 0) {
                            c10 = ~c10;
                        }
                        c6072s.f47626b[c10] = obj2;
                        c6072s.f47627c[c10] = max;
                        G.e0 e0Var = (G.e0) obj3;
                        e0Var.f5500b[max - e0Var.f5501c] = obj2;
                        if (max != min) {
                            max++;
                        }
                    }
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6479q(E0.d0[] d0VarArr, r rVar, int i10, int i11) {
        super(1);
        this.f50276i0 = d0VarArr;
        this.f50277j0 = rVar;
        this.f50274Z = i10;
        this.f50275h0 = i11;
    }
}
