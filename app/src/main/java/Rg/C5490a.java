package rg;

import Mf.h0;
import Pf.b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import yf.AbstractC6583a;

/* renamed from: rg.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5490a implements Ig.a {

    /* renamed from: Y  reason: collision with root package name */
    public static final C5490a f44982Y = new Object();

    @Override // Ig.a
    public final Iterable c(Object obj) {
        int i10 = AbstractC5493d.f44985a;
        Collection m10 = ((b0) ((h0) obj)).m();
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(m10, 10));
        Iterator it = ((ArrayList) m10).iterator();
        while (it.hasNext()) {
            arrayList.add(((b0) ((h0) it.next())).p0());
        }
        return arrayList;
    }
}
