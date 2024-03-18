package A;

import Ng.AbstractC1073l0;
import Ng.C1071k0;
import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicReference;
import nf.AbstractC4825e;
import nf.AbstractC4829i;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class D0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Wg.a f34Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f35Z;

    /* renamed from: h0  reason: collision with root package name */
    public F0 f36h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f37i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f38j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ B0 f39k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ F0 f40l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ wf.k f41m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(B0 b02, F0 f02, wf.k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39k0 = b02;
        this.f40l0 = f02;
        this.f41m0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        D0 d02 = new D0(this.f39k0, this.f40l0, this.f41m0, abstractC4825e);
        d02.f38j0 = obj;
        return d02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((D0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090 A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:21:0x0087, B:22:0x0089, B:25:0x0090, B:31:0x00a1, B:32:0x00a3, B:34:0x00a9, B:37:0x00b0), top: B:41:0x0007 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4, types: [Wg.a] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        C0 c02;
        F0 f02;
        AtomicReference atomicReference;
        Wg.a aVar;
        AtomicReference atomicReference2;
        F0 f03;
        wf.k kVar;
        C0 c03;
        Wg.d dVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        ?? r12 = this.f37i0;
        try {
            try {
                if (r12 != 0) {
                    if (r12 != 1) {
                        if (r12 == 2) {
                            f02 = (F0) this.f35Z;
                            aVar = this.f34Y;
                            c02 = (C0) this.f38j0;
                            try {
                                com.google.android.gms.internal.play_billing.N.B0(obj);
                                atomicReference2 = f02.f66a;
                                while (!atomicReference2.compareAndSet(c02, null) && atomicReference2.get() == c02) {
                                }
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                atomicReference = f02.f66a;
                                while (!atomicReference.compareAndSet(c02, null)) {
                                }
                                throw th2;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    F0 f04 = this.f36h0;
                    kVar = (wf.k) this.f35Z;
                    ?? r52 = this.f34Y;
                    c03 = (C0) this.f38j0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    f03 = f04;
                    dVar = r52;
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    AbstractC4829i abstractC4829i = ((Ng.F) this.f38j0).i().get(C1071k0.f12951Y);
                    AbstractC3557B.Z(abstractC4829i);
                    C0 c04 = new C0(this.f39k0, (AbstractC1073l0) abstractC4829i);
                    f03 = this.f40l0;
                    F0.a(f03, c04);
                    this.f38j0 = c04;
                    Wg.d dVar2 = f03.f67b;
                    this.f34Y = dVar2;
                    wf.k kVar2 = this.f41m0;
                    this.f35Z = kVar2;
                    this.f36h0 = f03;
                    this.f37i0 = 1;
                    if (dVar2.e(null, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    kVar = kVar2;
                    c03 = c04;
                    dVar = dVar2;
                }
                this.f38j0 = c03;
                this.f34Y = aVar;
                this.f35Z = f03;
                this.f36h0 = null;
                this.f37i0 = 2;
                Object invoke = kVar.invoke(this);
                if (invoke == enumC5000a) {
                    return enumC5000a;
                }
                f02 = f03;
                obj = invoke;
                c02 = c03;
                atomicReference2 = f02.f66a;
                while (!atomicReference2.compareAndSet(c02, null)) {
                    while (!atomicReference2.compareAndSet(c02, null)) {
                    }
                }
                return obj;
            } catch (Throwable th4) {
                c02 = c03;
                f02 = f03;
                th2 = th4;
                atomicReference = f02.f66a;
                while (!atomicReference.compareAndSet(c02, null) && atomicReference.get() == c02) {
                }
                throw th2;
            }
            aVar = dVar;
        } finally {
            ((Wg.d) r12).g(null);
        }
    }
}
