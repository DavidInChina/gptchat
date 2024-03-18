package Cf;

import java.util.NoSuchElementException;
import kf.AbstractC4265A;

/* loaded from: classes.dex */
public final class f extends AbstractC4265A {

    /* renamed from: Y  reason: collision with root package name */
    public final int f3109Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f3110Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f3111h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f3112i0;

    public f(int i10, int i11, int i12) {
        this.f3109Y = i12;
        this.f3110Z = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f3111h0 = z10;
        this.f3112i0 = !z10 ? i11 : i10;
    }

    @Override // kf.AbstractC4265A
    public final int a() {
        int i10 = this.f3112i0;
        if (i10 == this.f3110Z) {
            if (this.f3111h0) {
                this.f3111h0 = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f3112i0 = this.f3109Y + i10;
        }
        return i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3111h0;
    }
}
