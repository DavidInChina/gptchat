package H2;

import android.os.Bundle;
import java.util.Arrays;
import p2.AbstractC5057j;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class j implements AbstractC5057j {

    /* renamed from: i0  reason: collision with root package name */
    public static final String f7284i0 = Integer.toString(0, 36);

    /* renamed from: j0  reason: collision with root package name */
    public static final String f7285j0 = Integer.toString(1, 36);

    /* renamed from: k0  reason: collision with root package name */
    public static final String f7286k0 = Integer.toString(2, 36);

    /* renamed from: Y  reason: collision with root package name */
    public final int f7287Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int[] f7288Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f7289h0;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public j(int i10, int i11, int[] iArr) {
        this.f7287Y = i10;
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.f7288Z = copyOf;
        this.f7289h0 = i11;
        Arrays.sort(copyOf);
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f7284i0, this.f7287Y);
        bundle.putIntArray(f7285j0, this.f7288Z);
        bundle.putInt(f7286k0, this.f7289h0);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f7287Y == jVar.f7287Y && Arrays.equals(this.f7288Z, jVar.f7288Z) && this.f7289h0 == jVar.f7289h0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f7288Z) + (this.f7287Y * 31)) * 31) + this.f7289h0;
    }
}
