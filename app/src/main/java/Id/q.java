package id;

import java.util.ArrayList;
import java.util.Set;
import kf.AbstractC4273I;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f33117Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C3556A f33118Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f33119h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f33120i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(C3556A c3556a, wf.k kVar, int i10, int i11) {
        super(0);
        this.f33117Y = i11;
        this.f33118Z = c3556a;
        this.f33119h0 = kVar;
        this.f33120i0 = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f33117Y;
        int i11 = this.f33120i0;
        wf.k kVar = this.f33119h0;
        C3556A c3556a = this.f33118Z;
        switch (i10) {
            case 0:
                if (c3556a == null || kVar == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : c3556a.f33077c) {
                    if (((int) (((m) obj).f33107a & 4294967295L)) != i11) {
                        arrayList.add(obj);
                    }
                }
                Set P22 = kf.t.P2(arrayList);
                Integer valueOf = Integer.valueOf(i11);
                Set set = c3556a.f33075a;
                kVar.invoke(C3556A.a(c3556a, set.contains(valueOf) ? AbstractC4273I.s2(set, valueOf) : AbstractC4273I.v2(set, valueOf), null, P22, 2));
                return;
            default:
                if (c3556a == null || kVar == null) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : c3556a.f33077c) {
                    if (((int) (((m) obj2).f33107a >> 32)) != i11) {
                        arrayList2.add(obj2);
                    }
                }
                Set P23 = kf.t.P2(arrayList2);
                Integer valueOf2 = Integer.valueOf(i11);
                Set set2 = c3556a.f33076b;
                kVar.invoke(C3556A.a(c3556a, null, set2.contains(valueOf2) ? AbstractC4273I.s2(set2, valueOf2) : AbstractC4273I.v2(set2, valueOf2), P23, 1));
                return;
        }
    }
}
