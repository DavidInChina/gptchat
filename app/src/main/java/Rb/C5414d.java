package rb;

import ca.AbstractC2313e;
import ca.C2317i;
import ca.C2325q;
import com.google.android.gms.internal.play_billing.N;
import fa.C2969F;
import jf.C3959i;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: rb.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5414d extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f44675Y;

    /* JADX WARN: Type inference failed for: r0v0, types: [rb.d, pf.j, nf.e] */
    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        ?? abstractC5163j = new AbstractC5163j(2, abstractC4825e);
        abstractC5163j.f44675Y = obj;
        return abstractC5163j;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5414d) create((T9.c) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        C2317i c2317i;
        N n10;
        C2325q c2325q;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        AbstractC2313e a5 = T9.b.a(((T9.c) this.f44675Y).f16971f);
        C2969F c2969f = null;
        if (a5 instanceof C2317i) {
            c2317i = (C2317i) a5;
        } else {
            c2317i = null;
        }
        if (c2317i != null) {
            n10 = c2317i.f26395d;
        } else {
            n10 = null;
        }
        if (n10 instanceof C2325q) {
            c2325q = (C2325q) n10;
        } else {
            c2325q = null;
        }
        if (a5 != null) {
            c2969f = a5.c();
        }
        return new C3959i(c2325q, c2969f);
    }
}
