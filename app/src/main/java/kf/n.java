package kf;

import id.AbstractC3557B;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class n extends AbstractC4280e implements RandomAccess {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int[] f37477Y;

    public n(int[] iArr) {
        this.f37477Y = iArr;
    }

    @Override // kf.AbstractC4276a, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return q.U2(this.f37477Y, ((Number) obj).intValue());
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return Integer.valueOf(this.f37477Y[i10]);
    }

    @Override // kf.AbstractC4280e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.f37477Y;
        AbstractC3557B.c0("<this>", iArr);
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (intValue == iArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @Override // kf.AbstractC4276a, java.util.Collection
    public final boolean isEmpty() {
        if (this.f37477Y.length == 0) {
            return true;
        }
        return false;
    }

    @Override // kf.AbstractC4280e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.f37477Y;
        AbstractC3557B.c0("<this>", iArr);
        int length = iArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i10 = length - 1;
            if (intValue == iArr[length]) {
                return length;
            }
            if (i10 < 0) {
                return -1;
            }
            length = i10;
        }
    }

    @Override // kf.AbstractC4276a
    public final int r() {
        return this.f37477Y.length;
    }
}
