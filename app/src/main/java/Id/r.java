package id;

import Ng.H;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kf.AbstractC4273I;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C3556A f33121Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f33122Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f33123h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f33124i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C3556A c3556a, wf.k kVar, int i10, int i11) {
        super(0);
        this.f33121Y = c3556a;
        this.f33122Z = kVar;
        this.f33123h0 = i10;
        this.f33124i0 = i11;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        wf.k kVar;
        LinkedHashSet linkedHashSet;
        C3556A c3556a = this.f33121Y;
        if (c3556a != null && (kVar = this.f33122Z) != null) {
            int i10 = this.f33123h0;
            int i11 = this.f33124i0;
            m mVar = new m(H.c(i10, i11));
            Set set = c3556a.f33077c;
            if (set.contains(mVar)) {
                linkedHashSet = AbstractC4273I.s2(set, mVar);
            } else {
                linkedHashSet = AbstractC4273I.v2(set, mVar);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : c3556a.f33075a) {
                if (((Number) obj).intValue() != i11) {
                    arrayList.add(obj);
                }
            }
            Set P22 = kf.t.P2(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : c3556a.f33076b) {
                if (((Number) obj2).intValue() != i10) {
                    arrayList2.add(obj2);
                }
            }
            kVar.invoke(new C3556A(P22, kf.t.P2(arrayList2), linkedHashSet));
        }
        return jf.y.f36177a;
    }
}
