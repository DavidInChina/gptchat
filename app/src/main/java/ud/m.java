package ud;

import Ng.F;
import Z.AbstractC1710f0;
import Z8.AbstractC1805k0;
import Z8.AbstractC1809m0;
import Z8.K0;
import com.google.android.gms.internal.play_billing.N;
import jf.C3959i;
import jf.y;
import kf.AbstractC4268D;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class m extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f46708Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f46709Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AbstractC1710f0 abstractC1710f0, AbstractC1710f0 abstractC1710f02, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f46708Y = abstractC1710f0;
        this.f46709Z = abstractC1710f02;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new m(this.f46708Y, this.f46709Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        AbstractC1710f0 abstractC1710f0 = this.f46708Y;
        Long l10 = (Long) abstractC1710f0.getValue();
        y yVar = y.f36177a;
        if (l10 != null) {
            AbstractC1710f0 abstractC1710f02 = this.f46709Z;
            if (((Long) abstractC1710f02.getValue()) != null) {
                AbstractC1805k0 a5 = AbstractC1809m0.a();
                K0 k02 = K0.f23257c;
                C3959i[] c3959iArr = new C3959i[2];
                Object obj2 = (Long) abstractC1710f0.getValue();
                if (obj2 == null) {
                    obj2 = new Float(-1.0f);
                }
                c3959iArr[0] = new C3959i("webViewLoadMs", obj2);
                Object obj3 = (Long) abstractC1710f02.getValue();
                if (obj3 == null) {
                    obj3 = new Float(-1.0f);
                }
                c3959iArr[1] = new C3959i("syntaxHighlightMs", obj3);
                a5.b(k02, AbstractC4268D.a1(c3959iArr));
            }
        }
        return yVar;
    }
}
