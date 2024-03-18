package Pf;

import hg.C3422a;
import java.util.ArrayList;
import java.util.List;
import kg.C4291c;
import wf.AbstractC6216a;
import yf.AbstractC6583a;

/* renamed from: Pf.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1167z extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14188Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ A f14189Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1167z(A a5, int i10) {
        super(0);
        this.f14188Y = i10;
        this.f14189Z = a5;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f14188Y;
        A a5 = this.f14189Z;
        switch (i10) {
            case 0:
                G g10 = a5.f13975h0;
                g10.p0();
                return Boolean.valueOf(r.f.L((C1157o) g10.f14001p0.getValue(), a5.f13976i0));
            case 1:
                G g11 = a5.f13975h0;
                g11.p0();
                return r.f.R((C1157o) g11.f14001p0.getValue(), a5.f13976i0);
            default:
                Ag.l lVar = a5.f13978k0;
                Df.v[] vVarArr = A.f13974m0;
                if (((Boolean) A7.b.X0(lVar, vVarArr[1])).booleanValue()) {
                    return ug.m.f46797b;
                }
                List<Mf.G> list = (List) A7.b.X0(a5.f13977j0, vVarArr[0]);
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                for (Mf.G g12 : list) {
                    arrayList.add(g12.R());
                }
                G g13 = a5.f13975h0;
                C4291c c4291c = a5.f13976i0;
                ArrayList x22 = kf.t.x2(new U(g13, c4291c), arrayList);
                return C3422a.g("package view scope for " + c4291c + " in " + g13.getName(), x22);
        }
    }
}
