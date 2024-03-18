package i0;

/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ wf.n f32434a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ wf.k f32435b;

    public r(wf.n nVar, wf.k kVar) {
        this.f32434a = nVar;
        this.f32435b = kVar;
    }

    @Override // i0.q
    public final Object a(d dVar, Object obj) {
        return this.f32434a.invoke(dVar, obj);
    }

    @Override // i0.q
    public final Object b(Object obj) {
        return this.f32435b.invoke(obj);
    }
}
