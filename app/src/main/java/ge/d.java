package ge;

import Df.H;
import Fe.l;
import K4.C0813a;
import Ng.AbstractC1073l0;
import Ng.C1071k0;
import Ng.C1079o0;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import e9.C2813f;
import he.C3418c;
import id.AbstractC3557B;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kf.t;
import me.AbstractC4637j;
import me.C4618A;
import me.C4622E;
import me.C4624G;
import me.C4628a;
import me.C4629b;
import me.C4647u;
import me.L;
import me.w;
import me.y;
import na.L0;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import of.EnumC5000a;
import te.C5760d;
import te.C5763g;
import te.C5765i;
import ve.C6033b;
import ve.C6038g;
import we.AbstractC6214b;
import wf.k;
import zc.C6821H;

/* loaded from: classes2.dex */
public final class d implements F, Closeable {

    /* renamed from: r0  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31592r0 = AtomicIntegerFieldUpdater.newUpdater(d.class, "closed");

    /* renamed from: Y  reason: collision with root package name */
    public final je.c f31593Y;

    /* renamed from: Z  reason: collision with root package name */
    public final f f31594Z;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f31595h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C1079o0 f31596i0;

    /* renamed from: j0  reason: collision with root package name */
    public final AbstractC4831k f31597j0;

    /* renamed from: k0  reason: collision with root package name */
    public final C5763g f31598k0;

    /* renamed from: l0  reason: collision with root package name */
    public final C6038g f31599l0;

    /* renamed from: m0  reason: collision with root package name */
    public final C5765i f31600m0;

    /* renamed from: n0  reason: collision with root package name */
    public final C6033b f31601n0;

    /* renamed from: q0  reason: collision with root package name */
    public final f f31604q0;
    private volatile /* synthetic */ int closed = 0;

    /* renamed from: o0  reason: collision with root package name */
    public final l f31602o0 = H.d();

    /* renamed from: p0  reason: collision with root package name */
    public final y7.b f31603p0 = new y7.b(11);

    public d(je.c cVar, f fVar, boolean z10) {
        C0813a c0813a;
        C0813a c0813a2;
        AbstractC3557B.c0("engine", cVar);
        this.f31593Y = cVar;
        this.f31594Z = fVar;
        C1079o0 c1079o0 = new C1079o0((AbstractC1073l0) cVar.i().get(C1071k0.f12951Y));
        this.f31596i0 = c1079o0;
        this.f31597j0 = cVar.i().plus(c1079o0);
        this.f31598k0 = new C5763g(fVar.f31613h);
        this.f31599l0 = new C6038g(fVar.f31613h);
        C5765i c5765i = new C5765i(fVar.f31613h);
        this.f31600m0 = c5765i;
        this.f31601n0 = new C6033b(fVar.f31613h);
        f fVar2 = new f();
        this.f31604q0 = fVar2;
        if (this.f31595h0) {
            c1079o0.V(new C6821H(10, this));
        }
        c5765i.f(C5765i.f46157j, new C2813f(this, (je.d) cVar, null, 1));
        switch (C5765i.f46153f.f20901a) {
            case 28:
                c0813a = C5765i.f46158k;
                break;
            default:
                c0813a = C6038g.f47499g;
                break;
        }
        c5765i.f(c0813a, new L0(this, (AbstractC4825e) null, 6));
        C4628a c4628a = C4624G.f39158a;
        C3257a c3257a = C3257a.f31583i0;
        fVar2.a(c4628a, c3257a);
        fVar2.a(C4629b.f39191a, c3257a);
        if (fVar.f31611f) {
            fVar2.f31608c.put("DefaultTransformers", C3257a.f31581Z);
        }
        fVar2.a(L.f39171c, c3257a);
        C4628a c4628a2 = C4647u.f39259d;
        fVar2.a(c4628a2, c3257a);
        if (fVar.f31610e) {
            fVar2.a(C4622E.f39152b, c3257a);
        }
        fVar2.b(fVar);
        if (fVar.f31611f) {
            fVar2.a(C4618A.f39133d, c3257a);
        }
        Fe.a aVar = AbstractC4637j.f39209a;
        C6821H c6821h = new C6821H(15, fVar2);
        Ei.a aVar2 = w.f39269a;
        fVar2.a(c4628a2, c6821h);
        for (k kVar : fVar2.f31606a.values()) {
            kVar.invoke(this);
        }
        for (k kVar2 : fVar2.f31608c.values()) {
            kVar2.invoke(this);
        }
        C6038g c6038g = this.f31599l0;
        switch (C6038g.f47498f.f20901a) {
            case 28:
                c0813a2 = C5765i.f46158k;
                break;
            default:
                c0813a2 = C6038g.f47499g;
                break;
        }
        c6038g.f(c0813a2, new C3258b(this, null, 0));
        this.f31595h0 = z10;
    }

    public final d a(k kVar) {
        f fVar = new f();
        fVar.b(this.f31594Z);
        kVar.invoke(fVar);
        return new d(this.f31593Y, fVar, this.f31595h0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!f31592r0.compareAndSet(this, 0, 1)) {
            return;
        }
        Fe.b bVar = (Fe.b) this.f31602o0.b(y.f39271a);
        for (Fe.a aVar : t.K2(bVar.c().keySet())) {
            AbstractC3557B.a0("null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>", aVar);
            Object b10 = bVar.b(aVar);
            if (b10 instanceof Closeable) {
                ((Closeable) b10).close();
            }
        }
        this.f31596i0.q0();
        if (this.f31595h0) {
            this.f31593Y.close();
        }
    }

    @Override // Ng.F
    public final AbstractC4831k i() {
        return this.f31597j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(C5760d c5760d, AbstractC4825e abstractC4825e) {
        C3259c c3259c;
        int i10;
        if (abstractC4825e instanceof C3259c) {
            c3259c = (C3259c) abstractC4825e;
            int i11 = c3259c.f31591h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3259c.f31591h0 = i11 - Integer.MIN_VALUE;
                Object obj = c3259c.f31589Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c3259c.f31591h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    this.f31603p0.q(AbstractC6214b.f48495a);
                    Object obj2 = c5760d.f46128d;
                    c3259c.f31591h0 = 1;
                    obj = this.f31598k0.a(c5760d, obj2, c3259c);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                AbstractC3557B.a0("null cannot be cast to non-null type io.ktor.client.call.HttpClientCall", obj);
                return (C3418c) obj;
            }
        }
        c3259c = new C3259c(this, abstractC4825e);
        Object obj3 = c3259c.f31589Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c3259c.f31591h0;
        if (i10 == 0) {
        }
        AbstractC3557B.a0("null cannot be cast to non-null type io.ktor.client.call.HttpClientCall", obj3);
        return (C3418c) obj3;
    }

    public final String toString() {
        return "HttpClient[" + this.f31593Y + ']';
    }
}
