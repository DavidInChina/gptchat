package kf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.RandomAccess;
import xe.C6431t;

/* renamed from: kf.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4279d extends AbstractC4280e implements RandomAccess {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4280e f37468Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f37469Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f37470h0;

    public C4279d(AbstractC4280e abstractC4280e, int i10, int i11) {
        AbstractC3557B.c0("list", abstractC4280e);
        this.f37468Y = abstractC4280e;
        this.f37469Z = i10;
        C6431t.h(i10, i11, abstractC4280e.r());
        this.f37470h0 = i11 - i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int i11 = this.f37470h0;
        if (i10 >= 0 && i10 < i11) {
            return this.f37468Y.get(this.f37469Z + i10);
        }
        throw new IndexOutOfBoundsException(AbstractC2469q0.i("index: ", i10, ", size: ", i11));
    }

    @Override // kf.AbstractC4276a
    public final int r() {
        return this.f37470h0;
    }
}
