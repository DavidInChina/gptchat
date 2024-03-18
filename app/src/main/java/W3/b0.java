package w3;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class b0 extends O {

    /* renamed from: a  reason: collision with root package name */
    public boolean f47831a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C6085A f47832b;

    public b0(C6085A c6085a) {
        this.f47832b = c6085a;
    }

    @Override // w3.O
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0 && this.f47831a) {
            this.f47831a = false;
            this.f47832b.f();
        }
    }

    @Override // w3.O
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        if (i10 != 0 || i11 != 0) {
            this.f47831a = true;
        }
    }
}
