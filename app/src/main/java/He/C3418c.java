package he;

import Ad.l;
import Df.AbstractC0405d;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import of.EnumC5000a;
import te.AbstractC5759c;
import u7.n;
import ve.AbstractC6034c;
import ve.C6035d;
import ve.C6038g;
import ze.C6843b;

/* renamed from: he.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3418c implements F {

    /* renamed from: Y  reason: collision with root package name */
    public final ge.d f32270Y;

    /* renamed from: Z  reason: collision with root package name */
    public AbstractC5759c f32271Z;

    /* renamed from: h0  reason: collision with root package name */
    public AbstractC6034c f32272h0;
    private volatile /* synthetic */ int received = 0;

    /* renamed from: j0  reason: collision with root package name */
    public static final Fe.a f32269j0 = new Fe.a("CustomResponse");

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32268i0 = AtomicIntegerFieldUpdater.newUpdater(C3418c.class, "received");

    public C3418c(ge.d dVar) {
        AbstractC3557B.c0("client", dVar);
        this.f32270Y = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:46:0x00b5, B:51:0x00c6, B:54:0x00d6, B:55:0x00eb), top: B:63:0x002c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Je.a aVar, AbstractC4825e abstractC4825e) {
        C3418c c3418c;
        C3417b c3417b;
        Object obj;
        EnumC5000a enumC5000a;
        int i10;
        Throwable th2;
        Object obj2;
        C3418c c3418c2;
        if (abstractC4825e instanceof C3417b) {
            c3417b = (C3417b) abstractC4825e;
            int i11 = c3417b.f32267j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3417b.f32267j0 = i11 - Integer.MIN_VALUE;
                obj = c3417b.f32265h0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = c3417b.f32267j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            aVar = c3417b.f32264Z;
                            c3418c = c3417b.f32263Y;
                            try {
                                N.B0(obj);
                                obj2 = ((C6035d) obj).f47492b;
                                if (!AbstractC3557B.K(obj2, C6843b.f52007a)) {
                                    obj2 = null;
                                }
                                if (obj2 != null) {
                                    AbstractC0405d abstractC0405d = aVar.f9097a;
                                    AbstractC3557B.c0("type", abstractC0405d);
                                    if (!R4.b.k1(abstractC0405d).isInstance(obj2)) {
                                        throw new n(c3418c.d(), C.f37623a.b(obj2.getClass()), aVar.f9097a);
                                    }
                                }
                                return obj2;
                            } catch (Throwable th3) {
                                th2 = th3;
                                try {
                                    l.P(c3418c.d(), A7.b.g("Receive failed", th2));
                                    throw th2;
                                } finally {
                                    AbstractC3557B.f0(c3418c.d());
                                }
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = c3417b.f32264Z;
                    c3418c2 = c3417b.f32263Y;
                    try {
                        N.B0(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        c3418c = c3418c2;
                        l.P(c3418c.d(), A7.b.g("Receive failed", th2));
                        throw th2;
                    }
                } else {
                    N.B0(obj);
                    try {
                        AbstractC6034c d10 = d();
                        AbstractC0405d abstractC0405d2 = aVar.f9097a;
                        AbstractC3557B.c0("type", abstractC0405d2);
                        if (R4.b.k1(abstractC0405d2).isInstance(d10)) {
                            return d();
                        }
                        if (!b() && !f32268i0.compareAndSet(this, 0, 1)) {
                            throw new C3416a(this);
                        }
                        obj = h().d(f32269j0);
                        if (obj == null) {
                            c3417b.f32263Y = this;
                            c3417b.f32264Z = aVar;
                            c3417b.f32267j0 = 1;
                            obj = e();
                            if (obj == enumC5000a) {
                                return enumC5000a;
                            }
                        }
                        c3418c2 = this;
                    } catch (Throwable th5) {
                        th2 = th5;
                        c3418c = this;
                        l.P(c3418c.d(), A7.b.g("Receive failed", th2));
                        throw th2;
                    }
                }
                C6035d c6035d = new C6035d(aVar, obj);
                C6038g c6038g = c3418c2.f32270Y.f31599l0;
                c3417b.f32263Y = c3418c2;
                c3417b.f32264Z = aVar;
                c3417b.f32267j0 = 2;
                obj = c6038g.a(c3418c2, c6035d, c3417b);
                if (obj != enumC5000a) {
                    return enumC5000a;
                }
                c3418c = c3418c2;
                obj2 = ((C6035d) obj).f47492b;
                if (!AbstractC3557B.K(obj2, C6843b.f52007a)) {
                }
                if (obj2 != null) {
                }
                return obj2;
            }
        }
        c3417b = new C3417b(this, abstractC4825e);
        obj = c3417b.f32265h0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = c3417b.f32267j0;
        if (i10 == 0) {
        }
        C6035d c6035d2 = new C6035d(aVar, obj);
        C6038g c6038g2 = c3418c2.f32270Y.f31599l0;
        c3417b.f32263Y = c3418c2;
        c3417b.f32264Z = aVar;
        c3417b.f32267j0 = 2;
        obj = c6038g2.a(c3418c2, c6035d2, c3417b);
        if (obj != enumC5000a) {
        }
    }

    public boolean b() {
        return false;
    }

    public final AbstractC5759c c() {
        AbstractC5759c abstractC5759c = this.f32271Z;
        if (abstractC5759c != null) {
            return abstractC5759c;
        }
        AbstractC3557B.C2("request");
        throw null;
    }

    public final AbstractC6034c d() {
        AbstractC6034c abstractC6034c = this.f32272h0;
        if (abstractC6034c != null) {
            return abstractC6034c;
        }
        AbstractC3557B.C2("response");
        throw null;
    }

    public Object e() {
        return d().c();
    }

    public final Fe.b h() {
        return c().h();
    }

    @Override // Ng.F
    public final AbstractC4831k i() {
        return d().i();
    }

    public final String toString() {
        return "HttpClientCall[" + c().O() + ", " + d().f() + ']';
    }
}
