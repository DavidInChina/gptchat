package Z1;

import android.content.Context;
import java.util.ArrayList;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class Y extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f22931Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f22932Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1751a0 f22933h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Context f22934i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int[] f22935j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(AbstractC1751a0 abstractC1751a0, Context context, int[] iArr, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f22933h0 = abstractC1751a0;
        this.f22934i0 = context;
        this.f22935j0 = iArr;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        Y y10 = new Y(this.f22933h0, this.f22934i0, this.f22935j0, abstractC4825e);
        y10.f22932Z = obj;
        return y10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((Y) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f22931Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Ng.F f6 = (Ng.F) this.f22932Z;
            AbstractC1751a0 abstractC1751a0 = this.f22933h0;
            Context context = this.f22934i0;
            AbstractC1751a0.a(abstractC1751a0, f6, context);
            int[] iArr = this.f22935j0;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i11 : iArr) {
                arrayList.add(Ad.l.L(f6, null, new X(abstractC1751a0, context, i11, null), 3));
            }
            this.f22931Y = 1;
            if (L4.a.W(arrayList, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
