package X8;

import P5.c;
import Y8.b;
import Y8.d;
import Y8.e;
import Y8.g;

/* loaded from: classes.dex */
public final class a implements W8.a {

    /* renamed from: Y  reason: collision with root package name */
    public final g f21800Y;

    /* renamed from: Z  reason: collision with root package name */
    public final W8.a f21801Z;

    public a(g gVar, c cVar) {
        this.f21800Y = gVar;
        this.f21801Z = cVar;
    }

    @Override // W8.a
    public final long j() {
        return this.f21801Z.j();
    }

    @Override // W8.a
    public final long l() {
        b bVar;
        W8.c cVar;
        g gVar = this.f21800Y;
        gVar.a();
        d dVar = gVar.f22127f;
        Pd.a aVar = (Pd.a) dVar.f22115a;
        long j6 = aVar.f13945a.getLong("com.lyft.kronos.cached_current_time", 0L);
        long j10 = aVar.f13945a.getLong("com.lyft.kronos.cached_elapsed_time", 0L);
        long j11 = aVar.f13945a.getLong("com.lyft.kronos.cached_offset", 0L);
        if (j10 == 0) {
            bVar = null;
        } else {
            bVar = new b(j6, j10, j11, dVar.f22116b);
        }
        if (((e) gVar.f22122a.get()) == e.f22117Y && bVar != null) {
            W8.a aVar2 = bVar.f22111d;
            if (Math.abs((bVar.f22108a - bVar.f22109b) - (aVar2.l() - aVar2.j())) >= 1000) {
                d dVar2 = gVar.f22127f;
                synchronized (dVar2) {
                    ((Pd.a) dVar2.f22115a).f13945a.edit().clear().apply();
                }
                bVar = null;
            }
        }
        if (bVar == null) {
            if (gVar.f22126e.j() - gVar.f22123b.get() >= gVar.f22131j) {
                gVar.b();
            }
            cVar = null;
        } else {
            long j12 = bVar.f22111d.j() - bVar.f22109b;
            if (j12 >= gVar.f22132k && gVar.f22126e.j() - gVar.f22123b.get() >= gVar.f22131j) {
                gVar.b();
            }
            cVar = new W8.c((bVar.f22111d.j() - bVar.f22109b) + bVar.f22108a + bVar.f22110c, Long.valueOf(j12));
        }
        if (cVar == null) {
            cVar = new W8.c(this.f21801Z.l(), null);
        }
        return cVar.f20821a;
    }
}
