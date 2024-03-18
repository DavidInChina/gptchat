package dg;

import java.util.ArrayList;
import kg.C4290b;

/* renamed from: dg.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2663c implements AbstractC2652A {

    /* renamed from: a  reason: collision with root package name */
    public final C2656E f28306a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f28307b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C2664d f28308c;

    public AbstractC2663c(C2664d c2664d, C2656E c2656e) {
        this.f28308c = c2664d;
        this.f28306a = c2656e;
    }

    @Override // dg.AbstractC2652A
    public final void a() {
        ArrayList arrayList = this.f28307b;
        if (!arrayList.isEmpty()) {
            this.f28308c.f28310b.put(this.f28306a, arrayList);
        }
    }

    @Override // dg.AbstractC2652A
    public final y b(C4290b c4290b, Rf.a aVar) {
        return this.f28308c.f28309a.q(c4290b, aVar, this.f28307b);
    }
}
