package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.AbstractC6696f;
import z.AbstractC6714o;

/* renamed from: B.g1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0127g1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f1328Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f1329Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ float f1330h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6714o f1331i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f1332j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0127g1(float f6, AbstractC6714o abstractC6714o, kotlin.jvm.internal.y yVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1330h0 = f6;
        this.f1331i0 = abstractC6714o;
        this.f1332j0 = yVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0127g1 c0127g1 = new C0127g1(this.f1330h0, this.f1331i0, this.f1332j0, abstractC4825e);
        c0127g1.f1329Z = obj;
        return c0127g1;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0127g1) create((AbstractC0130h1) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1328Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C0149o c0149o = new C0149o(this.f1332j0, (AbstractC0130h1) this.f1329Z);
            this.f1328Y = 1;
            if (AbstractC6696f.c(0.0f, this.f1330h0, 0.0f, this.f1331i0, c0149o, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
