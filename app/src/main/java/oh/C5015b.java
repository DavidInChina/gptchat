package oh;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: oh.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5015b extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f41401Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f41402Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5018e f41403h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.n f41404i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5015b(C5018e c5018e, wf.n nVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41403h0 = c5018e;
        this.f41404i0 = nVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5015b c5015b = new C5015b(this.f41403h0, this.f41404i0, abstractC4825e);
        c5015b.f41402Z = obj;
        return c5015b;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5015b) create((C5017d) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41401Y;
        C5018e c5018e = this.f41403h0;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    N.B0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                N.B0(obj);
                C5017d c5017d = (C5017d) this.f41402Z;
                c5018e.f41413d.setValue(Boolean.TRUE);
                wf.n nVar = this.f41404i0;
                this.f41401Y = 1;
                if (nVar.invoke(c5017d, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
            c5018e.f41413d.setValue(Boolean.FALSE);
            return jf.y.f36177a;
        } catch (Throwable th2) {
            c5018e.f41413d.setValue(Boolean.FALSE);
            throw th2;
        }
    }
}
