package androidx.glance.appwidget.protobuf;

/* renamed from: androidx.glance.appwidget.protobuf.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2045e extends AbstractC2046f {

    /* renamed from: Y  reason: collision with root package name */
    public int f25210Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final int f25211Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC2049i f25212h0;

    public C2045e(AbstractC2049i abstractC2049i) {
        this.f25212h0 = abstractC2049i;
        this.f25211Z = abstractC2049i.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f25210Y < this.f25211Z) {
            return true;
        }
        return false;
    }
}
