package hg;

import android.gov.nist.core.Separators;
import fg.I;
import fg.J;
import fg.K;
import fg.L;
import id.AbstractC3557B;
import java.util.LinkedList;
import java.util.List;
import jf.C3964n;
import kf.t;

/* renamed from: hg.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3429h implements AbstractC3428g {

    /* renamed from: a  reason: collision with root package name */
    public final L f32338a;

    /* renamed from: b  reason: collision with root package name */
    public final K f32339b;

    public C3429h(L l10, K k10) {
        this.f32338a = l10;
        this.f32339b = k10;
    }

    @Override // hg.AbstractC3428g
    public final String a(int i10) {
        C3964n d10 = d(i10);
        List list = (List) d10.f36165Y;
        String m22 = t.m2((List) d10.f36166Z, Separators.DOT, null, null, null, 62);
        if (!list.isEmpty()) {
            return t.m2(list, Separators.SLASH, null, null, null, 62) + '/' + m22;
        }
        return m22;
    }

    @Override // hg.AbstractC3428g
    public final String b(int i10) {
        String str = (String) this.f32338a.f30356Z.get(i10);
        AbstractC3557B.b0("getString(...)", str);
        return str;
    }

    @Override // hg.AbstractC3428g
    public final boolean c(int i10) {
        return ((Boolean) d(i10).f36167h0).booleanValue();
    }

    public final C3964n d(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i10 != -1) {
            J j6 = (J) this.f32339b.f30350Z.get(i10);
            String str = (String) this.f32338a.f30356Z.get(j6.f30343i0);
            I i11 = j6.f30344j0;
            AbstractC3557B.Z(i11);
            int ordinal = i11.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        linkedList2.addFirst(str);
                        z10 = true;
                    }
                } else {
                    linkedList.addFirst(str);
                }
            } else {
                linkedList2.addFirst(str);
            }
            i10 = j6.f30342h0;
        }
        return new C3964n(linkedList, linkedList2, Boolean.valueOf(z10));
    }
}
