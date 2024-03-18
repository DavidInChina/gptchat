package Qg;

import Ng.AbstractC1073l0;
import Ng.C1066i;
import Ng.C1071k0;
import Ng.C1072l;
import Pg.EnumC1170c;
import Rg.AbstractC1281b;
import Rg.AbstractC1282c;
import Rg.AbstractC1283d;
import id.AbstractC3557B;
import java.util.Arrays;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import of.EnumC5000a;
import q1.AbstractC5260f;

/* loaded from: classes2.dex */
public class r0 extends AbstractC1281b implements k0, AbstractC1206i, Rg.y {

    /* renamed from: j0  reason: collision with root package name */
    public final int f14906j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f14907k0;

    /* renamed from: l0  reason: collision with root package name */
    public final EnumC1170c f14908l0;

    /* renamed from: m0  reason: collision with root package name */
    public Object[] f14909m0;

    /* renamed from: n0  reason: collision with root package name */
    public long f14910n0;

    /* renamed from: o0  reason: collision with root package name */
    public long f14911o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f14912p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f14913q0;

    public r0(int i10, int i11, EnumC1170c enumC1170c) {
        this.f14906j0 = i10;
        this.f14907k0 = i11;
        this.f14908l0 = enumC1170c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:21:0x004b, B:30:0x0079, B:32:0x0081, B:36:0x0094, B:39:0x009b, B:40:0x009f, B:41:0x00a0), top: B:50:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0, types: [Rg.b] */
    /* JADX WARN: Type inference failed for: r9v0, types: [Qg.j] */
    /* JADX WARN: Type inference failed for: r9v1, types: [Rg.d] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [Qg.t0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00ae -> B:16:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void n(r0 r0Var, AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        q0 q0Var;
        EnumC5000a enumC5000a;
        int i10;
        Throwable th2;
        r0 r0Var2;
        AbstractC1073l0 abstractC1073l0;
        AbstractC1207j abstractC1207j2;
        Object v10;
        AbstractC1207j abstractC1207j3;
        AbstractC1073l0 abstractC1073l02;
        t0 t0Var;
        try {
            try {
                if (abstractC4825e instanceof q0) {
                    q0Var = (q0) abstractC4825e;
                    int i11 = q0Var.f14903l0;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        q0Var.f14903l0 = i11 - Integer.MIN_VALUE;
                        Object obj = q0Var.f14901j0;
                        enumC5000a = EnumC5000a.f41328Y;
                        i10 = q0Var.f14903l0;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 == 3) {
                                        abstractC1073l0 = q0Var.f14900i0;
                                        t0 t0Var2 = q0Var.f14899h0;
                                        abstractC1207j2 = q0Var.f14898Z;
                                        r0 r0Var3 = q0Var.f14897Y;
                                        com.google.android.gms.internal.play_billing.N.B0(obj);
                                        r0 r0Var4 = r0Var3;
                                        t0 t0Var3 = t0Var2;
                                        abstractC1207j3 = abstractC1207j2;
                                        abstractC1073l02 = abstractC1073l0;
                                        r0Var = r0Var4;
                                        t0Var = t0Var3;
                                        r0Var2 = r0Var;
                                        abstractC1073l0 = abstractC1073l02;
                                        abstractC1207j2 = abstractC1207j3;
                                        abstractC1207j = t0Var;
                                        do {
                                            v10 = r0Var2.v(abstractC1207j);
                                            if (v10 == s0.f14917a) {
                                                if (abstractC1073l0 != null && !abstractC1073l0.a()) {
                                                    throw abstractC1073l0.P();
                                                }
                                                q0Var.f14897Y = r0Var2;
                                                q0Var.f14898Z = abstractC1207j2;
                                                q0Var.f14899h0 = abstractC1207j;
                                                q0Var.f14900i0 = abstractC1073l0;
                                                q0Var.f14903l0 = 3;
                                                r0Var4 = r0Var2;
                                                t0Var3 = abstractC1207j;
                                                if (abstractC1207j2.c(v10, q0Var) == enumC5000a) {
                                                    return;
                                                }
                                                abstractC1207j3 = abstractC1207j2;
                                                abstractC1073l02 = abstractC1073l0;
                                                r0Var = r0Var4;
                                                t0Var = t0Var3;
                                                r0Var2 = r0Var;
                                                abstractC1073l0 = abstractC1073l02;
                                                abstractC1207j2 = abstractC1207j3;
                                                abstractC1207j = t0Var;
                                                v10 = r0Var2.v(abstractC1207j);
                                                if (v10 == s0.f14917a) {
                                                    q0Var.f14897Y = r0Var2;
                                                    q0Var.f14898Z = abstractC1207j2;
                                                    q0Var.f14899h0 = abstractC1207j;
                                                    q0Var.f14900i0 = abstractC1073l0;
                                                    q0Var.f14903l0 = 2;
                                                }
                                            }
                                        } while (r0Var2.l(abstractC1207j, q0Var) != enumC5000a);
                                        return;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                abstractC1073l0 = q0Var.f14900i0;
                                t0 t0Var4 = q0Var.f14899h0;
                                abstractC1207j2 = q0Var.f14898Z;
                                r0 r0Var5 = q0Var.f14897Y;
                                com.google.android.gms.internal.play_billing.N.B0(obj);
                                r0Var2 = r0Var5;
                                abstractC1207j = t0Var4;
                                do {
                                    v10 = r0Var2.v(abstractC1207j);
                                    if (v10 == s0.f14917a) {
                                    }
                                } while (r0Var2.l(abstractC1207j, q0Var) != enumC5000a);
                                return;
                            }
                            abstractC1207j = q0Var.f14899h0;
                            AbstractC1207j abstractC1207j4 = q0Var.f14898Z;
                            r0 r0Var6 = q0Var.f14897Y;
                            try {
                                com.google.android.gms.internal.play_billing.N.B0(obj);
                                abstractC1207j3 = abstractC1207j4;
                                r0Var = r0Var6;
                            } catch (Throwable th3) {
                                th2 = th3;
                                r0Var2 = r0Var6;
                                r0Var2.k(abstractC1207j);
                                throw th2;
                            }
                        } else {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            abstractC1207j3 = abstractC1207j;
                            abstractC1207j = (t0) r0Var.d();
                        }
                        abstractC1073l02 = (AbstractC1073l0) q0Var.getContext().get(C1071k0.f12951Y);
                        t0Var = abstractC1207j;
                        r0Var2 = r0Var;
                        abstractC1073l0 = abstractC1073l02;
                        abstractC1207j2 = abstractC1207j3;
                        abstractC1207j = t0Var;
                        do {
                            v10 = r0Var2.v(abstractC1207j);
                            if (v10 == s0.f14917a) {
                            }
                        } while (r0Var2.l(abstractC1207j, q0Var) != enumC5000a);
                        return;
                    }
                }
                abstractC1073l02 = (AbstractC1073l0) q0Var.getContext().get(C1071k0.f12951Y);
                t0Var = abstractC1207j;
                r0Var2 = r0Var;
                abstractC1073l0 = abstractC1073l02;
                abstractC1207j2 = abstractC1207j3;
                abstractC1207j = t0Var;
                do {
                    v10 = r0Var2.v(abstractC1207j);
                    if (v10 == s0.f14917a) {
                    }
                } while (r0Var2.l(abstractC1207j, q0Var) != enumC5000a);
                return;
            } catch (Throwable th4) {
                r0Var2 = r0Var;
                th2 = th4;
                r0Var2.k(abstractC1207j);
                throw th2;
            }
            if (i10 == 0) {
            }
        } catch (Throwable th5) {
            th2 = th5;
        }
        q0Var = new q0(r0Var, abstractC4825e);
        Object obj2 = q0Var.f14901j0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = q0Var.f14903l0;
    }

    @Override // Rg.y
    public final AbstractC1206i a(AbstractC4831k abstractC4831k, int i10, EnumC1170c enumC1170c) {
        return s0.f(this, abstractC4831k, i10, enumC1170c);
    }

    @Override // Qg.AbstractC1206i
    public final Object b(AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        n(this, abstractC1207j, abstractC4825e);
        return EnumC5000a.f41328Y;
    }

    @Override // Qg.k0, Qg.AbstractC1207j
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        AbstractC4825e[] abstractC4825eArr;
        p0 p0Var;
        if (g(obj)) {
            return jf.y.f36177a;
        }
        C1072l c1072l = new C1072l(1, AbstractC5260f.z(abstractC4825e));
        c1072l.u();
        AbstractC4825e[] abstractC4825eArr2 = AbstractC1282c.f15529a;
        synchronized (this) {
            try {
                if (t(obj)) {
                    c1072l.resumeWith(jf.y.f36177a);
                    abstractC4825eArr = q(abstractC4825eArr2);
                    p0Var = null;
                } else {
                    p0 p0Var2 = new p0(this, this.f14912p0 + this.f14913q0 + r(), obj, c1072l);
                    p(p0Var2);
                    this.f14913q0++;
                    if (this.f14907k0 == 0) {
                        abstractC4825eArr2 = q(abstractC4825eArr2);
                    }
                    abstractC4825eArr = abstractC4825eArr2;
                    p0Var = p0Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (p0Var != null) {
            c1072l.w(new C1066i(1, p0Var));
        }
        for (AbstractC4825e abstractC4825e2 : abstractC4825eArr) {
            if (abstractC4825e2 != null) {
                abstractC4825e2.resumeWith(jf.y.f36177a);
            }
        }
        Object t10 = c1072l.t();
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        if (t10 == enumC5000a) {
            com.google.android.gms.internal.play_billing.N.k0(abstractC4825e);
        }
        if (t10 != enumC5000a) {
            t10 = jf.y.f36177a;
        }
        if (t10 != enumC5000a) {
            return jf.y.f36177a;
        }
        return t10;
    }

    @Override // Qg.k0
    public final void f() {
        synchronized (this) {
            w(r() + this.f14912p0, this.f14911o0, r() + this.f14912p0, r() + this.f14912p0 + this.f14913q0);
        }
    }

    @Override // Qg.k0
    public final boolean g(Object obj) {
        int i10;
        boolean z10;
        AbstractC4825e[] abstractC4825eArr = AbstractC1282c.f15529a;
        synchronized (this) {
            if (t(obj)) {
                abstractC4825eArr = q(abstractC4825eArr);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (AbstractC4825e abstractC4825e : abstractC4825eArr) {
            if (abstractC4825e != null) {
                abstractC4825e.resumeWith(jf.y.f36177a);
            }
        }
        return z10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Qg.t0, java.lang.Object, Rg.d] */
    @Override // Rg.AbstractC1281b
    public final AbstractC1283d h() {
        ?? obj = new Object();
        obj.f14923a = -1L;
        return obj;
    }

    @Override // Rg.AbstractC1281b
    public final AbstractC1283d[] j() {
        return new t0[2];
    }

    public final Object l(t0 t0Var, q0 q0Var) {
        C1072l c1072l = new C1072l(1, AbstractC5260f.z(q0Var));
        c1072l.u();
        synchronized (this) {
            if (u(t0Var) < 0) {
                t0Var.f14924b = c1072l;
            } else {
                c1072l.resumeWith(jf.y.f36177a);
            }
        }
        Object t10 = c1072l.t();
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        if (t10 == enumC5000a) {
            com.google.android.gms.internal.play_billing.N.k0(q0Var);
        }
        if (t10 == enumC5000a) {
            return t10;
        }
        return jf.y.f36177a;
    }

    public final void m() {
        if (this.f14907k0 == 0 && this.f14913q0 <= 1) {
            return;
        }
        Object[] objArr = this.f14909m0;
        AbstractC3557B.Z(objArr);
        while (this.f14913q0 > 0) {
            long r10 = r();
            int i10 = this.f14912p0;
            int i11 = this.f14913q0;
            if (objArr[((int) ((r10 + (i10 + i11)) - 1)) & (objArr.length - 1)] == s0.f14917a) {
                this.f14913q0 = i11 - 1;
                s0.d(objArr, r() + this.f14912p0 + this.f14913q0, null);
            } else {
                return;
            }
        }
    }

    public final void o() {
        AbstractC1283d[] abstractC1283dArr;
        Object[] objArr = this.f14909m0;
        AbstractC3557B.Z(objArr);
        s0.d(objArr, r(), null);
        this.f14912p0--;
        long r10 = r() + 1;
        if (this.f14910n0 < r10) {
            this.f14910n0 = r10;
        }
        if (this.f14911o0 < r10) {
            if (this.f15526Z != 0 && (abstractC1283dArr = this.f15525Y) != null) {
                for (AbstractC1283d abstractC1283d : abstractC1283dArr) {
                    if (abstractC1283d != null) {
                        t0 t0Var = (t0) abstractC1283d;
                        long j6 = t0Var.f14923a;
                        if (j6 >= 0 && j6 < r10) {
                            t0Var.f14923a = r10;
                        }
                    }
                }
            }
            this.f14911o0 = r10;
        }
    }

    public final void p(Object obj) {
        int i10 = this.f14912p0 + this.f14913q0;
        Object[] objArr = this.f14909m0;
        if (objArr == null) {
            objArr = s(0, 2, null);
        } else if (i10 >= objArr.length) {
            objArr = s(i10, objArr.length * 2, objArr);
        }
        s0.d(objArr, r() + i10, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final AbstractC4825e[] q(AbstractC4825e[] abstractC4825eArr) {
        AbstractC1283d[] abstractC1283dArr;
        t0 t0Var;
        C1072l c1072l;
        int length = abstractC4825eArr.length;
        if (this.f15526Z != 0 && (abstractC1283dArr = this.f15525Y) != null) {
            int length2 = abstractC1283dArr.length;
            int i10 = 0;
            abstractC4825eArr = abstractC4825eArr;
            while (i10 < length2) {
                AbstractC1283d abstractC1283d = abstractC1283dArr[i10];
                if (abstractC1283d != null && (c1072l = (t0Var = (t0) abstractC1283d).f14924b) != null && u(t0Var) >= 0) {
                    int length3 = abstractC4825eArr.length;
                    abstractC4825eArr = abstractC4825eArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(abstractC4825eArr, Math.max(2, abstractC4825eArr.length * 2));
                        AbstractC3557B.b0("copyOf(...)", copyOf);
                        abstractC4825eArr = copyOf;
                    }
                    abstractC4825eArr[length] = c1072l;
                    t0Var.f14924b = null;
                    length++;
                }
                i10++;
                abstractC4825eArr = abstractC4825eArr;
            }
        }
        return abstractC4825eArr;
    }

    public final long r() {
        return Math.min(this.f14911o0, this.f14910n0);
    }

    public final Object[] s(int i10, int i11, Object[] objArr) {
        if (i11 > 0) {
            Object[] objArr2 = new Object[i11];
            this.f14909m0 = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long r10 = r();
            for (int i12 = 0; i12 < i10; i12++) {
                long j6 = i12 + r10;
                s0.d(objArr2, j6, objArr[((int) j6) & (objArr.length - 1)]);
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean t(Object obj) {
        int i10 = this.f15526Z;
        int i11 = this.f14906j0;
        if (i10 == 0) {
            if (i11 != 0) {
                p(obj);
                int i12 = this.f14912p0 + 1;
                this.f14912p0 = i12;
                if (i12 > i11) {
                    o();
                }
                this.f14911o0 = r() + this.f14912p0;
            }
            return true;
        }
        int i13 = this.f14912p0;
        int i14 = this.f14907k0;
        if (i13 >= i14 && this.f14911o0 <= this.f14910n0) {
            int ordinal = this.f14908l0.ordinal();
            if (ordinal != 0) {
                if (ordinal == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        p(obj);
        int i15 = this.f14912p0 + 1;
        this.f14912p0 = i15;
        if (i15 > i14) {
            o();
        }
        long r10 = r() + this.f14912p0;
        long j6 = this.f14910n0;
        if (((int) (r10 - j6)) > i11) {
            w(j6 + 1, this.f14911o0, r() + this.f14912p0, r() + this.f14912p0 + this.f14913q0);
        }
        return true;
    }

    public final long u(t0 t0Var) {
        long j6 = t0Var.f14923a;
        if (j6 < r() + this.f14912p0) {
            return j6;
        }
        if (this.f14907k0 > 0 || j6 > r() || this.f14913q0 == 0) {
            return -1L;
        }
        return j6;
    }

    public final Object v(t0 t0Var) {
        Object obj;
        AbstractC4825e[] abstractC4825eArr = AbstractC1282c.f15529a;
        synchronized (this) {
            long u10 = u(t0Var);
            if (u10 < 0) {
                obj = s0.f14917a;
            } else {
                long j6 = t0Var.f14923a;
                Object[] objArr = this.f14909m0;
                AbstractC3557B.Z(objArr);
                Object obj2 = objArr[((int) u10) & (objArr.length - 1)];
                if (obj2 instanceof p0) {
                    obj2 = ((p0) obj2).f14892h0;
                }
                t0Var.f14923a = u10 + 1;
                Object obj3 = obj2;
                abstractC4825eArr = x(j6);
                obj = obj3;
            }
        }
        for (AbstractC4825e abstractC4825e : abstractC4825eArr) {
            if (abstractC4825e != null) {
                abstractC4825e.resumeWith(jf.y.f36177a);
            }
        }
        return obj;
    }

    public final void w(long j6, long j10, long j11, long j12) {
        long min = Math.min(j10, j6);
        for (long r10 = r(); r10 < min; r10++) {
            Object[] objArr = this.f14909m0;
            AbstractC3557B.Z(objArr);
            s0.d(objArr, r10, null);
        }
        this.f14910n0 = j6;
        this.f14911o0 = j10;
        this.f14912p0 = (int) (j11 - min);
        this.f14913q0 = (int) (j12 - j11);
    }

    public final AbstractC4825e[] x(long j6) {
        int i10;
        long j10;
        long j11;
        AbstractC4825e[] abstractC4825eArr;
        long j12;
        boolean z10;
        long j13;
        AbstractC1283d[] abstractC1283dArr;
        int i11 = (j6 > this.f14911o0 ? 1 : (j6 == this.f14911o0 ? 0 : -1));
        AbstractC4825e[] abstractC4825eArr2 = AbstractC1282c.f15529a;
        if (i11 > 0) {
            return abstractC4825eArr2;
        }
        long r10 = r();
        long j14 = this.f14912p0 + r10;
        int i12 = this.f14907k0;
        if (i12 == 0 && this.f14913q0 > 0) {
            j14++;
        }
        if (this.f15526Z != 0 && (abstractC1283dArr = this.f15525Y) != null) {
            for (AbstractC1283d abstractC1283d : abstractC1283dArr) {
                if (abstractC1283d != null) {
                    long j15 = ((t0) abstractC1283d).f14923a;
                    if (j15 >= 0 && j15 < j14) {
                        j14 = j15;
                    }
                }
            }
        }
        if (j14 <= this.f14911o0) {
            return abstractC4825eArr2;
        }
        long r11 = r() + this.f14912p0;
        if (this.f15526Z > 0) {
            i10 = Math.min(this.f14913q0, i12 - ((int) (r11 - j14)));
        } else {
            i10 = this.f14913q0;
        }
        long j16 = this.f14913q0 + r11;
        Q1.u uVar = s0.f14917a;
        if (i10 > 0) {
            AbstractC4825e[] abstractC4825eArr3 = new AbstractC4825e[i10];
            Object[] objArr = this.f14909m0;
            AbstractC3557B.Z(objArr);
            long j17 = r11;
            int i13 = 0;
            while (true) {
                if (r11 < j16) {
                    j11 = j14;
                    Object obj = objArr[((int) r11) & (objArr.length - 1)];
                    if (obj != uVar) {
                        AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter", obj);
                        p0 p0Var = (p0) obj;
                        int i14 = i13 + 1;
                        j10 = j16;
                        abstractC4825eArr3[i13] = p0Var.f14893i0;
                        s0.d(objArr, r11, uVar);
                        s0.d(objArr, j17, p0Var.f14892h0);
                        j13 = 1;
                        j17++;
                        if (i14 >= i10) {
                            break;
                        }
                        i13 = i14;
                    } else {
                        j10 = j16;
                        j13 = 1;
                    }
                    r11 += j13;
                    j14 = j11;
                    j16 = j10;
                } else {
                    j11 = j14;
                    j10 = j16;
                    break;
                }
            }
            abstractC4825eArr = abstractC4825eArr3;
            r11 = j17;
        } else {
            j11 = j14;
            j10 = j16;
            abstractC4825eArr = abstractC4825eArr2;
        }
        int i15 = (int) (r11 - r10);
        if (this.f15526Z == 0) {
            j12 = r11;
        } else {
            j12 = j11;
        }
        long max = Math.max(this.f14910n0, r11 - Math.min(this.f14906j0, i15));
        if (i12 == 0 && max < j10) {
            Object[] objArr2 = this.f14909m0;
            AbstractC3557B.Z(objArr2);
            if (AbstractC3557B.K(objArr2[((int) max) & (objArr2.length - 1)], uVar)) {
                r11++;
                max++;
            }
        }
        w(max, j12, r11, j10);
        m();
        if (abstractC4825eArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return q(abstractC4825eArr);
        }
        return abstractC4825eArr;
    }
}
