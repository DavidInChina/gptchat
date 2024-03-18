package oh;

import com.google.android.gms.internal.play_billing.N;
import k6.AbstractC4194d;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class s extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public kotlin.jvm.internal.B f41454Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f41455Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f41456h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f41457i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ x f41458j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(kotlin.jvm.internal.B b10, x xVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41457i0 = b10;
        this.f41458j0 = xVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        s sVar = new s(this.f41457i0, this.f41458j0, abstractC4825e);
        sVar.f41456h0 = obj;
        return sVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((C5017d) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004e -> B:20:0x0051). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C5017d c5017d;
        boolean z10;
        C5022i c5022i;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41455Z;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.jvm.internal.B b10 = this.f41454Y;
                C5017d c5017d2 = (C5017d) this.f41456h0;
                N.B0(obj);
                b10.f37622Y = obj;
                c5017d = c5017d2;
                b10 = this.f41457i0;
                Object obj2 = b10.f37622Y;
                z10 = obj2 instanceof C5022i;
                if (z10) {
                    if (z10) {
                        c5022i = (C5022i) obj2;
                    } else {
                        c5022i = null;
                    }
                    if (c5022i != null) {
                        long j6 = c5022i.f41421a;
                        AbstractC4194d.P(c5017d, c5022i.f41422b, 0L, j6, 6);
                    }
                    Pg.k kVar = this.f41458j0.f41474B0;
                    this.f41456h0 = c5017d;
                    this.f41454Y = b10;
                    this.f41455Z = 1;
                    Object g10 = kVar.g(this);
                    if (g10 == enumC5000a) {
                        return enumC5000a;
                    }
                    c5017d2 = c5017d;
                    obj = g10;
                    b10.f37622Y = obj;
                    c5017d = c5017d2;
                    b10 = this.f41457i0;
                    Object obj22 = b10.f37622Y;
                    z10 = obj22 instanceof C5022i;
                    if (z10) {
                    }
                } else {
                    return jf.y.f36177a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            c5017d = (C5017d) this.f41456h0;
            b10 = this.f41457i0;
            Object obj222 = b10.f37622Y;
            z10 = obj222 instanceof C5022i;
            if (z10) {
            }
        }
    }
}
