package mg;

import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1003l;
import Mf.b0;
import id.AbstractC3557B;
import java.util.ArrayList;
import kf.C4269E;
import kg.C4294f;

/* renamed from: mg.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4653c implements AbstractC4655e {

    /* renamed from: a  reason: collision with root package name */
    public static final C4653c f39287a = new Object();

    @Override // mg.AbstractC4655e
    public final String a(AbstractC1000i abstractC1000i, m mVar) {
        boolean z10;
        AbstractC3557B.c0("renderer", mVar);
        if (abstractC1000i instanceof b0) {
            C4294f name = ((b0) abstractC1000i).getName();
            AbstractC3557B.b0("getName(...)", name);
            return mVar.O(name, false);
        }
        ArrayList arrayList = new ArrayList();
        AbstractC1000i abstractC1000i2 = abstractC1000i;
        do {
            arrayList.add(abstractC1000i2.getName());
            AbstractC1003l mo20k = abstractC1000i2.mo20k();
            z10 = mo20k instanceof AbstractC0997f;
            abstractC1000i2 = mo20k;
        } while (z10);
        return Bi.c.x1(new C4269E(arrayList));
    }
}
