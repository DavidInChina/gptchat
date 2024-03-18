package oa;

import ca.AbstractC2314f;
import ca.AbstractC2318j;
import ca.C2315g;
import ca.C2316h;
import ca.C2317i;
import com.google.android.gms.internal.play_billing.N;
import fa.AbstractC2965B;
import fa.C2969F;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: oa.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4976a extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f41087Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4972C f41088Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4976a(C4972C c4972c, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41088Z = c4972c;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C4976a c4976a = new C4976a(this.f41088Z, abstractC4825e);
        c4976a.f41087Y = obj;
        return c4976a;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C4976a) create((List) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        C4972C c4972c = this.f41088Z;
        c4972c.getClass();
        for (AbstractC2318j abstractC2318j : (List) this.f41087Y) {
            if (!(abstractC2318j instanceof C2315g)) {
                if (abstractC2318j instanceof C2316h) {
                    c4972c.i(((C2316h) abstractC2318j).f26391a.f30015h);
                } else if (abstractC2318j instanceof C2317i) {
                    C2317i c2317i = (C2317i) abstractC2318j;
                    AbstractC2965B abstractC2965B = c2317i.f26394c;
                    if (abstractC2965B != null) {
                        c4972c.i(abstractC2965B);
                    }
                    for (C2969F c2969f : c2317i.f26393b) {
                        c4972c.i(c2969f.f30015h);
                    }
                } else {
                    boolean z10 = abstractC2318j instanceof AbstractC2314f;
                }
            }
        }
        return jf.y.f36177a;
    }
}
