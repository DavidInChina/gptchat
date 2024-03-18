package i9;

import Ad.l;
import com.google.android.gms.internal.play_billing.N;
import java.util.ArrayList;
import java.util.Set;
import jf.y;
import nf.AbstractC4825e;
import od.AbstractC4991b;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;
import yf.AbstractC6583a;

/* renamed from: i9.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3513e extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f32886Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ boolean f32887Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C3514f f32888h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3513e(C3514f c3514f, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f32888h0 = c3514f;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C3513e c3513e = new C3513e(this.f32888h0, abstractC4825e);
        c3513e.f32887Z = ((Boolean) obj).booleanValue();
        return c3513e;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C3513e) create(bool, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f32886Y;
        y yVar = y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            if (!this.f32887Z) {
                return yVar;
            }
            C3514f c3514f = this.f32888h0;
            Set<AbstractC4991b> set = c3514f.f32890b;
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(set, 10));
            for (AbstractC4991b abstractC4991b : set) {
                arrayList.add(l.O0(c3514f.f32889a, abstractC4991b.c(), null, new C3512d(abstractC4991b, null), 2));
            }
            this.f32886Y = 1;
            if (r9.y.I0(arrayList, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
