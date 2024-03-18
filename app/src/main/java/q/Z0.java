package q;

/* loaded from: classes2.dex */
public final class Z0 {

    /* renamed from: a  reason: collision with root package name */
    public int f43389a;

    /* renamed from: b  reason: collision with root package name */
    public int f43390b;

    /* renamed from: c  reason: collision with root package name */
    public int f43391c;

    /* renamed from: d  reason: collision with root package name */
    public int f43392d;

    /* renamed from: e  reason: collision with root package name */
    public int f43393e;

    /* renamed from: f  reason: collision with root package name */
    public int f43394f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f43395g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f43396h;

    public final void a(int i10, int i11) {
        this.f43391c = i10;
        this.f43392d = i11;
        this.f43396h = true;
        if (this.f43395g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f43389a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f43390b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f43389a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f43390b = i11;
        }
    }
}
