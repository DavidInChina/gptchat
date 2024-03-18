package B;

import java.util.concurrent.CancellationException;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.AbstractC6696f;
import z.C6686a;
import z.C6716p;
import z.C6736z;

/* loaded from: classes.dex */
public final class V extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public kotlin.jvm.internal.y f1196Y;

    /* renamed from: Z  reason: collision with root package name */
    public C6716p f1197Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f1198h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ float f1199i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ W f1200j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0130h1 f1201k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(float f6, W w10, AbstractC0130h1 abstractC0130h1, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1199i0 = f6;
        this.f1200j0 = w10;
        this.f1201k0 = abstractC0130h1;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new V(this.f1199i0, this.f1200j0, this.f1201k0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.jvm.internal.y] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        float f6;
        kotlin.jvm.internal.y yVar;
        kotlin.jvm.internal.y yVar2;
        C6716p c6716p;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1198h0;
        if (i10 != 0) {
            if (i10 == 1) {
                c6716p = this.f1197Z;
                yVar2 = this.f1196Y;
                try {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    yVar = yVar2;
                } catch (CancellationException unused) {
                    yVar2.f37646Y = ((Number) c6716p.b()).floatValue();
                    yVar = yVar2;
                    f6 = yVar.f37646Y;
                    return new Float(f6);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            f6 = this.f1199i0;
            if (Math.abs(f6) > 1.0f) {
                yVar2 = new Object();
                yVar2.f37646Y = f6;
                Object obj2 = new Object();
                C6716p b10 = AbstractC6696f.b(0.0f, f6, 28);
                try {
                    W w10 = this.f1200j0;
                    C6736z c6736z = w10.f1211a;
                    C6686a c6686a = new C6686a(obj2, this.f1201k0, (Object) yVar2, w10, 2);
                    this.f1196Y = yVar2;
                    this.f1197Z = b10;
                    this.f1198h0 = 1;
                    yVar = yVar2;
                    if (AbstractC6696f.e(b10, c6736z, false, c6686a, this) == enumC5000a) {
                        return enumC5000a;
                    }
                } catch (CancellationException unused2) {
                    c6716p = b10;
                    yVar2.f37646Y = ((Number) c6716p.b()).floatValue();
                    yVar = yVar2;
                    f6 = yVar.f37646Y;
                    return new Float(f6);
                }
            }
            return new Float(f6);
        }
        f6 = yVar.f37646Y;
        return new Float(f6);
    }
}
