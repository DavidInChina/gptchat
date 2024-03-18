package x9;

import id.AbstractC3557B;
import j0.C3878C;
import j0.u;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.jvm.internal.o;
import l8.AbstractC4344b;
import r0.r;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class m extends o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public static final m f49684Y = new o(2);

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        l lVar = (l) obj2;
        AbstractC3557B.c0("$this$Saver", (i0.d) obj);
        AbstractC3557B.c0("state", lVar);
        u uVar = lVar.f49676b;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(uVar, 10));
        ListIterator listIterator = uVar.listIterator();
        while (true) {
            C3878C c3878c = (C3878C) listIterator;
            if (!c3878c.hasNext()) {
                break;
            }
            arrayList.add(n.b((f) c3878c.next(), lVar.f49683i));
        }
        u uVar2 = lVar.f49678d;
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(uVar2, 10));
        ListIterator listIterator2 = uVar2.listIterator();
        while (true) {
            C3878C c3878c2 = (C3878C) listIterator2;
            if (!c3878c2.hasNext()) {
                break;
            }
            arrayList2.add(n.b((f) c3878c2.next(), lVar.f49683i));
        }
        u uVar3 = lVar.f49677c;
        ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(uVar3, 10));
        ListIterator listIterator3 = uVar3.listIterator();
        while (true) {
            C3878C c3878c3 = (C3878C) listIterator3;
            if (c3878c3.hasNext()) {
                arrayList3.add(n.b((f) c3878c3.next(), lVar.f49683i));
            } else {
                return AbstractC4344b.G0(lVar.f49675a, Float.valueOf(lVar.f49679e.h()), Float.valueOf(lVar.f49680f.h()), Integer.valueOf(androidx.compose.ui.graphics.a.s(((r) lVar.f49681g.getValue()).f44265a)), arrayList, arrayList2, arrayList3, Integer.valueOf((int) (lVar.f49683i >> 32)), Integer.valueOf((int) (lVar.f49683i & 4294967295L)), Integer.valueOf((int) (lVar.f49682h >> 32)), Integer.valueOf((int) (lVar.f49682h & 4294967295L)));
            }
        }
    }
}
