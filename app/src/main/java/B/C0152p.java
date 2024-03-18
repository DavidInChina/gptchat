package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.AbstractC6696f;

/* renamed from: B.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152p extends AbstractC5163j implements wf.p {

    /* renamed from: Y  reason: collision with root package name */
    public int f1444Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ C f1445Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ P0 f1446h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f1447i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ H f1448j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ float f1449k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0152p(H h10, float f6, AbstractC4825e abstractC4825e) {
        super(4, abstractC4825e);
        this.f1448j0 = h10;
        this.f1449k0 = f6;
    }

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        C0152p c0152p = new C0152p(this.f1448j0, this.f1449k0, (AbstractC4825e) obj4);
        c0152p.f1445Z = (C) obj;
        c0152p.f1446h0 = (P0) obj2;
        c0152p.f1447i0 = obj3;
        return c0152p.invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.jvm.internal.y, java.io.Serializable] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        float f6;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1444Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C c10 = this.f1445Z;
            float c11 = this.f1446h0.c(this.f1447i0);
            if (!Float.isNaN(c11)) {
                ?? obj2 = new Object();
                H h10 = this.f1448j0;
                if (Float.isNaN(h10.f1088h.h())) {
                    f6 = 0.0f;
                } else {
                    f6 = h10.f1088h.h();
                }
                obj2.f37646Y = f6;
                C0149o c0149o = new C0149o(c10, obj2, 0);
                this.f1445Z = null;
                this.f1446h0 = null;
                this.f1444Y = 1;
                if (AbstractC6696f.c(f6, c11, this.f1449k0, h10.f1081a, c0149o, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return jf.y.f36177a;
    }
}
