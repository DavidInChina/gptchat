package Z;

import Ng.AbstractC1073l0;
import e0.C2741d;
import f0.C2930a;
import f0.C2931b;
import g0.C3135b;
import id.AbstractC3557B;
import j0.AbstractC3893i;
import j0.C3892h;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import y.C6473k;

/* loaded from: classes2.dex */
public final class B0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public C3892h f22436Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f22437Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f22438h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ E0 f22439i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.o f22440j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1700a0 f22441k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(E0 e02, wf.o oVar, AbstractC1700a0 abstractC1700a0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f22439i0 = e02;
        this.f22440j0 = oVar;
        this.f22441k0 = abstractC1700a0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        B0 b02 = new B0(this.f22439i0, this.f22440j0, this.f22441k0, abstractC4825e);
        b02.f22438h0 = obj;
        return b02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((B0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        AbstractC1073l0 abstractC1073l0;
        C3892h c3892h;
        E0 e02;
        Qg.F0 f02;
        c0.g gVar;
        C2931b c2931b;
        List A10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f22437Z;
        if (i10 != 0) {
            if (i10 == 1) {
                c3892h = this.f22436Y;
                abstractC1073l0 = (AbstractC1073l0) this.f22438h0;
                try {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } catch (Throwable th3) {
                    th2 = th3;
                    c3892h.a();
                    e02 = this.f22439i0;
                    synchronized (e02.f22466c) {
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            abstractC1073l0 = Ad.l.v0(((Ng.F) this.f22438h0).i());
            E0.u(this.f22439i0, abstractC1073l0);
            int i11 = AbstractC3893i.f35891e;
            C3892h f6 = io.sentry.hints.i.f(new C6473k(9, this.f22439i0));
            J0.a aVar = this.f22439i0.f22486w;
            try {
                do {
                    f02 = E0.f22462x;
                    gVar = (c0.g) f02.getValue();
                    c2931b = (C2931b) gVar;
                    C2741d c2741d = c2931b.f29518h0;
                    if (!c2741d.containsKey(aVar)) {
                        boolean isEmpty = c2931b.isEmpty();
                        C3135b c3135b = C3135b.f31015a;
                        if (isEmpty) {
                            c2931b = new C2931b(aVar, aVar, c2741d.b(aVar, new C2930a(c3135b, c3135b)));
                        } else {
                            Object obj2 = c2931b.f29517Z;
                            Object obj3 = c2741d.get(obj2);
                            AbstractC3557B.Z(obj3);
                            c2931b = new C2931b(c2931b.f29516Y, aVar, c2741d.b(obj2, new C2930a(((C2930a) obj3).f29513a, aVar)).b(aVar, new C2930a(obj2, c3135b)));
                        }
                    }
                    if (gVar == c2931b) {
                        break;
                    }
                } while (!f02.e(gVar, c2931b));
                break;
                E0 e03 = this.f22439i0;
                synchronized (e03.f22466c) {
                    A10 = e03.A();
                }
                int size = A10.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((C1744x) ((D) A10.get(i12))).s();
                }
                A0 a02 = new A0(this.f22440j0, this.f22441k0, null);
                this.f22438h0 = abstractC1073l0;
                this.f22436Y = f6;
                this.f22437Z = 1;
                if (Ad.l.e0(a02, this) == enumC5000a) {
                    return enumC5000a;
                }
                c3892h = f6;
            } catch (Throwable th4) {
                c3892h = f6;
                th2 = th4;
                c3892h.a();
                e02 = this.f22439i0;
                synchronized (e02.f22466c) {
                    try {
                        if (e02.f22467d == abstractC1073l0) {
                            e02.f22467d = null;
                        }
                        e02.x();
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                Qg.F0 f03 = E0.f22462x;
                io.sentry.hints.i.b(this.f22439i0.f22486w);
                throw th2;
            }
        }
        c3892h.a();
        E0 e04 = this.f22439i0;
        synchronized (e04.f22466c) {
            try {
                if (e04.f22467d == abstractC1073l0) {
                    e04.f22467d = null;
                }
                e04.x();
            } catch (Throwable th6) {
                throw th6;
            }
        }
        Qg.F0 f04 = E0.f22462x;
        io.sentry.hints.i.b(this.f22439i0.f22486w);
        return jf.y.f36177a;
    }
}
