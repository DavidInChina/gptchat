package Yf;

import Mf.b0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rg.AbstractC5493d;
import wf.AbstractC6216a;
import yf.AbstractC6583a;

/* renamed from: Yf.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1695g extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f22337Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1697i f22338Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1695g(C1697i c1697i, int i10) {
        super(0);
        this.f22337Y = i10;
        this.f22338Z = c1697i;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final List mo122invoke() {
        int i10 = this.f22337Y;
        C1697i c1697i = this.f22338Z;
        switch (i10) {
            case 0:
                return AbstractC3557B.i0(c1697i);
            case 1:
                ArrayList typeParameters = ((Sf.q) c1697i.f22345n0).getTypeParameters();
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(typeParameters, 10));
                Iterator it = typeParameters.iterator();
                while (it.hasNext()) {
                    Sf.E e10 = (Sf.E) it.next();
                    b0 a5 = ((Xf.i) c1697i.f22347p0.f45395b).a(e10);
                    if (a5 != null) {
                        arrayList.add(a5);
                    } else {
                        throw new AssertionError("Parameter " + e10 + " surely belongs to class " + c1697i.f22345n0 + ", so it must be resolved");
                    }
                }
                return arrayList;
            default:
                if (AbstractC5493d.f(c1697i) == null) {
                    return null;
                }
                ((Xf.a) c1697i.f22344m0.f45394a).f21974w.getClass();
                return null;
        }
    }
}
