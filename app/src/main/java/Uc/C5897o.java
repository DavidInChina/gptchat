package uc;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import java.util.Iterator;
import java.util.Map;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: uc.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5897o extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f46655Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5900r f46656Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5897o(C5900r c5900r, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f46656Z = c5900r;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5897o c5897o = new C5897o(this.f46656Z, abstractC4825e);
        c5897o.f46655Y = obj;
        return c5897o;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((C5897o) create((C5885c) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        C5885c c5885c = (C5885c) this.f46655Y;
        C5900r c5900r = this.f46656Z;
        c5900r.f46669e.setValue(c5885c.f46630a);
        Map map = c5885c.f46630a;
        boolean z10 = false;
        if (!map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                AbstractC2469q0.p(entry.getKey());
                if (!((Boolean) entry.getValue()).booleanValue() && !c5885c.f46631b.contains(null)) {
                    z10 = true;
                    break;
                }
            }
        }
        c5900r.f46670f.setValue(Boolean.valueOf(z10));
        return y.f36177a;
    }
}
