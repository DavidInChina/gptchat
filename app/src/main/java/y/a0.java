package y;

import id.AbstractC3557B;
import l0.AbstractC4313e;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50176Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ c0 f50177Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f50178h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(c0 c0Var, long j6, int i10) {
        super(1);
        this.f50176Y = i10;
        this.f50177Z = c0Var;
        this.f50178h0 = j6;
    }

    public final long a(V v10) {
        long j6;
        long j10;
        wf.k kVar;
        wf.k kVar2;
        int i10 = this.f50176Y;
        c0 c0Var = this.f50177Z;
        switch (i10) {
            case 1:
                if (c0Var.f50184A0 == null) {
                    return Z0.i.f22797b;
                }
                if (c0Var.A0() == null) {
                    return Z0.i.f22797b;
                }
                if (AbstractC3557B.K(c0Var.f50184A0, c0Var.A0())) {
                    return Z0.i.f22797b;
                }
                int ordinal = v10.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            N n10 = c0Var.f50192x0.f50201a.f50302c;
                            if (n10 != null) {
                                long j11 = this.f50178h0;
                                long j12 = ((Z0.k) n10.f50131b.invoke(new Z0.k(j11))).f22804a;
                                AbstractC4313e A02 = c0Var.A0();
                                AbstractC3557B.Z(A02);
                                Z0.l lVar = Z0.l.f22805Y;
                                long a5 = A02.a(j11, j12, lVar);
                                AbstractC4313e abstractC4313e = c0Var.f50184A0;
                                AbstractC3557B.Z(abstractC4313e);
                                long a10 = abstractC4313e.a(j11, j12, lVar);
                                int i11 = Z0.i.f22798c;
                                return kotlin.jvm.internal.m.c(((int) (a5 >> 32)) - ((int) (a10 >> 32)), ((int) (a5 & 4294967295L)) - ((int) (a10 & 4294967295L)));
                            }
                            return Z0.i.f22797b;
                        }
                        throw new RuntimeException();
                    }
                    return Z0.i.f22797b;
                }
                return Z0.i.f22797b;
            default:
                q0 q0Var = c0Var.f50191w0.f50197a.f50301b;
                long j13 = this.f50178h0;
                if (q0Var != null && (kVar2 = q0Var.f50278a) != null) {
                    j6 = ((Z0.i) kVar2.invoke(new Z0.k(j13))).f22799a;
                } else {
                    j6 = Z0.i.f22797b;
                }
                q0 q0Var2 = c0Var.f50192x0.f50201a.f50301b;
                if (q0Var2 != null && (kVar = q0Var2.f50278a) != null) {
                    j10 = ((Z0.i) kVar.invoke(new Z0.k(j13))).f22799a;
                } else {
                    j10 = Z0.i.f22797b;
                }
                int ordinal2 = v10.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            return j10;
                        }
                        throw new RuntimeException();
                    }
                    return Z0.i.f22797b;
                }
                return j6;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        wf.k kVar;
        wf.k kVar2;
        switch (this.f50176Y) {
            case 0:
                c0 c0Var = this.f50177Z;
                c0Var.getClass();
                int ordinal = ((V) obj).ordinal();
                long j6 = this.f50178h0;
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            N n10 = c0Var.f50192x0.f50201a.f50302c;
                            if (n10 != null && (kVar2 = n10.f50131b) != null) {
                                j6 = ((Z0.k) kVar2.invoke(new Z0.k(j6))).f22804a;
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    }
                } else {
                    N n11 = c0Var.f50191w0.f50197a.f50302c;
                    if (n11 != null && (kVar = n11.f50131b) != null) {
                        j6 = ((Z0.k) kVar.invoke(new Z0.k(j6))).f22804a;
                    }
                }
                return new Z0.k(j6);
            case 1:
                return new Z0.i(a((V) obj));
            default:
                return new Z0.i(a((V) obj));
        }
    }
}
