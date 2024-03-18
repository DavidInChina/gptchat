package g2;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: g2.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3151i extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f31093Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.A f31094Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.A f31095h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C3153k f31096i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ long f31097j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3151i(kotlin.jvm.internal.A a5, kotlin.jvm.internal.A a10, C3153k c3153k, long j6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f31094Z = a5;
        this.f31095h0 = a10;
        this.f31096i0 = c3153k;
        this.f31097j0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C3151i(this.f31094Z, this.f31095h0, this.f31096i0, this.f31097j0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3151i) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f31093Y;
        C3153k c3153k = this.f31096i0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    C3153k.b(c3153k, ((Number) c3153k.f31104j0.mo122invoke()).longValue());
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.google.android.gms.internal.play_billing.N.B0(obj);
                long j6 = this.f31097j0;
                c3153k.f31105k0.c(j6);
                synchronized (c3153k.f31106l0) {
                    c3153k.f31108n0 = j6;
                }
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            long j10 = this.f31094Z.f37621Y;
            long j11 = this.f31095h0.f37621Y;
            if (j10 >= j11) {
                this.f31093Y = 1;
                if (L4.a.a1(this) == enumC5000a) {
                    return enumC5000a;
                }
                long j62 = this.f31097j0;
                c3153k.f31105k0.c(j62);
                synchronized (c3153k.f31106l0) {
                }
            } else {
                this.f31093Y = 2;
                if (R4.b.p0((j11 - j10) / 1000000, this) == enumC5000a) {
                    return enumC5000a;
                }
                C3153k.b(c3153k, ((Number) c3153k.f31104j0.mo122invoke()).longValue());
            }
        }
        return jf.y.f36177a;
    }
}
