package F;

import java.util.Comparator;

/* renamed from: F.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0537k implements Comparator {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f4931Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ G.H f4932Z;

    public /* synthetic */ C0537k(G.H h10, int i10) {
        this.f4931Y = i10;
        this.f4932Z = h10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = this.f4931Y;
        G.H h10 = this.f4932Z;
        switch (i10) {
            case 0:
                return r.f.n(Integer.valueOf(h10.c(((A) obj).f4837l)), Integer.valueOf(h10.c(((A) obj2).f4837l)));
            case 1:
                return r.f.n(Integer.valueOf(h10.c(((A) obj).f4837l)), Integer.valueOf(h10.c(((A) obj2).f4837l)));
            case 2:
                return r.f.n(Integer.valueOf(h10.c(((A) obj2).f4837l)), Integer.valueOf(h10.c(((A) obj).f4837l)));
            default:
                return r.f.n(Integer.valueOf(h10.c(((A) obj2).f4837l)), Integer.valueOf(h10.c(((A) obj).f4837l)));
        }
    }
}
