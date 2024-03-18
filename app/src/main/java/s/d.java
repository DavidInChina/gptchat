package s;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class d extends f implements Iterator {

    /* renamed from: Y  reason: collision with root package name */
    public c f45007Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f45008Z = true;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ g f45009h0;

    public d(g gVar) {
        this.f45009h0 = gVar;
    }

    @Override // s.f
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f45007Y;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f45006i0;
            this.f45007Y = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f45008Z = z10;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f45008Z) {
            if (this.f45009h0.f45012Y == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f45007Y;
        if (cVar == null || cVar.f45005h0 == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        if (this.f45008Z) {
            this.f45008Z = false;
            this.f45007Y = this.f45009h0.f45012Y;
        } else {
            c cVar2 = this.f45007Y;
            if (cVar2 != null) {
                cVar = cVar2.f45005h0;
            } else {
                cVar = null;
            }
            this.f45007Y = cVar;
        }
        return this.f45007Y;
    }
}
