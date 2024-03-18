package zg;

import K4.J;
import Mf.AbstractC0994c;
import Mf.C1009s;
import Pf.AbstractC1165x;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import ng.C4846m;

/* renamed from: zg.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6858e extends J {

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ List f52027n0;

    public C6858e(ArrayList arrayList) {
        this.f52027n0 = arrayList;
    }

    @Override // K4.J
    public final void g(AbstractC0994c abstractC0994c) {
        AbstractC3557B.c0("fakeOverride", abstractC0994c);
        C4846m.r(abstractC0994c, null);
        this.f52027n0.add(abstractC0994c);
    }

    @Override // K4.J
    public final void n(AbstractC0994c abstractC0994c, AbstractC0994c abstractC0994c2) {
        AbstractC3557B.c0("fromCurrent", abstractC0994c2);
        if (abstractC0994c2 instanceof AbstractC1165x) {
            ((AbstractC1165x) abstractC0994c2).D0(C1009s.f12118a, abstractC0994c);
        }
    }
}
