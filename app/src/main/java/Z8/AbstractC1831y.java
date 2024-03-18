package Z8;

/* renamed from: Z8.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1831y {

    /* renamed from: a  reason: collision with root package name */
    public final String f23420a;

    public AbstractC1831y(String str) {
        this.f23420a = str;
    }

    public abstract String a();

    public String toString() {
        StringBuilder s10 = android.gov.nist.core.a.s("Android: ", a(), ": ");
        s10.append(this.f23420a);
        return s10.toString();
    }
}
