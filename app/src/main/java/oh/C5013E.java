package oh;

import B0.N;
import java.util.concurrent.CancellationException;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import pf.AbstractC5161h;

/* renamed from: oh.E  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5013E extends AbstractC5161h implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public int f41372Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f41373h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ I f41374i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Ng.F f41375j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5013E(I i10, Ng.F f6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41374i0 = i10;
        this.f41375j0 = f6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5013E c5013e = new C5013E(this.f41374i0, this.f41375j0, abstractC4825e);
        c5013e.f41373h0 = obj;
        return c5013e;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5013E) create((N) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:22:0x0063, B:27:0x007b), top: B:36:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CancellationException e10;
        C0.d dVar;
        Pg.k kVar;
        C5009A c5009a;
        long j6;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41372Z;
        boolean z10 = false;
        I i11 = this.f41374i0;
        if (i10 != 0) {
            if (i10 == 1) {
                dVar = (C0.d) this.f41373h0;
                try {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } catch (CancellationException e11) {
                    e10 = e11;
                    try {
                        if (!Ad.l.F0(this.f41375j0)) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = true;
                        long l10 = AbstractC4828h.l(2.14748365E9f, 2.14748365E9f);
                        if (z10) {
                            j6 = Z0.p.f22813b;
                        } else {
                            j6 = dVar.b(l10);
                        }
                        i11.f41386B0.t(new C5009A(j6));
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    long l102 = AbstractC4828h.l(2.14748365E9f, 2.14748365E9f);
                    if (z10) {
                    }
                    i11.f41386B0.t(new C5009A(j6));
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            N n10 = (N) this.f41373h0;
            C0.d dVar2 = new C0.d();
            try {
                boolean z11 = i11.f41390w0;
                Pg.k kVar2 = i11.f41386B0;
                H h10 = i11.f41393z0;
                this.f41373h0 = dVar2;
                this.f41372Z = 1;
                if (P4.a.k(n10, z11, kVar2, h10, dVar2, this) == enumC5000a) {
                    return enumC5000a;
                }
                dVar = dVar2;
            } catch (CancellationException e12) {
                dVar = dVar2;
                e10 = e12;
                if (!Ad.l.F0(this.f41375j0)) {
                    AbstractC4828h.l(2.14748365E9f, 2.14748365E9f);
                    long j10 = Z0.p.f22813b;
                    kVar = i11.f41386B0;
                    c5009a = new C5009A(j10);
                    kVar.t(c5009a);
                    return jf.y.f36177a;
                }
                throw e10;
            } catch (Throwable th4) {
                dVar = dVar2;
                th = th4;
                long l1022 = AbstractC4828h.l(2.14748365E9f, 2.14748365E9f);
                if (z10) {
                }
                i11.f41386B0.t(new C5009A(j6));
                throw th;
            }
        }
        long b10 = dVar.b(AbstractC4828h.l(2.14748365E9f, 2.14748365E9f));
        kVar = i11.f41386B0;
        c5009a = new C5009A(b10);
        kVar.t(c5009a);
        return jf.y.f36177a;
    }
}
