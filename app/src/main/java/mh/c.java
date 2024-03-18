package Mh;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final vh.c f12144a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f12145b;

    public c(d dVar, vh.c cVar) {
        this.f12145b = dVar;
        this.f12144a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f12145b.equals(cVar.f12145b) && this.f12144a.equals(cVar.f12144a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f12144a.hashCode();
        return this.f12145b.hashCode() + ((hashCode + (c.class.hashCode() * 31)) * 31);
    }
}
