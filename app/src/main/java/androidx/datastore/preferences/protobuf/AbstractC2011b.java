package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2011b {
    protected int memoizedHashCode;

    public abstract int a();

    public final int b(AbstractC2022g0 abstractC2022g0) {
        AbstractC2040z abstractC2040z = (AbstractC2040z) this;
        int i10 = abstractC2040z.memoizedSerializedSize;
        if (i10 == -1) {
            int f6 = abstractC2022g0.f(this);
            abstractC2040z.memoizedSerializedSize = f6;
            return f6;
        }
        return i10;
    }

    public abstract void c(AbstractC2031p abstractC2031p);
}
