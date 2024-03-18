package w;

import kf.AbstractC4265A;

/* renamed from: w.D  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6052D extends AbstractC4265A {

    /* renamed from: Y  reason: collision with root package name */
    public int f47566Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6050B f47567Z;

    public C6052D(C6050B c6050b) {
        this.f47567Z = c6050b;
    }

    @Override // kf.AbstractC4265A
    public final int a() {
        int i10 = this.f47566Y;
        this.f47566Y = i10 + 1;
        return this.f47567Z.d(i10);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f47566Y < this.f47567Z.f()) {
            return true;
        }
        return false;
    }
}
