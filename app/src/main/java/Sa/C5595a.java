package sa;

import Qg.AbstractC1207j;
import com.google.android.gms.internal.play_billing.N;
import jf.C3959i;
import jf.y;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.O;
import wf.n;

/* renamed from: sa.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5595a extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f45467Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f45468Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f45469h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5595a(String str, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f45469h0 = str;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5595a c5595a = new C5595a(this.f45469h0, abstractC4825e);
        c5595a.f45468Z = obj;
        return c5595a;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5595a) create((AbstractC1207j) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f45467Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            AbstractC1207j abstractC1207j = (AbstractC1207j) this.f45468Z;
            String str = this.f45469h0;
            if (str != null) {
                C3959i c3959i = new C3959i(AbstractC4344b.F0(new O(str)), new O(str));
                this.f45467Y = 1;
                if (abstractC1207j.c(c3959i, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return y.f36177a;
    }
}
