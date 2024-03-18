package hg;

import androidx.datastore.preferences.protobuf.n0;
import fg.P;
import fg.Q;
import fg.X;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import l8.AbstractC4344b;
import yf.AbstractC6583a;

/* renamed from: hg.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3430i {

    /* renamed from: a  reason: collision with root package name */
    public final List f32340a;

    public C3430i(X x10) {
        List list = x10.f30467h0;
        if ((x10.f30466Z & 1) == 1) {
            int i10 = x10.f30468i0;
            AbstractC3557B.b0("getTypeList(...)", list);
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 >= 0) {
                    Q q10 = (Q) obj;
                    if (i11 >= i10) {
                        q10.getClass();
                        P q11 = Q.q(q10);
                        q11.f30378i0 |= 2;
                        q11.f30380k0 = true;
                        q10 = q11.e();
                        if (!q10.isInitialized()) {
                            throw new n0();
                        }
                    }
                    arrayList.add(q10);
                    i11 = i12;
                } else {
                    AbstractC4344b.d1();
                    throw null;
                }
            }
            list = arrayList;
        }
        AbstractC3557B.b0("run(...)", list);
        this.f32340a = list;
    }

    public final Q a(int i10) {
        return (Q) this.f32340a.get(i10);
    }
}
