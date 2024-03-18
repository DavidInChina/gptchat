package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2019f extends AbstractC2021g {

    /* renamed from: Y  reason: collision with root package name */
    public int f25049Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final int f25050Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC2025j f25051h0;

    public C2019f(AbstractC2025j abstractC2025j) {
        this.f25051h0 = abstractC2025j;
        this.f25050Z = abstractC2025j.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f25049Y < this.f25050Z) {
            return true;
        }
        return false;
    }
}
