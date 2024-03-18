package ji;

import java.util.RandomAccess;
import kf.AbstractC4280e;

/* renamed from: ji.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4112A extends AbstractC4280e implements RandomAccess {

    /* renamed from: Y  reason: collision with root package name */
    public final C4138m[] f36658Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int[] f36659Z;

    public C4112A(C4138m[] c4138mArr, int[] iArr) {
        this.f36658Y = c4138mArr;
        this.f36659Z = iArr;
    }

    @Override // kf.AbstractC4276a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C4138m)) {
            return false;
        }
        return super.contains((C4138m) obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f36658Y[i10];
    }

    @Override // kf.AbstractC4280e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C4138m)) {
            return -1;
        }
        return super.indexOf((C4138m) obj);
    }

    @Override // kf.AbstractC4280e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C4138m)) {
            return -1;
        }
        return super.lastIndexOf((C4138m) obj);
    }

    @Override // kf.AbstractC4276a
    public final int r() {
        return this.f36658Y.length;
    }
}
