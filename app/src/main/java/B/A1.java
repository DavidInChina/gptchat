package B;

import Z.C1724m0;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import q0.C5251c;

/* loaded from: classes.dex */
public final class A1 {

    /* renamed from: a  reason: collision with root package name */
    public AbstractC0168u1 f1022a;

    /* renamed from: b  reason: collision with root package name */
    public W0 f1023b;

    /* renamed from: c  reason: collision with root package name */
    public A.L0 f1024c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1025d;

    /* renamed from: e  reason: collision with root package name */
    public L0 f1026e;

    /* renamed from: f  reason: collision with root package name */
    public A0.d f1027f;

    /* renamed from: g  reason: collision with root package name */
    public final C1724m0 f1028g = AbstractC4828h.Z(Boolean.FALSE, Z.o1.f22665a);

    public A1(AbstractC0168u1 abstractC0168u1, W0 w02, A.L0 l02, boolean z10, L0 l03, A0.d dVar) {
        this.f1022a = abstractC0168u1;
        this.f1023b = w02;
        this.f1024c = l02;
        this.f1025d = z10;
        this.f1026e = l03;
        this.f1027f = dVar;
    }

    public final long a(AbstractC0130h1 abstractC0130h1, long j6, int i10) {
        A.a1 a1Var = new A.a1(this, i10, abstractC0130h1, 1);
        A.L0 l02 = this.f1024c;
        if (Ad.l.k0(i10, 4)) {
            return ((C5251c) a1Var.invoke(new C5251c(j6))).f43623a;
        }
        if (l02 != null && (this.f1022a.d() || this.f1022a.b())) {
            return l02.a(j6, i10, a1Var);
        }
        return ((C5251c) a1Var.invoke(new C5251c(j6))).f43623a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Type inference failed for: r14v3, types: [kotlin.jvm.internal.A, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j6, AbstractC4825e abstractC4825e) {
        C0171v1 c0171v1;
        int i10;
        kotlin.jvm.internal.A a5;
        if (abstractC4825e instanceof C0171v1) {
            c0171v1 = (C0171v1) abstractC4825e;
            int i11 = c0171v1.f1541i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0171v1.f1541i0 = i11 - Integer.MIN_VALUE;
                Object obj = c0171v1.f1539Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0171v1.f1541i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        a5 = c0171v1.f1538Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    ?? obj2 = new Object();
                    obj2.f37621Y = j6;
                    AbstractC0168u1 abstractC0168u1 = this.f1022a;
                    C0177x1 c0177x1 = new C0177x1(this, obj2, j6, null);
                    c0171v1.f1538Y = obj2;
                    c0171v1.f1541i0 = 1;
                    if (abstractC0168u1.c(A.B0.f14Y, c0177x1, c0171v1) == enumC5000a) {
                        return enumC5000a;
                    }
                    a5 = obj2;
                }
                return new Z0.p(a5.f37621Y);
            }
        }
        c0171v1 = new C0171v1(this, abstractC4825e);
        Object obj3 = c0171v1.f1539Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0171v1.f1541i0;
        if (i10 == 0) {
        }
        return new Z0.p(a5.f37621Y);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(long j6, AbstractC4825e abstractC4825e) {
        C0180y1 c0180y1;
        int i10;
        A1 a12;
        long j10;
        if (abstractC4825e instanceof C0180y1) {
            c0180y1 = (C0180y1) abstractC4825e;
            int i11 = c0180y1.f1567i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0180y1.f1567i0 = i11 - Integer.MIN_VALUE;
                Object obj = c0180y1.f1565Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0180y1.f1567i0;
                if (i10 == 0) {
                    if (i10 != 1 && i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a12 = c0180y1.f1564Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    this.f1028g.setValue(Boolean.TRUE);
                    if (this.f1023b == W0.f1214Z) {
                        j10 = Z0.p.a(j6, 0.0f, 0.0f, 1);
                    } else {
                        j10 = Z0.p.a(j6, 0.0f, 0.0f, 2);
                    }
                    C0183z1 c0183z1 = new C0183z1(this, null);
                    A.L0 l02 = this.f1024c;
                    if (l02 != null && (this.f1022a.d() || this.f1022a.b())) {
                        c0180y1.f1564Y = this;
                        c0180y1.f1567i0 = 1;
                        if (l02.d(j10, c0183z1, c0180y1) == enumC5000a) {
                            return enumC5000a;
                        }
                    } else {
                        Z0.p pVar = new Z0.p(j10);
                        c0180y1.f1564Y = this;
                        c0180y1.f1567i0 = 2;
                        if (c0183z1.invoke(pVar, c0180y1) == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    a12 = this;
                }
                a12.f1028g.setValue(Boolean.FALSE);
                return jf.y.f36177a;
            }
        }
        c0180y1 = new C0180y1(this, abstractC4825e);
        Object obj2 = c0180y1.f1565Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0180y1.f1567i0;
        if (i10 == 0) {
        }
        a12.f1028g.setValue(Boolean.FALSE);
        return jf.y.f36177a;
    }

    public final long d(float f6) {
        if (f6 == 0.0f) {
            int i10 = C5251c.f43622e;
            return C5251c.f43619b;
        } else if (this.f1023b == W0.f1214Z) {
            return R4.b.r(f6, 0.0f);
        } else {
            return R4.b.r(0.0f, f6);
        }
    }
}
