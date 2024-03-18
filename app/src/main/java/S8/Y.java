package S8;

import id.AbstractC3557B;
import java.util.List;
import q0.C5254f;
import t0.AbstractC5648g;
import t0.AbstractC5650i;

/* loaded from: classes.dex */
public final class Y extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ List f16284Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ List f16285Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f16286h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ float f16287i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(List list, List list2, long j6, float f6) {
        super(1);
        this.f16284Y = list;
        this.f16285Z = list2;
        this.f16286h0 = j6;
        this.f16287i0 = f6;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        AbstractC5650i abstractC5650i = (AbstractC5650i) obj;
        AbstractC3557B.c0("$this$drawBehind", abstractC5650i);
        for (Number number : this.f16284Y) {
            float floatValue = number.floatValue();
            AbstractC5648g.g(abstractC5650i, this.f16286h0, R4.b.r(0.0f, floatValue), R4.b.r(C5254f.d(abstractC5650i.g()), floatValue), this.f16287i0, 0, 496);
        }
        for (Number number2 : this.f16285Z) {
            float floatValue2 = number2.floatValue();
            AbstractC5648g.g(abstractC5650i, this.f16286h0, R4.b.r(floatValue2, 0.0f), R4.b.r(floatValue2, C5254f.b(abstractC5650i.g())), this.f16287i0, 0, 496);
        }
        return jf.y.f36177a;
    }
}
