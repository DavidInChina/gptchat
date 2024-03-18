package W;

import Ng.AbstractC1073l0;
import Ng.C1071k0;
import id.AbstractC3557B;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import nf.AbstractC4825e;
import nf.AbstractC4829i;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: W.v1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1627v1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Wg.a f20502Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f20503Z;

    /* renamed from: h0  reason: collision with root package name */
    public C1632w1 f20504h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f20505i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f20506j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ A.B0 f20507k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ C1632w1 f20508l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ wf.k f20509m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1627v1(A.B0 b02, C1632w1 c1632w1, wf.k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f20507k0 = b02;
        this.f20508l0 = c1632w1;
        this.f20509m0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C1627v1 c1627v1 = new C1627v1(this.f20507k0, this.f20508l0, this.f20509m0, abstractC4825e);
        c1627v1.f20506j0 = obj;
        return c1627v1;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1627v1) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7 A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #1 {all -> 0x00d8, blocks: (B:32:0x00ae, B:33:0x00b0, B:36:0x00b7, B:42:0x00c8, B:43:0x00ca, B:45:0x00d0, B:48:0x00d7), top: B:56:0x0007 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v6, types: [Wg.a] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        C1622u1 c1622u1;
        C1632w1 c1632w1;
        AtomicReference atomicReference;
        Wg.a aVar;
        AtomicReference atomicReference2;
        C1632w1 c1632w12;
        wf.k kVar;
        C1622u1 c1622u12;
        Wg.d dVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        ?? r12 = this.f20505i0;
        try {
            try {
                if (r12 != 0) {
                    if (r12 != 1) {
                        if (r12 == 2) {
                            c1632w1 = (C1632w1) this.f20503Z;
                            aVar = this.f20502Y;
                            c1622u1 = (C1622u1) this.f20506j0;
                            try {
                                com.google.android.gms.internal.play_billing.N.B0(obj);
                                atomicReference2 = c1632w1.f20563a;
                                while (!atomicReference2.compareAndSet(c1622u1, null) && atomicReference2.get() == c1622u1) {
                                }
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                atomicReference = c1632w1.f20563a;
                                while (!atomicReference.compareAndSet(c1622u1, null)) {
                                }
                                throw th2;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1632w1 c1632w13 = this.f20504h0;
                    kVar = (wf.k) this.f20503Z;
                    ?? r52 = this.f20502Y;
                    c1622u12 = (C1622u1) this.f20506j0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c1632w12 = c1632w13;
                    dVar = r52;
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    AbstractC4829i abstractC4829i = ((Ng.F) this.f20506j0).i().get(C1071k0.f12951Y);
                    AbstractC3557B.Z(abstractC4829i);
                    C1622u1 c1622u13 = new C1622u1(this.f20507k0, (AbstractC1073l0) abstractC4829i);
                    while (true) {
                        c1632w12 = this.f20508l0;
                        AtomicReference atomicReference3 = c1632w12.f20563a;
                        C1622u1 c1622u14 = (C1622u1) atomicReference3.get();
                        if (c1622u14 != null && c1622u13.f20455a.compareTo(c1622u14.f20455a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(c1622u14, c1622u13)) {
                            if (atomicReference3.get() != c1622u14) {
                                break;
                            }
                        }
                        if (c1622u14 != null) {
                            c1622u14.f20456b.k(null);
                        }
                        this.f20506j0 = c1622u13;
                        Wg.d dVar2 = c1632w12.f20564b;
                        this.f20502Y = dVar2;
                        wf.k kVar2 = this.f20509m0;
                        this.f20503Z = kVar2;
                        this.f20504h0 = c1632w12;
                        this.f20505i0 = 1;
                        if (dVar2.e(null, this) == enumC5000a) {
                            return enumC5000a;
                        }
                        kVar = kVar2;
                        c1622u12 = c1622u13;
                        dVar = dVar2;
                    }
                }
                this.f20506j0 = c1622u12;
                this.f20502Y = aVar;
                this.f20503Z = c1632w12;
                this.f20504h0 = null;
                this.f20505i0 = 2;
                Object invoke = kVar.invoke(this);
                if (invoke == enumC5000a) {
                    return enumC5000a;
                }
                c1632w1 = c1632w12;
                obj = invoke;
                c1622u1 = c1622u12;
                atomicReference2 = c1632w1.f20563a;
                while (!atomicReference2.compareAndSet(c1622u1, null)) {
                    while (!atomicReference2.compareAndSet(c1622u1, null)) {
                    }
                }
                return obj;
            } catch (Throwable th4) {
                c1622u1 = c1622u12;
                c1632w1 = c1632w12;
                th2 = th4;
                atomicReference = c1632w1.f20563a;
                while (!atomicReference.compareAndSet(c1622u1, null) && atomicReference.get() == c1622u1) {
                }
                throw th2;
            }
            aVar = dVar;
        } finally {
            ((Wg.d) r12).g(null);
        }
    }
}
