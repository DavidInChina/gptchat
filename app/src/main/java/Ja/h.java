package Ja;

import G0.C0571a;
import b4.C2123d;
import ca.C2311c;
import ca.EnumC2320l;
import com.google.android.gms.internal.play_billing.N;
import d4.AbstractC2597f;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import jf.y;
import n9.C4726e;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class h extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ p f8919Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f8920Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p pVar, AbstractC4825e abstractC4825e, boolean z10) {
        super(2, abstractC4825e);
        this.f8919Y = pVar;
        this.f8920Z = z10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new h(this.f8919Y, abstractC4825e, this.f8920Z);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((b4.h) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        C2311c c2311c;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        p pVar = this.f8919Y;
        C4726e c4726e = pVar.f8950c;
        c4726e.getClass();
        C0571a c0571a = new C0571a(28, c4726e);
        AbstractC2597f abstractC2597f = c4726e.f25632a;
        AbstractC3557B.c0("driver", abstractC2597f);
        C2123d c2123d = new C2123d(new String[]{"DBConversation"}, abstractC2597f, c0571a);
        List<C2311c> list = (List) c2123d.a(new C0571a(17, c2123d)).f27991b;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        for (C2311c c2311c2 : list) {
            if (this.f8920Z) {
                c2311c = C2311c.a(c2311c2, null, null, null, null, null, null, null, EnumC2320l.f26398Y, null, 14335);
            } else {
                c2311c = p.a(pVar, c2311c2);
            }
            arrayList.add(c2311c);
        }
        return arrayList;
    }
}
