package dg;

import java.util.ArrayList;
import java.util.List;
import kg.C4290b;

/* renamed from: dg.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2662b extends AbstractC2663c {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C2664d f28305d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2662b(C2664d c2664d, C2656E c2656e) {
        super(c2664d, c2656e);
        this.f28305d = c2664d;
    }

    public final C2672l c(int i10, C4290b c4290b, Rf.a aVar) {
        C2656E m10 = Cf.k.m(this.f28306a, i10);
        C2664d c2664d = this.f28305d;
        List list = (List) c2664d.f28310b.get(m10);
        if (list == null) {
            list = new ArrayList();
            c2664d.f28310b.put(m10, list);
        }
        return c2664d.f28309a.q(c4290b, aVar, list);
    }
}
