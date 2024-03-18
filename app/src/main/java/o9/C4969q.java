package o9;

import Df.H;
import Lc.x;
import Ng.Q;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import of.EnumC5000a;
import u7.C5848d;

/* renamed from: o9.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4969q {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC4831k f41031a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f41032b;

    /* renamed from: c  reason: collision with root package name */
    public final wf.k f41033c;

    /* renamed from: d  reason: collision with root package name */
    public final Wg.d f41034d = Wg.e.a();

    /* renamed from: e  reason: collision with root package name */
    public Object f41035e = C4965m.f41019a;

    /* renamed from: f  reason: collision with root package name */
    public long f41036f;

    static {
        new C5848d(25, 0);
    }

    public C4969q(Long l10, x xVar) {
        Tg.e eVar = Q.f12904a;
        AbstractC3557B.c0("context", eVar);
        this.f41031a = eVar;
        this.f41032b = l10;
        this.f41033c = xVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:2|(5:(2:4|(8:6|8|49|(1:(1:(1:(6:13|14|44|33|45|46)(2:16|17))(6:18|19|32|33|45|46))(1:20))(2:21|(1:23)(1:24))|50|25|26|(2:28|(1:30)(5:31|32|33|45|46))(4:36|(2:38|(2:40|(1:42)(3:43|44|33)))|45|46)))|50|25|26|(0)(0))|7|8|49|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
        r14 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080 A[Catch: all -> 0x009d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x009d, blocks: (B:25:0x0068, B:28:0x0080, B:36:0x00a1, B:38:0x00a5, B:40:0x00ab), top: B:50:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1 A[Catch: all -> 0x009d, TRY_ENTER, TryCatch #1 {all -> 0x009d, blocks: (B:25:0x0068, B:28:0x0080, B:36:0x00a1, B:38:0x00a5, B:40:0x00ab), top: B:50:0x0068 }] */
    /* JADX WARN: Type inference failed for: r2v9, types: [Wg.a] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        C4966n c4966n;
        int i10;
        ?? r42;
        Wg.d dVar;
        C4969q c4969q;
        Object obj;
        C4965m c4965m;
        Wg.a aVar;
        C4969q c4969q2;
        C4969q c4969q3;
        long j6;
        C4969q c4969q4;
        Wg.d dVar2;
        try {
            if (abstractC4825e instanceof C4966n) {
                c4966n = (C4966n) abstractC4825e;
                int i11 = c4966n.f41026l0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c4966n.f41026l0 = i11 - Integer.MIN_VALUE;
                    Object obj2 = c4966n.f41024j0;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = c4966n.f41026l0;
                    r42 = 2;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 == 3) {
                                    j6 = c4966n.f41023i0;
                                    c4969q3 = c4966n.f41022h0;
                                    aVar = c4966n.f41021Z;
                                    c4969q2 = c4966n.f41020Y;
                                    N.B0(obj2);
                                    c4969q3.f41035e = obj2;
                                    c4969q2.f41036f = j6 + c4969q2.f41032b.longValue();
                                    c4969q = c4969q2;
                                    dVar2 = aVar;
                                    dVar2.g(null);
                                    return c4969q.f41035e;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c4969q4 = c4966n.f41022h0;
                            aVar = c4966n.f41021Z;
                            c4969q2 = c4966n.f41020Y;
                            N.B0(obj2);
                            c4969q4.f41035e = obj2;
                            c4969q = c4969q2;
                            dVar2 = aVar;
                            dVar2.g(null);
                            return c4969q.f41035e;
                        }
                        ?? r22 = c4966n.f41021Z;
                        c4969q = c4966n.f41020Y;
                        N.B0(obj2);
                        dVar = r22;
                    } else {
                        N.B0(obj2);
                        c4966n.f41020Y = this;
                        dVar = this.f41034d;
                        c4966n.f41021Z = dVar;
                        c4966n.f41026l0 = 1;
                        if (dVar.e(null, c4966n) == enumC5000a) {
                            return enumC5000a;
                        }
                        c4969q = this;
                    }
                    Mg.a aVar2 = Mg.b.f12127Z;
                    long e10 = Mg.b.e(H.y0(System.nanoTime(), Mg.d.f12132Z));
                    obj = c4969q.f41035e;
                    c4965m = C4965m.f41019a;
                    AbstractC4831k abstractC4831k = c4969q.f41031a;
                    if (obj != c4965m) {
                        C4967o c4967o = new C4967o(c4969q, null);
                        c4966n.f41020Y = c4969q;
                        c4966n.f41021Z = dVar;
                        c4966n.f41022h0 = c4969q;
                        c4966n.f41026l0 = 2;
                        Object n12 = Ad.l.n1(c4966n, abstractC4831k, c4967o);
                        if (n12 == enumC5000a) {
                            return enumC5000a;
                        }
                        aVar = dVar;
                        obj2 = n12;
                        c4969q2 = c4969q;
                        c4969q4 = c4969q2;
                        c4969q4.f41035e = obj2;
                        c4969q = c4969q2;
                        dVar2 = aVar;
                        dVar2.g(null);
                        return c4969q.f41035e;
                    }
                    dVar2 = dVar;
                    if (c4969q.f41032b != null) {
                        dVar2 = dVar;
                        if (e10 >= c4969q.f41036f) {
                            C4968p c4968p = new C4968p(c4969q, null);
                            c4966n.f41020Y = c4969q;
                            c4966n.f41021Z = dVar;
                            c4966n.f41022h0 = c4969q;
                            c4966n.f41023i0 = e10;
                            c4966n.f41026l0 = 3;
                            Object n13 = Ad.l.n1(c4966n, abstractC4831k, c4968p);
                            if (n13 == enumC5000a) {
                                return enumC5000a;
                            }
                            aVar = dVar;
                            obj2 = n13;
                            c4969q2 = c4969q;
                            c4969q3 = c4969q2;
                            j6 = e10;
                            c4969q3.f41035e = obj2;
                            c4969q2.f41036f = j6 + c4969q2.f41032b.longValue();
                            c4969q = c4969q2;
                            dVar2 = aVar;
                        }
                    }
                    dVar2.g(null);
                    return c4969q.f41035e;
                }
            }
            Mg.a aVar22 = Mg.b.f12127Z;
            long e102 = Mg.b.e(H.y0(System.nanoTime(), Mg.d.f12132Z));
            obj = c4969q.f41035e;
            c4965m = C4965m.f41019a;
            AbstractC4831k abstractC4831k2 = c4969q.f41031a;
            if (obj != c4965m) {
            }
        } catch (Throwable th2) {
            r42 = dVar;
            Throwable th3 = th2;
            ((Wg.d) r42).g(null);
            throw th3;
        }
        c4966n = new C4966n(this, abstractC4825e);
        Object obj22 = c4966n.f41024j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4966n.f41026l0;
        r42 = 2;
        if (i10 == 0) {
        }
    }
}
