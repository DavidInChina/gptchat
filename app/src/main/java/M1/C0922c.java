package M1;

/* renamed from: M1.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0922c extends K {

    /* renamed from: a  reason: collision with root package name */
    public final Object f11427a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11428b;

    public C0922c(int i10, Object obj) {
        this.f11427a = obj;
        this.f11428b = i10;
    }

    public final void a() {
        int i10;
        boolean z10 = false;
        Object obj = this.f11427a;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        if (i10 == this.f11428b) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
    }
}
