package y2;

/* renamed from: y2.J  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6507J {

    /* renamed from: a  reason: collision with root package name */
    public boolean f50393a;

    /* renamed from: b  reason: collision with root package name */
    public d0 f50394b;

    /* renamed from: c  reason: collision with root package name */
    public int f50395c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f50396d;

    /* renamed from: e  reason: collision with root package name */
    public int f50397e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f50398f;

    /* renamed from: g  reason: collision with root package name */
    public int f50399g;

    public C6507J(d0 d0Var) {
        this.f50394b = d0Var;
    }

    public final void a(int i10) {
        boolean z10;
        boolean z11 = this.f50393a;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f50393a = z11 | z10;
        this.f50395c += i10;
    }
}
