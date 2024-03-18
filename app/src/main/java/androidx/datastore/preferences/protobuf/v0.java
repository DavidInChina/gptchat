package androidx.datastore.preferences.protobuf;

/* loaded from: classes2.dex */
public final class v0 extends w0 {
    @Override // androidx.datastore.preferences.protobuf.w0
    public final boolean c(long j6, Object obj) {
        return this.f25125a.getBoolean(obj, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final byte d(long j6, Object obj) {
        return this.f25125a.getByte(obj, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final double e(long j6, Object obj) {
        return this.f25125a.getDouble(obj, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final float f(long j6, Object obj) {
        return this.f25125a.getFloat(obj, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final void k(Object obj, long j6, boolean z10) {
        this.f25125a.putBoolean(obj, j6, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final void l(Object obj, long j6, byte b10) {
        this.f25125a.putByte(obj, j6, b10);
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final void m(Object obj, long j6, double d10) {
        this.f25125a.putDouble(obj, j6, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final void n(Object obj, long j6, float f6) {
        this.f25125a.putFloat(obj, j6, f6);
    }
}
