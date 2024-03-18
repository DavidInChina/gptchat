package oh;

import A.B0;
import A.E0;
import A.F0;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: oh.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5016c extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f41405Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5018e f41406Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ B0 f41407h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.n f41408i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5016c(C5018e c5018e, B0 b02, wf.n nVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41406Z = c5018e;
        this.f41407h0 = b02;
        this.f41408i0 = nVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C5016c(this.f41406Z, this.f41407h0, this.f41408i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5016c) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41405Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5018e c5018e = this.f41406Z;
            F0 f02 = c5018e.f41412c;
            C5015b c5015b = new C5015b(c5018e, this.f41408i0, null);
            this.f41405Y = 1;
            f02.getClass();
            if (Ad.l.e0(new E0(this.f41407h0, f02, c5015b, c5018e.f41411b, null), this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
