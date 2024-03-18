package L;

import B.W0;
import T0.C1412g;
import id.AbstractC3557B;
import java.util.List;
import z.C6681V;

/* renamed from: L.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0868q extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C0868q f10264Z = new C0868q(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C0868q f10265h0 = new C0868q(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C0868q f10266i0 = new C0868q(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C0868q f10267j0 = new C0868q(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C0868q f10268k0 = new C0868q(5);

    /* renamed from: l0  reason: collision with root package name */
    public static final C0868q f10269l0 = new C0868q(6);

    /* renamed from: m0  reason: collision with root package name */
    public static final C0868q f10270m0 = new C0868q(7);

    /* renamed from: n0  reason: collision with root package name */
    public static final C0868q f10271n0 = new C0868q(8);

    /* renamed from: o0  reason: collision with root package name */
    public static final C0868q f10272o0 = new C0868q(9);

    /* renamed from: p0  reason: collision with root package name */
    public static final C0868q f10273p0 = new C0868q(10);

    /* renamed from: q0  reason: collision with root package name */
    public static final C0868q f10274q0 = new C0868q(11);

    /* renamed from: r0  reason: collision with root package name */
    public static final C0868q f10275r0 = new C0868q(12);

    /* renamed from: s0  reason: collision with root package name */
    public static final C0868q f10276s0 = new C0868q(13);

    /* renamed from: t0  reason: collision with root package name */
    public static final C0868q f10277t0 = new C0868q(14);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10278Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0868q(int i10) {
        super(1);
        this.f10278Y = i10;
    }

    public final C1412g a(N.q0 q0Var) {
        switch (this.f10278Y) {
            case 7:
                long j6 = q0Var.f12343f;
                int i10 = N0.D.f12484c;
                return new C1412g(((int) (j6 & 4294967295L)) - A7.b.F0((int) (4294967295L & j6), q0Var.f12344g.f12512Y), 0);
            case 8:
                String str = q0Var.f12344g.f12512Y;
                long j10 = q0Var.f12343f;
                int i11 = N0.D.f12484c;
                int E02 = A7.b.E0((int) (j10 & 4294967295L), str);
                if (E02 == -1) {
                    return null;
                }
                return new C1412g(0, E02 - ((int) (4294967295L & q0Var.f12343f)));
            case 9:
                Integer d10 = q0Var.d();
                if (d10 == null) {
                    return null;
                }
                int intValue = d10.intValue();
                long j11 = q0Var.f12343f;
                int i12 = N0.D.f12484c;
                return new C1412g(((int) (4294967295L & j11)) - intValue, 0);
            case 10:
                Integer c10 = q0Var.c();
                if (c10 == null) {
                    return null;
                }
                int intValue2 = c10.intValue();
                long j12 = q0Var.f12343f;
                int i13 = N0.D.f12484c;
                return new C1412g(0, intValue2 - ((int) (4294967295L & j12)));
            case 11:
                Integer b10 = q0Var.b();
                if (b10 == null) {
                    return null;
                }
                int intValue3 = b10.intValue();
                long j13 = q0Var.f12343f;
                int i14 = N0.D.f12484c;
                return new C1412g(((int) (4294967295L & j13)) - intValue3, 0);
            default:
                Integer a5 = q0Var.a();
                if (a5 == null) {
                    return null;
                }
                int intValue4 = a5.intValue();
                long j14 = q0Var.f12343f;
                int i15 = N0.D.f12484c;
                return new C1412g(0, intValue4 - ((int) (4294967295L & j14)));
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        W0 w02;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f10278Y;
        switch (i10) {
            case 0:
                return Long.valueOf(((Number) obj).longValue());
            case 1:
                E0.c0 c0Var = (E0.c0) obj;
                return yVar;
            case 2:
                E0.c0 c0Var2 = (E0.c0) obj;
                return yVar;
            case 3:
                C6681V c6681v = (C6681V) obj;
                c6681v.f51194a = 1000;
                c6681v.a(0, Float.valueOf(1.0f));
                c6681v.a(499, Float.valueOf(1.0f));
                c6681v.a(500, Float.valueOf(0.0f));
                c6681v.a(999, Float.valueOf(0.0f));
                return yVar;
            case 4:
                T0.z zVar = (T0.z) obj;
                return yVar;
            case 5:
                N.q0 q0Var = (N.q0) obj;
                switch (i10) {
                    case 5:
                        N.x0 x0Var = q0Var.f12342e;
                        x0Var.f12451a = null;
                        if (q0Var.f12344g.f12512Y.length() > 0) {
                            if (q0Var.e()) {
                                x0Var.f12451a = null;
                                if (q0Var.f12344g.f12512Y.length() > 0) {
                                    String str = q0Var.f12344g.f12512Y;
                                    long j6 = q0Var.f12343f;
                                    int i11 = N0.D.f12484c;
                                    int F02 = A7.b.F0((int) (4294967295L & j6), str);
                                    if (F02 != -1) {
                                        q0Var.l(F02, F02);
                                        break;
                                    }
                                }
                            } else {
                                x0Var.f12451a = null;
                                if (q0Var.f12344g.f12512Y.length() > 0) {
                                    String str2 = q0Var.f12344g.f12512Y;
                                    long j10 = q0Var.f12343f;
                                    int i12 = N0.D.f12484c;
                                    int E02 = A7.b.E0((int) (4294967295L & j10), str2);
                                    if (E02 != -1) {
                                        q0Var.l(E02, E02);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        N.x0 x0Var2 = q0Var.f12342e;
                        x0Var2.f12451a = null;
                        if (q0Var.f12344g.f12512Y.length() > 0) {
                            if (q0Var.e()) {
                                x0Var2.f12451a = null;
                                if (q0Var.f12344g.f12512Y.length() > 0) {
                                    String str3 = q0Var.f12344g.f12512Y;
                                    long j11 = q0Var.f12343f;
                                    int i13 = N0.D.f12484c;
                                    int E03 = A7.b.E0((int) (4294967295L & j11), str3);
                                    if (E03 != -1) {
                                        q0Var.l(E03, E03);
                                        break;
                                    }
                                }
                            } else {
                                x0Var2.f12451a = null;
                                if (q0Var.f12344g.f12512Y.length() > 0) {
                                    String str4 = q0Var.f12344g.f12512Y;
                                    long j12 = q0Var.f12343f;
                                    int i14 = N0.D.f12484c;
                                    int F03 = A7.b.F0((int) (4294967295L & j12), str4);
                                    if (F03 != -1) {
                                        q0Var.l(F03, F03);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                }
                return yVar;
            case 6:
                N.q0 q0Var2 = (N.q0) obj;
                switch (i10) {
                    case 5:
                        N.x0 x0Var3 = q0Var2.f12342e;
                        x0Var3.f12451a = null;
                        if (q0Var2.f12344g.f12512Y.length() > 0) {
                            if (q0Var2.e()) {
                                x0Var3.f12451a = null;
                                if (q0Var2.f12344g.f12512Y.length() > 0) {
                                    String str5 = q0Var2.f12344g.f12512Y;
                                    long j13 = q0Var2.f12343f;
                                    int i15 = N0.D.f12484c;
                                    int F04 = A7.b.F0((int) (4294967295L & j13), str5);
                                    if (F04 != -1) {
                                        q0Var2.l(F04, F04);
                                        break;
                                    }
                                }
                            } else {
                                x0Var3.f12451a = null;
                                if (q0Var2.f12344g.f12512Y.length() > 0) {
                                    String str6 = q0Var2.f12344g.f12512Y;
                                    long j14 = q0Var2.f12343f;
                                    int i16 = N0.D.f12484c;
                                    int E04 = A7.b.E0((int) (4294967295L & j14), str6);
                                    if (E04 != -1) {
                                        q0Var2.l(E04, E04);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        N.x0 x0Var4 = q0Var2.f12342e;
                        x0Var4.f12451a = null;
                        if (q0Var2.f12344g.f12512Y.length() > 0) {
                            if (q0Var2.e()) {
                                x0Var4.f12451a = null;
                                if (q0Var2.f12344g.f12512Y.length() > 0) {
                                    String str7 = q0Var2.f12344g.f12512Y;
                                    long j15 = q0Var2.f12343f;
                                    int i17 = N0.D.f12484c;
                                    int E05 = A7.b.E0((int) (4294967295L & j15), str7);
                                    if (E05 != -1) {
                                        q0Var2.l(E05, E05);
                                        break;
                                    }
                                }
                            } else {
                                x0Var4.f12451a = null;
                                if (q0Var2.f12344g.f12512Y.length() > 0) {
                                    String str8 = q0Var2.f12344g.f12512Y;
                                    long j16 = q0Var2.f12343f;
                                    int i18 = N0.D.f12484c;
                                    int F05 = A7.b.F0((int) (4294967295L & j16), str8);
                                    if (F05 != -1) {
                                        q0Var2.l(F05, F05);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                }
                return yVar;
            case 7:
                return a((N.q0) obj);
            case 8:
                return a((N.q0) obj);
            case 9:
                return a((N.q0) obj);
            case 10:
                return a((N.q0) obj);
            case 11:
                return a((N.q0) obj);
            case 12:
                return a((N.q0) obj);
            case 13:
                List list = (List) obj;
                Object obj2 = list.get(1);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Boolean", obj2);
                if (((Boolean) obj2).booleanValue()) {
                    w02 = W0.f1213Y;
                } else {
                    w02 = W0.f1214Z;
                }
                Object obj3 = list.get(0);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Float", obj3);
                return new N0(w02, ((Float) obj3).floatValue());
            default:
                T0.z zVar2 = (T0.z) obj;
                return yVar;
        }
    }
}
