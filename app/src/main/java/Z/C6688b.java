package z;

import java.util.concurrent.CancellationException;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: z.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6688b extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public C6716p f51206Y;

    /* renamed from: Z  reason: collision with root package name */
    public kotlin.jvm.internal.x f51207Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f51208h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C6694e f51209i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f51210j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6706k f51211k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ long f51212l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ wf.k f51213m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6688b(C6694e c6694e, Object obj, AbstractC6706k abstractC6706k, long j6, wf.k kVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f51209i0 = c6694e;
        this.f51210j0 = obj;
        this.f51211k0 = abstractC6706k;
        this.f51212l0 = j6;
        this.f51213m0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C6688b(this.f51209i0, this.f51210j0, this.f51211k0, this.f51212l0, this.f51213m0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C6688b) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.jvm.internal.x] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        C6716p c6716p;
        kotlin.jvm.internal.x xVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f51208h0;
        int i11 = 1;
        C6694e c6694e = this.f51209i0;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    xVar = this.f51207Z;
                    c6716p = this.f51206Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.google.android.gms.internal.play_billing.N.B0(obj);
                c6694e.f51230c.f51347h0 = (AbstractC6726u) c6694e.f51228a.f51416a.invoke(this.f51210j0);
                c6694e.f51232e.setValue(this.f51211k0.g());
                c6694e.f51231d.setValue(Boolean.TRUE);
                C6716p c6716p2 = c6694e.f51230c;
                C6716p c6716p3 = new C6716p(c6716p2.f51345Y, c6716p2.f51346Z.getValue(), AbstractC6696f.k(c6716p2.f51347h0), c6716p2.f51348i0, Long.MIN_VALUE, c6716p2.f51350k0);
                ?? obj2 = new Object();
                AbstractC6706k abstractC6706k = this.f51211k0;
                long j6 = this.f51212l0;
                C6686a c6686a = new C6686a(this.f51209i0, c6716p3, this.f51213m0, (Object) obj2, 0);
                this.f51206Y = c6716p3;
                this.f51207Z = obj2;
                this.f51208h0 = 1;
                if (AbstractC6696f.d(c6716p3, abstractC6706k, j6, c6686a, this) == enumC5000a) {
                    return enumC5000a;
                }
                xVar = obj2;
                c6716p = c6716p3;
            }
            if (!xVar.f37645Y) {
                i11 = 2;
            }
            C6694e.a(c6694e);
            return new C6710m(c6716p, i11);
        } catch (CancellationException e10) {
            C6694e.a(c6694e);
            throw e10;
        }
    }
}
