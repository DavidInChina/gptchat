package E;

import l8.AbstractC4344b;

/* renamed from: E.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0428l extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C0428l f3883Z = new C0428l(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C0428l f3884h0 = new C0428l(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C0428l f3885i0 = new C0428l(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C0428l f3886j0 = new C0428l(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C0428l f3887k0 = new C0428l(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C0428l f3888l0 = new C0428l(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final C0428l f3889m0 = new C0428l(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final C0428l f3890n0 = new C0428l(7);

    /* renamed from: o0  reason: collision with root package name */
    public static final C0428l f3891o0 = new C0428l(8);

    /* renamed from: p0  reason: collision with root package name */
    public static final C0428l f3892p0 = new C0428l(9);

    /* renamed from: q0  reason: collision with root package name */
    public static final C0428l f3893q0 = new C0428l(10);

    /* renamed from: r0  reason: collision with root package name */
    public static final C0428l f3894r0 = new C0428l(11);

    /* renamed from: s0  reason: collision with root package name */
    public static final C0428l f3895s0 = new C0428l(12);

    /* renamed from: t0  reason: collision with root package name */
    public static final C0428l f3896t0 = new C0428l(13);

    /* renamed from: u0  reason: collision with root package name */
    public static final C0428l f3897u0 = new C0428l(14);

    /* renamed from: v0  reason: collision with root package name */
    public static final C0428l f3898v0 = new C0428l(15);

    /* renamed from: w0  reason: collision with root package name */
    public static final C0428l f3899w0 = new C0428l(16);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f3900Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0428l(int i10) {
        super(2);
        this.f3900Y = i10;
    }

    public final Integer a(E0.r rVar, int i10) {
        switch (this.f3900Y) {
            case 1:
                return Integer.valueOf(rVar.c(i10));
            case 2:
                return Integer.valueOf(rVar.m(i10));
            case 3:
                return Integer.valueOf(rVar.m(i10));
            case 4:
                return Integer.valueOf(rVar.c(i10));
            case 5:
                return Integer.valueOf(rVar.S(i10));
            case 6:
                return Integer.valueOf(rVar.m(i10));
            case 7:
                return Integer.valueOf(rVar.l(i10));
            case 8:
                return Integer.valueOf(rVar.c(i10));
            case 9:
                return Integer.valueOf(rVar.c(i10));
            case 10:
                return Integer.valueOf(rVar.m(i10));
            case 11:
                return Integer.valueOf(rVar.m(i10));
            case 12:
                return Integer.valueOf(rVar.c(i10));
            case 13:
                return Integer.valueOf(rVar.S(i10));
            case 14:
                return Integer.valueOf(rVar.m(i10));
            case 15:
                return Integer.valueOf(rVar.l(i10));
            default:
                return Integer.valueOf(rVar.c(i10));
        }
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3900Y) {
            case 0:
                Z0.l lVar = (Z0.l) obj2;
                float intValue = ((Number) obj).intValue() / 2.0f;
                float f6 = -1.0f;
                if (lVar != Z0.l.f22805Y) {
                    f6 = (-1.0f) * (-1);
                }
                return Integer.valueOf(AbstractC4344b.Y0((1 + f6) * intValue));
            case 1:
                return a((E0.r) obj, ((Number) obj2).intValue());
            case 2:
                return a((E0.r) obj, ((Number) obj2).intValue());
            case 3:
                return a((E0.r) obj, ((Number) obj2).intValue());
            case 4:
                return a((E0.r) obj, ((Number) obj2).intValue());
            case 5:
                return a((E0.r) obj, ((Number) obj2).intValue());
            case 6:
                return a((E0.r) obj, ((Number) obj2).intValue());
            case 7:
                return a((E0.r) obj, ((Number) obj2).intValue());
            case 8:
                return a((E0.r) obj, ((Number) obj2).intValue());
            case 9:
                return a((E0.r) obj, ((Number) obj2).intValue());
            case 10:
                return a((E0.r) obj, ((Number) obj2).intValue());
            case 11:
                return a((E0.r) obj, ((Number) obj2).intValue());
            case 12:
                return a((E0.r) obj, ((Number) obj2).intValue());
            case 13:
                return a((E0.r) obj, ((Number) obj2).intValue());
            case 14:
                return a((E0.r) obj, ((Number) obj2).intValue());
            case 15:
                return a((E0.r) obj, ((Number) obj2).intValue());
            default:
                return a((E0.r) obj, ((Number) obj2).intValue());
        }
    }
}
