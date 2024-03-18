package W;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.AbstractC6696f;
import z.C6697f0;

/* renamed from: W.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1586n extends AbstractC5163j implements wf.p {

    /* renamed from: Y  reason: collision with root package name */
    public int f20230Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ C1645z f20231Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ F1 f20232h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f20233i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C f20234j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ float f20235k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1586n(C c10, float f6, AbstractC4825e abstractC4825e) {
        super(4, abstractC4825e);
        this.f20234j0 = c10;
        this.f20235k0 = f6;
    }

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        C1586n c1586n = new C1586n(this.f20234j0, this.f20235k0, (AbstractC4825e) obj4);
        c1586n.f20231Z = (C1645z) obj;
        c1586n.f20232h0 = (F1) obj2;
        c1586n.f20233i0 = obj3;
        return c1586n.invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.jvm.internal.y] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        float h10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f20230Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C1645z c1645z = this.f20231Z;
            float c10 = this.f20232h0.c(this.f20233i0);
            if (!Float.isNaN(c10)) {
                ?? obj2 = new Object();
                C c11 = this.f20234j0;
                if (Float.isNaN(c11.f19000i.h())) {
                    h10 = 0.0f;
                } else {
                    h10 = c11.f19000i.h();
                }
                float f6 = h10;
                obj2.f37646Y = f6;
                C6697f0 c6697f0 = AbstractC1576l.f20202a;
                C1581m c1581m = new C1581m(c1645z, 0, obj2);
                this.f20231Z = null;
                this.f20232h0 = null;
                this.f20230Y = 1;
                if (AbstractC6696f.c(f6, c10, this.f20235k0, c6697f0, c1581m, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return jf.y.f36177a;
    }
}
