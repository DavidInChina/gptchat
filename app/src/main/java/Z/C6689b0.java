package z;

import Ng.AbstractC1073l0;
import Ng.C1071k0;
import id.AbstractC3557B;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import nf.AbstractC4825e;
import nf.AbstractC4829i;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: z.b0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6689b0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Wg.a f51214Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f51215Z;

    /* renamed from: h0  reason: collision with root package name */
    public C6691c0 f51216h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f51217i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f51218j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f51219k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ C6691c0 f51220l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ wf.k f51221m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6689b0(int i10, C6691c0 c6691c0, wf.k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f51219k0 = i10;
        this.f51220l0 = c6691c0;
        this.f51221m0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C6689b0 c6689b0 = new C6689b0(this.f51219k0, this.f51220l0, this.f51221m0, abstractC4825e);
        c6689b0.f51218j0 = obj;
        return c6689b0;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6689b0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd A[Catch: all -> 0x00de, TRY_LEAVE, TryCatch #2 {all -> 0x00de, blocks: (B:32:0x00b4, B:33:0x00b6, B:36:0x00bd, B:42:0x00ce, B:43:0x00d0, B:45:0x00d6, B:48:0x00dd), top: B:58:0x0007 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v6, types: [Wg.a] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        C6687a0 c6687a0;
        C6691c0 c6691c0;
        AtomicReference atomicReference;
        Wg.a aVar;
        AtomicReference atomicReference2;
        C6691c0 c6691c02;
        wf.k kVar;
        C6687a0 c6687a02;
        Wg.d dVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        ?? r12 = this.f51217i0;
        try {
            try {
                if (r12 != 0) {
                    if (r12 != 1) {
                        if (r12 == 2) {
                            c6691c0 = (C6691c0) this.f51215Z;
                            aVar = this.f51214Y;
                            c6687a0 = (C6687a0) this.f51218j0;
                            try {
                                com.google.android.gms.internal.play_billing.N.B0(obj);
                                atomicReference2 = c6691c0.f51224a;
                                while (!atomicReference2.compareAndSet(c6687a0, null) && atomicReference2.get() == c6687a0) {
                                }
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                atomicReference = c6691c0.f51224a;
                                while (!atomicReference.compareAndSet(c6687a0, null)) {
                                }
                                throw th2;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6691c0 c6691c03 = this.f51216h0;
                    kVar = (wf.k) this.f51215Z;
                    ?? r52 = this.f51214Y;
                    c6687a02 = (C6687a0) this.f51218j0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c6691c02 = c6691c03;
                    dVar = r52;
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    AbstractC4829i abstractC4829i = ((Ng.F) this.f51218j0).i().get(C1071k0.f12951Y);
                    AbstractC3557B.Z(abstractC4829i);
                    C6687a0 c6687a03 = new C6687a0(this.f51219k0, (AbstractC1073l0) abstractC4829i);
                    while (true) {
                        c6691c02 = this.f51220l0;
                        AtomicReference atomicReference3 = c6691c02.f51224a;
                        C6687a0 c6687a04 = (C6687a0) atomicReference3.get();
                        if (c6687a04 != null && AbstractC6708l.b(c6687a03.f51204a, c6687a04.f51204a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(c6687a04, c6687a03)) {
                            if (atomicReference3.get() != c6687a04) {
                                break;
                            }
                        }
                        if (c6687a04 != null) {
                            c6687a04.f51205b.k(new C6685Z(0, 0));
                        }
                        this.f51218j0 = c6687a03;
                        Wg.d dVar2 = c6691c02.f51225b;
                        this.f51214Y = dVar2;
                        wf.k kVar2 = this.f51221m0;
                        this.f51215Z = kVar2;
                        this.f51216h0 = c6691c02;
                        this.f51217i0 = 1;
                        if (dVar2.e(null, this) == enumC5000a) {
                            return enumC5000a;
                        }
                        kVar = kVar2;
                        c6687a02 = c6687a03;
                        dVar = dVar2;
                    }
                }
                this.f51218j0 = c6687a02;
                this.f51214Y = aVar;
                this.f51215Z = c6691c02;
                this.f51216h0 = null;
                this.f51217i0 = 2;
                Object invoke = kVar.invoke(this);
                if (invoke == enumC5000a) {
                    return enumC5000a;
                }
                c6691c0 = c6691c02;
                obj = invoke;
                c6687a0 = c6687a02;
                atomicReference2 = c6691c0.f51224a;
                while (!atomicReference2.compareAndSet(c6687a0, null)) {
                    while (!atomicReference2.compareAndSet(c6687a0, null)) {
                    }
                }
                return obj;
            } catch (Throwable th4) {
                c6687a0 = c6687a02;
                c6691c0 = c6691c02;
                th2 = th4;
                atomicReference = c6691c0.f51224a;
                while (!atomicReference.compareAndSet(c6687a0, null) && atomicReference.get() == c6687a0) {
                }
                throw th2;
            }
            aVar = dVar;
        } finally {
            ((Wg.d) r12).g(null);
        }
    }
}
