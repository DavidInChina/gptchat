package Yf;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kf.AbstractC4273I;
import wf.AbstractC6216a;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f22365Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ o f22366Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i10) {
        super(0);
        this.f22365Y = i10;
        this.f22366Z = oVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        switch (this.f22365Y) {
            case 0:
                List a5 = ((Sf.q) this.f22366Z.f22368o).a();
                ArrayList arrayList = new ArrayList();
                for (Object obj : a5) {
                    if (((Sf.w) obj).f16627a.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int n02 = P4.a.n0(AbstractC6583a.H1(arrayList, 10));
                if (n02 < 16) {
                    n02 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(((Sf.w) next).b(), next);
                }
                return linkedHashMap;
            case 1:
                return mo122invoke();
            default:
                return mo122invoke();
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final Set mo122invoke() {
        int i10 = this.f22365Y;
        o oVar = this.f22366Z;
        switch (i10) {
            case 1:
                Class<?>[] declaredClasses = ((Sf.q) oVar.f22368o).f16621a.getDeclaredClasses();
                AbstractC3557B.b0("getDeclaredClasses(...)", declaredClasses);
                return kf.t.P2(Kg.m.p1(Kg.m.o1(Kg.m.i1(kf.q.R2(declaredClasses), Sf.n.f16618Y), Sf.o.f16619Y)));
            default:
                return AbstractC4273I.u2(oVar.b(), oVar.g());
        }
    }
}
