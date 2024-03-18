package V3;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class s implements L3.j {

    /* renamed from: a  reason: collision with root package name */
    public final X3.b f18374a;

    /* renamed from: b  reason: collision with root package name */
    public final T3.a f18375b;

    /* renamed from: c  reason: collision with root package name */
    public final U3.s f18376c;

    static {
        L3.s.f("WMFgUpdater");
    }

    public s(WorkDatabase workDatabase, T3.a aVar, X3.b bVar) {
        this.f18375b = aVar;
        this.f18374a = bVar;
        this.f18376c = workDatabase.u();
    }
}
