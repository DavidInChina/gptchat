package W;

import q0.C5254f;
import t0.AbstractC5650i;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class E2 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ long f19086Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f19087Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f19088h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f19089i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E2(long j6, int i10, AbstractC6216a abstractC6216a, long j10) {
        super(1);
        this.f19086Y = j6;
        this.f19087Z = i10;
        this.f19088h0 = abstractC6216a;
        this.f19089i0 = j10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        AbstractC5650i abstractC5650i = (AbstractC5650i) obj;
        float b10 = C5254f.b(abstractC5650i.g());
        I2.f(abstractC5650i, 0.0f, 1.0f, this.f19086Y, b10, this.f19087Z);
        I2.f(abstractC5650i, 0.0f, ((Number) this.f19088h0.mo122invoke()).floatValue(), this.f19089i0, b10, this.f19087Z);
        return jf.y.f36177a;
    }
}
