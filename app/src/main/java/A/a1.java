package A;

import B.A1;
import B.AbstractC0130h1;
import Z.AbstractC1736t;
import Z.C1741v0;
import Z.C1744x;
import android.content.IntentSender;
import g.AbstractActivityC3122o;
import id.AbstractC3557B;
import j.C3875e;
import l8.C4343a;
import l8.C4347e;
import l8.C4352j;
import q0.C5251c;
import w.C6072s;
import w.C6073t;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class a1 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f165Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f166Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f167h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f168i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(int i10, Object obj, Object obj2, int i11) {
        super(1);
        this.f165Y = i11;
        this.f166Z = i10;
        this.f167h0 = obj;
        this.f168i0 = obj2;
    }

    public final void a(E0.c0 c0Var) {
        int i10;
        int i11;
        int i12 = this.f166Z;
        int i13 = 0;
        int i14 = this.f165Y;
        Object obj = this.f167h0;
        Object obj2 = this.f168i0;
        switch (i14) {
            case 0:
                b1 b1Var = (b1) obj;
                int p10 = com.google.android.gms.internal.play_billing.N.p(b1Var.f174s0.f151a.h(), 0, i12);
                if (b1Var.f175t0) {
                    i10 = p10 - i12;
                } else {
                    i10 = -p10;
                }
                boolean z10 = b1Var.f176u0;
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = i10;
                }
                if (z10) {
                    i13 = i10;
                }
                E0.c0.h(c0Var, (E0.d0) obj2, i11, i13);
                return;
            default:
                AbstractC3557B.c0("$this$layout", c0Var);
                E0.c0.e((E0.d0) obj2, Z0.i.f22797b, 0.0f);
                E0.c0.c((E0.d0) obj, i12, 0, 0.0f);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [k.h, java.lang.Object] */
    @Override // wf.k
    public final Object invoke(Object obj) {
        long j6;
        long j10;
        float f6;
        long j11;
        AbstractC1736t abstractC1736t;
        long[] jArr;
        AbstractC1736t abstractC1736t2;
        long[] jArr2;
        int i10;
        boolean z10;
        Z.J j12;
        jf.y yVar = jf.y.f36177a;
        int i11 = this.f165Y;
        int i12 = 0;
        Object obj2 = this.f168i0;
        Object obj3 = this.f167h0;
        int i13 = this.f166Z;
        switch (i11) {
            case 0:
                a((E0.c0) obj);
                return yVar;
            case 1:
                long j13 = ((C5251c) obj).f43623a;
                A1 a12 = (A1) obj3;
                A0.g d10 = a12.f1027f.d();
                if (d10 != null) {
                    j6 = d10.F(i13, j13);
                } else {
                    j6 = C5251c.f43619b;
                }
                long g10 = C5251c.g(j13, j6);
                B.W0 w02 = a12.f1023b;
                B.W0 w03 = B.W0.f1214Z;
                if (w02 == w03) {
                    j10 = C5251c.a(g10, 1);
                } else {
                    j10 = C5251c.a(g10, 2);
                }
                if (a12.f1025d) {
                    j10 = C5251c.i(-1.0f, j10);
                }
                if (a12.f1023b == w03) {
                    f6 = C5251c.d(j10);
                } else {
                    f6 = C5251c.e(j10);
                }
                long d11 = a12.d(((AbstractC0130h1) obj2).a(f6));
                if (a12.f1025d) {
                    d11 = C5251c.i(-1.0f, d11);
                }
                long g11 = C5251c.g(g10, d11);
                A0.g d12 = a12.f1027f.d();
                if (d12 != null) {
                    j11 = d12.u(d11, this.f166Z, g11);
                } else {
                    j11 = C5251c.f43619b;
                }
                return new C5251c(C5251c.h(C5251c.h(j6, d11), j11));
            case 2:
                AbstractC1736t abstractC1736t3 = (AbstractC1736t) obj;
                C1741v0 c1741v0 = (C1741v0) obj3;
                if (c1741v0.f22740e == i13) {
                    C6072s c6072s = (C6072s) obj2;
                    if (AbstractC3557B.K(c6072s, c1741v0.f22741f) && (abstractC1736t3 instanceof C1744x)) {
                        long[] jArr3 = c6072s.f47625a;
                        int length = jArr3.length - 2;
                        if (length >= 0) {
                            int i14 = 0;
                            while (true) {
                                long j14 = jArr3[i14];
                                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i15 = 8;
                                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                                    while (i12 < i16) {
                                        if ((j14 & 255) < 128) {
                                            int i17 = (i14 << 3) + i12;
                                            Object obj4 = c6072s.f47626b[i17];
                                            if (c6072s.f47627c[i17] != i13) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                jArr2 = jArr3;
                                                C1744x c1744x = (C1744x) abstractC1736t3;
                                                abstractC1736t2 = abstractC1736t3;
                                                c1744x.f22754l0.b(obj4, c1741v0);
                                                if (obj4 instanceof Z.J) {
                                                    j12 = (Z.J) obj4;
                                                } else {
                                                    j12 = null;
                                                }
                                                if (j12 != null) {
                                                    if (!c1744x.f22754l0.f25570a.b(j12)) {
                                                        c1744x.f22756n0.c(j12);
                                                    }
                                                    C6073t c6073t = c1741v0.f22742g;
                                                    if (c6073t != null) {
                                                        c6073t.i(j12);
                                                        if (c6073t.f47635e == 0) {
                                                            c1741v0.f22742g = null;
                                                        }
                                                    }
                                                }
                                            } else {
                                                abstractC1736t2 = abstractC1736t3;
                                                jArr2 = jArr3;
                                            }
                                            if (z10) {
                                                c6072s.g(i17);
                                            }
                                            i10 = 8;
                                        } else {
                                            abstractC1736t2 = abstractC1736t3;
                                            jArr2 = jArr3;
                                            i10 = i15;
                                        }
                                        j14 >>= i10;
                                        i12++;
                                        i15 = i10;
                                        jArr3 = jArr2;
                                        abstractC1736t3 = abstractC1736t2;
                                    }
                                    abstractC1736t = abstractC1736t3;
                                    jArr = jArr3;
                                    if (i16 != i15) {
                                    }
                                } else {
                                    abstractC1736t = abstractC1736t3;
                                    jArr = jArr3;
                                }
                                if (i14 != length) {
                                    i14++;
                                    jArr3 = jArr;
                                    abstractC1736t3 = abstractC1736t;
                                    i12 = 0;
                                }
                            }
                        }
                        if (c6072s.f47629e == 0) {
                            c1741v0.f22741f = null;
                        }
                    }
                }
                return yVar;
            case 3:
                a((E0.c0) obj);
                return yVar;
            case 4:
                C4343a c4343a = (C4343a) obj;
                if (c4343a.f37847a == 2) {
                    Integer num = c4343a.f37848b;
                    if (num == null) {
                        num = 0;
                    }
                    if (num.intValue() >= i13) {
                        byte b10 = (byte) (((byte) (0 | 1)) | 2);
                        if (b10 != 3) {
                            StringBuilder sb2 = new StringBuilder();
                            if ((b10 & 1) == 0) {
                                sb2.append(" appUpdateType");
                            }
                            if ((b10 & 2) == 0) {
                                sb2.append(" allowAssetPackDeletion");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                        } else if (c4343a.a(new C4352j(0, false)) != null) {
                            C3875e l10 = ((AbstractActivityC3122o) obj3).l(new A9.a(19), new Object());
                            C4347e c4347e = (C4347e) obj2;
                            byte b11 = (byte) (((byte) (0 | 1)) | 2);
                            if (b11 != 3) {
                                StringBuilder sb3 = new StringBuilder();
                                if ((b11 & 1) == 0) {
                                    sb3.append(" appUpdateType");
                                }
                                if ((b11 & 2) == 0) {
                                    sb3.append(" allowAssetPackDeletion");
                                }
                                throw new IllegalStateException("Missing required properties:".concat(sb3.toString()));
                            }
                            C4352j c4352j = new C4352j(0, false);
                            c4347e.getClass();
                            if (c4343a.a(c4352j) != null && !c4343a.f37856j) {
                                c4343a.f37856j = true;
                                IntentSender intentSender = c4343a.a(c4352j).getIntentSender();
                                AbstractC3557B.c0("intentSender", intentSender);
                                l10.K(new j.k(intentSender, null, 0, 0));
                            }
                        }
                    }
                }
                return yVar;
            default:
                String str = (String) obj;
                AbstractC3557B.c0("value", str);
                String Z22 = Lg.o.Z2(i13, Kb.q.d(str));
                ((wf.k) obj3).invoke(Z22);
                if (Z22.length() == i13) {
                    ((AbstractC6216a) obj2).mo122invoke();
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(E0.d0 d0Var, E0.d0 d0Var2, int i10) {
        super(1);
        this.f165Y = 3;
        this.f168i0 = d0Var;
        this.f167h0 = d0Var2;
        this.f166Z = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(Object obj, int i10, Object obj2, int i11) {
        super(1);
        this.f165Y = i11;
        this.f167h0 = obj;
        this.f166Z = i10;
        this.f168i0 = obj2;
    }
}
