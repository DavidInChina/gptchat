package qf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.io.Serializable;
import kf.AbstractC4280e;
import kf.q;

/* renamed from: qf.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5323a extends AbstractC4280e implements Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public final Enum[] f44133Y;

    public C5323a(Enum[] enumArr) {
        AbstractC3557B.c0("entries", enumArr);
        this.f44133Y = enumArr;
    }

    @Override // kf.AbstractC4276a, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r42 = (Enum) obj;
        AbstractC3557B.c0("element", r42);
        if (((Enum) q.n3(r42.ordinal(), this.f44133Y)) != r42) {
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Enum[] enumArr = this.f44133Y;
        int length = enumArr.length;
        if (i10 >= 0 && i10 < length) {
            return enumArr[i10];
        }
        throw new IndexOutOfBoundsException(AbstractC2469q0.i("index: ", i10, ", size: ", length));
    }

    @Override // kf.AbstractC4280e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        AbstractC3557B.c0("element", r42);
        int ordinal = r42.ordinal();
        if (((Enum) q.n3(ordinal, this.f44133Y)) != r42) {
            return -1;
        }
        return ordinal;
    }

    @Override // kf.AbstractC4280e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r22 = (Enum) obj;
        AbstractC3557B.c0("element", r22);
        return indexOf(r22);
    }

    @Override // kf.AbstractC4276a
    public final int r() {
        return this.f44133Y.length;
    }
}
