package C6;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f2700a;

    public b(e eVar) {
        this.f2700a = eVar;
    }

    public final void a() {
        ff.d dVar;
        String name = Thread.currentThread().getName();
        e eVar = this.f2700a;
        ff.c b10 = ((Q6.a) eVar.f11684i0).b();
        if (b10 != null) {
            dVar = b10.c();
        } else {
            dVar = null;
        }
        if (dVar != null) {
            eVar.f2714v0.j("tracing", new a(name, dVar.a(), dVar.b(), 0));
        }
    }
}
