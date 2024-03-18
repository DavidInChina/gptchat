package Y8;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final W8.d f22115a;

    /* renamed from: b  reason: collision with root package name */
    public final W8.a f22116b;

    public d(Pd.a aVar, P5.c cVar) {
        this.f22115a = aVar;
        this.f22116b = cVar;
    }

    public final void a(b bVar) {
        synchronized (this) {
            W8.d dVar = this.f22115a;
            ((Pd.a) dVar).f13945a.edit().putLong("com.lyft.kronos.cached_current_time", bVar.f22108a).apply();
            W8.d dVar2 = this.f22115a;
            ((Pd.a) dVar2).f13945a.edit().putLong("com.lyft.kronos.cached_elapsed_time", bVar.f22109b).apply();
            W8.d dVar3 = this.f22115a;
            ((Pd.a) dVar3).f13945a.edit().putLong("com.lyft.kronos.cached_offset", bVar.f22110c).apply();
        }
    }
}
