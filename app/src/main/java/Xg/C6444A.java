package xg;

import Mf.V;
import fg.C3042j;
import gg.C3270a;
import hg.AbstractC3423b;
import hg.AbstractC3428g;
import hg.C3429h;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.List;
import kg.C4290b;
import yf.AbstractC6583a;

/* renamed from: xg.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6444A implements AbstractC6453h {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC3428g f49957a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC3423b f49958b;

    /* renamed from: c  reason: collision with root package name */
    public final wf.k f49959c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f49960d;

    public C6444A(fg.E e10, C3429h c3429h, C3270a c3270a, Xf.f fVar) {
        this.f49957a = c3429h;
        this.f49958b = c3270a;
        this.f49959c = fVar;
        List list = e10.f30290l0;
        AbstractC3557B.b0("getClass_List(...)", list);
        int n02 = P4.a.n0(AbstractC6583a.H1(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(n02 < 16 ? 16 : n02);
        for (Object obj : list) {
            linkedHashMap.put(R4.b.f1(this.f49957a, ((C3042j) obj).f30651j0), obj);
        }
        this.f49960d = linkedHashMap;
    }

    @Override // xg.AbstractC6453h
    public final C6452g a(C4290b c4290b) {
        AbstractC3557B.c0("classId", c4290b);
        C3042j c3042j = (C3042j) this.f49960d.get(c4290b);
        if (c3042j == null) {
            return null;
        }
        return new C6452g(this.f49957a, c3042j, this.f49958b, (V) this.f49959c.invoke(c4290b));
    }
}
