package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: B.x1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177x1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public A1 f1553Y;

    /* renamed from: Z  reason: collision with root package name */
    public kotlin.jvm.internal.A f1554Z;

    /* renamed from: h0  reason: collision with root package name */
    public long f1555h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f1556i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f1557j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ A1 f1558k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.A f1559l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ long f1560m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0177x1(A1 a12, kotlin.jvm.internal.A a5, long j6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1558k0 = a12;
        this.f1559l0 = a5;
        this.f1560m0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0177x1 c0177x1 = new C0177x1(this.f1558k0, this.f1559l0, this.f1560m0, abstractC4825e);
        c0177x1.f1557j0 = obj;
        return c0177x1;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0177x1) create((AbstractC0130h1) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        A1 a12;
        A1 a13;
        kotlin.jvm.internal.A a5;
        long j6;
        long j10;
        float f6;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1556i0;
        W0 w02 = W0.f1214Z;
        if (i10 != 0) {
            if (i10 == 1) {
                j6 = this.f1555h0;
                a5 = this.f1554Z;
                a13 = this.f1553Y;
                a12 = (A1) this.f1557j0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            a13 = this.f1558k0;
            C0174w1 c0174w1 = new C0174w1(a13, new J(a13, 1, (AbstractC0130h1) this.f1557j0));
            L0 l02 = a13.f1026e;
            a5 = this.f1559l0;
            long j11 = a5.f37621Y;
            W0 w03 = a13.f1023b;
            long j12 = this.f1560m0;
            if (w03 == w02) {
                f6 = Z0.p.b(j12);
            } else {
                f6 = Z0.p.c(j12);
            }
            if (a13.f1025d) {
                f6 *= -1;
            }
            this.f1557j0 = a13;
            this.f1553Y = a13;
            this.f1554Z = a5;
            this.f1555h0 = j11;
            this.f1556i0 = 1;
            obj = l02.a(c0174w1, f6, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
            j6 = j11;
            a12 = a13;
        }
        float floatValue = ((Number) obj).floatValue();
        if (a12.f1025d) {
            floatValue *= -1;
        }
        if (a13.f1023b == w02) {
            j10 = Z0.p.a(j6, floatValue, 0.0f, 2);
        } else {
            j10 = Z0.p.a(j6, 0.0f, floatValue, 1);
        }
        a5.f37621Y = j10;
        return jf.y.f36177a;
    }
}
