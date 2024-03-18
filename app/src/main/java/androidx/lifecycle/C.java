package androidx.lifecycle;

/* loaded from: classes2.dex */
public abstract class C {

    /* renamed from: Y  reason: collision with root package name */
    public final F f25285Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f25286Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f25287h0 = -1;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ E f25288i0;

    public C(E e10, F f6) {
        this.f25288i0 = e10;
        this.f25285Y = f6;
    }

    public final void a(boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        if (z10 == this.f25286Z) {
            return;
        }
        this.f25286Z = z10;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        E e10 = this.f25288i0;
        int i11 = e10.f25294c;
        e10.f25294c = i10 + i11;
        if (!e10.f25295d) {
            e10.f25295d = true;
            while (true) {
                try {
                    int i12 = e10.f25294c;
                    if (i11 == i12) {
                        break;
                    }
                    if (i11 == 0 && i12 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (i11 > 0 && i12 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z11) {
                        e10.e();
                    } else if (z12) {
                        e10.f();
                    }
                    i11 = i12;
                } catch (Throwable th2) {
                    e10.f25295d = false;
                    throw th2;
                }
            }
            e10.f25295d = false;
        }
        if (this.f25286Z) {
            e10.c(this);
        }
    }

    public void c() {
    }

    public boolean d(AbstractC2086v abstractC2086v) {
        return false;
    }

    public abstract boolean e();
}
