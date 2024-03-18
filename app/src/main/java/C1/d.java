package C1;

import h1.C3299f;

/* loaded from: classes2.dex */
public final class d extends C3299f {

    /* renamed from: d  reason: collision with root package name */
    public final Object f2498d = new Object();

    public d() {
        super(12, 1);
    }

    @Override // h1.C3299f
    public final Object a() {
        Object a5;
        synchronized (this.f2498d) {
            a5 = super.a();
        }
        return a5;
    }

    @Override // h1.C3299f
    public final boolean b(Object obj) {
        boolean b10;
        synchronized (this.f2498d) {
            b10 = super.b(obj);
        }
        return b10;
    }
}
