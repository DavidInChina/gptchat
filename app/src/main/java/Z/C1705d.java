package Z;

/* renamed from: Z.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1705d {

    /* renamed from: a  reason: collision with root package name */
    public int f22611a;

    public C1705d(int i10) {
        this.f22611a = i10;
    }

    public final boolean a() {
        if (this.f22611a != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{ location = ");
        return android.gov.nist.core.a.l(sb2, this.f22611a, " }");
    }
}
