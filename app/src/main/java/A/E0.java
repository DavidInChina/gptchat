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
public final class E0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Wg.a f48Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f49Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f50h0;

    /* renamed from: i0  reason: collision with root package name */
    public F0 f51i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f52j0;

    /* renamed from: k0  reason: collision with root package name */
    public /* synthetic */ Object f53k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ B0 f54l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ F0 f55m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ wf.n f56n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ Object f57o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(B0 b02, F0 f02, wf.n nVar, Object obj, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f54l0 = b02;
        this.f55m0 = f02;
        this.f56n0 = nVar;
        this.f57o0 = obj;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        E0 e02 = new E0(this.f54l0, this.f55m0, this.f56n0, this.f57o0, abstractC4825e);
        e02.f53k0 = obj;
        return e02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((E0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[Catch: all -> 0x00ba, TRY_LEAVE, TryCatch #1 {all -> 0x00ba, blocks: (B:20:0x0090, B:21:0x0092, B:24:0x0099, B:30:0x00aa, B:31:0x00ac, B:33:0x00b2, B:36:0x00b9), top: B:42:0x0007 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        F0 f02;
        C0 c02;
        wf.n nVar;
        Object obj2;
        Wg.a aVar;
        C0 c03;
        F0 f03;
        Throwable th2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        Wg.a aVar2 = this.f52j0;
        try {
            try {
                if (aVar2 != 0) {
                    if (aVar2 != 1) {
                        if (aVar2 == 2) {
                            f03 = (F0) this.f49Z;
                            aVar = this.f48Y;
                            c03 = (C0) this.f53k0;
                            try {
                                com.google.android.gms.internal.play_billing.N.B0(obj);
                                atomicReference2 = f03.f66a;
                                while (!atomicReference2.compareAndSet(c03, null) && atomicReference2.get() == c03) {
                                }
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                atomicReference = f03.f66a;
                                while (!atomicReference.compareAndSet(c03, null)) {
                                }
                                throw th2;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    F0 f04 = this.f51i0;
                    obj2 = this.f50h0;
                    nVar = (wf.n) this.f49Z;
                    Wg.a aVar3 = this.f48Y;
                    c02 = (C0) this.f53k0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    f02 = f04;
                    aVar = aVar3;
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    AbstractC4829i abstractC4829i = ((Ng.F) this.f53k0).i().get(C1071k0.f12951Y);
                    AbstractC3557B.Z(abstractC4829i);
                    C0 c04 = new C0(this.f54l0, (AbstractC1073l0) abstractC4829i);
                    f02 = this.f55m0;
                    F0.a(f02, c04);
                    this.f53k0 = c04;
                    Wg.d dVar = f02.f67b;
                    this.f48Y = dVar;
                    wf.n nVar2 = this.f56n0;
                    this.f49Z = nVar2;
                    Object obj3 = this.f57o0;
                    this.f50h0 = obj3;
                    this.f51i0 = f02;
                    this.f52j0 = 1;
                    if (dVar.e(null, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    obj2 = obj3;
                    c02 = c04;
                    aVar = dVar;
                    nVar = nVar2;
                }
                this.f53k0 = c02;
                this.f48Y = aVar;
                this.f49Z = f02;
                this.f50h0 = null;
                this.f51i0 = null;
                this.f52j0 = 2;
                Object invoke = nVar.invoke(obj2, this);
                if (invoke == enumC5000a) {
                    return enumC5000a;
                }
                f03 = f02;
                obj = invoke;
                c03 = c02;
                atomicReference2 = f03.f66a;
                while (!atomicReference2.compareAndSet(c03, null)) {
                    while (!atomicReference2.compareAndSet(c03, null)) {
                    }
                }
                return obj;
            } catch (Throwable th4) {
                c03 = c02;
                f03 = f02;
                th2 = th4;
                atomicReference = f03.f66a;
                while (!atomicReference.compareAndSet(c03, null) && atomicReference.get() == c03) {
                }
                throw th2;
            }
        } finally {
            ((Wg.d) aVar2).g(null);
        }
    }
}
