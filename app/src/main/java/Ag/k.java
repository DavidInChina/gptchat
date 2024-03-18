package Ag;

/* loaded from: classes2.dex */
public abstract class k extends j {

    /* renamed from: i0  reason: collision with root package name */
    public volatile U3.e f859i0;

    /* JADX WARN: Type inference failed for: r0v0, types: [U3.e, java.lang.Object] */
    @Override // Ag.j
    public final void c(Object obj) {
        ?? obj2 = new Object();
        obj2.f17400Y = obj;
        obj2.f17401Z = Thread.currentThread();
        this.f859i0 = obj2;
        try {
            e eVar = (e) this;
            if (obj != null) {
                eVar.f852k0.invoke(obj);
            } else {
                e.a(2);
                throw null;
            }
        } finally {
            this.f859i0 = null;
        }
    }

    @Override // Ag.j, wf.AbstractC6216a
    /* renamed from: invoke */
    public Object mo122invoke() {
        U3.e eVar = this.f859i0;
        if (eVar != null && ((Thread) eVar.f17401Z) == Thread.currentThread()) {
            if (((Thread) eVar.f17401Z) == Thread.currentThread()) {
                return eVar.f17400Y;
            }
            throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
        }
        return super.mo122invoke();
    }
}
